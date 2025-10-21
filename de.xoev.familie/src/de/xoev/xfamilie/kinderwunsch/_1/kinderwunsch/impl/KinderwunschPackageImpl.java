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
package de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl;

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

import de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage;

import de.xoev.xfamilie.dsrv._1.dsrv.impl.DSRVPackageImpl;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl;

import de.xoev.xfamilie.geburt._1.geburt.GeburtPackage;

import de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl;

import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage;

import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl;

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AltersgrenzeType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AngabenZurBehandlungType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtNachreichungType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BefruchtungsbehandlungenType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.DocumentRoot;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenAuszahlungsantragType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschBewilligungsantrag1001Type;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschFactory;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschVerwendungsnachweispruefung1002Type;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KonfigurationsfragenBewilligungType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KonfigurationsfragenType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KrankenkasseType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachreichungType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweisType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseBerechnungZuwendungType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseRechnungenType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.PersonendatenType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VersuchType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.WohnsitzType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZusaetzlicheBeteiligungType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZuschuesseKrankenversicherungType;

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
public class KinderwunschPackageImpl extends EPackageImpl implements KinderwunschPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass altersgrenzeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angabenZurBehandlungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artDerBehandlungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artNachreichungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auszahlungsantragTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass befruchtungsbehandlungenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bewilligungsantragTypeEClass = null;

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
	private EClass einwilligungenAuszahlungsantragTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass einwilligungenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finanzierungsplanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kinderwunschBewilligungsantrag1001TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kinderwunschNachreichung1003TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kinderwunschVerwendungsnachweispruefung1002TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass konfigurationsfragenBewilligungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass konfigurationsfragenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass krankenkasseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nachreichungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nachweiseBerechnungZuwendungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nachweiseKinderwunschTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nachweiseRechnungenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nachweisTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personendatenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versuchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vorherigeBehandlungenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wohnsitzTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zusaetzlicheBeteiligungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zuschuesseKrankenversicherungTypeEClass = null;

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
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KinderwunschPackageImpl() {
		super(eNS_URI, KinderwunschFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link KinderwunschPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KinderwunschPackage init() {
		if (isInited) return (KinderwunschPackage)EPackage.Registry.INSTANCE.getEPackage(KinderwunschPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredKinderwunschPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		KinderwunschPackageImpl theKinderwunschPackage = registeredKinderwunschPackage instanceof KinderwunschPackageImpl ? (KinderwunschPackageImpl)registeredKinderwunschPackage : new KinderwunschPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DSRVPackage.eNS_URI);
		DSRVPackageImpl theDSRVPackage = (DSRVPackageImpl)(registeredPackage instanceof DSRVPackageImpl ? registeredPackage : DSRVPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI);
		ElterngeldPackageImpl theElterngeldPackage = (ElterngeldPackageImpl)(registeredPackage instanceof ElterngeldPackageImpl ? registeredPackage : ElterngeldPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GeburtPackage.eNS_URI);
		GeburtPackageImpl theGeburtPackage = (GeburtPackageImpl)(registeredPackage instanceof GeburtPackageImpl ? registeredPackage : GeburtPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ErziehungshilfePackage.eNS_URI);
		ErziehungshilfePackageImpl theErziehungshilfePackage = (ErziehungshilfePackageImpl)(registeredPackage instanceof ErziehungshilfePackageImpl ? registeredPackage : ErziehungshilfePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MutterschaftsgeldPackage.eNS_URI);
		MutterschaftsgeldPackageImpl theMutterschaftsgeldPackage = (MutterschaftsgeldPackageImpl)(registeredPackage instanceof MutterschaftsgeldPackageImpl ? registeredPackage : MutterschaftsgeldPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI);
		UnterhaltsvorschussPackageImpl theUnterhaltsvorschussPackage = (UnterhaltsvorschussPackageImpl)(registeredPackage instanceof UnterhaltsvorschussPackageImpl ? registeredPackage : UnterhaltsvorschussPackage.eINSTANCE);

		// Load packages
		theElterngeldPackage.loadPackage();
		theUnterhaltsvorschussPackage.loadPackage();

		// Create package meta-data objects
		theKinderwunschPackage.createPackageContents();
		theAdoptionPackage.createPackageContents();
		theBaukastenPackage.createPackageContents();
		theAllgemeineNachrichtenPackage.createPackageContents();
		theBeistandschaftPackage.createPackageContents();
		theDSRVPackage.createPackageContents();
		theGeburtPackage.createPackageContents();
		theErziehungshilfePackage.createPackageContents();
		theMutterschaftsgeldPackage.createPackageContents();

		// Initialize created meta-data
		theKinderwunschPackage.initializePackageContents();
		theAdoptionPackage.initializePackageContents();
		theBaukastenPackage.initializePackageContents();
		theAllgemeineNachrichtenPackage.initializePackageContents();
		theBeistandschaftPackage.initializePackageContents();
		theDSRVPackage.initializePackageContents();
		theGeburtPackage.initializePackageContents();
		theErziehungshilfePackage.initializePackageContents();
		theMutterschaftsgeldPackage.initializePackageContents();

		// Fix loaded packages
		theElterngeldPackage.fixPackageContents();
		theUnterhaltsvorschussPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theKinderwunschPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KinderwunschPackage.eNS_URI, theKinderwunschPackage);
		return theKinderwunschPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAltersgrenzeType() {
		return altersgrenzeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAltersgrenzeType_GeburtsdatumAustragendenPerson() {
		return (EAttribute)altersgrenzeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAltersgrenzeType_GeburtsdatumNichtaustragendenPerson() {
		return (EAttribute)altersgrenzeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAltersgrenzeType_KeinerKannAustragen() {
		return (EAttribute)altersgrenzeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAngabenZurBehandlungType() {
		return angabenZurBehandlungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZurBehandlungType_Erstantrag() {
		return (EAttribute)angabenZurBehandlungTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZurBehandlungType_AktenzeichenVorherigerAntrag() {
		return (EAttribute)angabenZurBehandlungTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZurBehandlungType_VorherigeBehandlungen() {
		return (EReference)angabenZurBehandlungTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArtDerBehandlungType() {
		return artDerBehandlungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtDerBehandlungType_ArtDerBehandlung() {
		return (EAttribute)artDerBehandlungTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtDerBehandlungType_NummerDesBehandlungszyklus() {
		return (EAttribute)artDerBehandlungTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtDerBehandlungType_VollstaendigeDurchfuehrungBehandlung() {
		return (EAttribute)artDerBehandlungTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtDerBehandlungType_SchwangerschaftEingetreten() {
		return (EAttribute)artDerBehandlungTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtDerBehandlungType_NummerBehandlungszyklus() {
		return (EAttribute)artDerBehandlungTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtDerBehandlungType_BestaetigungBehandlungNnichtBegonnen() {
		return (EAttribute)artDerBehandlungTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtDerBehandlungType_VoraussichtlicherBehandlungsbeginn() {
		return (EAttribute)artDerBehandlungTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArtNachreichungType() {
		return artNachreichungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuszahlungsantragType() {
		return auszahlungsantragTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuszahlungsantragType_AbfrageBewilligungsbescheid() {
		return (EAttribute)auszahlungsantragTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuszahlungsantragType_BundeslandFoerderstelle() {
		return (EAttribute)auszahlungsantragTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuszahlungsantragType_AktenzeichenBewilligungsantrag() {
		return (EAttribute)auszahlungsantragTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuszahlungsantragType_DatenschutzerklaerungSchwangerschaft() {
		return (EAttribute)auszahlungsantragTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuszahlungsantragType_ZustimmungDatenschutzerklaerungHerbeifuehrung() {
		return (EAttribute)auszahlungsantragTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuszahlungsantragType_Konfigurationsfragen() {
		return (EReference)auszahlungsantragTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuszahlungsantragType_AntragstellendePerson() {
		return (EReference)auszahlungsantragTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuszahlungsantragType_NichtaustragendePerson() {
		return (EReference)auszahlungsantragTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuszahlungsantragType_AngabenBankverbindung() {
		return (EReference)auszahlungsantragTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuszahlungsantragType_NachweiseBerechnungZuwendung() {
		return (EReference)auszahlungsantragTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuszahlungsantragType_EinwilligungenAuszahlungsantrag() {
		return (EReference)auszahlungsantragTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuszahlungsantragType_BestaetigungRichtigkeitAngaben() {
		return (EAttribute)auszahlungsantragTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBefruchtungsbehandlungenType() {
		return befruchtungsbehandlungenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBefruchtungsbehandlungenType_Versuch() {
		return (EReference)befruchtungsbehandlungenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBewilligungsantragType() {
		return bewilligungsantragTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBewilligungsantragType_StandortReproduktionsklinik() {
		return (EAttribute)bewilligungsantragTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBewilligungsantragType_Bundesland() {
		return (EReference)bewilligungsantragTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBewilligungsantragType_DatenschutzerklaerungSchwangerschaft() {
		return (EAttribute)bewilligungsantragTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBewilligungsantragType_DatenschutzerklaerungherbeifuehrungSchwangerschaft() {
		return (EAttribute)bewilligungsantragTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBewilligungsantragType_Konfigurationsfragen() {
		return (EReference)bewilligungsantragTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBewilligungsantragType_Familienstand() {
		return (EReference)bewilligungsantragTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBewilligungsantragType_GleicherHaushalt() {
		return (EAttribute)bewilligungsantragTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBewilligungsantragType_GruendegetrennterWohnsitz() {
		return (EAttribute)bewilligungsantragTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBewilligungsantragType_Altersgrenze() {
		return (EReference)bewilligungsantragTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBewilligungsantragType_ArtBehandlung() {
		return (EReference)bewilligungsantragTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBewilligungsantragType_AntragstellendePerson() {
		return (EReference)bewilligungsantragTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBewilligungsantragType_NichtaustragendePerson() {
		return (EReference)bewilligungsantragTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBewilligungsantragType_AngabenBehandlung() {
		return (EReference)bewilligungsantragTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBewilligungsantragType_Finanzierungsplan() {
		return (EReference)bewilligungsantragTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBewilligungsantragType_Nachweise() {
		return (EReference)bewilligungsantragTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBewilligungsantragType_Einwilligungen() {
		return (EReference)bewilligungsantragTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBewilligungsantragType_BestaetigungRichtigkeitAngaben() {
		return (EAttribute)bewilligungsantragTypeEClass.getEStructuralFeatures().get(16);
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
	public EReference getDocumentRoot_KinderwunschBewilligungsantrag1001() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_KinderwunschNachreichung1003() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_KinderwunschVerwendungsnachweispruefung1002() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEinwilligungenAuszahlungsantragType() {
		return einwilligungenAuszahlungsantragTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinwilligungenAuszahlungsantragType_ZustimmungDatenschutz() {
		return (EAttribute)einwilligungenAuszahlungsantragTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinwilligungenAuszahlungsantragType_ElektronischeBescheidzustellung() {
		return (EAttribute)einwilligungenAuszahlungsantragTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEinwilligungenType() {
		return einwilligungenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinwilligungenType_EinwilligungZurAuskunftseinholung() {
		return (EAttribute)einwilligungenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinwilligungenType_EinwilligungZurAuskunftseinholungEinschraenkungen() {
		return (EAttribute)einwilligungenTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinwilligungenType_EntbindungSchweigepflichtDerAerzte() {
		return (EAttribute)einwilligungenTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinwilligungenType_EinwilligungKostenuebernahmeregelungBehandlungsabbruch() {
		return (EAttribute)einwilligungenTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinwilligungenType_DatenschutzerklaerungHerbeifuehrungSchwangerschaft() {
		return (EAttribute)einwilligungenTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFinanzierungsplanType() {
		return finanzierungsplanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinanzierungsplanType_Gesamtkosten() {
		return (EAttribute)finanzierungsplanTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinanzierungsplanType_VoraussichtlicheErstattungGesetzlicheKrankenkasse() {
		return (EAttribute)finanzierungsplanTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinanzierungsplanType_VoraussichtlicheErstattungPrivateKrankenkasse() {
		return (EAttribute)finanzierungsplanTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinanzierungsplanType_VoraussichtlicheErstattungBeihilfe() {
		return (EAttribute)finanzierungsplanTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinanzierungsplanType_VoraussichtlicheErstattungHeilfuersorge() {
		return (EAttribute)finanzierungsplanTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinanzierungsplanType_VerbleibenderEigenanteilSelbstkostenanteil() {
		return (EAttribute)finanzierungsplanTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinanzierungsplanType_ZuwendungenGesamt() {
		return (EAttribute)finanzierungsplanTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKinderwunschBewilligungsantrag1001Type() {
		return kinderwunschBewilligungsantrag1001TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKinderwunschBewilligungsantrag1001Type_Bewilligungsantrag() {
		return (EReference)kinderwunschBewilligungsantrag1001TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKinderwunschNachreichung1003Type() {
		return kinderwunschNachreichung1003TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKinderwunschNachreichung1003Type_Bundesland() {
		return (EReference)kinderwunschNachreichung1003TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKinderwunschNachreichung1003Type_Bearbeitungsnummer() {
		return (EAttribute)kinderwunschNachreichung1003TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKinderwunschNachreichung1003Type_NichtaustragendePerson() {
		return (EReference)kinderwunschNachreichung1003TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKinderwunschNachreichung1003Type_AntragstellendePerson() {
		return (EReference)kinderwunschNachreichung1003TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKinderwunschNachreichung1003Type_Nachreichung() {
		return (EReference)kinderwunschNachreichung1003TypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKinderwunschNachreichung1003Type_DatenschutzerklaerungDerFoerderstelle() {
		return (EAttribute)kinderwunschNachreichung1003TypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKinderwunschNachreichung1003Type_BestaetigungRichtigkeitAngaben() {
		return (EAttribute)kinderwunschNachreichung1003TypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKinderwunschVerwendungsnachweispruefung1002Type() {
		return kinderwunschVerwendungsnachweispruefung1002TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKinderwunschVerwendungsnachweispruefung1002Type_Auszahlungsantrag() {
		return (EReference)kinderwunschVerwendungsnachweispruefung1002TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKonfigurationsfragenBewilligungType() {
		return konfigurationsfragenBewilligungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKonfigurationsfragenBewilligungType_GleicherHaushalt() {
		return (EAttribute)konfigurationsfragenBewilligungTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKonfigurationsfragenType() {
		return konfigurationsfragenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKonfigurationsfragenType_GleicherHaushalt() {
		return (EAttribute)konfigurationsfragenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKonfigurationsfragenType_AngabenZurBehandlung() {
		return (EReference)konfigurationsfragenTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKrankenkasseType() {
		return krankenkasseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKrankenkasseType_ArtKrankenkasse() {
		return (EReference)krankenkasseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKrankenkasseType_NameKrankenkasse() {
		return (EAttribute)krankenkasseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKrankenkasseType_NameBeihilfestelle() {
		return (EAttribute)krankenkasseTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKrankenkasseType_NameHeilfuersorge() {
		return (EAttribute)krankenkasseTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNachreichungType() {
		return nachreichungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachreichungType_ArtNachreichung() {
		return (EReference)nachreichungTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachreichungType_Nachweis() {
		return (EReference)nachreichungTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachreichungType_EinwilligungDatenverarbeitungDurchFoerderstelle() {
		return (EAttribute)nachreichungTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNachweiseBerechnungZuwendungType() {
		return nachweiseBerechnungZuwendungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachweiseBerechnungZuwendungType_NegativbescheinigungVersicherungKostentraeger() {
		return (EReference)nachweiseBerechnungZuwendungTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachweiseBerechnungZuwendungType_ZuschuesseKrankenversicherung() {
		return (EReference)nachweiseBerechnungZuwendungTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNachweiseKinderwunschType() {
		return nachweiseKinderwunschTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachweiseKinderwunschType_NachweisAktuellerWohnsitz() {
		return (EReference)nachweiseKinderwunschTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachweiseKinderwunschType_NachweisEheurkunde() {
		return (EReference)nachweiseKinderwunschTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachweiseKinderwunschType_DauerAngelegtePartnerschaft() {
		return (EReference)nachweiseKinderwunschTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachweiseKinderwunschType_KostenuebernahmeerklaerungNegativbescheid() {
		return (EReference)nachweiseKinderwunschTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachweiseKinderwunschType_NotwendigkeitsbescheinigungDesArztes() {
		return (EReference)nachweiseKinderwunschTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachweiseKinderwunschType_BehandlungsplanKostenvoranschlag() {
		return (EReference)nachweiseKinderwunschTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachweiseKinderwunschType_ErklaerungReproduktionseinrichtung() {
		return (EReference)nachweiseKinderwunschTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNachweiseRechnungenType() {
		return nachweiseRechnungenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachweiseRechnungenType_Rechnungsdatum() {
		return (EAttribute)nachweiseRechnungenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachweiseRechnungenType_Rechnungssteller() {
		return (EAttribute)nachweiseRechnungenTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachweiseRechnungenType_Betrag() {
		return (EAttribute)nachweiseRechnungenTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachweiseRechnungenType_SummeGesamtkosten() {
		return (EAttribute)nachweiseRechnungenTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachweiseRechnungenType_Nachweis() {
		return (EReference)nachweiseRechnungenTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNachweisType() {
		return nachweisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachweisType_NachweisVorhanden() {
		return (EAttribute)nachweisTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachweisType_Nachweis() {
		return (EReference)nachweisTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersonendatenType() {
		return personendatenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersonendatenType_Name() {
		return (EReference)personendatenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersonendatenType_Wohnsitz() {
		return (EReference)personendatenTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersonendatenType_Krankenkasse() {
		return (EReference)personendatenTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVersuchType() {
		return versuchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersuchType_NummerDesVersuchs() {
		return (EAttribute)versuchTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersuchType_DatumDesVersuchs() {
		return (EAttribute)versuchTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVersuchType_NachweisVierterVersuch() {
		return (EReference)versuchTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVorherigeBehandlungenType() {
		return vorherigeBehandlungenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVorherigeBehandlungenType_BisherGefoerderteBehandlungen() {
		return (EAttribute)vorherigeBehandlungenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVorherigeBehandlungenType_Befruchtungsbehandlungen() {
		return (EReference)vorherigeBehandlungenTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVorherigeBehandlungenType_Wiederholungsversuch() {
		return (EAttribute)vorherigeBehandlungenTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVorherigeBehandlungenType_NameReproduktionseinrichtung() {
		return (EAttribute)vorherigeBehandlungenTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVorherigeBehandlungenType_PostleitzahlReproduktionseinrichtung() {
		return (EAttribute)vorherigeBehandlungenTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVorherigeBehandlungenType_Beratung() {
		return (EAttribute)vorherigeBehandlungenTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVorherigeBehandlungenType_NachweisVierterVersuch() {
		return (EReference)vorherigeBehandlungenTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWohnsitzType() {
		return wohnsitzTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWohnsitzType_AnschriftInlandStrassenanschrift() {
		return (EReference)wohnsitzTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWohnsitzType_AbweichendeAdresseNPA() {
		return (EAttribute)wohnsitzTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWohnsitzType_Erreichbarkeit() {
		return (EReference)wohnsitzTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZusaetzlicheBeteiligungType() {
		return zusaetzlicheBeteiligungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZusaetzlicheBeteiligungType_ZusaetzlicheBeteiligung() {
		return (EAttribute)zusaetzlicheBeteiligungTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZusaetzlicheBeteiligungType_VorliegenNachweis() {
		return (EAttribute)zusaetzlicheBeteiligungTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZusaetzlicheBeteiligungType_Betrag() {
		return (EAttribute)zusaetzlicheBeteiligungTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZusaetzlicheBeteiligungType_Nachweis() {
		return (EReference)zusaetzlicheBeteiligungTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZuschuesseKrankenversicherungType() {
		return zuschuesseKrankenversicherungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZuschuesseKrankenversicherungType_BeteiligteKrankenkassen() {
		return (EAttribute)zuschuesseKrankenversicherungTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZuschuesseKrankenversicherungType_NegativbescheinigungVersicherungKostentraeger() {
		return (EReference)zuschuesseKrankenversicherungTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZuschuesseKrankenversicherungType_ZusaetzlicheBeteiligungGKV() {
		return (EReference)zuschuesseKrankenversicherungTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZuschuesseKrankenversicherungType_ZusaetzlicheBeteiligungPKV() {
		return (EReference)zuschuesseKrankenversicherungTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZuschuesseKrankenversicherungType_BeteiligungBeihilfe() {
		return (EReference)zuschuesseKrankenversicherungTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZuschuesseKrankenversicherungType_NachweiseRechnungen() {
		return (EReference)zuschuesseKrankenversicherungTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KinderwunschFactory getKinderwunschFactory() {
		return (KinderwunschFactory)getEFactoryInstance();
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
		altersgrenzeTypeEClass = createEClass(ALTERSGRENZE_TYPE);
		createEAttribute(altersgrenzeTypeEClass, ALTERSGRENZE_TYPE__GEBURTSDATUM_AUSTRAGENDEN_PERSON);
		createEAttribute(altersgrenzeTypeEClass, ALTERSGRENZE_TYPE__GEBURTSDATUM_NICHTAUSTRAGENDEN_PERSON);
		createEAttribute(altersgrenzeTypeEClass, ALTERSGRENZE_TYPE__KEINER_KANN_AUSTRAGEN);

		angabenZurBehandlungTypeEClass = createEClass(ANGABEN_ZUR_BEHANDLUNG_TYPE);
		createEAttribute(angabenZurBehandlungTypeEClass, ANGABEN_ZUR_BEHANDLUNG_TYPE__ERSTANTRAG);
		createEAttribute(angabenZurBehandlungTypeEClass, ANGABEN_ZUR_BEHANDLUNG_TYPE__AKTENZEICHEN_VORHERIGER_ANTRAG);
		createEReference(angabenZurBehandlungTypeEClass, ANGABEN_ZUR_BEHANDLUNG_TYPE__VORHERIGE_BEHANDLUNGEN);

		artDerBehandlungTypeEClass = createEClass(ART_DER_BEHANDLUNG_TYPE);
		createEAttribute(artDerBehandlungTypeEClass, ART_DER_BEHANDLUNG_TYPE__ART_DER_BEHANDLUNG);
		createEAttribute(artDerBehandlungTypeEClass, ART_DER_BEHANDLUNG_TYPE__NUMMER_DES_BEHANDLUNGSZYKLUS);
		createEAttribute(artDerBehandlungTypeEClass, ART_DER_BEHANDLUNG_TYPE__VOLLSTAENDIGE_DURCHFUEHRUNG_BEHANDLUNG);
		createEAttribute(artDerBehandlungTypeEClass, ART_DER_BEHANDLUNG_TYPE__SCHWANGERSCHAFT_EINGETRETEN);
		createEAttribute(artDerBehandlungTypeEClass, ART_DER_BEHANDLUNG_TYPE__NUMMER_BEHANDLUNGSZYKLUS);
		createEAttribute(artDerBehandlungTypeEClass, ART_DER_BEHANDLUNG_TYPE__BESTAETIGUNG_BEHANDLUNG_NNICHT_BEGONNEN);
		createEAttribute(artDerBehandlungTypeEClass, ART_DER_BEHANDLUNG_TYPE__VORAUSSICHTLICHER_BEHANDLUNGSBEGINN);

		artNachreichungTypeEClass = createEClass(ART_NACHREICHUNG_TYPE);

		auszahlungsantragTypeEClass = createEClass(AUSZAHLUNGSANTRAG_TYPE);
		createEAttribute(auszahlungsantragTypeEClass, AUSZAHLUNGSANTRAG_TYPE__ABFRAGE_BEWILLIGUNGSBESCHEID);
		createEAttribute(auszahlungsantragTypeEClass, AUSZAHLUNGSANTRAG_TYPE__BUNDESLAND_FOERDERSTELLE);
		createEAttribute(auszahlungsantragTypeEClass, AUSZAHLUNGSANTRAG_TYPE__AKTENZEICHEN_BEWILLIGUNGSANTRAG);
		createEAttribute(auszahlungsantragTypeEClass, AUSZAHLUNGSANTRAG_TYPE__DATENSCHUTZERKLAERUNG_SCHWANGERSCHAFT);
		createEAttribute(auszahlungsantragTypeEClass, AUSZAHLUNGSANTRAG_TYPE__ZUSTIMMUNG_DATENSCHUTZERKLAERUNG_HERBEIFUEHRUNG);
		createEReference(auszahlungsantragTypeEClass, AUSZAHLUNGSANTRAG_TYPE__KONFIGURATIONSFRAGEN);
		createEReference(auszahlungsantragTypeEClass, AUSZAHLUNGSANTRAG_TYPE__ANTRAGSTELLENDE_PERSON);
		createEReference(auszahlungsantragTypeEClass, AUSZAHLUNGSANTRAG_TYPE__NICHTAUSTRAGENDE_PERSON);
		createEReference(auszahlungsantragTypeEClass, AUSZAHLUNGSANTRAG_TYPE__ANGABEN_BANKVERBINDUNG);
		createEReference(auszahlungsantragTypeEClass, AUSZAHLUNGSANTRAG_TYPE__NACHWEISE_BERECHNUNG_ZUWENDUNG);
		createEReference(auszahlungsantragTypeEClass, AUSZAHLUNGSANTRAG_TYPE__EINWILLIGUNGEN_AUSZAHLUNGSANTRAG);
		createEAttribute(auszahlungsantragTypeEClass, AUSZAHLUNGSANTRAG_TYPE__BESTAETIGUNG_RICHTIGKEIT_ANGABEN);

		befruchtungsbehandlungenTypeEClass = createEClass(BEFRUCHTUNGSBEHANDLUNGEN_TYPE);
		createEReference(befruchtungsbehandlungenTypeEClass, BEFRUCHTUNGSBEHANDLUNGEN_TYPE__VERSUCH);

		bewilligungsantragTypeEClass = createEClass(BEWILLIGUNGSANTRAG_TYPE);
		createEAttribute(bewilligungsantragTypeEClass, BEWILLIGUNGSANTRAG_TYPE__STANDORT_REPRODUKTIONSKLINIK);
		createEReference(bewilligungsantragTypeEClass, BEWILLIGUNGSANTRAG_TYPE__BUNDESLAND);
		createEAttribute(bewilligungsantragTypeEClass, BEWILLIGUNGSANTRAG_TYPE__DATENSCHUTZERKLAERUNG_SCHWANGERSCHAFT);
		createEAttribute(bewilligungsantragTypeEClass, BEWILLIGUNGSANTRAG_TYPE__DATENSCHUTZERKLAERUNGHERBEIFUEHRUNG_SCHWANGERSCHAFT);
		createEReference(bewilligungsantragTypeEClass, BEWILLIGUNGSANTRAG_TYPE__KONFIGURATIONSFRAGEN);
		createEReference(bewilligungsantragTypeEClass, BEWILLIGUNGSANTRAG_TYPE__FAMILIENSTAND);
		createEAttribute(bewilligungsantragTypeEClass, BEWILLIGUNGSANTRAG_TYPE__GLEICHER_HAUSHALT);
		createEAttribute(bewilligungsantragTypeEClass, BEWILLIGUNGSANTRAG_TYPE__GRUENDEGETRENNTER_WOHNSITZ);
		createEReference(bewilligungsantragTypeEClass, BEWILLIGUNGSANTRAG_TYPE__ALTERSGRENZE);
		createEReference(bewilligungsantragTypeEClass, BEWILLIGUNGSANTRAG_TYPE__ART_BEHANDLUNG);
		createEReference(bewilligungsantragTypeEClass, BEWILLIGUNGSANTRAG_TYPE__ANTRAGSTELLENDE_PERSON);
		createEReference(bewilligungsantragTypeEClass, BEWILLIGUNGSANTRAG_TYPE__NICHTAUSTRAGENDE_PERSON);
		createEReference(bewilligungsantragTypeEClass, BEWILLIGUNGSANTRAG_TYPE__ANGABEN_BEHANDLUNG);
		createEReference(bewilligungsantragTypeEClass, BEWILLIGUNGSANTRAG_TYPE__FINANZIERUNGSPLAN);
		createEReference(bewilligungsantragTypeEClass, BEWILLIGUNGSANTRAG_TYPE__NACHWEISE);
		createEReference(bewilligungsantragTypeEClass, BEWILLIGUNGSANTRAG_TYPE__EINWILLIGUNGEN);
		createEAttribute(bewilligungsantragTypeEClass, BEWILLIGUNGSANTRAG_TYPE__BESTAETIGUNG_RICHTIGKEIT_ANGABEN);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__KINDERWUNSCH_BEWILLIGUNGSANTRAG1001);
		createEReference(documentRootEClass, DOCUMENT_ROOT__KINDERWUNSCH_NACHREICHUNG1003);
		createEReference(documentRootEClass, DOCUMENT_ROOT__KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002);

		einwilligungenAuszahlungsantragTypeEClass = createEClass(EINWILLIGUNGEN_AUSZAHLUNGSANTRAG_TYPE);
		createEAttribute(einwilligungenAuszahlungsantragTypeEClass, EINWILLIGUNGEN_AUSZAHLUNGSANTRAG_TYPE__ZUSTIMMUNG_DATENSCHUTZ);
		createEAttribute(einwilligungenAuszahlungsantragTypeEClass, EINWILLIGUNGEN_AUSZAHLUNGSANTRAG_TYPE__ELEKTRONISCHE_BESCHEIDZUSTELLUNG);

		einwilligungenTypeEClass = createEClass(EINWILLIGUNGEN_TYPE);
		createEAttribute(einwilligungenTypeEClass, EINWILLIGUNGEN_TYPE__EINWILLIGUNG_ZUR_AUSKUNFTSEINHOLUNG);
		createEAttribute(einwilligungenTypeEClass, EINWILLIGUNGEN_TYPE__EINWILLIGUNG_ZUR_AUSKUNFTSEINHOLUNG_EINSCHRAENKUNGEN);
		createEAttribute(einwilligungenTypeEClass, EINWILLIGUNGEN_TYPE__ENTBINDUNG_SCHWEIGEPFLICHT_DER_AERZTE);
		createEAttribute(einwilligungenTypeEClass, EINWILLIGUNGEN_TYPE__EINWILLIGUNG_KOSTENUEBERNAHMEREGELUNG_BEHANDLUNGSABBRUCH);
		createEAttribute(einwilligungenTypeEClass, EINWILLIGUNGEN_TYPE__DATENSCHUTZERKLAERUNG_HERBEIFUEHRUNG_SCHWANGERSCHAFT);

		finanzierungsplanTypeEClass = createEClass(FINANZIERUNGSPLAN_TYPE);
		createEAttribute(finanzierungsplanTypeEClass, FINANZIERUNGSPLAN_TYPE__GESAMTKOSTEN);
		createEAttribute(finanzierungsplanTypeEClass, FINANZIERUNGSPLAN_TYPE__VORAUSSICHTLICHE_ERSTATTUNG_GESETZLICHE_KRANKENKASSE);
		createEAttribute(finanzierungsplanTypeEClass, FINANZIERUNGSPLAN_TYPE__VORAUSSICHTLICHE_ERSTATTUNG_PRIVATE_KRANKENKASSE);
		createEAttribute(finanzierungsplanTypeEClass, FINANZIERUNGSPLAN_TYPE__VORAUSSICHTLICHE_ERSTATTUNG_BEIHILFE);
		createEAttribute(finanzierungsplanTypeEClass, FINANZIERUNGSPLAN_TYPE__VORAUSSICHTLICHE_ERSTATTUNG_HEILFUERSORGE);
		createEAttribute(finanzierungsplanTypeEClass, FINANZIERUNGSPLAN_TYPE__VERBLEIBENDER_EIGENANTEIL_SELBSTKOSTENANTEIL);
		createEAttribute(finanzierungsplanTypeEClass, FINANZIERUNGSPLAN_TYPE__ZUWENDUNGEN_GESAMT);

		kinderwunschBewilligungsantrag1001TypeEClass = createEClass(KINDERWUNSCH_BEWILLIGUNGSANTRAG1001_TYPE);
		createEReference(kinderwunschBewilligungsantrag1001TypeEClass, KINDERWUNSCH_BEWILLIGUNGSANTRAG1001_TYPE__BEWILLIGUNGSANTRAG);

		kinderwunschNachreichung1003TypeEClass = createEClass(KINDERWUNSCH_NACHREICHUNG1003_TYPE);
		createEReference(kinderwunschNachreichung1003TypeEClass, KINDERWUNSCH_NACHREICHUNG1003_TYPE__BUNDESLAND);
		createEAttribute(kinderwunschNachreichung1003TypeEClass, KINDERWUNSCH_NACHREICHUNG1003_TYPE__BEARBEITUNGSNUMMER);
		createEReference(kinderwunschNachreichung1003TypeEClass, KINDERWUNSCH_NACHREICHUNG1003_TYPE__NICHTAUSTRAGENDE_PERSON);
		createEReference(kinderwunschNachreichung1003TypeEClass, KINDERWUNSCH_NACHREICHUNG1003_TYPE__ANTRAGSTELLENDE_PERSON);
		createEReference(kinderwunschNachreichung1003TypeEClass, KINDERWUNSCH_NACHREICHUNG1003_TYPE__NACHREICHUNG);
		createEAttribute(kinderwunschNachreichung1003TypeEClass, KINDERWUNSCH_NACHREICHUNG1003_TYPE__DATENSCHUTZERKLAERUNG_DER_FOERDERSTELLE);
		createEAttribute(kinderwunschNachreichung1003TypeEClass, KINDERWUNSCH_NACHREICHUNG1003_TYPE__BESTAETIGUNG_RICHTIGKEIT_ANGABEN);

		kinderwunschVerwendungsnachweispruefung1002TypeEClass = createEClass(KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002_TYPE);
		createEReference(kinderwunschVerwendungsnachweispruefung1002TypeEClass, KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002_TYPE__AUSZAHLUNGSANTRAG);

		konfigurationsfragenBewilligungTypeEClass = createEClass(KONFIGURATIONSFRAGEN_BEWILLIGUNG_TYPE);
		createEAttribute(konfigurationsfragenBewilligungTypeEClass, KONFIGURATIONSFRAGEN_BEWILLIGUNG_TYPE__GLEICHER_HAUSHALT);

		konfigurationsfragenTypeEClass = createEClass(KONFIGURATIONSFRAGEN_TYPE);
		createEAttribute(konfigurationsfragenTypeEClass, KONFIGURATIONSFRAGEN_TYPE__GLEICHER_HAUSHALT);
		createEReference(konfigurationsfragenTypeEClass, KONFIGURATIONSFRAGEN_TYPE__ANGABEN_ZUR_BEHANDLUNG);

		krankenkasseTypeEClass = createEClass(KRANKENKASSE_TYPE);
		createEReference(krankenkasseTypeEClass, KRANKENKASSE_TYPE__ART_KRANKENKASSE);
		createEAttribute(krankenkasseTypeEClass, KRANKENKASSE_TYPE__NAME_KRANKENKASSE);
		createEAttribute(krankenkasseTypeEClass, KRANKENKASSE_TYPE__NAME_BEIHILFESTELLE);
		createEAttribute(krankenkasseTypeEClass, KRANKENKASSE_TYPE__NAME_HEILFUERSORGE);

		nachreichungTypeEClass = createEClass(NACHREICHUNG_TYPE);
		createEReference(nachreichungTypeEClass, NACHREICHUNG_TYPE__ART_NACHREICHUNG);
		createEReference(nachreichungTypeEClass, NACHREICHUNG_TYPE__NACHWEIS);
		createEAttribute(nachreichungTypeEClass, NACHREICHUNG_TYPE__EINWILLIGUNG_DATENVERARBEITUNG_DURCH_FOERDERSTELLE);

		nachweiseBerechnungZuwendungTypeEClass = createEClass(NACHWEISE_BERECHNUNG_ZUWENDUNG_TYPE);
		createEReference(nachweiseBerechnungZuwendungTypeEClass, NACHWEISE_BERECHNUNG_ZUWENDUNG_TYPE__NEGATIVBESCHEINIGUNG_VERSICHERUNG_KOSTENTRAEGER);
		createEReference(nachweiseBerechnungZuwendungTypeEClass, NACHWEISE_BERECHNUNG_ZUWENDUNG_TYPE__ZUSCHUESSE_KRANKENVERSICHERUNG);

		nachweiseKinderwunschTypeEClass = createEClass(NACHWEISE_KINDERWUNSCH_TYPE);
		createEReference(nachweiseKinderwunschTypeEClass, NACHWEISE_KINDERWUNSCH_TYPE__NACHWEIS_AKTUELLER_WOHNSITZ);
		createEReference(nachweiseKinderwunschTypeEClass, NACHWEISE_KINDERWUNSCH_TYPE__NACHWEIS_EHEURKUNDE);
		createEReference(nachweiseKinderwunschTypeEClass, NACHWEISE_KINDERWUNSCH_TYPE__DAUER_ANGELEGTE_PARTNERSCHAFT);
		createEReference(nachweiseKinderwunschTypeEClass, NACHWEISE_KINDERWUNSCH_TYPE__KOSTENUEBERNAHMEERKLAERUNG_NEGATIVBESCHEID);
		createEReference(nachweiseKinderwunschTypeEClass, NACHWEISE_KINDERWUNSCH_TYPE__NOTWENDIGKEITSBESCHEINIGUNG_DES_ARZTES);
		createEReference(nachweiseKinderwunschTypeEClass, NACHWEISE_KINDERWUNSCH_TYPE__BEHANDLUNGSPLAN_KOSTENVORANSCHLAG);
		createEReference(nachweiseKinderwunschTypeEClass, NACHWEISE_KINDERWUNSCH_TYPE__ERKLAERUNG_REPRODUKTIONSEINRICHTUNG);

		nachweiseRechnungenTypeEClass = createEClass(NACHWEISE_RECHNUNGEN_TYPE);
		createEAttribute(nachweiseRechnungenTypeEClass, NACHWEISE_RECHNUNGEN_TYPE__RECHNUNGSDATUM);
		createEAttribute(nachweiseRechnungenTypeEClass, NACHWEISE_RECHNUNGEN_TYPE__RECHNUNGSSTELLER);
		createEAttribute(nachweiseRechnungenTypeEClass, NACHWEISE_RECHNUNGEN_TYPE__BETRAG);
		createEAttribute(nachweiseRechnungenTypeEClass, NACHWEISE_RECHNUNGEN_TYPE__SUMME_GESAMTKOSTEN);
		createEReference(nachweiseRechnungenTypeEClass, NACHWEISE_RECHNUNGEN_TYPE__NACHWEIS);

		nachweisTypeEClass = createEClass(NACHWEIS_TYPE);
		createEAttribute(nachweisTypeEClass, NACHWEIS_TYPE__NACHWEIS_VORHANDEN);
		createEReference(nachweisTypeEClass, NACHWEIS_TYPE__NACHWEIS);

		personendatenTypeEClass = createEClass(PERSONENDATEN_TYPE);
		createEReference(personendatenTypeEClass, PERSONENDATEN_TYPE__NAME);
		createEReference(personendatenTypeEClass, PERSONENDATEN_TYPE__WOHNSITZ);
		createEReference(personendatenTypeEClass, PERSONENDATEN_TYPE__KRANKENKASSE);

		versuchTypeEClass = createEClass(VERSUCH_TYPE);
		createEAttribute(versuchTypeEClass, VERSUCH_TYPE__NUMMER_DES_VERSUCHS);
		createEAttribute(versuchTypeEClass, VERSUCH_TYPE__DATUM_DES_VERSUCHS);
		createEReference(versuchTypeEClass, VERSUCH_TYPE__NACHWEIS_VIERTER_VERSUCH);

		vorherigeBehandlungenTypeEClass = createEClass(VORHERIGE_BEHANDLUNGEN_TYPE);
		createEAttribute(vorherigeBehandlungenTypeEClass, VORHERIGE_BEHANDLUNGEN_TYPE__BISHER_GEFOERDERTE_BEHANDLUNGEN);
		createEReference(vorherigeBehandlungenTypeEClass, VORHERIGE_BEHANDLUNGEN_TYPE__BEFRUCHTUNGSBEHANDLUNGEN);
		createEAttribute(vorherigeBehandlungenTypeEClass, VORHERIGE_BEHANDLUNGEN_TYPE__WIEDERHOLUNGSVERSUCH);
		createEAttribute(vorherigeBehandlungenTypeEClass, VORHERIGE_BEHANDLUNGEN_TYPE__NAME_REPRODUKTIONSEINRICHTUNG);
		createEAttribute(vorherigeBehandlungenTypeEClass, VORHERIGE_BEHANDLUNGEN_TYPE__POSTLEITZAHL_REPRODUKTIONSEINRICHTUNG);
		createEAttribute(vorherigeBehandlungenTypeEClass, VORHERIGE_BEHANDLUNGEN_TYPE__BERATUNG);
		createEReference(vorherigeBehandlungenTypeEClass, VORHERIGE_BEHANDLUNGEN_TYPE__NACHWEIS_VIERTER_VERSUCH);

		wohnsitzTypeEClass = createEClass(WOHNSITZ_TYPE);
		createEReference(wohnsitzTypeEClass, WOHNSITZ_TYPE__ANSCHRIFT_INLAND_STRASSENANSCHRIFT);
		createEAttribute(wohnsitzTypeEClass, WOHNSITZ_TYPE__ABWEICHENDE_ADRESSE_NPA);
		createEReference(wohnsitzTypeEClass, WOHNSITZ_TYPE__ERREICHBARKEIT);

		zusaetzlicheBeteiligungTypeEClass = createEClass(ZUSAETZLICHE_BETEILIGUNG_TYPE);
		createEAttribute(zusaetzlicheBeteiligungTypeEClass, ZUSAETZLICHE_BETEILIGUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG);
		createEAttribute(zusaetzlicheBeteiligungTypeEClass, ZUSAETZLICHE_BETEILIGUNG_TYPE__VORLIEGEN_NACHWEIS);
		createEAttribute(zusaetzlicheBeteiligungTypeEClass, ZUSAETZLICHE_BETEILIGUNG_TYPE__BETRAG);
		createEReference(zusaetzlicheBeteiligungTypeEClass, ZUSAETZLICHE_BETEILIGUNG_TYPE__NACHWEIS);

		zuschuesseKrankenversicherungTypeEClass = createEClass(ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE);
		createEAttribute(zuschuesseKrankenversicherungTypeEClass, ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__BETEILIGTE_KRANKENKASSEN);
		createEReference(zuschuesseKrankenversicherungTypeEClass, ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__NEGATIVBESCHEINIGUNG_VERSICHERUNG_KOSTENTRAEGER);
		createEReference(zuschuesseKrankenversicherungTypeEClass, ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG_GKV);
		createEReference(zuschuesseKrankenversicherungTypeEClass, ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG_PKV);
		createEReference(zuschuesseKrankenversicherungTypeEClass, ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__BETEILIGUNG_BEIHILFE);
		createEReference(zuschuesseKrankenversicherungTypeEClass, ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__NACHWEISE_RECHNUNGEN);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		DIN913792204Package theDIN913792204Package = (DIN913792204Package)EPackage.Registry.INSTANCE.getEPackage(DIN913792204Package.eNS_URI);
		Code10Package theCode10Package = (Code10Package)EPackage.Registry.INSTANCE.getEPackage(Code10Package.eNS_URI);
		BaukastenPackage theBaukastenPackage = (BaukastenPackage)EPackage.Registry.INSTANCE.getEPackage(BaukastenPackage.eNS_URI);
		ElterngeldPackage theElterngeldPackage = (ElterngeldPackage)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		artNachreichungTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		kinderwunschBewilligungsantrag1001TypeEClass.getESuperTypes().add(theBaukastenPackage.getAntragsnachrichtType());
		kinderwunschNachreichung1003TypeEClass.getESuperTypes().add(theBaukastenPackage.getAntragsnachrichtType());
		kinderwunschVerwendungsnachweispruefung1002TypeEClass.getESuperTypes().add(theBaukastenPackage.getAntragsnachrichtType());

		// Initialize classes, features, and operations; add parameters
		initEClass(altersgrenzeTypeEClass, AltersgrenzeType.class, "AltersgrenzeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAltersgrenzeType_GeburtsdatumAustragendenPerson(), theXMLTypePackage.getDate(), "geburtsdatumAustragendenPerson", null, 1, 1, AltersgrenzeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAltersgrenzeType_GeburtsdatumNichtaustragendenPerson(), theXMLTypePackage.getDate(), "geburtsdatumNichtaustragendenPerson", null, 1, 1, AltersgrenzeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAltersgrenzeType_KeinerKannAustragen(), theXMLTypePackage.getBoolean(), "keinerKannAustragen", null, 1, 1, AltersgrenzeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(angabenZurBehandlungTypeEClass, AngabenZurBehandlungType.class, "AngabenZurBehandlungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAngabenZurBehandlungType_Erstantrag(), theXMLTypePackage.getBoolean(), "erstantrag", null, 1, 1, AngabenZurBehandlungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZurBehandlungType_AktenzeichenVorherigerAntrag(), theDIN913792204Package.getDatatypeC(), "aktenzeichenVorherigerAntrag", null, 0, 1, AngabenZurBehandlungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenZurBehandlungType_VorherigeBehandlungen(), this.getVorherigeBehandlungenType(), null, "vorherigeBehandlungen", null, 0, 1, AngabenZurBehandlungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artDerBehandlungTypeEClass, ArtDerBehandlungType.class, "ArtDerBehandlungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtDerBehandlungType_ArtDerBehandlung(), theDIN913792204Package.getDatatypeC(), "artDerBehandlung", null, 1, 1, ArtDerBehandlungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtDerBehandlungType_NummerDesBehandlungszyklus(), theDIN913792204Package.getDatatypeC(), "nummerDesBehandlungszyklus", null, 1, 1, ArtDerBehandlungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtDerBehandlungType_VollstaendigeDurchfuehrungBehandlung(), theXMLTypePackage.getBoolean(), "vollstaendigeDurchfuehrungBehandlung", null, 0, 1, ArtDerBehandlungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtDerBehandlungType_SchwangerschaftEingetreten(), theXMLTypePackage.getBoolean(), "schwangerschaftEingetreten", null, 0, 1, ArtDerBehandlungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtDerBehandlungType_NummerBehandlungszyklus(), theDIN913792204Package.getDatatypeC(), "nummerBehandlungszyklus", null, 0, 1, ArtDerBehandlungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtDerBehandlungType_BestaetigungBehandlungNnichtBegonnen(), theXMLTypePackage.getBoolean(), "bestaetigungBehandlungNnichtBegonnen", null, 1, 1, ArtDerBehandlungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtDerBehandlungType_VoraussichtlicherBehandlungsbeginn(), theXMLTypePackage.getDate(), "voraussichtlicherBehandlungsbeginn", null, 1, 1, ArtDerBehandlungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artNachreichungTypeEClass, ArtNachreichungType.class, "ArtNachreichungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(auszahlungsantragTypeEClass, AuszahlungsantragType.class, "AuszahlungsantragType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuszahlungsantragType_AbfrageBewilligungsbescheid(), theXMLTypePackage.getBoolean(), "abfrageBewilligungsbescheid", null, 1, 1, AuszahlungsantragType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuszahlungsantragType_BundeslandFoerderstelle(), theDIN913792204Package.getDatatypeC(), "bundeslandFoerderstelle", null, 1, 1, AuszahlungsantragType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuszahlungsantragType_AktenzeichenBewilligungsantrag(), theDIN913792204Package.getDatatypeC(), "aktenzeichenBewilligungsantrag", null, 1, 1, AuszahlungsantragType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuszahlungsantragType_DatenschutzerklaerungSchwangerschaft(), theDIN913792204Package.getDatatypeC(), "datenschutzerklaerungSchwangerschaft", null, 1, 1, AuszahlungsantragType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuszahlungsantragType_ZustimmungDatenschutzerklaerungHerbeifuehrung(), theXMLTypePackage.getBoolean(), "zustimmungDatenschutzerklaerungHerbeifuehrung", null, 1, 1, AuszahlungsantragType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuszahlungsantragType_Konfigurationsfragen(), this.getKonfigurationsfragenType(), null, "konfigurationsfragen", null, 1, 1, AuszahlungsantragType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuszahlungsantragType_AntragstellendePerson(), this.getPersonendatenType(), null, "antragstellendePerson", null, 1, 1, AuszahlungsantragType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuszahlungsantragType_NichtaustragendePerson(), this.getPersonendatenType(), null, "nichtaustragendePerson", null, 1, 1, AuszahlungsantragType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuszahlungsantragType_AngabenBankverbindung(), theBaukastenPackage.getBankverbindungType(), null, "angabenBankverbindung", null, 1, 1, AuszahlungsantragType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuszahlungsantragType_NachweiseBerechnungZuwendung(), this.getNachweiseBerechnungZuwendungType(), null, "nachweiseBerechnungZuwendung", null, 1, 1, AuszahlungsantragType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuszahlungsantragType_EinwilligungenAuszahlungsantrag(), this.getEinwilligungenAuszahlungsantragType(), null, "einwilligungenAuszahlungsantrag", null, 1, 1, AuszahlungsantragType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuszahlungsantragType_BestaetigungRichtigkeitAngaben(), theXMLTypePackage.getBoolean(), "bestaetigungRichtigkeitAngaben", null, 1, 1, AuszahlungsantragType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(befruchtungsbehandlungenTypeEClass, BefruchtungsbehandlungenType.class, "BefruchtungsbehandlungenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBefruchtungsbehandlungenType_Versuch(), this.getVersuchType(), null, "versuch", null, 0, 4, BefruchtungsbehandlungenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bewilligungsantragTypeEClass, BewilligungsantragType.class, "BewilligungsantragType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBewilligungsantragType_StandortReproduktionsklinik(), theDIN913792204Package.getDatatypeC(), "standortReproduktionsklinik", null, 0, 1, BewilligungsantragType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBewilligungsantragType_Bundesland(), theBaukastenPackage.getCodeBundeslandType(), null, "bundesland", null, 1, 1, BewilligungsantragType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBewilligungsantragType_DatenschutzerklaerungSchwangerschaft(), theDIN913792204Package.getDatatypeC(), "datenschutzerklaerungSchwangerschaft", null, 1, 1, BewilligungsantragType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBewilligungsantragType_DatenschutzerklaerungherbeifuehrungSchwangerschaft(), theDIN913792204Package.getDatatypeC(), "datenschutzerklaerungherbeifuehrungSchwangerschaft", null, 1, 1, BewilligungsantragType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBewilligungsantragType_Konfigurationsfragen(), this.getKonfigurationsfragenBewilligungType(), null, "konfigurationsfragen", null, 1, 1, BewilligungsantragType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBewilligungsantragType_Familienstand(), theBaukastenPackage.getFamilienstandType(), null, "familienstand", null, 1, 1, BewilligungsantragType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBewilligungsantragType_GleicherHaushalt(), theXMLTypePackage.getBoolean(), "gleicherHaushalt", null, 0, 1, BewilligungsantragType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBewilligungsantragType_GruendegetrennterWohnsitz(), theDIN913792204Package.getDatatypeC(), "gruendegetrennterWohnsitz", null, 0, 1, BewilligungsantragType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBewilligungsantragType_Altersgrenze(), this.getAltersgrenzeType(), null, "altersgrenze", null, 1, 1, BewilligungsantragType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBewilligungsantragType_ArtBehandlung(), this.getArtDerBehandlungType(), null, "artBehandlung", null, 1, 1, BewilligungsantragType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBewilligungsantragType_AntragstellendePerson(), this.getPersonendatenType(), null, "antragstellendePerson", null, 1, 1, BewilligungsantragType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBewilligungsantragType_NichtaustragendePerson(), this.getPersonendatenType(), null, "nichtaustragendePerson", null, 1, 1, BewilligungsantragType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBewilligungsantragType_AngabenBehandlung(), this.getAngabenZurBehandlungType(), null, "angabenBehandlung", null, 1, 1, BewilligungsantragType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBewilligungsantragType_Finanzierungsplan(), this.getFinanzierungsplanType(), null, "finanzierungsplan", null, 0, 1, BewilligungsantragType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBewilligungsantragType_Nachweise(), this.getNachweiseKinderwunschType(), null, "nachweise", null, 0, 1, BewilligungsantragType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBewilligungsantragType_Einwilligungen(), this.getEinwilligungenType(), null, "einwilligungen", null, 1, 1, BewilligungsantragType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBewilligungsantragType_BestaetigungRichtigkeitAngaben(), theXMLTypePackage.getBoolean(), "bestaetigungRichtigkeitAngaben", null, 1, 1, BewilligungsantragType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_KinderwunschBewilligungsantrag1001(), this.getKinderwunschBewilligungsantrag1001Type(), null, "kinderwunschBewilligungsantrag1001", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_KinderwunschNachreichung1003(), this.getKinderwunschNachreichung1003Type(), null, "kinderwunschNachreichung1003", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_KinderwunschVerwendungsnachweispruefung1002(), this.getKinderwunschVerwendungsnachweispruefung1002Type(), null, "kinderwunschVerwendungsnachweispruefung1002", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(einwilligungenAuszahlungsantragTypeEClass, EinwilligungenAuszahlungsantragType.class, "EinwilligungenAuszahlungsantragType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEinwilligungenAuszahlungsantragType_ZustimmungDatenschutz(), theXMLTypePackage.getBoolean(), "zustimmungDatenschutz", null, 1, 1, EinwilligungenAuszahlungsantragType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEinwilligungenAuszahlungsantragType_ElektronischeBescheidzustellung(), theXMLTypePackage.getBoolean(), "elektronischeBescheidzustellung", null, 1, 1, EinwilligungenAuszahlungsantragType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(einwilligungenTypeEClass, EinwilligungenType.class, "EinwilligungenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEinwilligungenType_EinwilligungZurAuskunftseinholung(), theXMLTypePackage.getBoolean(), "einwilligungZurAuskunftseinholung", null, 1, 1, EinwilligungenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEinwilligungenType_EinwilligungZurAuskunftseinholungEinschraenkungen(), theXMLTypePackage.getBoolean(), "einwilligungZurAuskunftseinholungEinschraenkungen", null, 0, 1, EinwilligungenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEinwilligungenType_EntbindungSchweigepflichtDerAerzte(), theXMLTypePackage.getBoolean(), "entbindungSchweigepflichtDerAerzte", null, 1, 1, EinwilligungenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEinwilligungenType_EinwilligungKostenuebernahmeregelungBehandlungsabbruch(), theXMLTypePackage.getBoolean(), "einwilligungKostenuebernahmeregelungBehandlungsabbruch", null, 0, 1, EinwilligungenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEinwilligungenType_DatenschutzerklaerungHerbeifuehrungSchwangerschaft(), theXMLTypePackage.getBoolean(), "datenschutzerklaerungHerbeifuehrungSchwangerschaft", null, 1, 1, EinwilligungenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(finanzierungsplanTypeEClass, FinanzierungsplanType.class, "FinanzierungsplanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFinanzierungsplanType_Gesamtkosten(), theXMLTypePackage.getDecimal(), "gesamtkosten", null, 0, 1, FinanzierungsplanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinanzierungsplanType_VoraussichtlicheErstattungGesetzlicheKrankenkasse(), theXMLTypePackage.getDecimal(), "voraussichtlicheErstattungGesetzlicheKrankenkasse", null, 0, 1, FinanzierungsplanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinanzierungsplanType_VoraussichtlicheErstattungPrivateKrankenkasse(), theXMLTypePackage.getDecimal(), "voraussichtlicheErstattungPrivateKrankenkasse", null, 0, 1, FinanzierungsplanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinanzierungsplanType_VoraussichtlicheErstattungBeihilfe(), theXMLTypePackage.getDecimal(), "voraussichtlicheErstattungBeihilfe", null, 0, 1, FinanzierungsplanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinanzierungsplanType_VoraussichtlicheErstattungHeilfuersorge(), theXMLTypePackage.getDecimal(), "voraussichtlicheErstattungHeilfuersorge", null, 0, 1, FinanzierungsplanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinanzierungsplanType_VerbleibenderEigenanteilSelbstkostenanteil(), theXMLTypePackage.getDecimal(), "verbleibenderEigenanteilSelbstkostenanteil", null, 0, 1, FinanzierungsplanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinanzierungsplanType_ZuwendungenGesamt(), theXMLTypePackage.getDecimal(), "zuwendungenGesamt", null, 0, 1, FinanzierungsplanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kinderwunschBewilligungsantrag1001TypeEClass, KinderwunschBewilligungsantrag1001Type.class, "KinderwunschBewilligungsantrag1001Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKinderwunschBewilligungsantrag1001Type_Bewilligungsantrag(), this.getBewilligungsantragType(), null, "bewilligungsantrag", null, 1, 1, KinderwunschBewilligungsantrag1001Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kinderwunschNachreichung1003TypeEClass, KinderwunschNachreichung1003Type.class, "KinderwunschNachreichung1003Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKinderwunschNachreichung1003Type_Bundesland(), theBaukastenPackage.getCodeBundeslandType(), null, "bundesland", null, 1, 1, KinderwunschNachreichung1003Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKinderwunschNachreichung1003Type_Bearbeitungsnummer(), theDIN913792204Package.getDatatypeC(), "bearbeitungsnummer", null, 1, 1, KinderwunschNachreichung1003Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKinderwunschNachreichung1003Type_NichtaustragendePerson(), this.getPersonendatenType(), null, "nichtaustragendePerson", null, 1, 1, KinderwunschNachreichung1003Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKinderwunschNachreichung1003Type_AntragstellendePerson(), this.getPersonendatenType(), null, "antragstellendePerson", null, 1, 1, KinderwunschNachreichung1003Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKinderwunschNachreichung1003Type_Nachreichung(), this.getNachreichungType(), null, "nachreichung", null, 1, 1, KinderwunschNachreichung1003Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKinderwunschNachreichung1003Type_DatenschutzerklaerungDerFoerderstelle(), theXMLTypePackage.getBoolean(), "datenschutzerklaerungDerFoerderstelle", null, 1, 1, KinderwunschNachreichung1003Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKinderwunschNachreichung1003Type_BestaetigungRichtigkeitAngaben(), theXMLTypePackage.getBoolean(), "bestaetigungRichtigkeitAngaben", null, 1, 1, KinderwunschNachreichung1003Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kinderwunschVerwendungsnachweispruefung1002TypeEClass, KinderwunschVerwendungsnachweispruefung1002Type.class, "KinderwunschVerwendungsnachweispruefung1002Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKinderwunschVerwendungsnachweispruefung1002Type_Auszahlungsantrag(), this.getAuszahlungsantragType(), null, "auszahlungsantrag", null, 1, 1, KinderwunschVerwendungsnachweispruefung1002Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(konfigurationsfragenBewilligungTypeEClass, KonfigurationsfragenBewilligungType.class, "KonfigurationsfragenBewilligungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKonfigurationsfragenBewilligungType_GleicherHaushalt(), theXMLTypePackage.getBoolean(), "gleicherHaushalt", null, 1, 1, KonfigurationsfragenBewilligungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(konfigurationsfragenTypeEClass, KonfigurationsfragenType.class, "KonfigurationsfragenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKonfigurationsfragenType_GleicherHaushalt(), theXMLTypePackage.getBoolean(), "gleicherHaushalt", null, 1, 1, KonfigurationsfragenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKonfigurationsfragenType_AngabenZurBehandlung(), this.getArtDerBehandlungType(), null, "angabenZurBehandlung", null, 1, 1, KonfigurationsfragenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(krankenkasseTypeEClass, KrankenkasseType.class, "KrankenkasseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKrankenkasseType_ArtKrankenkasse(), theElterngeldPackage.getCodeVersicherungsartType(), null, "artKrankenkasse", null, 1, 1, KrankenkasseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKrankenkasseType_NameKrankenkasse(), theDIN913792204Package.getDatatypeC(), "nameKrankenkasse", null, 1, 1, KrankenkasseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKrankenkasseType_NameBeihilfestelle(), theDIN913792204Package.getDatatypeC(), "nameBeihilfestelle", null, 1, 1, KrankenkasseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKrankenkasseType_NameHeilfuersorge(), theDIN913792204Package.getDatatypeC(), "nameHeilfuersorge", null, 1, 1, KrankenkasseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nachreichungTypeEClass, NachreichungType.class, "NachreichungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNachreichungType_ArtNachreichung(), this.getArtNachreichungType(), null, "artNachreichung", null, 1, 1, NachreichungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachreichungType_Nachweis(), theBaukastenPackage.getNachweisdokumentType(), null, "nachweis", null, 1, 1, NachreichungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachreichungType_EinwilligungDatenverarbeitungDurchFoerderstelle(), theXMLTypePackage.getBoolean(), "einwilligungDatenverarbeitungDurchFoerderstelle", null, 1, 1, NachreichungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nachweiseBerechnungZuwendungTypeEClass, NachweiseBerechnungZuwendungType.class, "NachweiseBerechnungZuwendungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNachweiseBerechnungZuwendungType_NegativbescheinigungVersicherungKostentraeger(), theBaukastenPackage.getNachweisdokumentType(), null, "negativbescheinigungVersicherungKostentraeger", null, 0, 1, NachweiseBerechnungZuwendungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachweiseBerechnungZuwendungType_ZuschuesseKrankenversicherung(), this.getZuschuesseKrankenversicherungType(), null, "zuschuesseKrankenversicherung", null, 1, 1, NachweiseBerechnungZuwendungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nachweiseKinderwunschTypeEClass, NachweiseKinderwunschType.class, "NachweiseKinderwunschType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNachweiseKinderwunschType_NachweisAktuellerWohnsitz(), this.getNachweisType(), null, "nachweisAktuellerWohnsitz", null, 0, 1, NachweiseKinderwunschType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachweiseKinderwunschType_NachweisEheurkunde(), this.getNachweisType(), null, "nachweisEheurkunde", null, 0, 1, NachweiseKinderwunschType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachweiseKinderwunschType_DauerAngelegtePartnerschaft(), this.getNachweisType(), null, "dauerAngelegtePartnerschaft", null, 0, 1, NachweiseKinderwunschType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachweiseKinderwunschType_KostenuebernahmeerklaerungNegativbescheid(), this.getNachweisType(), null, "kostenuebernahmeerklaerungNegativbescheid", null, 0, 1, NachweiseKinderwunschType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachweiseKinderwunschType_NotwendigkeitsbescheinigungDesArztes(), this.getNachweisType(), null, "notwendigkeitsbescheinigungDesArztes", null, 0, 1, NachweiseKinderwunschType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachweiseKinderwunschType_BehandlungsplanKostenvoranschlag(), this.getNachweisType(), null, "behandlungsplanKostenvoranschlag", null, 0, 1, NachweiseKinderwunschType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachweiseKinderwunschType_ErklaerungReproduktionseinrichtung(), this.getNachweisType(), null, "erklaerungReproduktionseinrichtung", null, 0, 1, NachweiseKinderwunschType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nachweiseRechnungenTypeEClass, NachweiseRechnungenType.class, "NachweiseRechnungenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNachweiseRechnungenType_Rechnungsdatum(), theXMLTypePackage.getDate(), "rechnungsdatum", null, 1, 1, NachweiseRechnungenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachweiseRechnungenType_Rechnungssteller(), theDIN913792204Package.getDatatypeC(), "rechnungssteller", null, 1, 1, NachweiseRechnungenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachweiseRechnungenType_Betrag(), theXMLTypePackage.getDecimal(), "betrag", null, 1, 1, NachweiseRechnungenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachweiseRechnungenType_SummeGesamtkosten(), theXMLTypePackage.getDecimal(), "summeGesamtkosten", null, 1, 1, NachweiseRechnungenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachweiseRechnungenType_Nachweis(), theBaukastenPackage.getNachweisdokumentType(), null, "nachweis", null, 0, 1, NachweiseRechnungenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nachweisTypeEClass, NachweisType.class, "NachweisType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNachweisType_NachweisVorhanden(), theXMLTypePackage.getBoolean(), "nachweisVorhanden", null, 0, 1, NachweisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachweisType_Nachweis(), theBaukastenPackage.getNachweisdokumentType(), null, "nachweis", null, 0, 1, NachweisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personendatenTypeEClass, PersonendatenType.class, "PersonendatenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersonendatenType_Name(), theBaukastenPackage.getNameNatuerlichePersonType(), null, "name", null, 1, 1, PersonendatenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonendatenType_Wohnsitz(), this.getWohnsitzType(), null, "wohnsitz", null, 1, -1, PersonendatenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonendatenType_Krankenkasse(), this.getKrankenkasseType(), null, "krankenkasse", null, 0, -1, PersonendatenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versuchTypeEClass, VersuchType.class, "VersuchType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersuchType_NummerDesVersuchs(), theDIN913792204Package.getDatatypeC(), "nummerDesVersuchs", null, 0, 1, VersuchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersuchType_DatumDesVersuchs(), theXMLTypePackage.getDate(), "datumDesVersuchs", null, 0, 1, VersuchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVersuchType_NachweisVierterVersuch(), theBaukastenPackage.getNachweisdokumentType(), null, "nachweisVierterVersuch", null, 0, 1, VersuchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vorherigeBehandlungenTypeEClass, VorherigeBehandlungenType.class, "VorherigeBehandlungenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVorherigeBehandlungenType_BisherGefoerderteBehandlungen(), theXMLTypePackage.getBoolean(), "bisherGefoerderteBehandlungen", null, 1, 1, VorherigeBehandlungenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVorherigeBehandlungenType_Befruchtungsbehandlungen(), this.getBefruchtungsbehandlungenType(), null, "befruchtungsbehandlungen", null, 0, 1, VorherigeBehandlungenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVorherigeBehandlungenType_Wiederholungsversuch(), theXMLTypePackage.getBoolean(), "wiederholungsversuch", null, 0, 1, VorherigeBehandlungenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVorherigeBehandlungenType_NameReproduktionseinrichtung(), theDIN913792204Package.getDatatypeC(), "nameReproduktionseinrichtung", null, 1, 1, VorherigeBehandlungenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVorherigeBehandlungenType_PostleitzahlReproduktionseinrichtung(), theDIN913792204Package.getDatatypeC(), "postleitzahlReproduktionseinrichtung", null, 0, 1, VorherigeBehandlungenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVorherigeBehandlungenType_Beratung(), theXMLTypePackage.getBoolean(), "beratung", null, 1, 1, VorherigeBehandlungenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVorherigeBehandlungenType_NachweisVierterVersuch(), theBaukastenPackage.getNachweisdokumentType(), null, "nachweisVierterVersuch", null, 0, 1, VorherigeBehandlungenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wohnsitzTypeEClass, WohnsitzType.class, "WohnsitzType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWohnsitzType_AnschriftInlandStrassenanschrift(), theBaukastenPackage.getMeldeanschriftType(), null, "anschriftInlandStrassenanschrift", null, 1, 1, WohnsitzType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWohnsitzType_AbweichendeAdresseNPA(), theXMLTypePackage.getBoolean(), "abweichendeAdresseNPA", null, 0, 1, WohnsitzType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWohnsitzType_Erreichbarkeit(), theBaukastenPackage.getErreichbarkeitType(), null, "erreichbarkeit", null, 0, 1, WohnsitzType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zusaetzlicheBeteiligungTypeEClass, ZusaetzlicheBeteiligungType.class, "ZusaetzlicheBeteiligungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZusaetzlicheBeteiligungType_ZusaetzlicheBeteiligung(), theXMLTypePackage.getBoolean(), "zusaetzlicheBeteiligung", null, 0, 1, ZusaetzlicheBeteiligungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZusaetzlicheBeteiligungType_VorliegenNachweis(), theXMLTypePackage.getBoolean(), "vorliegenNachweis", null, 0, 1, ZusaetzlicheBeteiligungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZusaetzlicheBeteiligungType_Betrag(), theXMLTypePackage.getDecimal(), "betrag", null, 0, 1, ZusaetzlicheBeteiligungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZusaetzlicheBeteiligungType_Nachweis(), theBaukastenPackage.getNachweisdokumentType(), null, "nachweis", null, 0, 1, ZusaetzlicheBeteiligungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zuschuesseKrankenversicherungTypeEClass, ZuschuesseKrankenversicherungType.class, "ZuschuesseKrankenversicherungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZuschuesseKrankenversicherungType_BeteiligteKrankenkassen(), theDIN913792204Package.getDatatypeC(), "beteiligteKrankenkassen", null, 1, 1, ZuschuesseKrankenversicherungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZuschuesseKrankenversicherungType_NegativbescheinigungVersicherungKostentraeger(), theBaukastenPackage.getNachweisdokumentType(), null, "negativbescheinigungVersicherungKostentraeger", null, 0, 1, ZuschuesseKrankenversicherungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZuschuesseKrankenversicherungType_ZusaetzlicheBeteiligungGKV(), this.getZusaetzlicheBeteiligungType(), null, "zusaetzlicheBeteiligungGKV", null, 0, 1, ZuschuesseKrankenversicherungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZuschuesseKrankenversicherungType_ZusaetzlicheBeteiligungPKV(), this.getZusaetzlicheBeteiligungType(), null, "zusaetzlicheBeteiligungPKV", null, 0, 1, ZuschuesseKrankenversicherungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZuschuesseKrankenversicherungType_BeteiligungBeihilfe(), this.getZusaetzlicheBeteiligungType(), null, "beteiligungBeihilfe", null, 0, 1, ZuschuesseKrankenversicherungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZuschuesseKrankenversicherungType_NachweiseRechnungen(), this.getNachweiseRechnungenType(), null, "nachweiseRechnungen", null, 0, -1, ZuschuesseKrankenversicherungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			   "appinfo", "\n           \n  <standard>\n                \n    <nameLang>XFamilie</nameLang>\n                \n    <nameKurz>XFamilie</nameKurz>\n                \n    <nameTechnisch>xfamilie</nameTechnisch>\n                \n    <kennung>urn:xoev-de:kosit:standard:xfamilie</kennung>\n                \n    <beschreibung>Projektziel ist die elektronische Kommunikation im Familienbereich zwischen verschiedenen Beh\u00f6rden, Institutionen, Registern und Onlineportalen, die Daten untereinander austauschen, zu unterst\u00fctzen. Der Nutzen des Projekts besteht in der Kostenreduktion und einer Verbesserung der Qualit\u00e4t von Daten f\u00fcr Familienleistungen, sowie einer Verbesserung der Interoperabilit\u00e4t von Akteuren im Familienbereich und weiteren Kommunikationspartner.</beschreibung>\n             \n  </standard>\n           \n  <versionStandard>\n                \n    <version>1.3.0</version>\n                \n    <beschreibung>Die \u00c4nderungshistorie befindet sich in Tabellenform nach Change Requests gegliedert in Kapitel E.</beschreibung>\n                \n    <versionXOEVProfil>3.0.2</versionXOEVProfil>\n                \n    <versionXOEVHandbuch>3.0.2</versionXOEVHandbuch>\n                \n    <versionXGenerator>3.1.0</versionXGenerator>\n                \n    <versionModellierungswerkzeug>19.0</versionModellierungswerkzeug>\n                \n    <nameModellierungswerkzeug>MagicDraw</nameModellierungswerkzeug>\n             \n  </versionStandard>\n        \n\n\n           \n  <standard>\n                \n    <nameLang>XFamilie</nameLang>\n                \n    <nameKurz>XFamilie</nameKurz>\n                \n    <nameTechnisch>xfamilie</nameTechnisch>\n                \n    <kennung>urn:xoev-de:kosit:standard:xfamilie</kennung>\n                \n    <beschreibung>Projektziel ist die elektronische Kommunikation im Familienbereich zwischen verschiedenen Beh\u00f6rden, Institutionen, Registern und Onlineportalen, die Daten untereinander austauschen, zu unterst\u00fctzen. Der Nutzen des Projekts besteht in der Kostenreduktion und einer Verbesserung der Qualit\u00e4t von Daten f\u00fcr Familienleistungen, sowie einer Verbesserung der Interoperabilit\u00e4t von Akteuren im Familienbereich und weiteren Kommunikationspartner.</beschreibung>\n             \n  </standard>\n           \n  <versionStandard>\n                \n    <version>1.3.0</version>\n                \n    <beschreibung>Die \u00c4nderungshistorie befindet sich in Tabellenform nach Change Requests gegliedert in Kapitel E.</beschreibung>\n                \n    <versionXOEVProfil>3.0.2</versionXOEVProfil>\n                \n    <versionXOEVHandbuch>3.0.2</versionXOEVHandbuch>\n                \n    <versionXGenerator>3.1.0</versionXGenerator>\n                \n    <versionModellierungswerkzeug>19.0</versionModellierungswerkzeug>\n                \n    <nameModellierungswerkzeug>MagicDraw</nameModellierungswerkzeug>\n             \n  </versionStandard>\n        \n\n\n           \n  <standard>\n                \n    <nameLang>XFamilie</nameLang>\n                \n    <nameKurz>XFamilie</nameKurz>\n                \n    <nameTechnisch>xfamilie</nameTechnisch>\n                \n    <kennung>urn:xoev-de:kosit:standard:xfamilie</kennung>\n                \n    <beschreibung>Projektziel ist die elektronische Kommunikation im Familienbereich zwischen verschiedenen Beh\u00f6rden, Institutionen, Registern und Onlineportalen, die Daten untereinander austauschen, zu unterst\u00fctzen. Der Nutzen des Projekts besteht in der Kostenreduktion und einer Verbesserung der Qualit\u00e4t von Daten f\u00fcr Familienleistungen, sowie einer Verbesserung der Interoperabilit\u00e4t von Akteuren im Familienbereich und weiteren Kommunikationspartner.</beschreibung>\n             \n  </standard>\n           \n  <versionStandard>\n                \n    <version>1.3.0</version>\n                \n    <beschreibung>Die \u00c4nderungshistorie befindet sich in Tabellenform nach Change Requests gegliedert in Kapitel E.</beschreibung>\n                \n    <versionXOEVProfil>3.0.2</versionXOEVProfil>\n                \n    <versionXOEVHandbuch>3.0.2</versionXOEVHandbuch>\n                \n    <versionXGenerator>3.1.0</versionXGenerator>\n                \n    <versionModellierungswerkzeug>19.0</versionModellierungswerkzeug>\n                \n    <nameModellierungswerkzeug>MagicDraw</nameModellierungswerkzeug>\n             \n  </versionStandard>\n        \n"
		   });
		addAnnotation
		  (getDocumentRoot_KinderwunschBewilligungsantrag1001(),
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <rechtsgrundlage>Richtlinie des Bundesministeriums f\u00fcr Familie, Senioren, Frauen und Jugend \u00fcber die Gew\u00e4hrung von Zuwendungen zur F\u00f6rderung von Ma\u00dfnahmen der assistierten Reproduktion</rechtsgrundlage>\n           \n"
		   });
		addAnnotation
		  (getDocumentRoot_KinderwunschVerwendungsnachweispruefung1002(),
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <rechtsgrundlage>Richtlinie des Bundesministeriums f\u00fcr Familie, Senioren, Frauen und Jugend \u00fcber die Gew\u00e4hrung von Zuwendungen zur F\u00f6rderung von Ma\u00dfnahmen der assistierten Reproduktion</rechtsgrundlage>\n           \n"
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
		  (altersgrenzeTypeEClass,
		   source,
		   new String[] {
			   "name", "AltersgrenzeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAltersgrenzeType_GeburtsdatumAustragendenPerson(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsdatumAustragendenPerson",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAltersgrenzeType_GeburtsdatumNichtaustragendenPerson(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsdatumNichtaustragendenPerson",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAltersgrenzeType_KeinerKannAustragen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "keinerKannAustragen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (angabenZurBehandlungTypeEClass,
		   source,
		   new String[] {
			   "name", "AngabenZurBehandlungType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAngabenZurBehandlungType_Erstantrag(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "erstantrag",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZurBehandlungType_AktenzeichenVorherigerAntrag(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aktenzeichenVorherigerAntrag",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZurBehandlungType_VorherigeBehandlungen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "vorherigeBehandlungen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (artDerBehandlungTypeEClass,
		   source,
		   new String[] {
			   "name", "ArtDerBehandlungType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getArtDerBehandlungType_ArtDerBehandlung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "artDerBehandlung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getArtDerBehandlungType_NummerDesBehandlungszyklus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nummerDesBehandlungszyklus",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getArtDerBehandlungType_VollstaendigeDurchfuehrungBehandlung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "vollstaendigeDurchfuehrungBehandlung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getArtDerBehandlungType_SchwangerschaftEingetreten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "schwangerschaftEingetreten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getArtDerBehandlungType_NummerBehandlungszyklus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nummerBehandlungszyklus",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getArtDerBehandlungType_BestaetigungBehandlungNnichtBegonnen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bestaetigungBehandlungNnichtBegonnen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getArtDerBehandlungType_VoraussichtlicherBehandlungsbeginn(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "voraussichtlicherBehandlungsbeginn",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (artNachreichungTypeEClass,
		   source,
		   new String[] {
			   "name", "artNachreichung_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (auszahlungsantragTypeEClass,
		   source,
		   new String[] {
			   "name", "AuszahlungsantragType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAuszahlungsantragType_AbfrageBewilligungsbescheid(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "abfrageBewilligungsbescheid",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAuszahlungsantragType_BundeslandFoerderstelle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bundeslandFoerderstelle",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAuszahlungsantragType_AktenzeichenBewilligungsantrag(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aktenzeichenBewilligungsantrag",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAuszahlungsantragType_DatenschutzerklaerungSchwangerschaft(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "datenschutzerklaerungSchwangerschaft",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAuszahlungsantragType_ZustimmungDatenschutzerklaerungHerbeifuehrung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zustimmungDatenschutzerklaerungHerbeifuehrung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAuszahlungsantragType_Konfigurationsfragen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "konfigurationsfragen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAuszahlungsantragType_AntragstellendePerson(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "antragstellendePerson",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAuszahlungsantragType_NichtaustragendePerson(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nichtaustragendePerson",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAuszahlungsantragType_AngabenBankverbindung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenBankverbindung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAuszahlungsantragType_NachweiseBerechnungZuwendung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweiseBerechnungZuwendung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAuszahlungsantragType_EinwilligungenAuszahlungsantrag(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "einwilligungenAuszahlungsantrag",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAuszahlungsantragType_BestaetigungRichtigkeitAngaben(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bestaetigungRichtigkeitAngaben",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (befruchtungsbehandlungenTypeEClass,
		   source,
		   new String[] {
			   "name", "BefruchtungsbehandlungenType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBefruchtungsbehandlungenType_Versuch(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "versuch",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (bewilligungsantragTypeEClass,
		   source,
		   new String[] {
			   "name", "BewilligungsantragType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBewilligungsantragType_StandortReproduktionsklinik(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "standortReproduktionsklinik",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBewilligungsantragType_Bundesland(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bundesland",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBewilligungsantragType_DatenschutzerklaerungSchwangerschaft(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "datenschutzerklaerungSchwangerschaft",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBewilligungsantragType_DatenschutzerklaerungherbeifuehrungSchwangerschaft(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "datenschutzerklaerungherbeifuehrungSchwangerschaft",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBewilligungsantragType_Konfigurationsfragen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "konfigurationsfragen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBewilligungsantragType_Familienstand(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "familienstand",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBewilligungsantragType_GleicherHaushalt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "gleicherHaushalt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBewilligungsantragType_GruendegetrennterWohnsitz(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "gruendegetrennterWohnsitz",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBewilligungsantragType_Altersgrenze(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "altersgrenze",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBewilligungsantragType_ArtBehandlung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "artBehandlung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBewilligungsantragType_AntragstellendePerson(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "antragstellendePerson",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBewilligungsantragType_NichtaustragendePerson(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nichtaustragendePerson",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBewilligungsantragType_AngabenBehandlung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenBehandlung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBewilligungsantragType_Finanzierungsplan(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "finanzierungsplan",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBewilligungsantragType_Nachweise(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweise",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBewilligungsantragType_Einwilligungen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "einwilligungen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBewilligungsantragType_BestaetigungRichtigkeitAngaben(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bestaetigungRichtigkeitAngaben",
			   "namespace", "##targetNamespace"
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
		  (getDocumentRoot_KinderwunschBewilligungsantrag1001(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kinderwunsch.bewilligungsantrag.1001",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_KinderwunschNachreichung1003(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kinderwunsch.nachreichung.1003",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_KinderwunschVerwendungsnachweispruefung1002(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kinderwunsch.verwendungsnachweispruefung.1002",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (einwilligungenAuszahlungsantragTypeEClass,
		   source,
		   new String[] {
			   "name", "EinwilligungenAuszahlungsantragType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEinwilligungenAuszahlungsantragType_ZustimmungDatenschutz(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zustimmungDatenschutz",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEinwilligungenAuszahlungsantragType_ElektronischeBescheidzustellung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "elektronischeBescheidzustellung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (einwilligungenTypeEClass,
		   source,
		   new String[] {
			   "name", "EinwilligungenType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEinwilligungenType_EinwilligungZurAuskunftseinholung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "einwilligungZurAuskunftseinholung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEinwilligungenType_EinwilligungZurAuskunftseinholungEinschraenkungen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "einwilligungZurAuskunftseinholungEinschraenkungen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEinwilligungenType_EntbindungSchweigepflichtDerAerzte(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "entbindungSchweigepflichtDerAerzte",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEinwilligungenType_EinwilligungKostenuebernahmeregelungBehandlungsabbruch(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "einwilligungKostenuebernahmeregelungBehandlungsabbruch",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEinwilligungenType_DatenschutzerklaerungHerbeifuehrungSchwangerschaft(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "datenschutzerklaerungHerbeifuehrungSchwangerschaft",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (finanzierungsplanTypeEClass,
		   source,
		   new String[] {
			   "name", "FinanzierungsplanType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFinanzierungsplanType_Gesamtkosten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "gesamtkosten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFinanzierungsplanType_VoraussichtlicheErstattungGesetzlicheKrankenkasse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "voraussichtlicheErstattungGesetzlicheKrankenkasse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFinanzierungsplanType_VoraussichtlicheErstattungPrivateKrankenkasse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "voraussichtlicheErstattungPrivateKrankenkasse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFinanzierungsplanType_VoraussichtlicheErstattungBeihilfe(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "voraussichtlicheErstattungBeihilfe",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFinanzierungsplanType_VoraussichtlicheErstattungHeilfuersorge(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "voraussichtlicheErstattungHeilfuersorge",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFinanzierungsplanType_VerbleibenderEigenanteilSelbstkostenanteil(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "verbleibenderEigenanteilSelbstkostenanteil",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFinanzierungsplanType_ZuwendungenGesamt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zuwendungenGesamt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (kinderwunschBewilligungsantrag1001TypeEClass,
		   source,
		   new String[] {
			   "name", "kinderwunsch.bewilligungsantrag.1001_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKinderwunschBewilligungsantrag1001Type_Bewilligungsantrag(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bewilligungsantrag",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (kinderwunschNachreichung1003TypeEClass,
		   source,
		   new String[] {
			   "name", "kinderwunsch.nachreichung.1003_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKinderwunschNachreichung1003Type_Bundesland(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bundesland",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKinderwunschNachreichung1003Type_Bearbeitungsnummer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bearbeitungsnummer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKinderwunschNachreichung1003Type_NichtaustragendePerson(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nichtaustragendePerson",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKinderwunschNachreichung1003Type_AntragstellendePerson(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "antragstellendePerson",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKinderwunschNachreichung1003Type_Nachreichung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachreichung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKinderwunschNachreichung1003Type_DatenschutzerklaerungDerFoerderstelle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "datenschutzerklaerungDerFoerderstelle",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKinderwunschNachreichung1003Type_BestaetigungRichtigkeitAngaben(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bestaetigungRichtigkeitAngaben",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (kinderwunschVerwendungsnachweispruefung1002TypeEClass,
		   source,
		   new String[] {
			   "name", "kinderwunsch.verwendungsnachweispruefung.1002_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKinderwunschVerwendungsnachweispruefung1002Type_Auszahlungsantrag(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "auszahlungsantrag",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (konfigurationsfragenBewilligungTypeEClass,
		   source,
		   new String[] {
			   "name", "KonfigurationsfragenBewilligungType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKonfigurationsfragenBewilligungType_GleicherHaushalt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "gleicherHaushalt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (konfigurationsfragenTypeEClass,
		   source,
		   new String[] {
			   "name", "KonfigurationsfragenType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKonfigurationsfragenType_GleicherHaushalt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "gleicherHaushalt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKonfigurationsfragenType_AngabenZurBehandlung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenZurBehandlung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (krankenkasseTypeEClass,
		   source,
		   new String[] {
			   "name", "KrankenkasseType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKrankenkasseType_ArtKrankenkasse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "artKrankenkasse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKrankenkasseType_NameKrankenkasse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nameKrankenkasse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKrankenkasseType_NameBeihilfestelle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nameBeihilfestelle",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKrankenkasseType_NameHeilfuersorge(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nameHeilfuersorge",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nachreichungTypeEClass,
		   source,
		   new String[] {
			   "name", "NachreichungType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNachreichungType_ArtNachreichung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "artNachreichung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachreichungType_Nachweis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweis",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachreichungType_EinwilligungDatenverarbeitungDurchFoerderstelle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "einwilligungDatenverarbeitungDurchFoerderstelle",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nachweiseBerechnungZuwendungTypeEClass,
		   source,
		   new String[] {
			   "name", "NachweiseBerechnungZuwendungType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNachweiseBerechnungZuwendungType_NegativbescheinigungVersicherungKostentraeger(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "negativbescheinigungVersicherungKostentraeger",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweiseBerechnungZuwendungType_ZuschuesseKrankenversicherung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zuschuesseKrankenversicherung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nachweiseKinderwunschTypeEClass,
		   source,
		   new String[] {
			   "name", "NachweiseKinderwunschType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNachweiseKinderwunschType_NachweisAktuellerWohnsitz(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweisAktuellerWohnsitz",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweiseKinderwunschType_NachweisEheurkunde(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweisEheurkunde",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweiseKinderwunschType_DauerAngelegtePartnerschaft(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dauerAngelegtePartnerschaft",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweiseKinderwunschType_KostenuebernahmeerklaerungNegativbescheid(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kostenuebernahmeerklaerungNegativbescheid",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweiseKinderwunschType_NotwendigkeitsbescheinigungDesArztes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "notwendigkeitsbescheinigungDesArztes",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweiseKinderwunschType_BehandlungsplanKostenvoranschlag(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "behandlungsplanKostenvoranschlag",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweiseKinderwunschType_ErklaerungReproduktionseinrichtung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "erklaerungReproduktionseinrichtung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nachweiseRechnungenTypeEClass,
		   source,
		   new String[] {
			   "name", "NachweiseRechnungenType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNachweiseRechnungenType_Rechnungsdatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "rechnungsdatum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweiseRechnungenType_Rechnungssteller(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "rechnungssteller",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweiseRechnungenType_Betrag(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "betrag",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweiseRechnungenType_SummeGesamtkosten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "summeGesamtkosten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweiseRechnungenType_Nachweis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweis",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nachweisTypeEClass,
		   source,
		   new String[] {
			   "name", "NachweisType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNachweisType_NachweisVorhanden(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweisVorhanden",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweisType_Nachweis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweis",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (personendatenTypeEClass,
		   source,
		   new String[] {
			   "name", "PersonendatenType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPersonendatenType_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersonendatenType_Wohnsitz(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wohnsitz",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersonendatenType_Krankenkasse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "krankenkasse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (versuchTypeEClass,
		   source,
		   new String[] {
			   "name", "VersuchType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getVersuchType_NummerDesVersuchs(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nummerDesVersuchs",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVersuchType_DatumDesVersuchs(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "datumDesVersuchs",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVersuchType_NachweisVierterVersuch(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweisVierterVersuch",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (vorherigeBehandlungenTypeEClass,
		   source,
		   new String[] {
			   "name", "VorherigeBehandlungenType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getVorherigeBehandlungenType_BisherGefoerderteBehandlungen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bisherGefoerderteBehandlungen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVorherigeBehandlungenType_Befruchtungsbehandlungen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "befruchtungsbehandlungen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVorherigeBehandlungenType_Wiederholungsversuch(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wiederholungsversuch",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVorherigeBehandlungenType_NameReproduktionseinrichtung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nameReproduktionseinrichtung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVorherigeBehandlungenType_PostleitzahlReproduktionseinrichtung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "postleitzahlReproduktionseinrichtung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVorherigeBehandlungenType_Beratung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "beratung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVorherigeBehandlungenType_NachweisVierterVersuch(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweisVierterVersuch",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (wohnsitzTypeEClass,
		   source,
		   new String[] {
			   "name", "WohnsitzType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getWohnsitzType_AnschriftInlandStrassenanschrift(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anschriftInlandStrassenanschrift",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWohnsitzType_AbweichendeAdresseNPA(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "abweichendeAdresseNPA",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWohnsitzType_Erreichbarkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "erreichbarkeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (zusaetzlicheBeteiligungTypeEClass,
		   source,
		   new String[] {
			   "name", "ZusaetzlicheBeteiligungType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZusaetzlicheBeteiligungType_ZusaetzlicheBeteiligung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zusaetzlicheBeteiligung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getZusaetzlicheBeteiligungType_VorliegenNachweis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "vorliegenNachweis",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getZusaetzlicheBeteiligungType_Betrag(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "betrag",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getZusaetzlicheBeteiligungType_Nachweis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweis",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (zuschuesseKrankenversicherungTypeEClass,
		   source,
		   new String[] {
			   "name", "ZuschuesseKrankenversicherungType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZuschuesseKrankenversicherungType_BeteiligteKrankenkassen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "beteiligteKrankenkassen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getZuschuesseKrankenversicherungType_NegativbescheinigungVersicherungKostentraeger(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "negativbescheinigungVersicherungKostentraeger",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getZuschuesseKrankenversicherungType_ZusaetzlicheBeteiligungGKV(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zusaetzlicheBeteiligungGKV",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getZuschuesseKrankenversicherungType_ZusaetzlicheBeteiligungPKV(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zusaetzlicheBeteiligungPKV",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getZuschuesseKrankenversicherungType_BeteiligungBeihilfe(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "beteiligungBeihilfe",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getZuschuesseKrankenversicherungType_NachweiseRechnungen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweiseRechnungen",
			   "namespace", "##targetNamespace"
		   });
	}

} //KinderwunschPackageImpl
