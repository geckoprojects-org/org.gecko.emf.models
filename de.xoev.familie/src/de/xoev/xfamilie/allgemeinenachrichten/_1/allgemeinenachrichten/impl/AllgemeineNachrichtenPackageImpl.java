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
package de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl;

import de.xoev.kosit.datentyp._202204.din91379.DIN913792204Package;

import de.xoev.schemata.code.code.Code10Package;

import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage;

import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl;

import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenFactory;
import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage;
import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenQuittung0011Type;
import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenRueckweisung0001Type;
import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.CodeRueckweisungsgrundType;
import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.DocumentRoot;
import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisendeStelleType;
import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.Rueckweisungsgruende;
import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisungsgrundSpezifischType;
import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisungsgrundType;
import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.TransportinformationenType;

import de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage;

import de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl;

import de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage;

import de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl;

import de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage;

import de.xoev.xfamilie.dsrv._1.dsrv.impl.DSRVPackageImpl;

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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
public class AllgemeineNachrichtenPackageImpl extends EPackageImpl implements AllgemeineNachrichtenPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allgemeinenachrichtenQuittung0011TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allgemeinenachrichtenRueckweisung0001TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeRueckweisungsgrundTypeEClass = null;

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
	private EClass rueckweisendeStelleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rueckweisungsgrundSpezifischTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rueckweisungsgrundTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportinformationenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rueckweisungsgruendeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rueckweisungsgruendeObjectEDataType = null;

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
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AllgemeineNachrichtenPackageImpl() {
		super(eNS_URI, AllgemeineNachrichtenFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AllgemeineNachrichtenPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AllgemeineNachrichtenPackage init() {
		if (isInited) return (AllgemeineNachrichtenPackage)EPackage.Registry.INSTANCE.getEPackage(AllgemeineNachrichtenPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAllgemeineNachrichtenPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AllgemeineNachrichtenPackageImpl theAllgemeineNachrichtenPackage = registeredAllgemeineNachrichtenPackage instanceof AllgemeineNachrichtenPackageImpl ? (AllgemeineNachrichtenPackageImpl)registeredAllgemeineNachrichtenPackage : new AllgemeineNachrichtenPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BeistandschaftPackage.eNS_URI);
		BeistandschaftPackageImpl theBeistandschaftPackage = (BeistandschaftPackageImpl)(registeredPackage instanceof BeistandschaftPackageImpl ? registeredPackage : BeistandschaftPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DSRVPackage.eNS_URI);
		DSRVPackageImpl theDSRVPackage = (DSRVPackageImpl)(registeredPackage instanceof DSRVPackageImpl ? registeredPackage : DSRVPackage.eINSTANCE);
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
		theAllgemeineNachrichtenPackage.createPackageContents();
		theAdoptionPackage.createPackageContents();
		theBaukastenPackage.createPackageContents();
		theBeistandschaftPackage.createPackageContents();
		theDSRVPackage.createPackageContents();
		theGeburtPackage.createPackageContents();
		theErziehungshilfePackage.createPackageContents();
		theKinderwunschPackage.createPackageContents();
		theMutterschaftsgeldPackage.createPackageContents();

		// Initialize created meta-data
		theAllgemeineNachrichtenPackage.initializePackageContents();
		theAdoptionPackage.initializePackageContents();
		theBaukastenPackage.initializePackageContents();
		theBeistandschaftPackage.initializePackageContents();
		theDSRVPackage.initializePackageContents();
		theGeburtPackage.initializePackageContents();
		theErziehungshilfePackage.initializePackageContents();
		theKinderwunschPackage.initializePackageContents();
		theMutterschaftsgeldPackage.initializePackageContents();

		// Fix loaded packages
		theElterngeldPackage.fixPackageContents();
		theUnterhaltsvorschussPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theAllgemeineNachrichtenPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AllgemeineNachrichtenPackage.eNS_URI, theAllgemeineNachrichtenPackage);
		return theAllgemeineNachrichtenPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllgemeinenachrichtenQuittung0011Type() {
		return allgemeinenachrichtenQuittung0011TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllgemeinenachrichtenQuittung0011Type_IdentifikationNachricht() {
		return (EReference)allgemeinenachrichtenQuittung0011TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllgemeinenachrichtenRueckweisung0001Type() {
		return allgemeinenachrichtenRueckweisung0001TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllgemeinenachrichtenRueckweisung0001Type_RueckweisendeStelle() {
		return (EReference)allgemeinenachrichtenRueckweisung0001TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllgemeinenachrichtenRueckweisung0001Type_Rueckweisungsgrund() {
		return (EReference)allgemeinenachrichtenRueckweisung0001TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllgemeinenachrichtenRueckweisung0001Type_Transportinformationen() {
		return (EReference)allgemeinenachrichtenRueckweisung0001TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllgemeinenachrichtenRueckweisung0001Type_IdentifikationNachricht() {
		return (EReference)allgemeinenachrichtenRueckweisung0001TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeinenachrichtenRueckweisung0001Type_Nachricht() {
		return (EAttribute)allgemeinenachrichtenRueckweisung0001TypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeRueckweisungsgrundType() {
		return codeRueckweisungsgrundTypeEClass;
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
	public EReference getDocumentRoot_AllgemeinenachrichtenQuittung0011() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AllgemeinenachrichtenRueckweisung0001() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRueckweisendeStelleType() {
		return rueckweisendeStelleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRueckweisendeStelleType_Pruefinstanz() {
		return (EAttribute)rueckweisendeStelleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRueckweisendeStelleType_Erreichbarkeit() {
		return (EReference)rueckweisendeStelleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRueckweisungsgrundSpezifischType() {
		return rueckweisungsgrundSpezifischTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRueckweisungsgrundSpezifischType_Code() {
		return (EReference)rueckweisungsgrundSpezifischTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRueckweisungsgrundSpezifischType_Beschreibung() {
		return (EAttribute)rueckweisungsgrundSpezifischTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRueckweisungsgrundType() {
		return rueckweisungsgrundTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRueckweisungsgrundType_Grund() {
		return (EReference)rueckweisungsgrundTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRueckweisungsgrundType_GrundSpezifisch() {
		return (EReference)rueckweisungsgrundTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransportinformationenType() {
		return transportinformationenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransportinformationenType_NachrichtenId() {
		return (EAttribute)transportinformationenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransportinformationenType_Betreff() {
		return (EAttribute)transportinformationenTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransportinformationenType_Sendezeitpunkt() {
		return (EAttribute)transportinformationenTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransportinformationenType_ErgaenzendeHinweise() {
		return (EAttribute)transportinformationenTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRueckweisungsgruende() {
		return rueckweisungsgruendeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRueckweisungsgruendeObject() {
		return rueckweisungsgruendeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllgemeineNachrichtenFactory getAllgemeineNachrichtenFactory() {
		return (AllgemeineNachrichtenFactory)getEFactoryInstance();
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
		allgemeinenachrichtenQuittung0011TypeEClass = createEClass(ALLGEMEINENACHRICHTEN_QUITTUNG0011_TYPE);
		createEReference(allgemeinenachrichtenQuittung0011TypeEClass, ALLGEMEINENACHRICHTEN_QUITTUNG0011_TYPE__IDENTIFIKATION_NACHRICHT);

		allgemeinenachrichtenRueckweisung0001TypeEClass = createEClass(ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE);
		createEReference(allgemeinenachrichtenRueckweisung0001TypeEClass, ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__RUECKWEISENDE_STELLE);
		createEReference(allgemeinenachrichtenRueckweisung0001TypeEClass, ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__RUECKWEISUNGSGRUND);
		createEReference(allgemeinenachrichtenRueckweisung0001TypeEClass, ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__TRANSPORTINFORMATIONEN);
		createEReference(allgemeinenachrichtenRueckweisung0001TypeEClass, ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__IDENTIFIKATION_NACHRICHT);
		createEAttribute(allgemeinenachrichtenRueckweisung0001TypeEClass, ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__NACHRICHT);

		codeRueckweisungsgrundTypeEClass = createEClass(CODE_RUECKWEISUNGSGRUND_TYPE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ALLGEMEINENACHRICHTEN_QUITTUNG0011);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001);

		rueckweisendeStelleTypeEClass = createEClass(RUECKWEISENDE_STELLE_TYPE);
		createEAttribute(rueckweisendeStelleTypeEClass, RUECKWEISENDE_STELLE_TYPE__PRUEFINSTANZ);
		createEReference(rueckweisendeStelleTypeEClass, RUECKWEISENDE_STELLE_TYPE__ERREICHBARKEIT);

		rueckweisungsgrundSpezifischTypeEClass = createEClass(RUECKWEISUNGSGRUND_SPEZIFISCH_TYPE);
		createEReference(rueckweisungsgrundSpezifischTypeEClass, RUECKWEISUNGSGRUND_SPEZIFISCH_TYPE__CODE);
		createEAttribute(rueckweisungsgrundSpezifischTypeEClass, RUECKWEISUNGSGRUND_SPEZIFISCH_TYPE__BESCHREIBUNG);

		rueckweisungsgrundTypeEClass = createEClass(RUECKWEISUNGSGRUND_TYPE);
		createEReference(rueckweisungsgrundTypeEClass, RUECKWEISUNGSGRUND_TYPE__GRUND);
		createEReference(rueckweisungsgrundTypeEClass, RUECKWEISUNGSGRUND_TYPE__GRUND_SPEZIFISCH);

		transportinformationenTypeEClass = createEClass(TRANSPORTINFORMATIONEN_TYPE);
		createEAttribute(transportinformationenTypeEClass, TRANSPORTINFORMATIONEN_TYPE__NACHRICHTEN_ID);
		createEAttribute(transportinformationenTypeEClass, TRANSPORTINFORMATIONEN_TYPE__BETREFF);
		createEAttribute(transportinformationenTypeEClass, TRANSPORTINFORMATIONEN_TYPE__SENDEZEITPUNKT);
		createEAttribute(transportinformationenTypeEClass, TRANSPORTINFORMATIONEN_TYPE__ERGAENZENDE_HINWEISE);

		// Create enums
		rueckweisungsgruendeEEnum = createEEnum(RUECKWEISUNGSGRUENDE);

		// Create data types
		rueckweisungsgruendeObjectEDataType = createEDataType(RUECKWEISUNGSGRUENDE_OBJECT);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		Code10Package theCode10Package = (Code10Package)EPackage.Registry.INSTANCE.getEPackage(Code10Package.eNS_URI);
		DIN913792204Package theDIN913792204Package = (DIN913792204Package)EPackage.Registry.INSTANCE.getEPackage(DIN913792204Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		allgemeinenachrichtenQuittung0011TypeEClass.getESuperTypes().add(theBaukastenPackage.getNachrichtType());
		allgemeinenachrichtenRueckweisung0001TypeEClass.getESuperTypes().add(theBaukastenPackage.getNachrichtType());
		codeRueckweisungsgrundTypeEClass.getESuperTypes().add(theCode10Package.getCode());

		// Initialize classes, features, and operations; add parameters
		initEClass(allgemeinenachrichtenQuittung0011TypeEClass, AllgemeinenachrichtenQuittung0011Type.class, "AllgemeinenachrichtenQuittung0011Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllgemeinenachrichtenQuittung0011Type_IdentifikationNachricht(), theBaukastenPackage.getIdentifikationNachrichtType(), null, "identifikationNachricht", null, 1, 1, AllgemeinenachrichtenQuittung0011Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allgemeinenachrichtenRueckweisung0001TypeEClass, AllgemeinenachrichtenRueckweisung0001Type.class, "AllgemeinenachrichtenRueckweisung0001Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllgemeinenachrichtenRueckweisung0001Type_RueckweisendeStelle(), this.getRueckweisendeStelleType(), null, "rueckweisendeStelle", null, 0, 1, AllgemeinenachrichtenRueckweisung0001Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllgemeinenachrichtenRueckweisung0001Type_Rueckweisungsgrund(), this.getRueckweisungsgrundType(), null, "rueckweisungsgrund", null, 1, -1, AllgemeinenachrichtenRueckweisung0001Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllgemeinenachrichtenRueckweisung0001Type_Transportinformationen(), this.getTransportinformationenType(), null, "transportinformationen", null, 0, 1, AllgemeinenachrichtenRueckweisung0001Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllgemeinenachrichtenRueckweisung0001Type_IdentifikationNachricht(), theBaukastenPackage.getIdentifikationNachrichtType(), null, "identifikationNachricht", null, 0, 1, AllgemeinenachrichtenRueckweisung0001Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllgemeinenachrichtenRueckweisung0001Type_Nachricht(), theXMLTypePackage.getBase64Binary(), "nachricht", null, 0, 1, AllgemeinenachrichtenRueckweisung0001Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeRueckweisungsgrundTypeEClass, CodeRueckweisungsgrundType.class, "CodeRueckweisungsgrundType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AllgemeinenachrichtenQuittung0011(), this.getAllgemeinenachrichtenQuittung0011Type(), null, "allgemeinenachrichtenQuittung0011", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AllgemeinenachrichtenRueckweisung0001(), this.getAllgemeinenachrichtenRueckweisung0001Type(), null, "allgemeinenachrichtenRueckweisung0001", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(rueckweisendeStelleTypeEClass, RueckweisendeStelleType.class, "RueckweisendeStelleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRueckweisendeStelleType_Pruefinstanz(), theDIN913792204Package.getDatatypeC(), "pruefinstanz", null, 1, 1, RueckweisendeStelleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRueckweisendeStelleType_Erreichbarkeit(), theBaukastenPackage.getErreichbarkeitType(), null, "erreichbarkeit", null, 1, -1, RueckweisendeStelleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rueckweisungsgrundSpezifischTypeEClass, RueckweisungsgrundSpezifischType.class, "RueckweisungsgrundSpezifischType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRueckweisungsgrundSpezifischType_Code(), theCode10Package.getCode(), null, "code", null, 0, 1, RueckweisungsgrundSpezifischType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRueckweisungsgrundSpezifischType_Beschreibung(), theDIN913792204Package.getDatatypeC(), "beschreibung", null, 0, 1, RueckweisungsgrundSpezifischType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rueckweisungsgrundTypeEClass, RueckweisungsgrundType.class, "RueckweisungsgrundType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRueckweisungsgrundType_Grund(), this.getCodeRueckweisungsgrundType(), null, "grund", null, 1, 1, RueckweisungsgrundType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRueckweisungsgrundType_GrundSpezifisch(), this.getRueckweisungsgrundSpezifischType(), null, "grundSpezifisch", null, 0, -1, RueckweisungsgrundType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transportinformationenTypeEClass, TransportinformationenType.class, "TransportinformationenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransportinformationenType_NachrichtenId(), theDIN913792204Package.getDatatypeC(), "nachrichtenId", null, 0, 1, TransportinformationenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransportinformationenType_Betreff(), theDIN913792204Package.getDatatypeC(), "betreff", null, 0, 1, TransportinformationenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransportinformationenType_Sendezeitpunkt(), theXMLTypePackage.getDateTime(), "sendezeitpunkt", null, 0, 1, TransportinformationenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransportinformationenType_ErgaenzendeHinweise(), theDIN913792204Package.getDatatypeC(), "ergaenzendeHinweise", null, 0, 1, TransportinformationenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(rueckweisungsgruendeEEnum, Rueckweisungsgruende.class, "Rueckweisungsgruende");
		addEEnumLiteral(rueckweisungsgruendeEEnum, Rueckweisungsgruende.S001);
		addEEnumLiteral(rueckweisungsgruendeEEnum, Rueckweisungsgruende.S010);
		addEEnumLiteral(rueckweisungsgruendeEEnum, Rueckweisungsgruende.S011);
		addEEnumLiteral(rueckweisungsgruendeEEnum, Rueckweisungsgruende.S100);
		addEEnumLiteral(rueckweisungsgruendeEEnum, Rueckweisungsgruende.S999);
		addEEnumLiteral(rueckweisungsgruendeEEnum, Rueckweisungsgruende.T000);
		addEEnumLiteral(rueckweisungsgruendeEEnum, Rueckweisungsgruende.T001);
		addEEnumLiteral(rueckweisungsgruendeEEnum, Rueckweisungsgruende.T002);
		addEEnumLiteral(rueckweisungsgruendeEEnum, Rueckweisungsgruende.T003);
		addEEnumLiteral(rueckweisungsgruendeEEnum, Rueckweisungsgruende.T010);
		addEEnumLiteral(rueckweisungsgruendeEEnum, Rueckweisungsgruende.T011);
		addEEnumLiteral(rueckweisungsgruendeEEnum, Rueckweisungsgruende.T020);
		addEEnumLiteral(rueckweisungsgruendeEEnum, Rueckweisungsgruende.T070);
		addEEnumLiteral(rueckweisungsgruendeEEnum, Rueckweisungsgruende.T080);
		addEEnumLiteral(rueckweisungsgruendeEEnum, Rueckweisungsgruende.T099);
		addEEnumLiteral(rueckweisungsgruendeEEnum, Rueckweisungsgruende.V000);
		addEEnumLiteral(rueckweisungsgruendeEEnum, Rueckweisungsgruende.X000);
		addEEnumLiteral(rueckweisungsgruendeEEnum, Rueckweisungsgruende.X001);
		addEEnumLiteral(rueckweisungsgruendeEEnum, Rueckweisungsgruende.X002);

		// Initialize data types
		initEDataType(rueckweisungsgruendeObjectEDataType, Rueckweisungsgruende.class, "RueckweisungsgruendeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (codeRueckweisungsgrundTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Rueckweisungsgruende</nameLang>\n                   \n    <nameKurz>Rueckweisungsgruende</nameKurz>\n                   \n    <nameTechnisch>rueckweisungsgruende</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:rueckweisungsgruende</kennung>\n                   \n    <beschreibung>Diese Tabelle f\u00fchrt m\u00f6gliche Gr\u00fcnde f\u00fcr eine R\u00fccksendung einer Nachricht an den Absender auf. Mit dem Pr\u00e4fix des jeweiligen Schl\u00fcssels wird folgende Systematik festgelegt: T (Transportproblem), X (formales Problem mit XML), V (Versionsproblem), S (nicht spezifikationskonform).</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (getDocumentRoot_AllgemeinenachrichtenQuittung0011(),
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <rechtsgrundlage>Rechtsgrundlage</rechtsgrundlage>\n           \n"
		   });
		addAnnotation
		  (getDocumentRoot_AllgemeinenachrichtenRueckweisung0001(),
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <rechtsgrundlage>Rechtsgrundlage</rechtsgrundlage>\n           \n"
		   });
		addAnnotation
		  (rueckweisungsgruendeEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Rueckweisungsgruende</nameLang>\n                   \n    <nameKurz>Rueckweisungsgruende</nameKurz>\n                   \n    <nameTechnisch>rueckweisungsgruende</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:rueckweisungsgruende</kennung>\n                   \n    <beschreibung>Diese Tabelle f\u00fchrt m\u00f6gliche Gr\u00fcnde f\u00fcr eine R\u00fccksendung einer Nachricht an den Absender auf. Mit dem Pr\u00e4fix des jeweiligen Schl\u00fcssels wird folgende Systematik festgelegt: T (Transportproblem), X (formales Problem mit XML), V (Versionsproblem), S (nicht spezifikationskonform).</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (rueckweisungsgruendeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Nicht spezifikationskonform: Die Nachricht ist nicht UTF-8 codiert</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (rueckweisungsgruendeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Nicht spezifikationskonform: Ung\u00fcltige Codeliste</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (rueckweisungsgruendeEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Nicht spezifikationskonform: Ung\u00fcltiger Code in einer Codeliste</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (rueckweisungsgruendeEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Nicht spezifikationskonform: R\u00fcckweisung aufgrund erneuter Lieferung eines bereits erfolgreich verarbeiteten Datensatzes</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (rueckweisungsgruendeEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Nicht spezifikationskonform aus anderen Gr\u00fcnden</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (rueckweisungsgruendeEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Das Zertifikat des Absenders ist abgelaufen</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (rueckweisungsgruendeEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Das Zertifikat des Absenders ist widerrufen</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (rueckweisungsgruendeEEnum.getELiterals().get(7),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Das Zertifikat des Absenders ist nicht g\u00fcltig</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (rueckweisungsgruendeEEnum.getELiterals().get(8),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Das Zertifikat des Absenders fehlt</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (rueckweisungsgruendeEEnum.getELiterals().get(9),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Die Signatur der Inhaltsdaten fehlt oder hat nicht das geforderte Signaturniveau</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (rueckweisungsgruendeEEnum.getELiterals().get(10),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Die Signatur der Inhaltsdaten ist nicht g\u00fcltig (Integrit\u00e4t verletzt)</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (rueckweisungsgruendeEEnum.getELiterals().get(11),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Die Inhaltsdaten k\u00f6nnen von dem Empf\u00e4nger nicht dechiffriert werden</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (rueckweisungsgruendeEEnum.getELiterals().get(12),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Der Absender ist zur Inanspruchnahme dieses Dienstes nicht berechtigt</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (rueckweisungsgruendeEEnum.getELiterals().get(13),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Die Nachricht ist dem falschen Empf\u00e4nger / Leser zugestellt worden, d. h. im Nachrichtenkopf ist eine abweichende Empf\u00e4ngerbeh\u00f6rde eingetragen (Irrl\u00e4ufer)</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (rueckweisungsgruendeEEnum.getELiterals().get(14),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Sonstiger Versto\u00df gegen Anforderungen des OSCI-Transport-Profils</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (rueckweisungsgruendeEEnum.getELiterals().get(15),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Nicht spezifikationskonform: Die Nachricht kann in der Version, die in der Nachricht angegeben wird, vom Empf\u00e4nger nicht bearbeitet werden (Der Dienst ist in dieser Version nicht oder nicht mehr bereit)</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (rueckweisungsgruendeEEnum.getELiterals().get(16),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Die Nachricht ist kein wohlgeformtes XML-Dokument</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (rueckweisungsgruendeEEnum.getELiterals().get(17),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Die Nachricht ist nicht valide zu dem Schema der in der Nachricht angegebenen Version</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (rueckweisungsgruendeEEnum.getELiterals().get(18),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Die Nachricht ist nicht valide zu den Schematron-Regeln, die f\u00fcr diese Nachricht gelten. Schematron-Fehlercode(s) werden als Unter-Codes mitgeteilt</beschreibung>\n                 \n"
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
		  (allgemeinenachrichtenQuittung0011TypeEClass,
		   source,
		   new String[] {
			   "name", "allgemeinenachrichten.quittung.0011_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAllgemeinenachrichtenQuittung0011Type_IdentifikationNachricht(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "identifikation.nachricht",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (allgemeinenachrichtenRueckweisung0001TypeEClass,
		   source,
		   new String[] {
			   "name", "allgemeinenachrichten.rueckweisung.0001_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAllgemeinenachrichtenRueckweisung0001Type_RueckweisendeStelle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "rueckweisendeStelle",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeinenachrichtenRueckweisung0001Type_Rueckweisungsgrund(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "rueckweisungsgrund",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeinenachrichtenRueckweisung0001Type_Transportinformationen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "transportinformationen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeinenachrichtenRueckweisung0001Type_IdentifikationNachricht(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "identifikation.nachricht",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeinenachrichtenRueckweisung0001Type_Nachricht(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachricht",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (codeRueckweisungsgrundTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.RueckweisungsgrundType",
			   "kind", "elementOnly"
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
		  (getDocumentRoot_AllgemeinenachrichtenQuittung0011(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "allgemeinenachrichten.quittung.0011",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_AllgemeinenachrichtenRueckweisung0001(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "allgemeinenachrichten.rueckweisung.0001",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (rueckweisendeStelleTypeEClass,
		   source,
		   new String[] {
			   "name", "RueckweisendeStelleType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRueckweisendeStelleType_Pruefinstanz(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "pruefinstanz",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRueckweisendeStelleType_Erreichbarkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "erreichbarkeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (rueckweisungsgruendeEEnum,
		   source,
		   new String[] {
			   "name", "rueckweisungsgruende"
		   });
		addAnnotation
		  (rueckweisungsgruendeObjectEDataType,
		   source,
		   new String[] {
			   "name", "rueckweisungsgruende:Object",
			   "baseType", "rueckweisungsgruende"
		   });
		addAnnotation
		  (rueckweisungsgrundSpezifischTypeEClass,
		   source,
		   new String[] {
			   "name", "RueckweisungsgrundSpezifischType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRueckweisungsgrundSpezifischType_Code(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "code",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRueckweisungsgrundSpezifischType_Beschreibung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "beschreibung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (rueckweisungsgrundTypeEClass,
		   source,
		   new String[] {
			   "name", "RueckweisungsgrundType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRueckweisungsgrundType_Grund(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "grund",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRueckweisungsgrundType_GrundSpezifisch(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "grundSpezifisch",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (transportinformationenTypeEClass,
		   source,
		   new String[] {
			   "name", "TransportinformationenType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTransportinformationenType_NachrichtenId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachrichtenId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTransportinformationenType_Betreff(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "betreff",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTransportinformationenType_Sendezeitpunkt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sendezeitpunkt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTransportinformationenType_ErgaenzendeHinweise(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ergaenzendeHinweise",
			   "namespace", "##targetNamespace"
		   });
	}

} //AllgemeineNachrichtenPackageImpl
