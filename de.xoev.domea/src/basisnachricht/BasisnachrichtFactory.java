/*
 */
package basisnachricht;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see basisnachricht.BasisnachrichtPackage
 * @generated
 */
@ProviderType
public interface BasisnachrichtFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasisnachrichtFactory eINSTANCE = basisnachricht.impl.BasisnachrichtFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Behoerde Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behoerde Type</em>'.
	 * @generated
	 */
	BehoerdeType createBehoerdeType();

	/**
	 * Returns a new object of class '<em>Code Kommunikation Kanal Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Kommunikation Kanal Type</em>'.
	 * @generated
	 */
	CodeKommunikationKanalType createCodeKommunikationKanalType();

	/**
	 * Returns a new object of class '<em>Code Verzeichnisdienst Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Verzeichnisdienst Type</em>'.
	 * @generated
	 */
	CodeVerzeichnisdienstType createCodeVerzeichnisdienstType();

	/**
	 * Returns a new object of class '<em>Identifikation Nachricht Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identifikation Nachricht Type</em>'.
	 * @generated
	 */
	IdentifikationNachrichtType createIdentifikationNachrichtType();

	/**
	 * Returns a new object of class '<em>Kommunikation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kommunikation Type</em>'.
	 * @generated
	 */
	KommunikationType createKommunikationType();

	/**
	 * Returns a new object of class '<em>Nachrichtenkopf G2G Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nachrichtenkopf G2G Type</em>'.
	 * @generated
	 */
	NachrichtenkopfG2GType createNachrichtenkopfG2GType();

	/**
	 * Returns a new object of class '<em>Nachricht G2G Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nachricht G2G Type</em>'.
	 * @generated
	 */
	NachrichtG2GType createNachrichtG2GType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BasisnachrichtPackage getBasisnachrichtPackage();

} //BasisnachrichtFactory
