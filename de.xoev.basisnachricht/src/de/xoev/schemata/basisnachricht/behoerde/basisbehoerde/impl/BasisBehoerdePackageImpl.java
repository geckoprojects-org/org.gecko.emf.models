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
package de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.impl;

import de.xoev.kosit.datentyp._201903.din91379.DIN913791903Package;

import de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.BasisBehoerdeFactory;
import de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.BasisBehoerdePackage;
import de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.BehoerdeType;
import de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.CodeVerzeichnisdienstType;

import de.xoev.schemata.basisnachricht.g2g.basisg2g.BasisG2GPackage;

import de.xoev.schemata.basisnachricht.g2g.basisg2g.impl.BasisG2GPackageImpl;

import de.xoev.schemata.basisnachricht.kommunikation.basiskom.BasisKommunikationPackage;

import de.xoev.schemata.basisnachricht.kommunikation.basiskom.impl.BasisKommunikationPackageImpl;

import de.xoev.schemata.code.code.Code10Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasisBehoerdePackageImpl extends EPackageImpl implements BasisBehoerdePackage {
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
	private EClass codeVerzeichnisdienstTypeEClass = null;

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
	 * @see de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.BasisBehoerdePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasisBehoerdePackageImpl() {
		super(eNS_URI, BasisBehoerdeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BasisBehoerdePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasisBehoerdePackage init() {
		if (isInited) return (BasisBehoerdePackage)EPackage.Registry.INSTANCE.getEPackage(BasisBehoerdePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBasisBehoerdePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BasisBehoerdePackageImpl theBasisBehoerdePackage = registeredBasisBehoerdePackage instanceof BasisBehoerdePackageImpl ? (BasisBehoerdePackageImpl)registeredBasisBehoerdePackage : new BasisBehoerdePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DIN913791903Package.eINSTANCE.eClass();
		Code10Package.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasisG2GPackage.eNS_URI);
		BasisG2GPackageImpl theBasisG2GPackage = (BasisG2GPackageImpl)(registeredPackage instanceof BasisG2GPackageImpl ? registeredPackage : BasisG2GPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasisKommunikationPackage.eNS_URI);
		BasisKommunikationPackageImpl theBasisKommunikationPackage = (BasisKommunikationPackageImpl)(registeredPackage instanceof BasisKommunikationPackageImpl ? registeredPackage : BasisKommunikationPackage.eINSTANCE);

		// Create package meta-data objects
		theBasisBehoerdePackage.createPackageContents();
		theBasisG2GPackage.createPackageContents();
		theBasisKommunikationPackage.createPackageContents();

		// Initialize created meta-data
		theBasisBehoerdePackage.initializePackageContents();
		theBasisG2GPackage.initializePackageContents();
		theBasisKommunikationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBasisBehoerdePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasisBehoerdePackage.eNS_URI, theBasisBehoerdePackage);
		return theBasisBehoerdePackage;
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
	public EClass getCodeVerzeichnisdienstType() {
		return codeVerzeichnisdienstTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasisBehoerdeFactory getBasisBehoerdeFactory() {
		return (BasisBehoerdeFactory)getEFactoryInstance();
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

		codeVerzeichnisdienstTypeEClass = createEClass(CODE_VERZEICHNISDIENST_TYPE);
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
		BasisKommunikationPackage theBasisKommunikationPackage = (BasisKommunikationPackage)EPackage.Registry.INSTANCE.getEPackage(BasisKommunikationPackage.eNS_URI);
		Code10Package theCode10Package = (Code10Package)EPackage.Registry.INSTANCE.getEPackage(Code10Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		codeVerzeichnisdienstTypeEClass.getESuperTypes().add(theCode10Package.getCode());

		// Initialize classes, features, and operations; add parameters
		initEClass(behoerdeTypeEClass, BehoerdeType.class, "BehoerdeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehoerdeType_Verzeichnisdienst(), this.getCodeVerzeichnisdienstType(), null, "verzeichnisdienst", null, 1, 1, BehoerdeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehoerdeType_Kennung(), theDIN913791903Package.getDatatypeC(), "kennung", null, 1, 1, BehoerdeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehoerdeType_Name(), theDIN913791903Package.getDatatypeC(), "name", null, 1, 1, BehoerdeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehoerdeType_Erreichbarkeit(), theBasisKommunikationPackage.getKommunikationType(), null, "erreichbarkeit", null, 0, -1, BehoerdeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeVerzeichnisdienstTypeEClass, CodeVerzeichnisdienstType.class, "CodeVerzeichnisdienstType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
			   "name", "verzeichnisdienst",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBehoerdeType_Kennung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kennung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBehoerdeType_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBehoerdeType_Erreichbarkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "erreichbarkeit",
			   "namespace", "http://xoev.de/schemata/basisnachricht/kommunikation/1_0"
		   });
		addAnnotation
		  (codeVerzeichnisdienstTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.VerzeichnisdienstType",
			   "kind", "elementOnly"
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
		  (codeVerzeichnisdienstTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Verzeichnisdienst\n</nameLang>\n                   \n    <nameKurz>Verzeichnisdienst\n</nameKurz>\n                   \n    <nameTechnisch>verzeichnisdienst</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:kosit:codeliste:verzeichnisdienst</kennung>\n                   \n    <beschreibung>Liste der Verzeichnisdienste, in die Beh\u00f6rden / \u00f6ffentliche Stellen eingetragen sein k\u00f6nnen</beschreibung>\n                   \n    <herausgebernameLang>Koordinierungsstelle f\u00fcr IT-Standards</herausgebernameLang>\n                   \n    <herausgebernameKurz>KoSIT</herausgebernameKurz>\n                \n  </codeliste>\n           \n"
		   });
	}

} //BasisBehoerdePackageImpl
