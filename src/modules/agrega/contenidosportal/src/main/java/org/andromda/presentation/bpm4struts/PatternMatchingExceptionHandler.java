//
// Attention: Generated code! Do not modify by hand!
// Generated by: StrutsPatternMatchingExceptionHandler.vsl in andromda-bpm4struts-cartridge.
//
package org.andromda.presentation.bpm4struts;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.Globals;
import org.apache.struts.util.ModuleException;
import org.apache.struts.config.ExceptionConfig;
import org.apache.commons.beanutils.PropertyUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * <p/>
 *  A configurable pattern matching error handler retrieves exception mapping
 *  keys from an exception. This is used to retrieve keys from the back-end exceptions
 *  which can be mapped to exception messages keyed in an application resource
 *  file.
 * </p>
 */
public class PatternMatchingExceptionHandler
    extends org.apache.struts.action.ExceptionHandler
{
    private static final Pattern compiledPattern = Pattern.compile("(.*)(\\{\\s*([\\w|\\.+]*)\\s*\\})(.*)");

    /**
     * This method is overriden to provide an alternative implementation for storing the exception.
     * This method will use a pattern matching algorithm to extract a possible resource message that is used instead
     * of the argument exception's message.
     */
    public ActionForward execute(Exception exception,
                                 ExceptionConfig exceptionConfig,
                                 ActionMapping mapping,
                                 ActionForm actionForm,
                                 HttpServletRequest request,
                                 HttpServletResponse response)
        throws
        ServletException
    {
        ActionForward forward;
        ActionMessage error;
        String property;

        if (exceptionConfig.getPath() != null)
        {
            forward = new ActionForward(exceptionConfig.getPath());
        }
        else
        {
            forward = mapping.getInputForward();
        }

        // Figure out the error
        if (exception instanceof ModuleException)
        {
            final ModuleException moduleException = (ModuleException)exception;
            error = moduleException.getActionMessage();
            property = moduleException.getProperty();
        }
        else
        {
            try
            {
                error = new ActionMessage(parseExceptionMessage(exception));
            }
            catch (Throwable patternMatchingException)
            {
                // no pattern was found, so just continue as usual
                error = new ActionMessage(exceptionConfig.getKey(), patternMatchingException.getMessage());
            }
            property = error.getKey();
        }

        this.logException(exception);

        // Store the exception
        request.setAttribute(Globals.EXCEPTION_KEY, exception);
        this.storeException(request, property, error, forward, exceptionConfig.getScope());

        return forward;
    }

    /**
     * Retrieves the message and attempts to extract
     * the specified pattern defined within this class. If a string can not be
     * found matching the pattern, the message itself is returned.
     *
     * @param exception the Exception containing the message to retrieve, should not be <code>null</code>
     * @return the retrieved string matching the pattern.
     * @throws Throwable rethrows the cause of the argument exception (which might be the exception itself)
     *      in case no pattern was found in its message
     */
    private static String parseExceptionMessage(Exception exception) throws Throwable
    {
        String exceptionMessage = null;

        final Throwable cause = findRootCause(exception);
        if (cause != null && cause.getMessage() != null)
        {
            final Matcher matcher = compiledPattern.matcher(cause.getMessage().replaceAll("[\\s]+", " "));
            try
            {
                if (matcher.matches())
                {
                    exceptionMessage = matcher.group(3);
                }
            }
            catch (IllegalStateException ex)
            {
                // no match was found, let the code below handle everything
            }
        }
        else
        {
            exceptionMessage = exception.getMessage();
        }

        // no pattern could be found and the cause exception is something worth throwing
        if (exceptionMessage == null && cause != null)
        {
            throw cause;
        }

        return exceptionMessage;
    }

    /**
     * Finds the root cause of the parent exception
     * by traveling up the exception tree
     */
    private static java.lang.Throwable findRootCause(Throwable throwable)
    {
        if (throwable != null)
        {
            // Reflectively get any exception causes.
            try
            {
                Throwable targetException = null;
                // java.lang.reflect.InvocationTargetException
                String exceptionProperty = "targetException";
                if (PropertyUtils.isReadable(throwable, exceptionProperty))
                {
                    targetException = (Throwable)PropertyUtils.getProperty(throwable, exceptionProperty);
                }
                else
                {
                    exceptionProperty = "causedByException";
                    // javax.ejb.EJBException
                    if (PropertyUtils.isReadable(throwable, exceptionProperty))
                    {
                        targetException = (Throwable)PropertyUtils.getProperty(throwable, exceptionProperty);
                    }
                }
                if (targetException != null)
                {
                    throwable = targetException;
                }
            }
            catch (Exception exception)
            {
                // just print the exception and continue
                exception.printStackTrace();
            }

            if (throwable.getCause() != null)
            {
                throwable = throwable.getCause();
                throwable = findRootCause(throwable);
            }
        }
        return throwable;
    }

    /**
     * Alternative implementation to the one offered by the parent class. Exceptions are also stored under
     * <code>org.apache.struts.Globals.MESSAGE_KEY</code> in session scope.
     */
    protected void storeException(HttpServletRequest request,
                                  String property,
                                  ActionMessage actionMessage,
                                  ActionForward actionForward,
                                  String scope)
    {
        final HttpSession session = request.getSession();
        ActionMessages messages = (ActionMessages)session.getAttribute(Globals.MESSAGE_KEY);
        if (messages == null)
        {
            messages = new ActionMessages();
            session.setAttribute(Globals.MESSAGE_KEY, messages);
        }
        messages.add("org.andromda.bpm4struts.errormessages", actionMessage);
    }
}