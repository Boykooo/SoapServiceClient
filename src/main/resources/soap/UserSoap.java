
package soap;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UserSoap", targetNamespace = "http://soap/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserSoap {


    /**
     * 
     * @return
     *     returns java.util.List<soap.UserDto>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllUsers", targetNamespace = "http://soap/", className = "soap.GetAllUsers")
    @ResponseWrapper(localName = "getAllUsersResponse", targetNamespace = "http://soap/", className = "soap.GetAllUsersResponse")
    public List<UserDto> getAllUsers();

    /**
     * 
     * @param arg0
     * @throws UpdateObjectNotExistException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "updateUser", targetNamespace = "http://soap/", className = "soap.UpdateUser")
    @ResponseWrapper(localName = "updateUserResponse", targetNamespace = "http://soap/", className = "soap.UpdateUserResponse")
    public void updateUser(
        @WebParam(name = "arg0", targetNamespace = "")
        UserDto arg0)
        throws UpdateObjectNotExistException_Exception
    ;

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteUser", targetNamespace = "http://soap/", className = "soap.DeleteUser")
    @ResponseWrapper(localName = "deleteUserResponse", targetNamespace = "http://soap/", className = "soap.DeleteUserResponse")
    public void deleteUser(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @throws ObjectAlreadyExistsException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "addUser", targetNamespace = "http://soap/", className = "soap.AddUser")
    @ResponseWrapper(localName = "addUserResponse", targetNamespace = "http://soap/", className = "soap.AddUserResponse")
    public void addUser(
        @WebParam(name = "arg0", targetNamespace = "")
        UserDto arg0)
        throws ObjectAlreadyExistsException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns soap.UserDto
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSpecificUser", targetNamespace = "http://soap/", className = "soap.GetSpecificUser")
    @ResponseWrapper(localName = "getSpecificUserResponse", targetNamespace = "http://soap/", className = "soap.GetSpecificUserResponse")
    public UserDto getSpecificUser(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}