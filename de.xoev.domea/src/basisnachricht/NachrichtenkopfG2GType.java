/*
 */
package basisnachricht;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nachrichtenkopf G2G Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Nachrichtenkopf für Nachrichten zwischen Behörden und anderen (öffentlichen) Stellen. Der Nachrichtenkopf umfasst Angaben zur eindeutigen Identifikation des Autors und des Lesers der Nachricht sowie der Nachricht selbst.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link basisnachricht.NachrichtenkopfG2GType#getIdentifikationNachricht <em>Identifikation Nachricht</em>}</li>
 *   <li>{@link basisnachricht.NachrichtenkopfG2GType#getLeser <em>Leser</em>}</li>
 *   <li>{@link basisnachricht.NachrichtenkopfG2GType#getAutor <em>Autor</em>}</li>
 * </ul>
 *
 * @see basisnachricht.BasisnachrichtPackage#getNachrichtenkopfG2GType()
 * @model extendedMetaData="name='Nachrichtenkopf.G2GType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NachrichtenkopfG2GType extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifikation Nachricht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dieses Element enthält Angaben zur eindeutigen Identifikation einer Nachricht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifikation Nachricht</em>' containment reference.
	 * @see #setIdentifikationNachricht(IdentifikationNachrichtType)
	 * @see basisnachricht.BasisnachrichtPackage#getNachrichtenkopfG2GType_IdentifikationNachricht()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='identifikation.nachricht'"
	 * @generated
	 */
	IdentifikationNachrichtType getIdentifikationNachricht();

	/**
	 * Sets the value of the '{@link basisnachricht.NachrichtenkopfG2GType#getIdentifikationNachricht <em>Identifikation Nachricht</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifikation Nachricht</em>' containment reference.
	 * @see #getIdentifikationNachricht()
	 * @generated
	 */
	void setIdentifikationNachricht(IdentifikationNachrichtType value);

	/**
	 * Returns the value of the '<em><b>Leser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dieses Element enthält Angaben zum Leser der Nachricht. Der Leser ist die fachlich zuständige Behörde / öffentliche Stelle, der die Nachricht zugestellt werden soll und die die Nachricht fachlich verarbeiten soll.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Leser</em>' containment reference.
	 * @see #setLeser(BehoerdeType)
	 * @see basisnachricht.BasisnachrichtPackage#getNachrichtenkopfG2GType_Leser()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='leser'"
	 * @generated
	 */
	BehoerdeType getLeser();

	/**
	 * Sets the value of the '{@link basisnachricht.NachrichtenkopfG2GType#getLeser <em>Leser</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leser</em>' containment reference.
	 * @see #getLeser()
	 * @generated
	 */
	void setLeser(BehoerdeType value);

	/**
	 * Returns the value of the '<em><b>Autor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dieses Element enthält Angaben zum Autor der Nachricht, die es dem Leser ermöglichen, bei Bedarf mit dem Autor in Verbindung zu treten. Der Autor ist die fachlich zuständige Behörde / öffentliche Stelle, die die Nachricht erstellt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Autor</em>' containment reference.
	 * @see #setAutor(BehoerdeType)
	 * @see basisnachricht.BasisnachrichtPackage#getNachrichtenkopfG2GType_Autor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='autor'"
	 * @generated
	 */
	BehoerdeType getAutor();

	/**
	 * Sets the value of the '{@link basisnachricht.NachrichtenkopfG2GType#getAutor <em>Autor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autor</em>' containment reference.
	 * @see #getAutor()
	 * @generated
	 */
	void setAutor(BehoerdeType value);

} // NachrichtenkopfG2GType
