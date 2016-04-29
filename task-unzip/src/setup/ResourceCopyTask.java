/**
 */
package setup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Copy Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link setup.ResourceCopyTask#getSourceURL <em>Source URL</em>}</li>
 *   <li>{@link setup.ResourceCopyTask#getTargetURL <em>Target URL</em>}</li>
 * </ul>
 * </p>
 *
 * @see setup.SetupPackage#getResourceCopyTask()
 * @model
 * @generated
 */
public interface ResourceCopyTask extends SetupTask
{
  /**
   * Returns the value of the '<em><b>Source URL</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source URL</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source URL</em>' attribute.
   * @see #setSourceURL(String)
   * @see setup.SetupPackage#getResourceCopyTask_SourceURL()
   * @model required="true"
   * @generated
   */
  String getSourceURL();

  /**
   * Sets the value of the '{@link setup.ResourceCopyTask#getSourceURL <em>Source URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source URL</em>' attribute.
   * @see #getSourceURL()
   * @generated
   */
  void setSourceURL(String value);

  /**
   * Returns the value of the '<em><b>Target URL</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target URL</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target URL</em>' attribute.
   * @see #setTargetURL(String)
   * @see setup.SetupPackage#getResourceCopyTask_TargetURL()
   * @model required="true"
   * @generated
   */
  String getTargetURL();

  /**
   * Sets the value of the '{@link setup.ResourceCopyTask#getTargetURL <em>Target URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target URL</em>' attribute.
   * @see #getTargetURL()
   * @generated
   */
  void setTargetURL(String value);

} // ResourceCopyTask
