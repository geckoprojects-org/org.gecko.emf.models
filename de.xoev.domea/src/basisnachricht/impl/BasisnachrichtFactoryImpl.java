/**
 */
package basisnachricht.impl;

import basisnachricht.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasisnachrichtFactoryImpl extends EFactoryImpl implements BasisnachrichtFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasisnachrichtFactory init() {
		try {
			BasisnachrichtFactory theBasisnachrichtFactory = (BasisnachrichtFactory)EPackage.Registry.INSTANCE.getEFactory(BasisnachrichtPackage.eNS_URI);
			if (theBasisnachrichtFactory != null) {
				return theBasisnachrichtFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BasisnachrichtFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisnachrichtFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BasisnachrichtPackage.BEHOERDE_TYPE: return createBehoerdeType();
			case BasisnachrichtPackage.CODE_KOMMUNIKATION_KANAL_TYPE: return createCodeKommunikationKanalType();
			case BasisnachrichtPackage.CODE_VERZEICHNISDIENST_TYPE: return createCodeVerzeichnisdienstType();
			case BasisnachrichtPackage.IDENTIFIKATION_NACHRICHT_TYPE: return createIdentifikationNachrichtType();
			case BasisnachrichtPackage.KOMMUNIKATION_TYPE: return createKommunikationType();
			case BasisnachrichtPackage.NACHRICHTENKOPF_G2G_TYPE: return createNachrichtenkopfG2GType();
			case BasisnachrichtPackage.NACHRICHT_G2G_TYPE: return createNachrichtG2GType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BasisnachrichtPackage.UUID:
				return createUUIDFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BasisnachrichtPackage.UUID:
				return convertUUIDToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehoerdeType createBehoerdeType() {
		BehoerdeTypeImpl behoerdeType = new BehoerdeTypeImpl();
		return behoerdeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeKommunikationKanalType createCodeKommunikationKanalType() {
		CodeKommunikationKanalTypeImpl codeKommunikationKanalType = new CodeKommunikationKanalTypeImpl();
		return codeKommunikationKanalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeVerzeichnisdienstType createCodeVerzeichnisdienstType() {
		CodeVerzeichnisdienstTypeImpl codeVerzeichnisdienstType = new CodeVerzeichnisdienstTypeImpl();
		return codeVerzeichnisdienstType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentifikationNachrichtType createIdentifikationNachrichtType() {
		IdentifikationNachrichtTypeImpl identifikationNachrichtType = new IdentifikationNachrichtTypeImpl();
		return identifikationNachrichtType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KommunikationType createKommunikationType() {
		KommunikationTypeImpl kommunikationType = new KommunikationTypeImpl();
		return kommunikationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachrichtenkopfG2GType createNachrichtenkopfG2GType() {
		NachrichtenkopfG2GTypeImpl nachrichtenkopfG2GType = new NachrichtenkopfG2GTypeImpl();
		return nachrichtenkopfG2GType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachrichtG2GType createNachrichtG2GType() {
		NachrichtG2GTypeImpl nachrichtG2GType = new NachrichtG2GTypeImpl();
		return nachrichtG2GType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUUIDFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NORMALIZED_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUUIDToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NORMALIZED_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasisnachrichtPackage getBasisnachrichtPackage() {
		return (BasisnachrichtPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BasisnachrichtPackage getPackage() {
		return BasisnachrichtPackage.eINSTANCE;
	}

} //BasisnachrichtFactoryImpl
