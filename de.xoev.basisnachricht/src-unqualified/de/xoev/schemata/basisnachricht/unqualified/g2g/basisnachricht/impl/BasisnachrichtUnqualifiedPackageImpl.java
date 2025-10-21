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
package de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl;

import de.xoev.kosit.datentyp._201903.din91379.DIN913791903Package;

import de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BasisnachrichtUnqualifiedFactory;
import de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BasisnachrichtUnqualifiedPackage;
import de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BehoerdeType;
import de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.CodeKommunikationKanalType;
import de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.CodeVerzeichnisdienstType;
import de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.IdentifikationNachrichtType;
import de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.KommunikationType;
import de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.NachrichtG2GType;
import de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.NachrichtenkopfG2GType;

import de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.util.BasisnachrichtUnqualifiedValidator;

import de.xoev.schemata.code.code.Code10Package;

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
public class BasisnachrichtUnqualifiedPackageImpl extends EPackageImpl implements BasisnachrichtUnqualifiedPackage {
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
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BasisnachrichtUnqualifiedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasisnachrichtUnqualifiedPackageImpl() {
		super(eNS_URI, BasisnachrichtUnqualifiedFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BasisnachrichtUnqualifiedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasisnachrichtUnqualifiedPackage init() {
		if (isInited) return (BasisnachrichtUnqualifiedPackage)EPackage.Registry.INSTANCE.getEPackage(BasisnachrichtUnqualifiedPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBasisnachrichtUnqualifiedPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BasisnachrichtUnqualifiedPackageImpl theBasisnachrichtUnqualifiedPackage = registeredBasisnachrichtUnqualifiedPackage instanceof BasisnachrichtUnqualifiedPackageImpl ? (BasisnachrichtUnqualifiedPackageImpl)registeredBasisnachrichtUnqualifiedPackage : new BasisnachrichtUnqualifiedPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DIN913791903Package.eINSTANCE.eClass();
		Code10Package.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBasisnachrichtUnqualifiedPackage.createPackageContents();

		// Initialize created meta-data
		theBasisnachrichtUnqualifiedPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theBasisnachrichtUnqualifiedPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return BasisnachrichtUnqualifiedValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theBasisnachrichtUnqualifiedPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasisnachrichtUnqualifiedPackage.eNS_URI, theBasisnachrichtUnqualifiedPackage);
		return theBasisnachrichtUnqualifiedPackage;
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
	public BasisnachrichtUnqualifiedFactory getBasisnachrichtUnqualifiedFactory() {
		return (BasisnachrichtUnqualifiedFactory)getEFactoryInstance();
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
		DIN913791903Package theDIN913791903Package = (DIN913791903Package)EPackage.Registry.INSTANCE.getEPackage(DIN913791903Package.eNS_URI);
		Code10Package theCode10Package = (Code10Package)EPackage.Registry.INSTANCE.getEPackage(Code10Package.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		codeKommunikationKanalTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeVerzeichnisdienstTypeEClass.getESuperTypes().add(theCode10Package.getCode());

		// Initialize classes, features, and operations; add parameters
		initEClass(behoerdeTypeEClass, BehoerdeType.class, "BehoerdeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehoerdeType_Verzeichnisdienst(), this.getCodeVerzeichnisdienstType(), null, "verzeichnisdienst", null, 1, 1, BehoerdeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehoerdeType_Kennung(), theDIN913791903Package.getDatatypeC(), "kennung", null, 1, 1, BehoerdeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehoerdeType_Name(), theDIN913791903Package.getDatatypeC(), "name", null, 1, 1, BehoerdeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehoerdeType_Erreichbarkeit(), this.getKommunikationType(), null, "erreichbarkeit", null, 0, -1, BehoerdeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeKommunikationKanalTypeEClass, CodeKommunikationKanalType.class, "CodeKommunikationKanalType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeVerzeichnisdienstTypeEClass, CodeVerzeichnisdienstType.class, "CodeVerzeichnisdienstType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(identifikationNachrichtTypeEClass, IdentifikationNachrichtType.class, "IdentifikationNachrichtType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifikationNachrichtType_NachrichtenUUID(), this.getUUID(), "nachrichtenUUID", null, 1, 1, IdentifikationNachrichtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentifikationNachrichtType_Nachrichtentyp(), theCode10Package.getCode(), null, "nachrichtentyp", null, 1, 1, IdentifikationNachrichtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifikationNachrichtType_Erstellungszeitpunkt(), theXMLTypePackage.getDateTime(), "erstellungszeitpunkt", null, 1, 1, IdentifikationNachrichtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kommunikationTypeEClass, KommunikationType.class, "KommunikationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKommunikationType_Kanal(), this.getCodeKommunikationKanalType(), null, "kanal", null, 1, 1, KommunikationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKommunikationType_Kennung(), theDIN913791903Package.getDatatypeC(), "kennung", null, 1, 1, KommunikationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKommunikationType_Zusatz(), theDIN913791903Package.getDatatypeC(), "zusatz", null, 0, 1, KommunikationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nachrichtenkopfG2GTypeEClass, NachrichtenkopfG2GType.class, "NachrichtenkopfG2GType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNachrichtenkopfG2GType_IdentifikationNachricht(), this.getIdentifikationNachrichtType(), null, "identifikationNachricht", null, 1, 1, NachrichtenkopfG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachrichtenkopfG2GType_Leser(), this.getBehoerdeType(), null, "leser", null, 1, 1, NachrichtenkopfG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachrichtenkopfG2GType_Autor(), this.getBehoerdeType(), null, "autor", null, 1, 1, NachrichtenkopfG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nachrichtG2GTypeEClass, NachrichtG2GType.class, "NachrichtG2GType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNachrichtG2GType_NachrichtenkopfG2g(), this.getNachrichtenkopfG2GType(), null, "nachrichtenkopfG2g", null, 1, 1, NachrichtG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtG2GType_Produkt(), theDIN913791903Package.getDatatypeC(), "produkt", null, 1, 1, NachrichtG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtG2GType_Produkthersteller(), theDIN913791903Package.getDatatypeC(), "produkthersteller", null, 1, 1, NachrichtG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtG2GType_Produktversion(), theDIN913791903Package.getDatatypeC(), "produktversion", null, 0, 1, NachrichtG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtG2GType_Standard(), theDIN913791903Package.getDatatypeC(), "standard", null, 1, 1, NachrichtG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtG2GType_Test(), theDIN913791903Package.getDatatypeC(), "test", null, 0, 1, NachrichtG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtG2GType_Version(), theDIN913791903Package.getDatatypeC(), "version", null, 1, 1, NachrichtG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(uuidEDataType, String.class, "UUID", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// null
		createNullAnnotations();
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

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;
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

} //BasisnachrichtUnqualifiedPackageImpl
