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
package de.xoev.xfamilie.dsrv._1.dsrv.impl;

import de.xoev.kosit.datentyp._202204.din91379.DIN913792204Package;

import de.xoev.schemata.code.code.Code10Package;

import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage;

import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl;

import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage;

import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeineNachrichtenPackageImpl;

import de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage;

import de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl;

import de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage;

import de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl;

import de.xoev.xfamilie.dsrv._1.dsrv.AnyTypeFamilieDSRVType;
import de.xoev.xfamilie.dsrv._1.dsrv.DSRVFactory;
import de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage;
import de.xoev.xfamilie.dsrv._1.dsrv.DocumentRoot;
import de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type;
import de.xoev.xfamilie.dsrv._1.dsrv.DsrvEinkommensdatenrvbea0402Type;
import de.xoev.xfamilie.dsrv._1.dsrv.DsrvStatusantwortrvbea0403Type;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl;

import de.xoev.xfamilie.geburt._1.geburt.GeburtPackage;

import de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl;

import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage;

import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl;

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage;

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl;

import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage;

import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldPackageImpl;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DSRVPackageImpl extends EPackageImpl implements DSRVPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyTypeFamilieDSRVTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsrvAnfragervbea0401TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsrvEinkommensdatenrvbea0402TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsrvStatusantwortrvbea0403TypeEClass = null;

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
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DSRVPackageImpl() {
		super(eNS_URI, DSRVFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DSRVPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DSRVPackage init() {
		if (isInited) return (DSRVPackage)EPackage.Registry.INSTANCE.getEPackage(DSRVPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDSRVPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DSRVPackageImpl theDSRVPackage = registeredDSRVPackage instanceof DSRVPackageImpl ? (DSRVPackageImpl)registeredDSRVPackage : new DSRVPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DIN913792204Package.eINSTANCE.eClass();
		Code10Package.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdoptionPackage.eNS_URI);
		AdoptionPackageImpl theAdoptionPackage = (AdoptionPackageImpl)(registeredPackage instanceof AdoptionPackageImpl ? registeredPackage : AdoptionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BaukastenPackage.eNS_URI);
		BaukastenPackageImpl theBaukastenPackage = (BaukastenPackageImpl)(registeredPackage instanceof BaukastenPackageImpl ? registeredPackage : BaukastenPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AllgemeineNachrichtenPackage.eNS_URI);
		AllgemeineNachrichtenPackageImpl theAllgemeineNachrichtenPackage = (AllgemeineNachrichtenPackageImpl)(registeredPackage instanceof AllgemeineNachrichtenPackageImpl ? registeredPackage : AllgemeineNachrichtenPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BeistandschaftPackage.eNS_URI);
		BeistandschaftPackageImpl theBeistandschaftPackage = (BeistandschaftPackageImpl)(registeredPackage instanceof BeistandschaftPackageImpl ? registeredPackage : BeistandschaftPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI);
		ElterngeldPackageImpl theElterngeldPackage = (ElterngeldPackageImpl)(registeredPackage instanceof ElterngeldPackageImpl ? registeredPackage : ElterngeldPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GeburtPackage.eNS_URI);
		GeburtPackageImpl theGeburtPackage = (GeburtPackageImpl)(registeredPackage instanceof GeburtPackageImpl ? registeredPackage : GeburtPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ErziehungshilfePackage.eNS_URI);
		ErziehungshilfePackageImpl theErziehungshilfePackage = (ErziehungshilfePackageImpl)(registeredPackage instanceof ErziehungshilfePackageImpl ? registeredPackage : ErziehungshilfePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KinderwunschPackage.eNS_URI);
		KinderwunschPackageImpl theKinderwunschPackage = (KinderwunschPackageImpl)(registeredPackage instanceof KinderwunschPackageImpl ? registeredPackage : KinderwunschPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MutterschaftsgeldPackage.eNS_URI);
		MutterschaftsgeldPackageImpl theMutterschaftsgeldPackage = (MutterschaftsgeldPackageImpl)(registeredPackage instanceof MutterschaftsgeldPackageImpl ? registeredPackage : MutterschaftsgeldPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI);
		UnterhaltsvorschussPackageImpl theUnterhaltsvorschussPackage = (UnterhaltsvorschussPackageImpl)(registeredPackage instanceof UnterhaltsvorschussPackageImpl ? registeredPackage : UnterhaltsvorschussPackage.eINSTANCE);

		// Load packages
		theElterngeldPackage.loadPackage();
		theUnterhaltsvorschussPackage.loadPackage();

		// Create package meta-data objects
		theDSRVPackage.createPackageContents();
		theAdoptionPackage.createPackageContents();
		theBaukastenPackage.createPackageContents();
		theAllgemeineNachrichtenPackage.createPackageContents();
		theBeistandschaftPackage.createPackageContents();
		theGeburtPackage.createPackageContents();
		theErziehungshilfePackage.createPackageContents();
		theKinderwunschPackage.createPackageContents();
		theMutterschaftsgeldPackage.createPackageContents();

		// Initialize created meta-data
		theDSRVPackage.initializePackageContents();
		theAdoptionPackage.initializePackageContents();
		theBaukastenPackage.initializePackageContents();
		theAllgemeineNachrichtenPackage.initializePackageContents();
		theBeistandschaftPackage.initializePackageContents();
		theGeburtPackage.initializePackageContents();
		theErziehungshilfePackage.initializePackageContents();
		theKinderwunschPackage.initializePackageContents();
		theMutterschaftsgeldPackage.initializePackageContents();

		// Fix loaded packages
		theElterngeldPackage.fixPackageContents();
		theUnterhaltsvorschussPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theDSRVPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DSRVPackage.eNS_URI, theDSRVPackage);
		return theDSRVPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnyTypeFamilieDSRVType() {
		return anyTypeFamilieDSRVTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnyTypeFamilieDSRVType_Any() {
		return (EAttribute)anyTypeFamilieDSRVTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DsrvAnfragervbea0401() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DsrvEinkommensdatenrvbea0402() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DsrvStatusantwortrvbea0403() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDsrvAnfragervbea0401Type() {
		return dsrvAnfragervbea0401TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDsrvAnfragervbea0401Type_AbfrageID() {
		return (EAttribute)dsrvAnfragervbea0401TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDsrvAnfragervbea0401Type_Anforderungsgrund() {
		return (EAttribute)dsrvAnfragervbea0401TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDsrvAnfragervbea0401Type_EinkommensDatenBisDatum() {
		return (EAttribute)dsrvAnfragervbea0401TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDsrvAnfragervbea0401Type_EinkommensDatenVonDatum() {
		return (EAttribute)dsrvAnfragervbea0401TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDsrvAnfragervbea0401Type_Geburt() {
		return (EReference)dsrvAnfragervbea0401TypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDsrvAnfragervbea0401Type_NameNatuerlichePerson() {
		return (EReference)dsrvAnfragervbea0401TypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDsrvAnfragervbea0401Type_Anschrift() {
		return (EReference)dsrvAnfragervbea0401TypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDsrvEinkommensdatenrvbea0402Type() {
		return dsrvEinkommensdatenrvbea0402TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDsrvEinkommensdatenrvbea0402Type_Dxeb() {
		return (EReference)dsrvEinkommensdatenrvbea0402TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDsrvEinkommensdatenrvbea0402Type_IfdNrArbeitgeber() {
		return (EAttribute)dsrvEinkommensdatenrvbea0402TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDsrvEinkommensdatenrvbea0402Type_AbfrageID() {
		return (EAttribute)dsrvEinkommensdatenrvbea0402TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDsrvStatusantwortrvbea0403Type() {
		return dsrvStatusantwortrvbea0403TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDsrvStatusantwortrvbea0403Type_AbfrageID() {
		return (EAttribute)dsrvStatusantwortrvbea0403TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDsrvStatusantwortrvbea0403Type_Rueckmeldung() {
		return (EReference)dsrvStatusantwortrvbea0403TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSRVFactory getDSRVFactory() {
		return (DSRVFactory)getEFactoryInstance();
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
		anyTypeFamilieDSRVTypeEClass = createEClass(ANY_TYPE_FAMILIE_DSRV_TYPE);
		createEAttribute(anyTypeFamilieDSRVTypeEClass, ANY_TYPE_FAMILIE_DSRV_TYPE__ANY);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DSRV_ANFRAGERVBEA0401);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DSRV_EINKOMMENSDATENRVBEA0402);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DSRV_STATUSANTWORTRVBEA0403);

		dsrvAnfragervbea0401TypeEClass = createEClass(DSRV_ANFRAGERVBEA0401_TYPE);
		createEAttribute(dsrvAnfragervbea0401TypeEClass, DSRV_ANFRAGERVBEA0401_TYPE__ABFRAGE_ID);
		createEAttribute(dsrvAnfragervbea0401TypeEClass, DSRV_ANFRAGERVBEA0401_TYPE__ANFORDERUNGSGRUND);
		createEAttribute(dsrvAnfragervbea0401TypeEClass, DSRV_ANFRAGERVBEA0401_TYPE__EINKOMMENS_DATEN_BIS_DATUM);
		createEAttribute(dsrvAnfragervbea0401TypeEClass, DSRV_ANFRAGERVBEA0401_TYPE__EINKOMMENS_DATEN_VON_DATUM);
		createEReference(dsrvAnfragervbea0401TypeEClass, DSRV_ANFRAGERVBEA0401_TYPE__GEBURT);
		createEReference(dsrvAnfragervbea0401TypeEClass, DSRV_ANFRAGERVBEA0401_TYPE__NAME_NATUERLICHE_PERSON);
		createEReference(dsrvAnfragervbea0401TypeEClass, DSRV_ANFRAGERVBEA0401_TYPE__ANSCHRIFT);

		dsrvEinkommensdatenrvbea0402TypeEClass = createEClass(DSRV_EINKOMMENSDATENRVBEA0402_TYPE);
		createEReference(dsrvEinkommensdatenrvbea0402TypeEClass, DSRV_EINKOMMENSDATENRVBEA0402_TYPE__DXEB);
		createEAttribute(dsrvEinkommensdatenrvbea0402TypeEClass, DSRV_EINKOMMENSDATENRVBEA0402_TYPE__IFD_NR_ARBEITGEBER);
		createEAttribute(dsrvEinkommensdatenrvbea0402TypeEClass, DSRV_EINKOMMENSDATENRVBEA0402_TYPE__ABFRAGE_ID);

		dsrvStatusantwortrvbea0403TypeEClass = createEClass(DSRV_STATUSANTWORTRVBEA0403_TYPE);
		createEAttribute(dsrvStatusantwortrvbea0403TypeEClass, DSRV_STATUSANTWORTRVBEA0403_TYPE__ABFRAGE_ID);
		createEReference(dsrvStatusantwortrvbea0403TypeEClass, DSRV_STATUSANTWORTRVBEA0403_TYPE__RUECKMELDUNG);
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
		BaukastenPackage theBaukastenPackage = (BaukastenPackage)EPackage.Registry.INSTANCE.getEPackage(BaukastenPackage.eNS_URI);
		DIN913792204Package theDIN913792204Package = (DIN913792204Package)EPackage.Registry.INSTANCE.getEPackage(DIN913792204Package.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dsrvAnfragervbea0401TypeEClass.getESuperTypes().add(theBaukastenPackage.getNachrichtType());
		dsrvEinkommensdatenrvbea0402TypeEClass.getESuperTypes().add(theBaukastenPackage.getNachrichtType());
		dsrvStatusantwortrvbea0403TypeEClass.getESuperTypes().add(theBaukastenPackage.getNachrichtType());

		// Initialize classes, features, and operations; add parameters
		initEClass(anyTypeFamilieDSRVTypeEClass, AnyTypeFamilieDSRVType.class, "AnyTypeFamilieDSRVType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnyTypeFamilieDSRVType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, AnyTypeFamilieDSRVType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DsrvAnfragervbea0401(), this.getDsrvAnfragervbea0401Type(), null, "dsrvAnfragervbea0401", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DsrvEinkommensdatenrvbea0402(), this.getDsrvEinkommensdatenrvbea0402Type(), null, "dsrvEinkommensdatenrvbea0402", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DsrvStatusantwortrvbea0403(), this.getDsrvStatusantwortrvbea0403Type(), null, "dsrvStatusantwortrvbea0403", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dsrvAnfragervbea0401TypeEClass, DsrvAnfragervbea0401Type.class, "DsrvAnfragervbea0401Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDsrvAnfragervbea0401Type_AbfrageID(), theBaukastenPackage.getUUIDType(), "abfrageID", null, 1, 1, DsrvAnfragervbea0401Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDsrvAnfragervbea0401Type_Anforderungsgrund(), theDIN913792204Package.getDatatypeC(), "anforderungsgrund", null, 1, 1, DsrvAnfragervbea0401Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDsrvAnfragervbea0401Type_EinkommensDatenBisDatum(), theBaukastenPackage.getJahrMonatType(), "einkommensDatenBisDatum", null, 1, 1, DsrvAnfragervbea0401Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDsrvAnfragervbea0401Type_EinkommensDatenVonDatum(), theBaukastenPackage.getJahrMonatType(), "einkommensDatenVonDatum", null, 1, 1, DsrvAnfragervbea0401Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDsrvAnfragervbea0401Type_Geburt(), theBaukastenPackage.getGeburtGeburtsortOptionalType(), null, "geburt", null, 1, 1, DsrvAnfragervbea0401Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDsrvAnfragervbea0401Type_NameNatuerlichePerson(), theBaukastenPackage.getNameNatuerlichePersonType(), null, "nameNatuerlichePerson", null, 1, 1, DsrvAnfragervbea0401Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDsrvAnfragervbea0401Type_Anschrift(), theBaukastenPackage.getPostalischeInlandsanschriftBasisType(), null, "anschrift", null, 1, 1, DsrvAnfragervbea0401Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dsrvEinkommensdatenrvbea0402TypeEClass, DsrvEinkommensdatenrvbea0402Type.class, "DsrvEinkommensdatenrvbea0402Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDsrvEinkommensdatenrvbea0402Type_Dxeb(), this.getAnyTypeFamilieDSRVType(), null, "dxeb", null, 0, 1, DsrvEinkommensdatenrvbea0402Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDsrvEinkommensdatenrvbea0402Type_IfdNrArbeitgeber(), theXMLTypePackage.getInteger(), "ifdNrArbeitgeber", null, 0, 1, DsrvEinkommensdatenrvbea0402Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDsrvEinkommensdatenrvbea0402Type_AbfrageID(), theBaukastenPackage.getUUIDType(), "abfrageID", null, 1, 1, DsrvEinkommensdatenrvbea0402Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dsrvStatusantwortrvbea0403TypeEClass, DsrvStatusantwortrvbea0403Type.class, "DsrvStatusantwortrvbea0403Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDsrvStatusantwortrvbea0403Type_AbfrageID(), theBaukastenPackage.getUUIDType(), "abfrageID", null, 1, 1, DsrvStatusantwortrvbea0403Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDsrvStatusantwortrvbea0403Type_Rueckmeldung(), this.getAnyTypeFamilieDSRVType(), null, "rueckmeldung", null, 0, 1, DsrvStatusantwortrvbea0403Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			   "appinfo", "\n           \n  <standard>\n                \n    <nameLang>XFamilie</nameLang>\n                \n    <nameKurz>XFamilie</nameKurz>\n                \n    <nameTechnisch>xfamilie</nameTechnisch>\n                \n    <kennung>urn:xoev-de:kosit:standard:xfamilie</kennung>\n                \n    <beschreibung>Projektziel ist die elektronische Kommunikation im Familienbereich zwischen verschiedenen Beh\u00f6rden, Institutionen, Registern und Onlineportalen, die Daten untereinander austauschen, zu unterst\u00fctzen. Der Nutzen des Projekts besteht in der Kostenreduktion und einer Verbesserung der Qualit\u00e4t von Daten f\u00fcr Familienleistungen, sowie einer Verbesserung der Interoperabilit\u00e4t von Akteuren im Familienbereich und weiteren Kommunikationspartner.</beschreibung>\n             \n  </standard>\n           \n  <versionStandard>\n                \n    <version>1.3.0</version>\n                \n    <beschreibung>Die \u00c4nderungshistorie befindet sich in Tabellenform nach Change Requests gegliedert in Kapitel E.</beschreibung>\n                \n    <versionXOEVProfil>3.0.2</versionXOEVProfil>\n                \n    <versionXOEVHandbuch>3.0.2</versionXOEVHandbuch>\n                \n    <versionXGenerator>3.1.0</versionXGenerator>\n                \n    <versionModellierungswerkzeug>19.0</versionModellierungswerkzeug>\n                \n    <nameModellierungswerkzeug>MagicDraw</nameModellierungswerkzeug>\n             \n  </versionStandard>\n        \n\n\n           \n  <standard>\n                \n    <nameLang>XFamilie</nameLang>\n                \n    <nameKurz>XFamilie</nameKurz>\n                \n    <nameTechnisch>xfamilie</nameTechnisch>\n                \n    <kennung>urn:xoev-de:kosit:standard:xfamilie</kennung>\n                \n    <beschreibung>Projektziel ist die elektronische Kommunikation im Familienbereich zwischen verschiedenen Beh\u00f6rden, Institutionen, Registern und Onlineportalen, die Daten untereinander austauschen, zu unterst\u00fctzen. Der Nutzen des Projekts besteht in der Kostenreduktion und einer Verbesserung der Qualit\u00e4t von Daten f\u00fcr Familienleistungen, sowie einer Verbesserung der Interoperabilit\u00e4t von Akteuren im Familienbereich und weiteren Kommunikationspartner.</beschreibung>\n             \n  </standard>\n           \n  <versionStandard>\n                \n    <version>1.3.0</version>\n                \n    <beschreibung>Die \u00c4nderungshistorie befindet sich in Tabellenform nach Change Requests gegliedert in Kapitel E.</beschreibung>\n                \n    <versionXOEVProfil>3.0.2</versionXOEVProfil>\n                \n    <versionXOEVHandbuch>3.0.2</versionXOEVHandbuch>\n                \n    <versionXGenerator>3.1.0</versionXGenerator>\n                \n    <versionModellierungswerkzeug>19.0</versionModellierungswerkzeug>\n                \n    <nameModellierungswerkzeug>MagicDraw</nameModellierungswerkzeug>\n             \n  </versionStandard>\n        \n"
		   });
		addAnnotation
		  (getDocumentRoot_DsrvAnfragervbea0401(),
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <rechtsgrundlage>Rechtsgrundlage</rechtsgrundlage>\n           \n"
		   });
		addAnnotation
		  (getDocumentRoot_DsrvEinkommensdatenrvbea0402(),
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <rechtsgrundlage>Rechtsgrundlage</rechtsgrundlage>\n           \n"
		   });
		addAnnotation
		  (getDocumentRoot_DsrvStatusantwortrvbea0403(),
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <rechtsgrundlage>Rechtsgrundlage</rechtsgrundlage>\n           \n"
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
		  (anyTypeFamilieDSRVTypeEClass,
		   source,
		   new String[] {
			   "name", "AnyTypeFamilieDSRVType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAnyTypeFamilieDSRVType_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "http://www.rvbea.de/XMLSchema/DXWL http://www.rvbea.de/XMLSchema/RVBEA_Antwort",
			   "name", ":0",
			   "processing", "lax"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_DsrvAnfragervbea0401(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dsrv.anfragervbea.0401",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_DsrvEinkommensdatenrvbea0402(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dsrv.einkommensdatenrvbea.0402",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_DsrvStatusantwortrvbea0403(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dsrv.statusantwortrvbea.0403",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dsrvAnfragervbea0401TypeEClass,
		   source,
		   new String[] {
			   "name", "dsrv.anfragervbea.0401_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDsrvAnfragervbea0401Type_AbfrageID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "abfrageID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDsrvAnfragervbea0401Type_Anforderungsgrund(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anforderungsgrund",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDsrvAnfragervbea0401Type_EinkommensDatenBisDatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "einkommensDatenBisDatum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDsrvAnfragervbea0401Type_EinkommensDatenVonDatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "einkommensDatenVonDatum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDsrvAnfragervbea0401Type_Geburt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDsrvAnfragervbea0401Type_NameNatuerlichePerson(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nameNatuerlichePerson",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDsrvAnfragervbea0401Type_Anschrift(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anschrift",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dsrvEinkommensdatenrvbea0402TypeEClass,
		   source,
		   new String[] {
			   "name", "dsrv.einkommensdatenrvbea.0402_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDsrvEinkommensdatenrvbea0402Type_Dxeb(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dxeb",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDsrvEinkommensdatenrvbea0402Type_IfdNrArbeitgeber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ifdNrArbeitgeber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDsrvEinkommensdatenrvbea0402Type_AbfrageID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "abfrageID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dsrvStatusantwortrvbea0403TypeEClass,
		   source,
		   new String[] {
			   "name", "dsrv.statusantwortrvbea.0403_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDsrvStatusantwortrvbea0403Type_AbfrageID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "abfrageID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDsrvStatusantwortrvbea0403Type_Rueckmeldung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "rueckmeldung",
			   "namespace", "##targetNamespace"
		   });
	}

} //DSRVPackageImpl
