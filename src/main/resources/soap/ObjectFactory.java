
package soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UpdateUser_QNAME = new QName("http://soap/", "updateUser");
    private final static QName _DeleteUser_QNAME = new QName("http://soap/", "deleteUser");
    private final static QName _UpdateObjectNotExistException_QNAME = new QName("http://soap/", "UpdateObjectNotExistException");
    private final static QName _DeleteUserResponse_QNAME = new QName("http://soap/", "deleteUserResponse");
    private final static QName _GetSpecificUser_QNAME = new QName("http://soap/", "getSpecificUser");
    private final static QName _GetSpecificUserResponse_QNAME = new QName("http://soap/", "getSpecificUserResponse");
    private final static QName _ObjectAlreadyExistsException_QNAME = new QName("http://soap/", "ObjectAlreadyExistsException");
    private final static QName _AddUserResponse_QNAME = new QName("http://soap/", "addUserResponse");
    private final static QName _UpdateUserResponse_QNAME = new QName("http://soap/", "updateUserResponse");
    private final static QName _GetAllUsersResponse_QNAME = new QName("http://soap/", "getAllUsersResponse");
    private final static QName _GetAllUsers_QNAME = new QName("http://soap/", "getAllUsers");
    private final static QName _AddUser_QNAME = new QName("http://soap/", "addUser");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllUsers }
     * 
     */
    public GetAllUsers createGetAllUsers() {
        return new GetAllUsers();
    }

    /**
     * Create an instance of {@link GetAllUsersResponse }
     * 
     */
    public GetAllUsersResponse createGetAllUsersResponse() {
        return new GetAllUsersResponse();
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link UpdateUser }
     * 
     */
    public UpdateUser createUpdateUser() {
        return new UpdateUser();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     * 
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link GetSpecificUserResponse }
     * 
     */
    public GetSpecificUserResponse createGetSpecificUserResponse() {
        return new GetSpecificUserResponse();
    }

    /**
     * Create an instance of {@link ObjectAlreadyExistsException }
     * 
     */
    public ObjectAlreadyExistsException createObjectAlreadyExistsException() {
        return new ObjectAlreadyExistsException();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link GetSpecificUser }
     * 
     */
    public GetSpecificUser createGetSpecificUser() {
        return new GetSpecificUser();
    }

    /**
     * Create an instance of {@link UpdateObjectNotExistException }
     * 
     */
    public UpdateObjectNotExistException createUpdateObjectNotExistException() {
        return new UpdateObjectNotExistException();
    }

    /**
     * Create an instance of {@link SessionDto }
     * 
     */
    public SessionDto createSessionDto() {
        return new SessionDto();
    }

    /**
     * Create an instance of {@link UserDto }
     * 
     */
    public UserDto createUserDto() {
        return new UserDto();
    }

    /**
     * Create an instance of {@link Timestamp }
     * 
     */
    public Timestamp createTimestamp() {
        return new Timestamp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "updateUser")
    public JAXBElement<UpdateUser> createUpdateUser(UpdateUser value) {
        return new JAXBElement<UpdateUser>(_UpdateUser_QNAME, UpdateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "deleteUser")
    public JAXBElement<DeleteUser> createDeleteUser(DeleteUser value) {
        return new JAXBElement<DeleteUser>(_DeleteUser_QNAME, DeleteUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateObjectNotExistException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "UpdateObjectNotExistException")
    public JAXBElement<UpdateObjectNotExistException> createUpdateObjectNotExistException(UpdateObjectNotExistException value) {
        return new JAXBElement<UpdateObjectNotExistException>(_UpdateObjectNotExistException_QNAME, UpdateObjectNotExistException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "deleteUserResponse")
    public JAXBElement<DeleteUserResponse> createDeleteUserResponse(DeleteUserResponse value) {
        return new JAXBElement<DeleteUserResponse>(_DeleteUserResponse_QNAME, DeleteUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSpecificUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "getSpecificUser")
    public JAXBElement<GetSpecificUser> createGetSpecificUser(GetSpecificUser value) {
        return new JAXBElement<GetSpecificUser>(_GetSpecificUser_QNAME, GetSpecificUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSpecificUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "getSpecificUserResponse")
    public JAXBElement<GetSpecificUserResponse> createGetSpecificUserResponse(GetSpecificUserResponse value) {
        return new JAXBElement<GetSpecificUserResponse>(_GetSpecificUserResponse_QNAME, GetSpecificUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectAlreadyExistsException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "ObjectAlreadyExistsException")
    public JAXBElement<ObjectAlreadyExistsException> createObjectAlreadyExistsException(ObjectAlreadyExistsException value) {
        return new JAXBElement<ObjectAlreadyExistsException>(_ObjectAlreadyExistsException_QNAME, ObjectAlreadyExistsException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "addUserResponse")
    public JAXBElement<AddUserResponse> createAddUserResponse(AddUserResponse value) {
        return new JAXBElement<AddUserResponse>(_AddUserResponse_QNAME, AddUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "updateUserResponse")
    public JAXBElement<UpdateUserResponse> createUpdateUserResponse(UpdateUserResponse value) {
        return new JAXBElement<UpdateUserResponse>(_UpdateUserResponse_QNAME, UpdateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "getAllUsersResponse")
    public JAXBElement<GetAllUsersResponse> createGetAllUsersResponse(GetAllUsersResponse value) {
        return new JAXBElement<GetAllUsersResponse>(_GetAllUsersResponse_QNAME, GetAllUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "getAllUsers")
    public JAXBElement<GetAllUsers> createGetAllUsers(GetAllUsers value) {
        return new JAXBElement<GetAllUsers>(_GetAllUsers_QNAME, GetAllUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "addUser")
    public JAXBElement<AddUser> createAddUser(AddUser value) {
        return new JAXBElement<AddUser>(_AddUser_QNAME, AddUser.class, null, value);
    }

}
