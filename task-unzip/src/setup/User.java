/**
 */
package setup;

import org.eclipse.oomph.setup.LicenseInfo;

import org.eclipse.emf.common.util.EList;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link setup.User#getAttributeRules <em>Attribute Rules</em>}</li>
 *   <li>{@link setup.User#getAcceptedLicenses <em>Accepted Licenses</em>}</li>
 *   <li>{@link setup.User#getUnsignedPolicy <em>Unsigned Policy</em>}</li>
 *   <li>{@link setup.User#getQuestionnaireDate <em>Questionnaire Date</em>}</li>
 *   <li>{@link setup.User#isPreferenceRecorderDefault <em>Preference Recorder Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see setup.SetupPackage#getUser()
 * @model
 * @generated
 */
public interface User extends Scope
{
  /**
   * Returns the value of the '<em><b>Attribute Rules</b></em>' containment reference list.
   * The list contents are of type {@link setup.AttributeRule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Rules</em>' containment reference list.
   * @see setup.SetupPackage#getUser_AttributeRules()
   * @model containment="true" keys="attributeURI"
   *        extendedMetaData="name='attributeRule'"
   * @generated
   */
  EList<AttributeRule> getAttributeRules();

  /**
   * Returns the value of the '<em><b>Accepted Licenses</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.oomph.setup.LicenseInfo}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Accepted Licenses</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Accepted Licenses</em>' attribute list.
   * @see setup.SetupPackage#getUser_AcceptedLicenses()
   * @model dataType="setup.LicenseInfo"
   *        extendedMetaData="name='acceptedLicense'"
   * @generated
   */
  EList<LicenseInfo> getAcceptedLicenses();

  /**
   * Returns the value of the '<em><b>Unsigned Policy</b></em>' attribute.
   * The default value is <code>"PROMPT"</code>.
   * The literals are from the enumeration {@link setup.UnsignedPolicy}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unsigned Policy</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unsigned Policy</em>' attribute.
   * @see setup.UnsignedPolicy
   * @see #setUnsignedPolicy(UnsignedPolicy)
   * @see setup.SetupPackage#getUser_UnsignedPolicy()
   * @model default="PROMPT"
   * @generated
   */
  UnsignedPolicy getUnsignedPolicy();

  /**
   * Sets the value of the '{@link setup.User#getUnsignedPolicy <em>Unsigned Policy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unsigned Policy</em>' attribute.
   * @see setup.UnsignedPolicy
   * @see #getUnsignedPolicy()
   * @generated
   */
  void setUnsignedPolicy(UnsignedPolicy value);

  /**
   * Returns the value of the '<em><b>Questionnaire Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Questionnaire Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Questionnaire Date</em>' attribute.
   * @see #setQuestionnaireDate(Date)
   * @see setup.SetupPackage#getUser_QuestionnaireDate()
   * @model
   * @generated
   */
  Date getQuestionnaireDate();

  /**
   * Sets the value of the '{@link setup.User#getQuestionnaireDate <em>Questionnaire Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Questionnaire Date</em>' attribute.
   * @see #getQuestionnaireDate()
   * @generated
   */
  void setQuestionnaireDate(Date value);

  /**
   * Returns the value of the '<em><b>Preference Recorder Default</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Preference Recorder Default</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Preference Recorder Default</em>' attribute.
   * @see #setPreferenceRecorderDefault(boolean)
   * @see setup.SetupPackage#getUser_PreferenceRecorderDefault()
   * @model default="true"
   * @generated
   */
  boolean isPreferenceRecorderDefault();

  /**
   * Sets the value of the '{@link setup.User#isPreferenceRecorderDefault <em>Preference Recorder Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Preference Recorder Default</em>' attribute.
   * @see #isPreferenceRecorderDefault()
   * @generated
   */
  void setPreferenceRecorderDefault(boolean value);

} // User
