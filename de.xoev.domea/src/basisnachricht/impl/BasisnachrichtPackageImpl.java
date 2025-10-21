/**
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package basisnachricht.impl;

import basisnachricht.BasisnachrichtFactory;
import basisnachricht.BasisnachrichtPackage;
import basisnachricht.BehoerdeType;
import basisnachricht.CodeKommunikationKanalType;
import basisnachricht.CodeVerzeichnisdienstType;
import basisnachricht.IdentifikationNachrichtType;
import basisnachricht.KommunikationType;
import basisnachricht.NachrichtG2GType;
import basisnachricht.NachrichtenkopfG2GType;

import basisnachricht.util.BasisnachrichtValidator;

import code.CodePackage;

import code.impl.CodePackageImpl;

import datatypedin.DatatypedinPackage;

import datatypedin.impl.DatatypedinPackageImpl;

import de.xoev.domea.domea.DomeaPackage;

import de.xoev.domea.domea.impl.DomeaPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasisnachrichtPackageImpl extends EPackageImpl implements BasisnachrichtPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behoerdeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeKommunikationKanalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeVerzeichnisdienstTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifikationNachrichtTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kommunikationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nachrichtenkopfG2GTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nachrichtG2GTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uuidEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see basisnachricht.BasisnachrichtPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasisnachrichtPackageImpl() {
		super(eNS_URI, BasisnachrichtFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BasisnachrichtPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasisnachrichtPackage init() {
		if (isInited) return (BasisnachrichtPackage)EPackage.Registry.INSTANCE.getEPackage(BasisnachrichtPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBasisnachrichtPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BasisnachrichtPackageImpl theBasisnachrichtPackage = registeredBasisnachrichtPackage instanceof BasisnachrichtPackageImpl ? (BasisnachrichtPackageImpl)registeredBasisnachrichtPackage : new BasisnachrichtPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI);
		CodePackageImpl theCodePackage = (CodePackageImpl)(registeredPackage instanceof CodePackageImpl ? registeredPackage : CodePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DatatypedinPackage.eNS_URI);
		DatatypedinPackageImpl theDatatypedinPackage = (DatatypedinPackageImpl)(registeredPackage instanceof DatatypedinPackageImpl ? registeredPackage : DatatypedinPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DomeaPackage.eNS_URI);
		DomeaPackageImpl theDomeaPackage = (DomeaPackageImpl)(registeredPackage instanceof DomeaPackageImpl ? registeredPackage : DomeaPackage.eINSTANCE);

		// Create package meta-data objects
		theBasisnachrichtPackage.createPackageContents();
		theCodePackage.createPackageContents();
		theDatatypedinPackage.createPackageContents();
		theDomeaPackage.createPackageContents();

		// Initialize created meta-data
		theBasisnachrichtPackage.initializePackageContents();
		theCodePackage.initializePackageContents();
		theDatatypedinPackage.initializePackageContents();
		theDomeaPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theBasisnachrichtPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return BasisnachrichtValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theBasisnachrichtPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasisnachrichtPackage.eNS_URI, theBasisnachrichtPackage);
		return theBasisnachrichtPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBehoerdeType() {
		return behoerdeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehoerdeType_Verzeichnisdienst() {
		return (EReference)behoerdeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBehoerdeType_Kennung() {
		return (EAttribute)behoerdeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBehoerdeType_Name() {
		return (EAttribute)behoerdeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehoerdeType_Erreichbarkeit() {
		return (EReference)behoerdeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeKommunikationKanalType() {
		return codeKommunikationKanalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeVerzeichnisdienstType() {
		return codeVerzeichnisdienstTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifikationNachrichtType() {
		return identifikationNachrichtTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifikationNachrichtType_NachrichtenUUID() {
		return (EAttribute)identifikationNachrichtTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentifikationNachrichtType_Nachrichtentyp() {
		return (EReference)identifikationNachrichtTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifikationNachrichtType_Erstellungszeitpunkt() {
		return (EAttribute)identifikationNachrichtTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKommunikationType() {
		return kommunikationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKommunikationType_Kanal() {
		return (EReference)kommunikationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKommunikationType_Kennung() {
		return (EAttribute)kommunikationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKommunikationType_Zusatz() {
		return (EAttribute)kommunikationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNachrichtenkopfG2GType() {
		return nachrichtenkopfG2GTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachrichtenkopfG2GType_IdentifikationNachricht() {
		return (EReference)nachrichtenkopfG2GTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachrichtenkopfG2GType_Leser() {
		return (EReference)nachrichtenkopfG2GTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachrichtenkopfG2GType_Autor() {
		return (EReference)nachrichtenkopfG2GTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNachrichtG2GType() {
		return nachrichtG2GTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachrichtG2GType_NachrichtenkopfG2g() {
		return (EReference)nachrichtG2GTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachrichtG2GType_Produkt() {
		return (EAttribute)nachrichtG2GTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachrichtG2GType_Produkthersteller() {
		return (EAttribute)nachrichtG2GTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachrichtG2GType_Produktversion() {
		return (EAttribute)nachrichtG2GTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachrichtG2GType_Standard() {
		return (EAttribute)nachrichtG2GTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachrichtG2GType_Test() {
		return (EAttribute)nachrichtG2GTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachrichtG2GType_Version() {
		return (EAttribute)nachrichtG2GTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUUID() {
		return uuidEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasisnachrichtFactory getBasisnachrichtFactory() {
		return (BasisnachrichtFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		behoerdeTypeEClass = createEClass(BEHOERDE_TYPE);
		createEReference(behoerdeTypeEClass, BEHOERDE_TYPE__VERZEICHNISDIENST);
		createEAttribute(behoerdeTypeEClass, BEHOERDE_TYPE__KENNUNG);
		createEAttribute(behoerdeTypeEClass, BEHOERDE_TYPE__NAME);
		createEReference(behoerdeTypeEClass, BEHOERDE_TYPE__ERREICHBARKEIT);

		codeKommunikationKanalTypeEClass = createEClass(CODE_KOMMUNIKATION_KANAL_TYPE);

		codeVerzeichnisdienstTypeEClass = createEClass(CODE_VERZEICHNISDIENST_TYPE);

		identifikationNachrichtTypeEClass = createEClass(IDENTIFIKATION_NACHRICHT_TYPE);
		createEAttribute(identifikationNachrichtTypeEClass, IDENTIFIKATION_NACHRICHT_TYPE__NACHRICHTEN_UUID);
		createEReference(identifikationNachrichtTypeEClass, IDENTIFIKATION_NACHRICHT_TYPE__NACHRICHTENTYP);
		createEAttribute(identifikationNachrichtTypeEClass, IDENTIFIKATION_NACHRICHT_TYPE__ERSTELLUNGSZEITPUNKT);

		kommunikationTypeEClass = createEClass(KOMMUNIKATION_TYPE);
		createEReference(kommunikationTypeEClass, KOMMUNIKATION_TYPE__KANAL);
		createEAttribute(kommunikationTypeEClass, KOMMUNIKATION_TYPE__KENNUNG);
		createEAttribute(kommunikationTypeEClass, KOMMUNIKATION_TYPE__ZUSATZ);

		nachrichtenkopfG2GTypeEClass = createEClass(NACHRICHTENKOPF_G2G_TYPE);
		createEReference(nachrichtenkopfG2GTypeEClass, NACHRICHTENKOPF_G2G_TYPE__IDENTIFIKATION_NACHRICHT);
		createEReference(nachrichtenkopfG2GTypeEClass, NACHRICHTENKOPF_G2G_TYPE__LESER);
		createEReference(nachrichtenkopfG2GTypeEClass, NACHRICHTENKOPF_G2G_TYPE__AUTOR);

		nachrichtG2GTypeEClass = createEClass(NACHRICHT_G2G_TYPE);
		createEReference(nachrichtG2GTypeEClass, NACHRICHT_G2G_TYPE__NACHRICHTENKOPF_G2G);
		createEAttribute(nachrichtG2GTypeEClass, NACHRICHT_G2G_TYPE__PRODUKT);
		createEAttribute(nachrichtG2GTypeEClass, NACHRICHT_G2G_TYPE__PRODUKTHERSTELLER);
		createEAttribute(nachrichtG2GTypeEClass, NACHRICHT_G2G_TYPE__PRODUKTVERSION);
		createEAttribute(nachrichtG2GTypeEClass, NACHRICHT_G2G_TYPE__STANDARD);
		createEAttribute(nachrichtG2GTypeEClass, NACHRICHT_G2G_TYPE__TEST);
		createEAttribute(nachrichtG2GTypeEClass, NACHRICHT_G2G_TYPE__VERSION);

		// Create data types
		uuidEDataType = createEDataType(UUID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DatatypedinPackage theDatatypedinPackage = (DatatypedinPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypedinPackage.eNS_URI);
		CodePackage theCodePackage = (CodePackage)EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		codeKommunikationKanalTypeEClass.getESuperTypes().add(theCodePackage.getCode());
		codeVerzeichnisdienstTypeEClass.getESuperTypes().add(theCodePackage.getCode());

		// Initialize classes, features, and operations; add parameters
		initEClass(behoerdeTypeEClass, BehoerdeType.class, "BehoerdeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehoerdeType_Verzeichnisdienst(), this.getCodeVerzeichnisdienstType(), null, "verzeichnisdienst", null, 1, 1, BehoerdeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehoerdeType_Kennung(), theDatatypedinPackage.getDatatypeC(), "kennung", null, 1, 1, BehoerdeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehoerdeType_Name(), theDatatypedinPackage.getDatatypeC(), "name", null, 1, 1, BehoerdeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehoerdeType_Erreichbarkeit(), this.getKommunikationType(), null, "erreichbarkeit", null, 0, -1, BehoerdeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeKommunikationKanalTypeEClass, CodeKommunikationKanalType.class, "CodeKommunikationKanalType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeVerzeichnisdienstTypeEClass, CodeVerzeichnisdienstType.class, "CodeVerzeichnisdienstType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(identifikationNachrichtTypeEClass, IdentifikationNachrichtType.class, "IdentifikationNachrichtType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifikationNachrichtType_NachrichtenUUID(), this.getUUID(), "nachrichtenUUID", null, 1, 1, IdentifikationNachrichtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentifikationNachrichtType_Nachrichtentyp(), theCodePackage.getCode(), null, "nachrichtentyp", null, 1, 1, IdentifikationNachrichtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifikationNachrichtType_Erstellungszeitpunkt(), theXMLTypePackage.getDateTime(), "erstellungszeitpunkt", null, 1, 1, IdentifikationNachrichtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kommunikationTypeEClass, KommunikationType.class, "KommunikationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKommunikationType_Kanal(), this.getCodeKommunikationKanalType(), null, "kanal", null, 1, 1, KommunikationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKommunikationType_Kennung(), theDatatypedinPackage.getDatatypeC(), "kennung", null, 1, 1, KommunikationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKommunikationType_Zusatz(), theDatatypedinPackage.getDatatypeC(), "zusatz", null, 0, 1, KommunikationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nachrichtenkopfG2GTypeEClass, NachrichtenkopfG2GType.class, "NachrichtenkopfG2GType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNachrichtenkopfG2GType_IdentifikationNachricht(), this.getIdentifikationNachrichtType(), null, "identifikationNachricht", null, 1, 1, NachrichtenkopfG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachrichtenkopfG2GType_Leser(), this.getBehoerdeType(), null, "leser", null, 1, 1, NachrichtenkopfG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachrichtenkopfG2GType_Autor(), this.getBehoerdeType(), null, "autor", null, 1, 1, NachrichtenkopfG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nachrichtG2GTypeEClass, NachrichtG2GType.class, "NachrichtG2GType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNachrichtG2GType_NachrichtenkopfG2g(), this.getNachrichtenkopfG2GType(), null, "nachrichtenkopfG2g", null, 1, 1, NachrichtG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtG2GType_Produkt(), theDatatypedinPackage.getDatatypeC(), "produkt", null, 1, 1, NachrichtG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtG2GType_Produkthersteller(), theDatatypedinPackage.getDatatypeC(), "produkthersteller", null, 1, 1, NachrichtG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtG2GType_Produktversion(), theDatatypedinPackage.getDatatypeC(), "produktversion", null, 0, 1, NachrichtG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtG2GType_Standard(), theDatatypedinPackage.getDatatypeC(), "standard", null, 1, 1, NachrichtG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtG2GType_Test(), theDatatypedinPackage.getDatatypeC(), "test", null, 0, 1, NachrichtG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtG2GType_Version(), theDatatypedinPackage.getDatatypeC(), "version", null, 1, 1, NachrichtG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(uuidEDataType, String.class, "UUID", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// null
		createNullAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "\n           \n  <XOEVBibliothek>\n                \n    <nameLang>X\u00d6V-Bibliothek: Spezifikation der X\u00d6V-Datentypen und X\u00d6V-Kernkomponenten</nameLang>\n                \n    <nameKurz>X\u00d6V-Bibliothek</nameKurz>\n                \n    <nameTechnisch>XOEV-Bibliothek</nameTechnisch>\n                \n    <kennung>urn:xoev-de:kosit:xoev:bibliothek:xoevbibliothek</kennung>\n                \n    <beschreibung>Die X\u00d6V-Bibliothek ist der zentrale Ort zur Verwaltung und Bereitstellung aller X\u00d6V-spezifischer, zur Wiederverwendung vorgesehener X\u00d6V-Bausteine.\n\nAusnahme bilden die Bausteine der Art \"Codeliste\", die ausschlie\u00dflich \u00fcber das XRepository bereitgestellt werden.</beschreibung>\n                \n    <herausgebernameLang>Koordinierungsstelle f\u00fcr IT-Standards</herausgebernameLang>\n                \n    <herausgebernameKurz>KoSIT</herausgebernameKurz>\n                \n    <externeWebsite>http://www.xoev.de/de/bibliothek</externeWebsite>\n             \n  </XOEVBibliothek>\n           \n  <versionXOEVBibliothek>\n                \n    <version>2022-10-14</version>\n                \n    <lizenz>Creative Commons Namensnennung - Keine Bearbeitung 4.0 International</lizenz>\n                \n    <bezugsort>http://www.xoev.de/de/bibliothek</bezugsort>\n                \n    <aenderungZurVorversion>Die X\u00d6V-Bibliothek wurde um Inhalte zur Norm DIN 91379 erg\u00e4nzt. Die Version 1.1 der Datentypen zur X\u00d6V-Basisnachricht (qualified und unqualified) wurde erstellt, in der von dem Datentyp C der DIN SPEC 91379 auf den Datentyp C der Norm DIN 91379 umgestellt wurde.</aenderungZurVorversion>\n             \n  </versionXOEVBibliothek>\n        \n\n\n           \n  <XOEVBibliothek>\n                \n    <nameLang>X\u00d6V-Bibliothek: Spezifikation der X\u00d6V-Datentypen und X\u00d6V-Kernkomponenten</nameLang>\n                \n    <nameKurz>X\u00d6V-Bibliothek</nameKurz>\n                \n    <nameTechnisch>XOEV-Bibliothek</nameTechnisch>\n                \n    <kennung>urn:xoev-de:kosit:xoev:bibliothek:xoevbibliothek</kennung>\n                \n    <beschreibung>Die X\u00d6V-Bibliothek ist der zentrale Ort zur Verwaltung und Bereitstellung aller X\u00d6V-spezifischer, zur Wiederverwendung vorgesehener X\u00d6V-Bausteine.\n\nAusnahme bilden die Bausteine der Art \"Codeliste\", die ausschlie\u00dflich \u00fcber das XRepository bereitgestellt werden.</beschreibung>\n                \n    <herausgebernameLang>Koordinierungsstelle f\u00fcr IT-Standards</herausgebernameLang>\n                \n    <herausgebernameKurz>KoSIT</herausgebernameKurz>\n                \n    <externeWebsite>http://www.xoev.de/de/bibliothek</externeWebsite>\n             \n  </XOEVBibliothek>\n           \n  <versionXOEVBibliothek>\n                \n    <version>2022-10-14</version>\n                \n    <lizenz>Creative Commons Namensnennung - Keine Bearbeitung 4.0 International</lizenz>\n                \n    <bezugsort>http://www.xoev.de/de/bibliothek</bezugsort>\n                \n    <aenderungZurVorversion>Die X\u00d6V-Bibliothek wurde um Inhalte zur Norm DIN 91379 erg\u00e4nzt. Die Version 1.1 der Datentypen zur X\u00d6V-Basisnachricht (qualified und unqualified) wurde erstellt, in der von dem Datentyp C der DIN SPEC 91379 auf den Datentyp C der Norm DIN 91379 umgestellt wurde.</aenderungZurVorversion>\n             \n  </versionXOEVBibliothek>\n        \n"
		   });
		addAnnotation
		  (codeKommunikationKanalTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Kommunikationskanal / Erreichbarkeit</nameLang>\n                   \n    <nameKurz>Erreichbarkeit</nameKurz>\n                   \n    <nameTechnisch>erreichbarkeit</nameTechnisch>\n                   \n    <kennung>urn:de:xoev:codeliste:erreichbarkeit</kennung>\n                   \n    <beschreibung>Eine Liste der Kommunikationsmedien und -kan\u00e4le, \u00fcber die man eine Person oder Institution erreichen kann.</beschreibung>\n                   \n    <herausgebernameLang>Koordinierungsstelle f\u00fcr IT-Standards</herausgebernameLang>\n                   \n    <herausgebernameKurz>KoSIT</herausgebernameKurz>\n                \n  </codeliste>\n           \n"
		   });
		addAnnotation
		  (codeVerzeichnisdienstTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Verzeichnisdienst\n</nameLang>\n                   \n    <nameKurz>Verzeichnisdienst\n</nameKurz>\n                   \n    <nameTechnisch>verzeichnisdienst</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:kosit:codeliste:verzeichnisdienst</kennung>\n                   \n    <beschreibung>Liste der Verzeichnisdienste, in die Beh\u00f6rden / \u00f6ffentliche Stellen eingetragen sein k\u00f6nnen</beschreibung>\n                   \n    <herausgebernameLang>Koordinierungsstelle f\u00fcr IT-Standards</herausgebernameLang>\n                   \n    <herausgebernameKurz>KoSIT</herausgebernameKurz>\n                \n  </codeliste>\n           \n"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (behoerdeTypeEClass,
		   source,
		   new String[] {
			   "name", "BehoerdeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBehoerdeType_Verzeichnisdienst(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "verzeichnisdienst"
		   });
		addAnnotation
		  (getBehoerdeType_Kennung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kennung"
		   });
		addAnnotation
		  (getBehoerdeType_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "name"
		   });
		addAnnotation
		  (getBehoerdeType_Erreichbarkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "erreichbarkeit"
		   });
		addAnnotation
		  (codeKommunikationKanalTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.Kommunikation.KanalType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeVerzeichnisdienstTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.VerzeichnisdienstType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (identifikationNachrichtTypeEClass,
		   source,
		   new String[] {
			   "name", "Identifikation.NachrichtType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIdentifikationNachrichtType_NachrichtenUUID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachrichtenUUID"
		   });
		addAnnotation
		  (getIdentifikationNachrichtType_Nachrichtentyp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachrichtentyp"
		   });
		addAnnotation
		  (getIdentifikationNachrichtType_Erstellungszeitpunkt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "erstellungszeitpunkt"
		   });
		addAnnotation
		  (kommunikationTypeEClass,
		   source,
		   new String[] {
			   "name", "KommunikationType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKommunikationType_Kanal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kanal"
		   });
		addAnnotation
		  (getKommunikationType_Kennung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kennung"
		   });
		addAnnotation
		  (getKommunikationType_Zusatz(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zusatz"
		   });
		addAnnotation
		  (nachrichtenkopfG2GTypeEClass,
		   source,
		   new String[] {
			   "name", "Nachrichtenkopf.G2GType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNachrichtenkopfG2GType_IdentifikationNachricht(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "identifikation.nachricht"
		   });
		addAnnotation
		  (getNachrichtenkopfG2GType_Leser(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "leser"
		   });
		addAnnotation
		  (getNachrichtenkopfG2GType_Autor(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "autor"
		   });
		addAnnotation
		  (nachrichtG2GTypeEClass,
		   source,
		   new String[] {
			   "name", "Nachricht.G2GType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNachrichtG2GType_NachrichtenkopfG2g(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachrichtenkopf.g2g"
		   });
		addAnnotation
		  (getNachrichtG2GType_Produkt(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "produkt"
		   });
		addAnnotation
		  (getNachrichtG2GType_Produkthersteller(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "produkthersteller"
		   });
		addAnnotation
		  (getNachrichtG2GType_Produktversion(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "produktversion"
		   });
		addAnnotation
		  (getNachrichtG2GType_Standard(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "standard"
		   });
		addAnnotation
		  (getNachrichtG2GType_Test(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "test"
		   });
		addAnnotation
		  (getNachrichtG2GType_Version(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "version"
		   });
		addAnnotation
		  (uuidEDataType,
		   source,
		   new String[] {
			   "name", "UUID",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#normalizedString",
			   "pattern", "[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}"
		   });
	}

} //BasisnachrichtPackageImpl
