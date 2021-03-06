package integration.mindbody;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.6
 * 2015-03-18T22:34:36.369+02:00
 * Generated source version: 2.5.6
 * 
 */
@WebService(targetNamespace = "http://clients.mindbodyonline.com/api/0_5", name = "Class_x0020_ServiceSoap")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ClassX0020ServiceSoap {

    /**
     * Gets a list of class schedules.
     */
    @WebMethod(operationName = "GetClassSchedules", action = "http://clients.mindbodyonline.com/api/0_5/GetClassSchedules")
    @WebResult(name = "GetClassSchedulesResponse", targetNamespace = "http://clients.mindbodyonline.com/api/0_5", partName = "parameters")
    public GetClassSchedulesResponse getClassSchedules(
        @WebParam(partName = "parameters", name = "GetClassSchedules", targetNamespace = "http://clients.mindbodyonline.com/api/0_5")
        GetClassSchedules parameters
    );

    /**
     * Removes client from enrollment waitlist
     */
    @WebMethod(operationName = "RemoveFromWaitlist", action = "http://clients.mindbodyonline.com/api/0_5/RemoveFromWaitlist")
    @WebResult(name = "RemoveFromWaitlistResponse", targetNamespace = "http://clients.mindbodyonline.com/api/0_5", partName = "parameters")
    public RemoveFromWaitlistResponse removeFromWaitlist(
        @WebParam(partName = "parameters", name = "RemoveFromWaitlist", targetNamespace = "http://clients.mindbodyonline.com/api/0_5")
        RemoveFromWaitlist parameters
    );

    /**
     * Gets a list of classes.
     */
    @WebMethod(operationName = "GetClasses", action = "http://clients.mindbodyonline.com/api/0_5/GetClasses")
    @WebResult(name = "GetClassesResponse", targetNamespace = "http://clients.mindbodyonline.com/api/0_5", partName = "parameters")
    public GetClassesResponse getClasses(
        @WebParam(partName = "parameters", name = "GetClasses", targetNamespace = "http://clients.mindbodyonline.com/api/0_5")
        GetClasses parameters
    );

    /**
     * Gets a list of semesters.
     */
    @WebMethod(operationName = "GetSemesters", action = "http://clients.mindbodyonline.com/api/0_5/GetSemesters")
    @WebResult(name = "GetSemestersResponse", targetNamespace = "http://clients.mindbodyonline.com/api/0_5", partName = "parameters")
    public GetSemestersResponse getSemesters(
        @WebParam(partName = "parameters", name = "GetSemesters", targetNamespace = "http://clients.mindbodyonline.com/api/0_5")
        GetSemesters parameters
    );

    /**
     * Adds clients to enrollments (signup).
     */
    @WebMethod(operationName = "AddClientsToEnrollments", action = "http://clients.mindbodyonline.com/api/0_5/AddClientsToEnrollments")
    @WebResult(name = "AddClientsToEnrollmentsResponse", targetNamespace = "http://clients.mindbodyonline.com/api/0_5", partName = "parameters")
    public AddClientsToEnrollmentsResponse addClientsToEnrollments(
        @WebParam(partName = "parameters", name = "AddClientsToEnrollments", targetNamespace = "http://clients.mindbodyonline.com/api/0_5")
        AddClientsToEnrollments parameters
    );

    /**
     * Gets a list of courses.
     */
    @WebMethod(operationName = "GetCourses", action = "http://clients.mindbodyonline.com/api/0_5/GetCourses")
    @WebResult(name = "GetCoursesResponse", targetNamespace = "http://clients.mindbodyonline.com/api/0_5", partName = "parameters")
    public GetCoursesResponse getCourses(
        @WebParam(partName = "parameters", name = "GetCourses", targetNamespace = "http://clients.mindbodyonline.com/api/0_5")
        GetCourses parameters
    );

    /**
     * Update a list of visits.
     */
    @WebMethod(operationName = "UpdateClientVisits", action = "http://clients.mindbodyonline.com/api/0_5/UpdateClientVisits")
    @WebResult(name = "UpdateClientVisitsResponse", targetNamespace = "http://clients.mindbodyonline.com/api/0_5", partName = "parameters")
    public UpdateClientVisitsResponse updateClientVisits(
        @WebParam(partName = "parameters", name = "UpdateClientVisits", targetNamespace = "http://clients.mindbodyonline.com/api/0_5")
        UpdateClientVisits parameters
    );

    /**
     * Gets a list of enrollments.
     */
    @WebMethod(operationName = "GetEnrollments", action = "http://clients.mindbodyonline.com/api/0_5/GetEnrollments")
    @WebResult(name = "GetEnrollmentsResponse", targetNamespace = "http://clients.mindbodyonline.com/api/0_5", partName = "parameters")
    public GetEnrollmentsResponse getEnrollments(
        @WebParam(partName = "parameters", name = "GetEnrollments", targetNamespace = "http://clients.mindbodyonline.com/api/0_5")
        GetEnrollments parameters
    );

    /**
     * Removes clients from classes.
     */
    @WebMethod(operationName = "RemoveClientsFromClasses", action = "http://clients.mindbodyonline.com/api/0_5/RemoveClientsFromClasses")
    @WebResult(name = "RemoveClientsFromClassesResponse", targetNamespace = "http://clients.mindbodyonline.com/api/0_5", partName = "parameters")
    public RemoveClientsFromClassesResponse removeClientsFromClasses(
        @WebParam(partName = "parameters", name = "RemoveClientsFromClasses", targetNamespace = "http://clients.mindbodyonline.com/api/0_5")
        RemoveClientsFromClasses parameters
    );

    /**
     * Adds clients to classes (signup).
     */
    @WebMethod(operationName = "AddClientsToClasses", action = "http://clients.mindbodyonline.com/api/0_5/AddClientsToClasses")
    @WebResult(name = "AddClientsToClassesResponse", targetNamespace = "http://clients.mindbodyonline.com/api/0_5", partName = "parameters")
    public AddClientsToClassesResponse addClientsToClasses(
        @WebParam(partName = "parameters", name = "AddClientsToClasses", targetNamespace = "http://clients.mindbodyonline.com/api/0_5")
        AddClientsToClasses parameters
    );

    /**
     * Get waitlist entries.
     */
    @WebMethod(operationName = "GetWaitlistEntries", action = "http://clients.mindbodyonline.com/api/0_5/GetWaitlistEntries")
    @WebResult(name = "GetWaitlistEntriesResponse", targetNamespace = "http://clients.mindbodyonline.com/api/0_5", partName = "parameters")
    public GetWaitlistEntriesResponse getWaitlistEntries(
        @WebParam(partName = "parameters", name = "GetWaitlistEntries", targetNamespace = "http://clients.mindbodyonline.com/api/0_5")
        GetWaitlistEntries parameters
    );

    /**
     * Gets a class with a list of clients.
     */
    @WebMethod(operationName = "GetClassVisits", action = "http://clients.mindbodyonline.com/api/0_5/GetClassVisits")
    @WebResult(name = "GetClassVisitsResponse", targetNamespace = "http://clients.mindbodyonline.com/api/0_5", partName = "parameters")
    public GetClassVisitsResponse getClassVisits(
        @WebParam(partName = "parameters", name = "GetClassVisits", targetNamespace = "http://clients.mindbodyonline.com/api/0_5")
        GetClassVisits parameters
    );

    /**
     * Gets a list of class descriptions.
     */
    @WebMethod(operationName = "GetClassDescriptions", action = "http://clients.mindbodyonline.com/api/0_5/GetClassDescriptions")
    @WebResult(name = "GetClassDescriptionsResponse", targetNamespace = "http://clients.mindbodyonline.com/api/0_5", partName = "parameters")
    public GetClassDescriptionsResponse getClassDescriptions(
        @WebParam(partName = "parameters", name = "GetClassDescriptions", targetNamespace = "http://clients.mindbodyonline.com/api/0_5")
        GetClassDescriptions parameters
    );
}
