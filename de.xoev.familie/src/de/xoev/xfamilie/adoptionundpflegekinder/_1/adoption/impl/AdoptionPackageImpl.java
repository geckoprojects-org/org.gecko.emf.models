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
package de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl;

import de.xoev.kosit.datentyp._202204.din91379.DIN913792204Package;

import de.xoev.schemata.code.code.Code10Package;

import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionFactory;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderAdoption0901Type;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenPflegeType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenVerwandtenadoptionType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AlterssicherungPflegepersonType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnliegenType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsUnfallversicherungType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragstellerType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BeitragsuebernahmeUnfallversicherungType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BestimmtesKindType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DatenschutzUndEinwilligungType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DigitalerRueckkanalType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DocumentRoot;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontakformularType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontoinformationenType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweisType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweiseEinreichenType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragGezahltVonType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragVollzeitpflegeType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PersonendatenType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegekindBasisType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegekindType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonBasisType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SignaturType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.WeiterePersonenImHauhaltType;

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
public class AdoptionPackageImpl extends EPackageImpl implements AdoptionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abgebenderElternteilTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adoptionundpflegekinderAdoption0901TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adoptionundpflegekinderPflegekinder0902TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allgemeineAngabenFremdkindadoptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allgemeineAngabenPflegeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allgemeineAngabenStiefkindadoptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allgemeineAngabenVerwandtenadoptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alterssicherungPflegepersonTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angabenDesZuAdoptierendenKindesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angabenPflegekindTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angabenZuKindernDerFamilieTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angabenZurPartnerschaftTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anliegenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annehmenderElternteilTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass antragdetailsAlterssicherungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass antragdetailsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass antragdetailsUnfallversicherungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass antragstellerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beitragsuebernahmeUnfallversicherungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bestimmtesKindTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datenschutzUndEinwilligungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digitalerRueckkanalTypeEClass = null;

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
	private EClass einkommenPflegekindTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass einkommenUndWohnenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fremdkindadoptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kontakformularTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kontoinformationenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moeglichkeitenUndGrenzenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nachweiseEinreichenTypeEClass = null;

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
	private EClass pauschalbetragGezahltVonTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pauschalbetragVollzeitpflegeTypeEClass = null;

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
	private EClass pflegekindBasisTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pflegekindTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pflegepersonBasisTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pflegepersonTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signaturTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sonstigeAntraegeSendenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stiefkindadoptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verbleibenderSorgeberechtigterElternteilTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verwandtenadoptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weiterePersonenImHauhaltTypeEClass = null;

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
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AdoptionPackageImpl() {
		super(eNS_URI, AdoptionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AdoptionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AdoptionPackage init() {
		if (isInited) return (AdoptionPackage)EPackage.Registry.INSTANCE.getEPackage(AdoptionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAdoptionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AdoptionPackageImpl theAdoptionPackage = registeredAdoptionPackage instanceof AdoptionPackageImpl ? (AdoptionPackageImpl)registeredAdoptionPackage : new AdoptionPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DIN913792204Package.eINSTANCE.eClass();
		Code10Package.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BaukastenPackage.eNS_URI);
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
		theAdoptionPackage.createPackageContents();
		theBaukastenPackage.createPackageContents();
		theAllgemeineNachrichtenPackage.createPackageContents();
		theBeistandschaftPackage.createPackageContents();
		theDSRVPackage.createPackageContents();
		theGeburtPackage.createPackageContents();
		theErziehungshilfePackage.createPackageContents();
		theKinderwunschPackage.createPackageContents();
		theMutterschaftsgeldPackage.createPackageContents();

		// Initialize created meta-data
		theAdoptionPackage.initializePackageContents();
		theBaukastenPackage.initializePackageContents();
		theAllgemeineNachrichtenPackage.initializePackageContents();
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
		theAdoptionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AdoptionPackage.eNS_URI, theAdoptionPackage);
		return theAdoptionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbgebenderElternteilType() {
		return abgebenderElternteilTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbgebenderElternteilType_Elternteil() {
		return (EReference)abgebenderElternteilTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbgebenderElternteilType_Personendaten() {
		return (EReference)abgebenderElternteilTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbgebenderElternteilType_Geburt() {
		return (EReference)abgebenderElternteilTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbgebenderElternteilType_Staatsangehoerigkeit() {
		return (EReference)abgebenderElternteilTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbgebenderElternteilType_EinstellungAdoptionsabsicht() {
		return (EAttribute)abgebenderElternteilTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbgebenderElternteilType_Aufenthaltsstatus() {
		return (EReference)abgebenderElternteilTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbgebenderElternteilType_ElternteilVerstorben() {
		return (EReference)abgebenderElternteilTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdoptionundpflegekinderAdoption0901Type() {
		return adoptionundpflegekinderAdoption0901TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdoptionundpflegekinderAdoption0901Type_Kontaktformular() {
		return (EReference)adoptionundpflegekinderAdoption0901TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdoptionundpflegekinderAdoption0901Type_NachweiseEinreichen() {
		return (EReference)adoptionundpflegekinderAdoption0901TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdoptionundpflegekinderAdoption0901Type_Stiefkindadoption() {
		return (EReference)adoptionundpflegekinderAdoption0901TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdoptionundpflegekinderAdoption0901Type_Verwandtenadoption() {
		return (EReference)adoptionundpflegekinderAdoption0901TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdoptionundpflegekinderAdoption0901Type_Fremdkindadoption() {
		return (EReference)adoptionundpflegekinderAdoption0901TypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdoptionundpflegekinderPflegekinder0902Type() {
		return adoptionundpflegekinderPflegekinder0902TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdoptionundpflegekinderPflegekinder0902Type_Kontaktformular() {
		return (EReference)adoptionundpflegekinderPflegekinder0902TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdoptionundpflegekinderPflegekinder0902Type_NachweiseEinreichen() {
		return (EReference)adoptionundpflegekinderPflegekinder0902TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdoptionundpflegekinderPflegekinder0902Type_Pflegeperson() {
		return (EReference)adoptionundpflegekinderPflegekinder0902TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdoptionundpflegekinderPflegekinder0902Type_SonstigeAntraegeSenden() {
		return (EReference)adoptionundpflegekinderPflegekinder0902TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdoptionundpflegekinderPflegekinder0902Type_BeitragsuebernahmeUnfallversicherung() {
		return (EReference)adoptionundpflegekinderPflegekinder0902TypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdoptionundpflegekinderPflegekinder0902Type_AlterssicherungPflegeperson() {
		return (EReference)adoptionundpflegekinderPflegekinder0902TypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdoptionundpflegekinderPflegekinder0902Type_PauschalbetragVollzeitpflege() {
		return (EReference)adoptionundpflegekinderPflegekinder0902TypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllgemeineAngabenFremdkindadoptionType() {
		return allgemeineAngabenFremdkindadoptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllgemeineAngabenFremdkindadoptionType_Personendaten() {
		return (EReference)allgemeineAngabenFremdkindadoptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllgemeineAngabenFremdkindadoptionType_Geburt() {
		return (EReference)allgemeineAngabenFremdkindadoptionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllgemeineAngabenFremdkindadoptionType_Staatsangehoerigkeit() {
		return (EReference)allgemeineAngabenFremdkindadoptionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineAngabenFremdkindadoptionType_Religionszugehoerigkeit() {
		return (EAttribute)allgemeineAngabenFremdkindadoptionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineAngabenFremdkindadoptionType_AktuelleBeruflicheTaetigkeit() {
		return (EAttribute)allgemeineAngabenFremdkindadoptionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineAngabenFremdkindadoptionType_EinkuenfteAusTaetigkeit() {
		return (EAttribute)allgemeineAngabenFremdkindadoptionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineAngabenFremdkindadoptionType_AndereEinkuenfte() {
		return (EAttribute)allgemeineAngabenFremdkindadoptionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineAngabenFremdkindadoptionType_Schuldverpflichtungen() {
		return (EAttribute)allgemeineAngabenFremdkindadoptionTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineAngabenFremdkindadoptionType_Unterhaltsverpflichtungen() {
		return (EAttribute)allgemeineAngabenFremdkindadoptionTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineAngabenFremdkindadoptionType_MonatlicheFixkostenUnterkunft() {
		return (EAttribute)allgemeineAngabenFremdkindadoptionTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllgemeineAngabenFremdkindadoptionType_Aufenthaltsstatus() {
		return (EReference)allgemeineAngabenFremdkindadoptionTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineAngabenFremdkindadoptionType_AktuellerFamilienstand() {
		return (EAttribute)allgemeineAngabenFremdkindadoptionTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllgemeineAngabenFremdkindadoptionType_Geschlecht() {
		return (EReference)allgemeineAngabenFremdkindadoptionTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineAngabenFremdkindadoptionType_BereitsVerheiratet() {
		return (EAttribute)allgemeineAngabenFremdkindadoptionTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineAngabenFremdkindadoptionType_UmfangVerheiratet() {
		return (EAttribute)allgemeineAngabenFremdkindadoptionTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllgemeineAngabenPflegeType() {
		return allgemeineAngabenPflegeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineAngabenPflegeType_Wochenstunden() {
		return (EAttribute)allgemeineAngabenPflegeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllgemeineAngabenPflegeType_Anschrift() {
		return (EReference)allgemeineAngabenPflegeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllgemeineAngabenPflegeType_Geschlecht() {
		return (EReference)allgemeineAngabenPflegeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllgemeineAngabenStiefkindadoptionType() {
		return allgemeineAngabenStiefkindadoptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineAngabenStiefkindadoptionType_KontaktZuLeiblicherFamilie() {
		return (EAttribute)allgemeineAngabenStiefkindadoptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineAngabenStiefkindadoptionType_ErlaeuterungKontaktZuLeiblicherFamilie() {
		return (EAttribute)allgemeineAngabenStiefkindadoptionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllgemeineAngabenStiefkindadoptionType_Personensorgerecht() {
		return (EReference)allgemeineAngabenStiefkindadoptionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineAngabenStiefkindadoptionType_PersonensorgerechtBeiSonstige() {
		return (EAttribute)allgemeineAngabenStiefkindadoptionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineAngabenStiefkindadoptionType_GeschpraechUeberAdoption() {
		return (EAttribute)allgemeineAngabenStiefkindadoptionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineAngabenStiefkindadoptionType_ReaktionKindGespraech() {
		return (EAttribute)allgemeineAngabenStiefkindadoptionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineAngabenStiefkindadoptionType_KontaktJugendamt() {
		return (EAttribute)allgemeineAngabenStiefkindadoptionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineAngabenStiefkindadoptionType_ArtKontaktJugendamt() {
		return (EAttribute)allgemeineAngabenStiefkindadoptionTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineAngabenStiefkindadoptionType_GerichtlicheRegelung() {
		return (EAttribute)allgemeineAngabenStiefkindadoptionTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllgemeineAngabenVerwandtenadoptionType() {
		return allgemeineAngabenVerwandtenadoptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineAngabenVerwandtenadoptionType_HerkunftBekannt() {
		return (EAttribute)allgemeineAngabenVerwandtenadoptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineAngabenVerwandtenadoptionType_KontaktZuLeiblicherFamilie() {
		return (EAttribute)allgemeineAngabenVerwandtenadoptionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineAngabenVerwandtenadoptionType_ErlaeuterungKontaktZuLeiblicherFamilie() {
		return (EAttribute)allgemeineAngabenVerwandtenadoptionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllgemeineAngabenVerwandtenadoptionType_Personensorgerecht() {
		return (EReference)allgemeineAngabenVerwandtenadoptionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineAngabenVerwandtenadoptionType_PersonensorgerechtBeiSonstige() {
		return (EAttribute)allgemeineAngabenVerwandtenadoptionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineAngabenVerwandtenadoptionType_GeschpraechUeberAdoption() {
		return (EAttribute)allgemeineAngabenVerwandtenadoptionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineAngabenVerwandtenadoptionType_ReaktionKindGespraech() {
		return (EAttribute)allgemeineAngabenVerwandtenadoptionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlterssicherungPflegepersonType() {
		return alterssicherungPflegepersonTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlterssicherungPflegepersonType_DatenschutzUndEinwilligung() {
		return (EReference)alterssicherungPflegepersonTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlterssicherungPflegepersonType_AllgemeineAngaben() {
		return (EReference)alterssicherungPflegepersonTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlterssicherungPflegepersonType_AntragdetailsAlterssicherung() {
		return (EReference)alterssicherungPflegepersonTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlterssicherungPflegepersonType_Pflegekinder() {
		return (EReference)alterssicherungPflegepersonTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlterssicherungPflegepersonType_Nachweise() {
		return (EReference)alterssicherungPflegepersonTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlterssicherungPflegepersonType_DatenschutzDerFachbehoerde() {
		return (EReference)alterssicherungPflegepersonTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlterssicherungPflegepersonType_Signatur() {
		return (EReference)alterssicherungPflegepersonTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlterssicherungPflegepersonType_DigitalerRueckkanal() {
		return (EReference)alterssicherungPflegepersonTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAngabenDesZuAdoptierendenKindesType() {
		return angabenDesZuAdoptierendenKindesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenDesZuAdoptierendenKindesType_Personendaten() {
		return (EReference)angabenDesZuAdoptierendenKindesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenDesZuAdoptierendenKindesType_Geburt() {
		return (EReference)angabenDesZuAdoptierendenKindesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenDesZuAdoptierendenKindesType_Staatsangehoerigkeit() {
		return (EReference)angabenDesZuAdoptierendenKindesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenDesZuAdoptierendenKindesType_Religionszugehoerigkeit() {
		return (EAttribute)angabenDesZuAdoptierendenKindesTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenDesZuAdoptierendenKindesType_AusAuslandGeholt() {
		return (EAttribute)angabenDesZuAdoptierendenKindesTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenDesZuAdoptierendenKindesType_Anschrift() {
		return (EReference)angabenDesZuAdoptierendenKindesTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenDesZuAdoptierendenKindesType_Aufenthaltsstatus() {
		return (EReference)angabenDesZuAdoptierendenKindesTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAngabenPflegekindType() {
		return angabenPflegekindTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenPflegekindType_Personendaten() {
		return (EReference)angabenPflegekindTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenPflegekindType_Geburt() {
		return (EReference)angabenPflegekindTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenPflegekindType_Anschrift() {
		return (EReference)angabenPflegekindTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenPflegekindType_BeginnPflegeverhaeltnis() {
		return (EAttribute)angabenPflegekindTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenPflegekindType_Krankenversichert() {
		return (EAttribute)angabenPflegekindTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenPflegekindType_KrankenversichertUeberPflegeperson() {
		return (EAttribute)angabenPflegekindTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenPflegekindType_SchuleAusbildungsstaette() {
		return (EAttribute)angabenPflegekindTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenPflegekindType_KlassenstufeAusbildungsjahr() {
		return (EAttribute)angabenPflegekindTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenPflegekindType_EinkommenPflegekind() {
		return (EReference)angabenPflegekindTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAngabenZuKindernDerFamilieType() {
		return angabenZuKindernDerFamilieTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZuKindernDerFamilieType_Personendaten() {
		return (EReference)angabenZuKindernDerFamilieTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZuKindernDerFamilieType_Geburt() {
		return (EReference)angabenZuKindernDerFamilieTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZuKindernDerFamilieType_VerhaeltnisKind() {
		return (EAttribute)angabenZuKindernDerFamilieTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZuKindernDerFamilieType_ElternteilDesKindes() {
		return (EAttribute)angabenZuKindernDerFamilieTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZuKindernDerFamilieType_KindWohnhaftHaushalt() {
		return (EAttribute)angabenZuKindernDerFamilieTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZuKindernDerFamilieType_KindWohnhaftAlterntive() {
		return (EAttribute)angabenZuKindernDerFamilieTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZuKindernDerFamilieType_KindVerstorben() {
		return (EReference)angabenZuKindernDerFamilieTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAngabenZurPartnerschaftType() {
		return angabenZurPartnerschaftTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZurPartnerschaftType_DauerPartnerschaft() {
		return (EAttribute)angabenZurPartnerschaftTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZurPartnerschaftType_DauerGemeinsamerHaushalt() {
		return (EAttribute)angabenZurPartnerschaftTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZurPartnerschaftType_VerheiratetOderLebenspartnerschaft() {
		return (EAttribute)angabenZurPartnerschaftTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZurPartnerschaftType_DauerVerheiratetOderLebenspartnerschaft() {
		return (EAttribute)angabenZurPartnerschaftTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZurPartnerschaftType_GespraechUeberAdoption() {
		return (EAttribute)angabenZurPartnerschaftTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZurPartnerschaftType_MeinungFamilieUndFreunde() {
		return (EAttribute)angabenZurPartnerschaftTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZurPartnerschaftType_Anschrift() {
		return (EReference)angabenZurPartnerschaftTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZurPartnerschaftType_WohnverhaeltnisseAnzahlZimmer() {
		return (EAttribute)angabenZurPartnerschaftTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZurPartnerschaftType_WohnverhaeltnisseWohnflaeche() {
		return (EAttribute)angabenZurPartnerschaftTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZurPartnerschaftType_MieteOderEigentum() {
		return (EAttribute)angabenZurPartnerschaftTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZurPartnerschaftType_Garten() {
		return (EAttribute)angabenZurPartnerschaftTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZurPartnerschaftType_Kinderzimmer() {
		return (EAttribute)angabenZurPartnerschaftTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZurPartnerschaftType_Haustiere() {
		return (EAttribute)angabenZurPartnerschaftTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnliegenType() {
		return anliegenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnliegenType_WunschBeratung() {
		return (EReference)anliegenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnliegenType_Kommentar() {
		return (EAttribute)anliegenTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnehmenderElternteilType() {
		return annehmenderElternteilTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnehmenderElternteilType_Personendaten() {
		return (EReference)annehmenderElternteilTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnehmenderElternteilType_Staatsangehoerigkeit() {
		return (EReference)annehmenderElternteilTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnehmenderElternteilType_Geburt() {
		return (EReference)annehmenderElternteilTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnehmenderElternteilType_AktuelleBeruflicheTaetigkeit() {
		return (EAttribute)annehmenderElternteilTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnehmenderElternteilType_GruendeMotiveFuerAdoption() {
		return (EAttribute)annehmenderElternteilTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnehmenderElternteilType_VeraenderungDurchAdoption() {
		return (EAttribute)annehmenderElternteilTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnehmenderElternteilType_EinkuenfteAusTaetigkeit() {
		return (EAttribute)annehmenderElternteilTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnehmenderElternteilType_AndereEinkuenfte() {
		return (EAttribute)annehmenderElternteilTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnehmenderElternteilType_Schuldverpflichtungen() {
		return (EAttribute)annehmenderElternteilTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnehmenderElternteilType_Unterhaltsverpflichtungen() {
		return (EAttribute)annehmenderElternteilTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnehmenderElternteilType_MonatlicheFixkostenUnterkunft() {
		return (EAttribute)annehmenderElternteilTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnehmenderElternteilType_Religionszugehoerigkeit() {
		return (EAttribute)annehmenderElternteilTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnehmenderElternteilType_Aufenthaltsstatus() {
		return (EReference)annehmenderElternteilTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnehmenderElternteilType_Geschlecht() {
		return (EReference)annehmenderElternteilTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAntragdetailsAlterssicherungType() {
		return antragdetailsAlterssicherungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAntragdetailsAlterssicherungType_BeantragungZuschussAlterssicherung() {
		return (EAttribute)antragdetailsAlterssicherungTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragdetailsAlterssicherungType_Zuschuesse() {
		return (EReference)antragdetailsAlterssicherungTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAntragdetailsAlterssicherungType_HoeheZuschuesse() {
		return (EAttribute)antragdetailsAlterssicherungTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAntragdetailsAlterssicherungType_VonAndererStelle() {
		return (EAttribute)antragdetailsAlterssicherungTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAntragdetailsAlterssicherungType_ArtHoeheAbsicherung() {
		return (EAttribute)antragdetailsAlterssicherungTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAntragdetailsAlterssicherungType_AlleinigePflegeperson() {
		return (EAttribute)antragdetailsAlterssicherungTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAntragdetailsAlterssicherungType_Hauptpflegeperson() {
		return (EAttribute)antragdetailsAlterssicherungTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAntragdetailsType() {
		return antragdetailsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragdetailsType_Antrag() {
		return (EReference)antragdetailsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAntragdetailsType_Information() {
		return (EAttribute)antragdetailsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAntragdetailsUnfallversicherungType() {
		return antragdetailsUnfallversicherungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAntragdetailsUnfallversicherungType_BeantragungKostenUnfallversicherung() {
		return (EAttribute)antragdetailsUnfallversicherungTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragdetailsUnfallversicherungType_Zuschuesse() {
		return (EReference)antragdetailsUnfallversicherungTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAntragdetailsUnfallversicherungType_HoeheZuschuesse() {
		return (EAttribute)antragdetailsUnfallversicherungTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAntragstellerType() {
		return antragstellerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellerType_Personendaten() {
		return (EReference)antragstellerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAntragstellerType_Fallnummer() {
		return (EAttribute)antragstellerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAntragstellerType_Antragsdatum() {
		return (EAttribute)antragstellerTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellerType_Geburt() {
		return (EReference)antragstellerTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBeitragsuebernahmeUnfallversicherungType() {
		return beitragsuebernahmeUnfallversicherungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeitragsuebernahmeUnfallversicherungType_DatenschutzUndEinwilligung() {
		return (EReference)beitragsuebernahmeUnfallversicherungTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeitragsuebernahmeUnfallversicherungType_AllgemeineAngaben() {
		return (EReference)beitragsuebernahmeUnfallversicherungTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeitragsuebernahmeUnfallversicherungType_AntragdetailsUnfallversicherung() {
		return (EReference)beitragsuebernahmeUnfallversicherungTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeitragsuebernahmeUnfallversicherungType_Pflegekinder() {
		return (EReference)beitragsuebernahmeUnfallversicherungTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeitragsuebernahmeUnfallversicherungType_Nachweise() {
		return (EReference)beitragsuebernahmeUnfallversicherungTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeitragsuebernahmeUnfallversicherungType_DatenschutzDerFachbehoerde() {
		return (EReference)beitragsuebernahmeUnfallversicherungTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeitragsuebernahmeUnfallversicherungType_Signatur() {
		return (EReference)beitragsuebernahmeUnfallversicherungTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeitragsuebernahmeUnfallversicherungType_DigitalerRueckkanal() {
		return (EReference)beitragsuebernahmeUnfallversicherungTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBestimmtesKindType() {
		return bestimmtesKindTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBestimmtesKindType_Personendaten() {
		return (EReference)bestimmtesKindTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBestimmtesKindType_Geburt() {
		return (EReference)bestimmtesKindTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBestimmtesKindType_ZustaendigesJugendamt() {
		return (EAttribute)bestimmtesKindTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatenschutzUndEinwilligungType() {
		return datenschutzUndEinwilligungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatenschutzUndEinwilligungType_AllgemeineDatenschutzerklaerung() {
		return (EAttribute)datenschutzUndEinwilligungTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatenschutzUndEinwilligungType_KenntnissnahmeDatenschutzerklaerung() {
		return (EAttribute)datenschutzUndEinwilligungTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDigitalerRueckkanalType() {
		return digitalerRueckkanalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDigitalerRueckkanalType_PostfachUUID() {
		return (EAttribute)digitalerRueckkanalTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDigitalerRueckkanalType_EinverstaendnisDigitalerRueckkanal() {
		return (EAttribute)digitalerRueckkanalTypeEClass.getEStructuralFeatures().get(1);
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
	public EReference getDocumentRoot_AdoptionundpflegekinderAdoption0901() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AdoptionundpflegekinderPflegekinder0902() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEinkommenPflegekindType() {
		return einkommenPflegekindTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkommenPflegekindType_EinkommenAb() {
		return (EAttribute)einkommenPflegekindTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkommenPflegekindType_HoeheEinkommen() {
		return (EAttribute)einkommenPflegekindTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkommenPflegekindType_BezugKindergeldAb() {
		return (EAttribute)einkommenPflegekindTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkommenPflegekindType_HoeheKindergeld() {
		return (EAttribute)einkommenPflegekindTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEinkommenPflegekindType_ArtDesEinkommens() {
		return (EReference)einkommenPflegekindTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkommenPflegekindType_SonstigesEinkommen() {
		return (EAttribute)einkommenPflegekindTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkommenPflegekindType_ZustaendigeFamilienkasse() {
		return (EAttribute)einkommenPflegekindTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEinkommenUndWohnenType() {
		return einkommenUndWohnenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkommenUndWohnenType_EinkuenfteAusTaetigkeit() {
		return (EAttribute)einkommenUndWohnenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkommenUndWohnenType_AndereEinkuenfte() {
		return (EAttribute)einkommenUndWohnenTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkommenUndWohnenType_Schuldverpflichtungen() {
		return (EAttribute)einkommenUndWohnenTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkommenUndWohnenType_Unterhaltsverpflichtungen() {
		return (EAttribute)einkommenUndWohnenTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkommenUndWohnenType_MonatlicheFixkostenUnterkunft() {
		return (EAttribute)einkommenUndWohnenTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkommenUndWohnenType_WohnverhaeltnisseAnzahlZimmer() {
		return (EAttribute)einkommenUndWohnenTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkommenUndWohnenType_WohnverhaeltnisseWohnflaeche() {
		return (EAttribute)einkommenUndWohnenTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFremdkindadoptionType() {
		return fremdkindadoptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFremdkindadoptionType_Beratungscode() {
		return (EAttribute)fremdkindadoptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFremdkindadoptionType_AllgemeineAngaben() {
		return (EReference)fremdkindadoptionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFremdkindadoptionType_AngabenZurPartnerschaft() {
		return (EReference)fremdkindadoptionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFremdkindadoptionType_AngabenZuKindernDerFamilie() {
		return (EReference)fremdkindadoptionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFremdkindadoptionType_WeiterePersonenImHauhalt() {
		return (EReference)fremdkindadoptionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFremdkindadoptionType_AuseinandersetzungThemaAdoption() {
		return (EAttribute)fremdkindadoptionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFremdkindadoptionType_Nachweise() {
		return (EReference)fremdkindadoptionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFremdkindadoptionType_DatenschutzDerFachbehoerde() {
		return (EReference)fremdkindadoptionTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFremdkindadoptionType_Signatur() {
		return (EReference)fremdkindadoptionTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFremdkindadoptionType_DigitalerRueckkanal() {
		return (EReference)fremdkindadoptionTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFremdkindadoptionType_DatenschutzUndEinwilligung() {
		return (EReference)fremdkindadoptionTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFremdkindadoptionType_AertzlicheBehandlung() {
		return (EAttribute)fremdkindadoptionTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKontakformularType() {
		return kontakformularTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKontakformularType_DatenschutzUndEinwilligung() {
		return (EReference)kontakformularTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKontakformularType_Personendaten() {
		return (EReference)kontakformularTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKontakformularType_Anschrift() {
		return (EReference)kontakformularTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKontakformularType_Anliegen() {
		return (EReference)kontakformularTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKontakformularType_DatenschutzDerFachbehoerde() {
		return (EReference)kontakformularTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKontakformularType_DigitalerRueckkanal() {
		return (EReference)kontakformularTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKontoinformationenType() {
		return kontoinformationenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKontoinformationenType_BeantragungJugendhilfe() {
		return (EReference)kontoinformationenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKontoinformationenType_Bankverbindung() {
		return (EReference)kontoinformationenTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMoeglichkeitenUndGrenzenType() {
		return moeglichkeitenUndGrenzenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMoeglichkeitenUndGrenzenType_ZutrauenKindJedenAlters() {
		return (EAttribute)moeglichkeitenUndGrenzenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMoeglichkeitenUndGrenzenType_ZutrauenKindAltersangabe() {
		return (EAttribute)moeglichkeitenUndGrenzenTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMoeglichkeitenUndGrenzenType_ZutrauenKindBeeintraechtigung() {
		return (EAttribute)moeglichkeitenUndGrenzenTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMoeglichkeitenUndGrenzenType_ZutrauenKindKoerperlicheBeeintraechtigung() {
		return (EAttribute)moeglichkeitenUndGrenzenTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMoeglichkeitenUndGrenzenType_ZutrauenKindGeistigerBeeintraechtigung() {
		return (EAttribute)moeglichkeitenUndGrenzenTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMoeglichkeitenUndGrenzenType_ZutrauenKindPsychischerBeeintraechtigung() {
		return (EAttribute)moeglichkeitenUndGrenzenTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNachweiseEinreichenType() {
		return nachweiseEinreichenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachweiseEinreichenType_DatenschutzUndEinwilligung() {
		return (EReference)nachweiseEinreichenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachweiseEinreichenType_Antragsteller() {
		return (EReference)nachweiseEinreichenTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachweiseEinreichenType_Nachweise() {
		return (EReference)nachweiseEinreichenTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachweiseEinreichenType_DatenschutzDerFachbehoerde() {
		return (EReference)nachweiseEinreichenTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachweiseEinreichenType_DigitalerRueckkanal() {
		return (EReference)nachweiseEinreichenTypeEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getNachweisType_Beschreibung() {
		return (EAttribute)nachweisTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPauschalbetragGezahltVonType() {
		return pauschalbetragGezahltVonTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPauschalbetragGezahltVonType_Stadt() {
		return (EAttribute)pauschalbetragGezahltVonTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPauschalbetragGezahltVonType_BezirkStadtteil() {
		return (EAttribute)pauschalbetragGezahltVonTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPauschalbetragGezahltVonType_AktenzeichenWirtschaftlicheJugendhilfe() {
		return (EAttribute)pauschalbetragGezahltVonTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPauschalbetragVollzeitpflegeType() {
		return pauschalbetragVollzeitpflegeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPauschalbetragVollzeitpflegeType_DatenschutzUndEinwilligung() {
		return (EReference)pauschalbetragVollzeitpflegeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPauschalbetragVollzeitpflegeType_AngabenPflegekind() {
		return (EReference)pauschalbetragVollzeitpflegeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPauschalbetragVollzeitpflegeType_Pflegeperson() {
		return (EReference)pauschalbetragVollzeitpflegeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPauschalbetragVollzeitpflegeType_Kinder() {
		return (EReference)pauschalbetragVollzeitpflegeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPauschalbetragVollzeitpflegeType_Kontoinformationen() {
		return (EReference)pauschalbetragVollzeitpflegeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPauschalbetragVollzeitpflegeType_Nachweise() {
		return (EReference)pauschalbetragVollzeitpflegeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPauschalbetragVollzeitpflegeType_DatenschutzDerFachbehoerde() {
		return (EReference)pauschalbetragVollzeitpflegeTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPauschalbetragVollzeitpflegeType_Signatur() {
		return (EReference)pauschalbetragVollzeitpflegeTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPauschalbetragVollzeitpflegeType_DigitalerRueckkanal() {
		return (EReference)pauschalbetragVollzeitpflegeTypeEClass.getEStructuralFeatures().get(8);
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
	public EReference getPersonendatenType_Kontakt() {
		return (EReference)personendatenTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPflegekindBasisType() {
		return pflegekindBasisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPflegekindBasisType_Personendaten() {
		return (EReference)pflegekindBasisTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPflegekindBasisType_Geburt() {
		return (EReference)pflegekindBasisTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPflegekindType() {
		return pflegekindTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPflegekindType_InPflegeSeit() {
		return (EAttribute)pflegekindTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPflegekindType_Pflegeform() {
		return (EReference)pflegekindTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPflegekindType_PauschalbetragGezahltVon() {
		return (EReference)pflegekindTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPflegepersonBasisType() {
		return pflegepersonBasisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPflegepersonBasisType_Personendaten() {
		return (EReference)pflegepersonBasisTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPflegepersonBasisType_Geburt() {
		return (EReference)pflegepersonBasisTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPflegepersonBasisType_Steueridentifikationsnummer() {
		return (EAttribute)pflegepersonBasisTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPflegepersonType() {
		return pflegepersonTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPflegepersonType_Beratungscode() {
		return (EAttribute)pflegepersonTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPflegepersonType_DatenschutzUndEinwilligung() {
		return (EReference)pflegepersonTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPflegepersonType_AllgemeineAngaben() {
		return (EReference)pflegepersonTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPflegepersonType_EinkommenUndWohnen() {
		return (EReference)pflegepersonTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPflegepersonType_AngabenZuKindernDerFamilie() {
		return (EReference)pflegepersonTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPflegepersonType_WeiterePersonenImHauhalt() {
		return (EReference)pflegepersonTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPflegepersonType_BestimmtesKind() {
		return (EReference)pflegepersonTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPflegepersonType_MoeglichkeitenUndGrenzen() {
		return (EReference)pflegepersonTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPflegepersonType_Nachweise() {
		return (EReference)pflegepersonTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPflegepersonType_DatenschutzDerFachbehoerde() {
		return (EReference)pflegepersonTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPflegepersonType_Signatur() {
		return (EReference)pflegepersonTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPflegepersonType_DigitalerRueckkanal() {
		return (EReference)pflegepersonTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignaturType() {
		return signaturTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignaturType_ElektronischSignieren() {
		return (EAttribute)signaturTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignaturType_Anlage() {
		return (EReference)signaturTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSonstigeAntraegeSendenType() {
		return sonstigeAntraegeSendenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSonstigeAntraegeSendenType_DatenschutzUndEinwilligung() {
		return (EReference)sonstigeAntraegeSendenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSonstigeAntraegeSendenType_AllgemeineAngaben() {
		return (EReference)sonstigeAntraegeSendenTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSonstigeAntraegeSendenType_Antragdetails() {
		return (EReference)sonstigeAntraegeSendenTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSonstigeAntraegeSendenType_Pflegekinder() {
		return (EReference)sonstigeAntraegeSendenTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSonstigeAntraegeSendenType_Nachweise() {
		return (EReference)sonstigeAntraegeSendenTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSonstigeAntraegeSendenType_DatenschutzDerFachbehoerde() {
		return (EReference)sonstigeAntraegeSendenTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSonstigeAntraegeSendenType_Signatur() {
		return (EReference)sonstigeAntraegeSendenTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSonstigeAntraegeSendenType_DigitalerRueckkanal() {
		return (EReference)sonstigeAntraegeSendenTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStiefkindadoptionType() {
		return stiefkindadoptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStiefkindadoptionType_Beratungscode() {
		return (EAttribute)stiefkindadoptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStiefkindadoptionType_DatenschutzUndEinwilligung() {
		return (EReference)stiefkindadoptionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStiefkindadoptionType_AngabenDesZuAdoptierendenKindes() {
		return (EReference)stiefkindadoptionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStiefkindadoptionType_AllgemeineAngaben() {
		return (EReference)stiefkindadoptionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStiefkindadoptionType_VerbleibenderSorgeberechtigterElternteil() {
		return (EReference)stiefkindadoptionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStiefkindadoptionType_AnnehmenderElternteil() {
		return (EReference)stiefkindadoptionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStiefkindadoptionType_AngabenZurPartnerschaft() {
		return (EReference)stiefkindadoptionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStiefkindadoptionType_AngabenZuKindernDerFamilie() {
		return (EReference)stiefkindadoptionTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStiefkindadoptionType_WeiterePersonenImHauhalt() {
		return (EReference)stiefkindadoptionTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStiefkindadoptionType_AbgebenderElternteil() {
		return (EReference)stiefkindadoptionTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStiefkindadoptionType_Nachweise() {
		return (EReference)stiefkindadoptionTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStiefkindadoptionType_DatenschutzDerFachbehoerde() {
		return (EReference)stiefkindadoptionTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStiefkindadoptionType_Signatur() {
		return (EReference)stiefkindadoptionTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStiefkindadoptionType_DigitalerRueckkanal() {
		return (EReference)stiefkindadoptionTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerbleibenderSorgeberechtigterElternteilType() {
		return verbleibenderSorgeberechtigterElternteilTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerbleibenderSorgeberechtigterElternteilType_Personendaten() {
		return (EReference)verbleibenderSorgeberechtigterElternteilTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerbleibenderSorgeberechtigterElternteilType_Staatsangehoerigkeit() {
		return (EReference)verbleibenderSorgeberechtigterElternteilTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerbleibenderSorgeberechtigterElternteilType_Geburt() {
		return (EReference)verbleibenderSorgeberechtigterElternteilTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerbleibenderSorgeberechtigterElternteilType_EinkuenfteAusTaetigkeit() {
		return (EAttribute)verbleibenderSorgeberechtigterElternteilTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerbleibenderSorgeberechtigterElternteilType_AndereEinkuenfte() {
		return (EAttribute)verbleibenderSorgeberechtigterElternteilTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerbleibenderSorgeberechtigterElternteilType_Schuldverpflichtungen() {
		return (EAttribute)verbleibenderSorgeberechtigterElternteilTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerbleibenderSorgeberechtigterElternteilType_Unterhaltsverpflichtungen() {
		return (EAttribute)verbleibenderSorgeberechtigterElternteilTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerbleibenderSorgeberechtigterElternteilType_MonatlicheFixkostenUnterkunft() {
		return (EAttribute)verbleibenderSorgeberechtigterElternteilTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerbleibenderSorgeberechtigterElternteilType_Aufenthaltsstatus() {
		return (EReference)verbleibenderSorgeberechtigterElternteilTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerbleibenderSorgeberechtigterElternteilType_Geschlecht() {
		return (EReference)verbleibenderSorgeberechtigterElternteilTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerwandtenadoptionType() {
		return verwandtenadoptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerwandtenadoptionType_Beratungscode() {
		return (EAttribute)verwandtenadoptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerwandtenadoptionType_DatenschutzUndEinwilligung() {
		return (EReference)verwandtenadoptionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerwandtenadoptionType_AngabenDesZuAdoptierendenKindes() {
		return (EReference)verwandtenadoptionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerwandtenadoptionType_AllgemeineAngaben() {
		return (EReference)verwandtenadoptionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerwandtenadoptionType_AnnehmenderElternteil() {
		return (EReference)verwandtenadoptionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerwandtenadoptionType_AngabenZurPartnerschaft() {
		return (EReference)verwandtenadoptionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerwandtenadoptionType_AngabenZuKindernDerFamilie() {
		return (EReference)verwandtenadoptionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerwandtenadoptionType_WeiterePersonenImHauhalt() {
		return (EReference)verwandtenadoptionTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerwandtenadoptionType_AbgebenderElternteil() {
		return (EReference)verwandtenadoptionTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerwandtenadoptionType_Nachweise() {
		return (EReference)verwandtenadoptionTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerwandtenadoptionType_DatenschutzDerFachbehoerde() {
		return (EReference)verwandtenadoptionTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerwandtenadoptionType_Signatur() {
		return (EReference)verwandtenadoptionTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerwandtenadoptionType_DigitalerRueckkanal() {
		return (EReference)verwandtenadoptionTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWeiterePersonenImHauhaltType() {
		return weiterePersonenImHauhaltTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeiterePersonenImHauhaltType_Personendaten() {
		return (EReference)weiterePersonenImHauhaltTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeiterePersonenImHauhaltType_BeziehungZurPerson() {
		return (EAttribute)weiterePersonenImHauhaltTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeiterePersonenImHauhaltType_Geburt() {
		return (EReference)weiterePersonenImHauhaltTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdoptionFactory getAdoptionFactory() {
		return (AdoptionFactory)getEFactoryInstance();
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
		abgebenderElternteilTypeEClass = createEClass(ABGEBENDER_ELTERNTEIL_TYPE);
		createEReference(abgebenderElternteilTypeEClass, ABGEBENDER_ELTERNTEIL_TYPE__ELTERNTEIL);
		createEReference(abgebenderElternteilTypeEClass, ABGEBENDER_ELTERNTEIL_TYPE__PERSONENDATEN);
		createEReference(abgebenderElternteilTypeEClass, ABGEBENDER_ELTERNTEIL_TYPE__GEBURT);
		createEReference(abgebenderElternteilTypeEClass, ABGEBENDER_ELTERNTEIL_TYPE__STAATSANGEHOERIGKEIT);
		createEAttribute(abgebenderElternteilTypeEClass, ABGEBENDER_ELTERNTEIL_TYPE__EINSTELLUNG_ADOPTIONSABSICHT);
		createEReference(abgebenderElternteilTypeEClass, ABGEBENDER_ELTERNTEIL_TYPE__AUFENTHALTSSTATUS);
		createEReference(abgebenderElternteilTypeEClass, ABGEBENDER_ELTERNTEIL_TYPE__ELTERNTEIL_VERSTORBEN);

		adoptionundpflegekinderAdoption0901TypeEClass = createEClass(ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE);
		createEReference(adoptionundpflegekinderAdoption0901TypeEClass, ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__KONTAKTFORMULAR);
		createEReference(adoptionundpflegekinderAdoption0901TypeEClass, ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__NACHWEISE_EINREICHEN);
		createEReference(adoptionundpflegekinderAdoption0901TypeEClass, ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__STIEFKINDADOPTION);
		createEReference(adoptionundpflegekinderAdoption0901TypeEClass, ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__VERWANDTENADOPTION);
		createEReference(adoptionundpflegekinderAdoption0901TypeEClass, ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__FREMDKINDADOPTION);

		adoptionundpflegekinderPflegekinder0902TypeEClass = createEClass(ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE);
		createEReference(adoptionundpflegekinderPflegekinder0902TypeEClass, ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__KONTAKTFORMULAR);
		createEReference(adoptionundpflegekinderPflegekinder0902TypeEClass, ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__NACHWEISE_EINREICHEN);
		createEReference(adoptionundpflegekinderPflegekinder0902TypeEClass, ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__PFLEGEPERSON);
		createEReference(adoptionundpflegekinderPflegekinder0902TypeEClass, ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__SONSTIGE_ANTRAEGE_SENDEN);
		createEReference(adoptionundpflegekinderPflegekinder0902TypeEClass, ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG);
		createEReference(adoptionundpflegekinderPflegekinder0902TypeEClass, ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__ALTERSSICHERUNG_PFLEGEPERSON);
		createEReference(adoptionundpflegekinderPflegekinder0902TypeEClass, ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__PAUSCHALBETRAG_VOLLZEITPFLEGE);

		allgemeineAngabenFremdkindadoptionTypeEClass = createEClass(ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE);
		createEReference(allgemeineAngabenFremdkindadoptionTypeEClass, ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__PERSONENDATEN);
		createEReference(allgemeineAngabenFremdkindadoptionTypeEClass, ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__GEBURT);
		createEReference(allgemeineAngabenFremdkindadoptionTypeEClass, ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__STAATSANGEHOERIGKEIT);
		createEAttribute(allgemeineAngabenFremdkindadoptionTypeEClass, ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__RELIGIONSZUGEHOERIGKEIT);
		createEAttribute(allgemeineAngabenFremdkindadoptionTypeEClass, ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__AKTUELLE_BERUFLICHE_TAETIGKEIT);
		createEAttribute(allgemeineAngabenFremdkindadoptionTypeEClass, ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__EINKUENFTE_AUS_TAETIGKEIT);
		createEAttribute(allgemeineAngabenFremdkindadoptionTypeEClass, ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__ANDERE_EINKUENFTE);
		createEAttribute(allgemeineAngabenFremdkindadoptionTypeEClass, ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__SCHULDVERPFLICHTUNGEN);
		createEAttribute(allgemeineAngabenFremdkindadoptionTypeEClass, ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__UNTERHALTSVERPFLICHTUNGEN);
		createEAttribute(allgemeineAngabenFremdkindadoptionTypeEClass, ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__MONATLICHE_FIXKOSTEN_UNTERKUNFT);
		createEReference(allgemeineAngabenFremdkindadoptionTypeEClass, ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__AUFENTHALTSSTATUS);
		createEAttribute(allgemeineAngabenFremdkindadoptionTypeEClass, ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__AKTUELLER_FAMILIENSTAND);
		createEReference(allgemeineAngabenFremdkindadoptionTypeEClass, ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__GESCHLECHT);
		createEAttribute(allgemeineAngabenFremdkindadoptionTypeEClass, ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__BEREITS_VERHEIRATET);
		createEAttribute(allgemeineAngabenFremdkindadoptionTypeEClass, ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__UMFANG_VERHEIRATET);

		allgemeineAngabenPflegeTypeEClass = createEClass(ALLGEMEINE_ANGABEN_PFLEGE_TYPE);
		createEAttribute(allgemeineAngabenPflegeTypeEClass, ALLGEMEINE_ANGABEN_PFLEGE_TYPE__WOCHENSTUNDEN);
		createEReference(allgemeineAngabenPflegeTypeEClass, ALLGEMEINE_ANGABEN_PFLEGE_TYPE__ANSCHRIFT);
		createEReference(allgemeineAngabenPflegeTypeEClass, ALLGEMEINE_ANGABEN_PFLEGE_TYPE__GESCHLECHT);

		allgemeineAngabenStiefkindadoptionTypeEClass = createEClass(ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE);
		createEAttribute(allgemeineAngabenStiefkindadoptionTypeEClass, ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__KONTAKT_ZU_LEIBLICHER_FAMILIE);
		createEAttribute(allgemeineAngabenStiefkindadoptionTypeEClass, ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__ERLAEUTERUNG_KONTAKT_ZU_LEIBLICHER_FAMILIE);
		createEReference(allgemeineAngabenStiefkindadoptionTypeEClass, ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__PERSONENSORGERECHT);
		createEAttribute(allgemeineAngabenStiefkindadoptionTypeEClass, ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__PERSONENSORGERECHT_BEI_SONSTIGE);
		createEAttribute(allgemeineAngabenStiefkindadoptionTypeEClass, ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__GESCHPRAECH_UEBER_ADOPTION);
		createEAttribute(allgemeineAngabenStiefkindadoptionTypeEClass, ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__REAKTION_KIND_GESPRAECH);
		createEAttribute(allgemeineAngabenStiefkindadoptionTypeEClass, ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__KONTAKT_JUGENDAMT);
		createEAttribute(allgemeineAngabenStiefkindadoptionTypeEClass, ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__ART_KONTAKT_JUGENDAMT);
		createEAttribute(allgemeineAngabenStiefkindadoptionTypeEClass, ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__GERICHTLICHE_REGELUNG);

		allgemeineAngabenVerwandtenadoptionTypeEClass = createEClass(ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE);
		createEAttribute(allgemeineAngabenVerwandtenadoptionTypeEClass, ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__HERKUNFT_BEKANNT);
		createEAttribute(allgemeineAngabenVerwandtenadoptionTypeEClass, ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__KONTAKT_ZU_LEIBLICHER_FAMILIE);
		createEAttribute(allgemeineAngabenVerwandtenadoptionTypeEClass, ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__ERLAEUTERUNG_KONTAKT_ZU_LEIBLICHER_FAMILIE);
		createEReference(allgemeineAngabenVerwandtenadoptionTypeEClass, ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__PERSONENSORGERECHT);
		createEAttribute(allgemeineAngabenVerwandtenadoptionTypeEClass, ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__PERSONENSORGERECHT_BEI_SONSTIGE);
		createEAttribute(allgemeineAngabenVerwandtenadoptionTypeEClass, ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__GESCHPRAECH_UEBER_ADOPTION);
		createEAttribute(allgemeineAngabenVerwandtenadoptionTypeEClass, ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__REAKTION_KIND_GESPRAECH);

		alterssicherungPflegepersonTypeEClass = createEClass(ALTERSSICHERUNG_PFLEGEPERSON_TYPE);
		createEReference(alterssicherungPflegepersonTypeEClass, ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG);
		createEReference(alterssicherungPflegepersonTypeEClass, ALTERSSICHERUNG_PFLEGEPERSON_TYPE__ALLGEMEINE_ANGABEN);
		createEReference(alterssicherungPflegepersonTypeEClass, ALTERSSICHERUNG_PFLEGEPERSON_TYPE__ANTRAGDETAILS_ALTERSSICHERUNG);
		createEReference(alterssicherungPflegepersonTypeEClass, ALTERSSICHERUNG_PFLEGEPERSON_TYPE__PFLEGEKINDER);
		createEReference(alterssicherungPflegepersonTypeEClass, ALTERSSICHERUNG_PFLEGEPERSON_TYPE__NACHWEISE);
		createEReference(alterssicherungPflegepersonTypeEClass, ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE);
		createEReference(alterssicherungPflegepersonTypeEClass, ALTERSSICHERUNG_PFLEGEPERSON_TYPE__SIGNATUR);
		createEReference(alterssicherungPflegepersonTypeEClass, ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DIGITALER_RUECKKANAL);

		angabenDesZuAdoptierendenKindesTypeEClass = createEClass(ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE);
		createEReference(angabenDesZuAdoptierendenKindesTypeEClass, ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__PERSONENDATEN);
		createEReference(angabenDesZuAdoptierendenKindesTypeEClass, ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__GEBURT);
		createEReference(angabenDesZuAdoptierendenKindesTypeEClass, ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__STAATSANGEHOERIGKEIT);
		createEAttribute(angabenDesZuAdoptierendenKindesTypeEClass, ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__RELIGIONSZUGEHOERIGKEIT);
		createEAttribute(angabenDesZuAdoptierendenKindesTypeEClass, ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__AUS_AUSLAND_GEHOLT);
		createEReference(angabenDesZuAdoptierendenKindesTypeEClass, ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__ANSCHRIFT);
		createEReference(angabenDesZuAdoptierendenKindesTypeEClass, ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__AUFENTHALTSSTATUS);

		angabenPflegekindTypeEClass = createEClass(ANGABEN_PFLEGEKIND_TYPE);
		createEReference(angabenPflegekindTypeEClass, ANGABEN_PFLEGEKIND_TYPE__PERSONENDATEN);
		createEReference(angabenPflegekindTypeEClass, ANGABEN_PFLEGEKIND_TYPE__GEBURT);
		createEReference(angabenPflegekindTypeEClass, ANGABEN_PFLEGEKIND_TYPE__ANSCHRIFT);
		createEAttribute(angabenPflegekindTypeEClass, ANGABEN_PFLEGEKIND_TYPE__BEGINN_PFLEGEVERHAELTNIS);
		createEAttribute(angabenPflegekindTypeEClass, ANGABEN_PFLEGEKIND_TYPE__KRANKENVERSICHERT);
		createEAttribute(angabenPflegekindTypeEClass, ANGABEN_PFLEGEKIND_TYPE__KRANKENVERSICHERT_UEBER_PFLEGEPERSON);
		createEAttribute(angabenPflegekindTypeEClass, ANGABEN_PFLEGEKIND_TYPE__SCHULE_AUSBILDUNGSSTAETTE);
		createEAttribute(angabenPflegekindTypeEClass, ANGABEN_PFLEGEKIND_TYPE__KLASSENSTUFE_AUSBILDUNGSJAHR);
		createEReference(angabenPflegekindTypeEClass, ANGABEN_PFLEGEKIND_TYPE__EINKOMMEN_PFLEGEKIND);

		angabenZuKindernDerFamilieTypeEClass = createEClass(ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE);
		createEReference(angabenZuKindernDerFamilieTypeEClass, ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__PERSONENDATEN);
		createEReference(angabenZuKindernDerFamilieTypeEClass, ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__GEBURT);
		createEAttribute(angabenZuKindernDerFamilieTypeEClass, ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__VERHAELTNIS_KIND);
		createEAttribute(angabenZuKindernDerFamilieTypeEClass, ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__ELTERNTEIL_DES_KINDES);
		createEAttribute(angabenZuKindernDerFamilieTypeEClass, ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__KIND_WOHNHAFT_HAUSHALT);
		createEAttribute(angabenZuKindernDerFamilieTypeEClass, ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__KIND_WOHNHAFT_ALTERNTIVE);
		createEReference(angabenZuKindernDerFamilieTypeEClass, ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__KIND_VERSTORBEN);

		angabenZurPartnerschaftTypeEClass = createEClass(ANGABEN_ZUR_PARTNERSCHAFT_TYPE);
		createEAttribute(angabenZurPartnerschaftTypeEClass, ANGABEN_ZUR_PARTNERSCHAFT_TYPE__DAUER_PARTNERSCHAFT);
		createEAttribute(angabenZurPartnerschaftTypeEClass, ANGABEN_ZUR_PARTNERSCHAFT_TYPE__DAUER_GEMEINSAMER_HAUSHALT);
		createEAttribute(angabenZurPartnerschaftTypeEClass, ANGABEN_ZUR_PARTNERSCHAFT_TYPE__VERHEIRATET_ODER_LEBENSPARTNERSCHAFT);
		createEAttribute(angabenZurPartnerschaftTypeEClass, ANGABEN_ZUR_PARTNERSCHAFT_TYPE__DAUER_VERHEIRATET_ODER_LEBENSPARTNERSCHAFT);
		createEAttribute(angabenZurPartnerschaftTypeEClass, ANGABEN_ZUR_PARTNERSCHAFT_TYPE__GESPRAECH_UEBER_ADOPTION);
		createEAttribute(angabenZurPartnerschaftTypeEClass, ANGABEN_ZUR_PARTNERSCHAFT_TYPE__MEINUNG_FAMILIE_UND_FREUNDE);
		createEReference(angabenZurPartnerschaftTypeEClass, ANGABEN_ZUR_PARTNERSCHAFT_TYPE__ANSCHRIFT);
		createEAttribute(angabenZurPartnerschaftTypeEClass, ANGABEN_ZUR_PARTNERSCHAFT_TYPE__WOHNVERHAELTNISSE_ANZAHL_ZIMMER);
		createEAttribute(angabenZurPartnerschaftTypeEClass, ANGABEN_ZUR_PARTNERSCHAFT_TYPE__WOHNVERHAELTNISSE_WOHNFLAECHE);
		createEAttribute(angabenZurPartnerschaftTypeEClass, ANGABEN_ZUR_PARTNERSCHAFT_TYPE__MIETE_ODER_EIGENTUM);
		createEAttribute(angabenZurPartnerschaftTypeEClass, ANGABEN_ZUR_PARTNERSCHAFT_TYPE__GARTEN);
		createEAttribute(angabenZurPartnerschaftTypeEClass, ANGABEN_ZUR_PARTNERSCHAFT_TYPE__KINDERZIMMER);
		createEAttribute(angabenZurPartnerschaftTypeEClass, ANGABEN_ZUR_PARTNERSCHAFT_TYPE__HAUSTIERE);

		anliegenTypeEClass = createEClass(ANLIEGEN_TYPE);
		createEReference(anliegenTypeEClass, ANLIEGEN_TYPE__WUNSCH_BERATUNG);
		createEAttribute(anliegenTypeEClass, ANLIEGEN_TYPE__KOMMENTAR);

		annehmenderElternteilTypeEClass = createEClass(ANNEHMENDER_ELTERNTEIL_TYPE);
		createEReference(annehmenderElternteilTypeEClass, ANNEHMENDER_ELTERNTEIL_TYPE__PERSONENDATEN);
		createEReference(annehmenderElternteilTypeEClass, ANNEHMENDER_ELTERNTEIL_TYPE__STAATSANGEHOERIGKEIT);
		createEReference(annehmenderElternteilTypeEClass, ANNEHMENDER_ELTERNTEIL_TYPE__GEBURT);
		createEAttribute(annehmenderElternteilTypeEClass, ANNEHMENDER_ELTERNTEIL_TYPE__AKTUELLE_BERUFLICHE_TAETIGKEIT);
		createEAttribute(annehmenderElternteilTypeEClass, ANNEHMENDER_ELTERNTEIL_TYPE__GRUENDE_MOTIVE_FUER_ADOPTION);
		createEAttribute(annehmenderElternteilTypeEClass, ANNEHMENDER_ELTERNTEIL_TYPE__VERAENDERUNG_DURCH_ADOPTION);
		createEAttribute(annehmenderElternteilTypeEClass, ANNEHMENDER_ELTERNTEIL_TYPE__EINKUENFTE_AUS_TAETIGKEIT);
		createEAttribute(annehmenderElternteilTypeEClass, ANNEHMENDER_ELTERNTEIL_TYPE__ANDERE_EINKUENFTE);
		createEAttribute(annehmenderElternteilTypeEClass, ANNEHMENDER_ELTERNTEIL_TYPE__SCHULDVERPFLICHTUNGEN);
		createEAttribute(annehmenderElternteilTypeEClass, ANNEHMENDER_ELTERNTEIL_TYPE__UNTERHALTSVERPFLICHTUNGEN);
		createEAttribute(annehmenderElternteilTypeEClass, ANNEHMENDER_ELTERNTEIL_TYPE__MONATLICHE_FIXKOSTEN_UNTERKUNFT);
		createEAttribute(annehmenderElternteilTypeEClass, ANNEHMENDER_ELTERNTEIL_TYPE__RELIGIONSZUGEHOERIGKEIT);
		createEReference(annehmenderElternteilTypeEClass, ANNEHMENDER_ELTERNTEIL_TYPE__AUFENTHALTSSTATUS);
		createEReference(annehmenderElternteilTypeEClass, ANNEHMENDER_ELTERNTEIL_TYPE__GESCHLECHT);

		antragdetailsAlterssicherungTypeEClass = createEClass(ANTRAGDETAILS_ALTERSSICHERUNG_TYPE);
		createEAttribute(antragdetailsAlterssicherungTypeEClass, ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__BEANTRAGUNG_ZUSCHUSS_ALTERSSICHERUNG);
		createEReference(antragdetailsAlterssicherungTypeEClass, ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__ZUSCHUESSE);
		createEAttribute(antragdetailsAlterssicherungTypeEClass, ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__HOEHE_ZUSCHUESSE);
		createEAttribute(antragdetailsAlterssicherungTypeEClass, ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__VON_ANDERER_STELLE);
		createEAttribute(antragdetailsAlterssicherungTypeEClass, ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__ART_HOEHE_ABSICHERUNG);
		createEAttribute(antragdetailsAlterssicherungTypeEClass, ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__ALLEINIGE_PFLEGEPERSON);
		createEAttribute(antragdetailsAlterssicherungTypeEClass, ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__HAUPTPFLEGEPERSON);

		antragdetailsTypeEClass = createEClass(ANTRAGDETAILS_TYPE);
		createEReference(antragdetailsTypeEClass, ANTRAGDETAILS_TYPE__ANTRAG);
		createEAttribute(antragdetailsTypeEClass, ANTRAGDETAILS_TYPE__INFORMATION);

		antragdetailsUnfallversicherungTypeEClass = createEClass(ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE);
		createEAttribute(antragdetailsUnfallversicherungTypeEClass, ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE__BEANTRAGUNG_KOSTEN_UNFALLVERSICHERUNG);
		createEReference(antragdetailsUnfallversicherungTypeEClass, ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE__ZUSCHUESSE);
		createEAttribute(antragdetailsUnfallversicherungTypeEClass, ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE__HOEHE_ZUSCHUESSE);

		antragstellerTypeEClass = createEClass(ANTRAGSTELLER_TYPE);
		createEReference(antragstellerTypeEClass, ANTRAGSTELLER_TYPE__PERSONENDATEN);
		createEAttribute(antragstellerTypeEClass, ANTRAGSTELLER_TYPE__FALLNUMMER);
		createEAttribute(antragstellerTypeEClass, ANTRAGSTELLER_TYPE__ANTRAGSDATUM);
		createEReference(antragstellerTypeEClass, ANTRAGSTELLER_TYPE__GEBURT);

		beitragsuebernahmeUnfallversicherungTypeEClass = createEClass(BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG_TYPE);
		createEReference(beitragsuebernahmeUnfallversicherungTypeEClass, BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG);
		createEReference(beitragsuebernahmeUnfallversicherungTypeEClass, BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG_TYPE__ALLGEMEINE_ANGABEN);
		createEReference(beitragsuebernahmeUnfallversicherungTypeEClass, BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG_TYPE__ANTRAGDETAILS_UNFALLVERSICHERUNG);
		createEReference(beitragsuebernahmeUnfallversicherungTypeEClass, BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG_TYPE__PFLEGEKINDER);
		createEReference(beitragsuebernahmeUnfallversicherungTypeEClass, BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG_TYPE__NACHWEISE);
		createEReference(beitragsuebernahmeUnfallversicherungTypeEClass, BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE);
		createEReference(beitragsuebernahmeUnfallversicherungTypeEClass, BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG_TYPE__SIGNATUR);
		createEReference(beitragsuebernahmeUnfallversicherungTypeEClass, BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG_TYPE__DIGITALER_RUECKKANAL);

		bestimmtesKindTypeEClass = createEClass(BESTIMMTES_KIND_TYPE);
		createEReference(bestimmtesKindTypeEClass, BESTIMMTES_KIND_TYPE__PERSONENDATEN);
		createEReference(bestimmtesKindTypeEClass, BESTIMMTES_KIND_TYPE__GEBURT);
		createEAttribute(bestimmtesKindTypeEClass, BESTIMMTES_KIND_TYPE__ZUSTAENDIGES_JUGENDAMT);

		datenschutzUndEinwilligungTypeEClass = createEClass(DATENSCHUTZ_UND_EINWILLIGUNG_TYPE);
		createEAttribute(datenschutzUndEinwilligungTypeEClass, DATENSCHUTZ_UND_EINWILLIGUNG_TYPE__ALLGEMEINE_DATENSCHUTZERKLAERUNG);
		createEAttribute(datenschutzUndEinwilligungTypeEClass, DATENSCHUTZ_UND_EINWILLIGUNG_TYPE__KENNTNISSNAHME_DATENSCHUTZERKLAERUNG);

		digitalerRueckkanalTypeEClass = createEClass(DIGITALER_RUECKKANAL_TYPE);
		createEAttribute(digitalerRueckkanalTypeEClass, DIGITALER_RUECKKANAL_TYPE__POSTFACH_UUID);
		createEAttribute(digitalerRueckkanalTypeEClass, DIGITALER_RUECKKANAL_TYPE__EINVERSTAENDNIS_DIGITALER_RUECKKANAL);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADOPTIONUNDPFLEGEKINDER_ADOPTION0901);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902);

		einkommenPflegekindTypeEClass = createEClass(EINKOMMEN_PFLEGEKIND_TYPE);
		createEAttribute(einkommenPflegekindTypeEClass, EINKOMMEN_PFLEGEKIND_TYPE__EINKOMMEN_AB);
		createEAttribute(einkommenPflegekindTypeEClass, EINKOMMEN_PFLEGEKIND_TYPE__HOEHE_EINKOMMEN);
		createEAttribute(einkommenPflegekindTypeEClass, EINKOMMEN_PFLEGEKIND_TYPE__BEZUG_KINDERGELD_AB);
		createEAttribute(einkommenPflegekindTypeEClass, EINKOMMEN_PFLEGEKIND_TYPE__HOEHE_KINDERGELD);
		createEReference(einkommenPflegekindTypeEClass, EINKOMMEN_PFLEGEKIND_TYPE__ART_DES_EINKOMMENS);
		createEAttribute(einkommenPflegekindTypeEClass, EINKOMMEN_PFLEGEKIND_TYPE__SONSTIGES_EINKOMMEN);
		createEAttribute(einkommenPflegekindTypeEClass, EINKOMMEN_PFLEGEKIND_TYPE__ZUSTAENDIGE_FAMILIENKASSE);

		einkommenUndWohnenTypeEClass = createEClass(EINKOMMEN_UND_WOHNEN_TYPE);
		createEAttribute(einkommenUndWohnenTypeEClass, EINKOMMEN_UND_WOHNEN_TYPE__EINKUENFTE_AUS_TAETIGKEIT);
		createEAttribute(einkommenUndWohnenTypeEClass, EINKOMMEN_UND_WOHNEN_TYPE__ANDERE_EINKUENFTE);
		createEAttribute(einkommenUndWohnenTypeEClass, EINKOMMEN_UND_WOHNEN_TYPE__SCHULDVERPFLICHTUNGEN);
		createEAttribute(einkommenUndWohnenTypeEClass, EINKOMMEN_UND_WOHNEN_TYPE__UNTERHALTSVERPFLICHTUNGEN);
		createEAttribute(einkommenUndWohnenTypeEClass, EINKOMMEN_UND_WOHNEN_TYPE__MONATLICHE_FIXKOSTEN_UNTERKUNFT);
		createEAttribute(einkommenUndWohnenTypeEClass, EINKOMMEN_UND_WOHNEN_TYPE__WOHNVERHAELTNISSE_ANZAHL_ZIMMER);
		createEAttribute(einkommenUndWohnenTypeEClass, EINKOMMEN_UND_WOHNEN_TYPE__WOHNVERHAELTNISSE_WOHNFLAECHE);

		fremdkindadoptionTypeEClass = createEClass(FREMDKINDADOPTION_TYPE);
		createEAttribute(fremdkindadoptionTypeEClass, FREMDKINDADOPTION_TYPE__BERATUNGSCODE);
		createEReference(fremdkindadoptionTypeEClass, FREMDKINDADOPTION_TYPE__ALLGEMEINE_ANGABEN);
		createEReference(fremdkindadoptionTypeEClass, FREMDKINDADOPTION_TYPE__ANGABEN_ZUR_PARTNERSCHAFT);
		createEReference(fremdkindadoptionTypeEClass, FREMDKINDADOPTION_TYPE__ANGABEN_ZU_KINDERN_DER_FAMILIE);
		createEReference(fremdkindadoptionTypeEClass, FREMDKINDADOPTION_TYPE__WEITERE_PERSONEN_IM_HAUHALT);
		createEAttribute(fremdkindadoptionTypeEClass, FREMDKINDADOPTION_TYPE__AUSEINANDERSETZUNG_THEMA_ADOPTION);
		createEReference(fremdkindadoptionTypeEClass, FREMDKINDADOPTION_TYPE__NACHWEISE);
		createEReference(fremdkindadoptionTypeEClass, FREMDKINDADOPTION_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE);
		createEReference(fremdkindadoptionTypeEClass, FREMDKINDADOPTION_TYPE__SIGNATUR);
		createEReference(fremdkindadoptionTypeEClass, FREMDKINDADOPTION_TYPE__DIGITALER_RUECKKANAL);
		createEReference(fremdkindadoptionTypeEClass, FREMDKINDADOPTION_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG);
		createEAttribute(fremdkindadoptionTypeEClass, FREMDKINDADOPTION_TYPE__AERTZLICHE_BEHANDLUNG);

		kontakformularTypeEClass = createEClass(KONTAKFORMULAR_TYPE);
		createEReference(kontakformularTypeEClass, KONTAKFORMULAR_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG);
		createEReference(kontakformularTypeEClass, KONTAKFORMULAR_TYPE__PERSONENDATEN);
		createEReference(kontakformularTypeEClass, KONTAKFORMULAR_TYPE__ANSCHRIFT);
		createEReference(kontakformularTypeEClass, KONTAKFORMULAR_TYPE__ANLIEGEN);
		createEReference(kontakformularTypeEClass, KONTAKFORMULAR_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE);
		createEReference(kontakformularTypeEClass, KONTAKFORMULAR_TYPE__DIGITALER_RUECKKANAL);

		kontoinformationenTypeEClass = createEClass(KONTOINFORMATIONEN_TYPE);
		createEReference(kontoinformationenTypeEClass, KONTOINFORMATIONEN_TYPE__BEANTRAGUNG_JUGENDHILFE);
		createEReference(kontoinformationenTypeEClass, KONTOINFORMATIONEN_TYPE__BANKVERBINDUNG);

		moeglichkeitenUndGrenzenTypeEClass = createEClass(MOEGLICHKEITEN_UND_GRENZEN_TYPE);
		createEAttribute(moeglichkeitenUndGrenzenTypeEClass, MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_JEDEN_ALTERS);
		createEAttribute(moeglichkeitenUndGrenzenTypeEClass, MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_ALTERSANGABE);
		createEAttribute(moeglichkeitenUndGrenzenTypeEClass, MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_BEEINTRAECHTIGUNG);
		createEAttribute(moeglichkeitenUndGrenzenTypeEClass, MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_KOERPERLICHE_BEEINTRAECHTIGUNG);
		createEAttribute(moeglichkeitenUndGrenzenTypeEClass, MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_GEISTIGER_BEEINTRAECHTIGUNG);
		createEAttribute(moeglichkeitenUndGrenzenTypeEClass, MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_PSYCHISCHER_BEEINTRAECHTIGUNG);

		nachweiseEinreichenTypeEClass = createEClass(NACHWEISE_EINREICHEN_TYPE);
		createEReference(nachweiseEinreichenTypeEClass, NACHWEISE_EINREICHEN_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG);
		createEReference(nachweiseEinreichenTypeEClass, NACHWEISE_EINREICHEN_TYPE__ANTRAGSTELLER);
		createEReference(nachweiseEinreichenTypeEClass, NACHWEISE_EINREICHEN_TYPE__NACHWEISE);
		createEReference(nachweiseEinreichenTypeEClass, NACHWEISE_EINREICHEN_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE);
		createEReference(nachweiseEinreichenTypeEClass, NACHWEISE_EINREICHEN_TYPE__DIGITALER_RUECKKANAL);

		nachweisTypeEClass = createEClass(NACHWEIS_TYPE);
		createEAttribute(nachweisTypeEClass, NACHWEIS_TYPE__BESCHREIBUNG);

		pauschalbetragGezahltVonTypeEClass = createEClass(PAUSCHALBETRAG_GEZAHLT_VON_TYPE);
		createEAttribute(pauschalbetragGezahltVonTypeEClass, PAUSCHALBETRAG_GEZAHLT_VON_TYPE__STADT);
		createEAttribute(pauschalbetragGezahltVonTypeEClass, PAUSCHALBETRAG_GEZAHLT_VON_TYPE__BEZIRK_STADTTEIL);
		createEAttribute(pauschalbetragGezahltVonTypeEClass, PAUSCHALBETRAG_GEZAHLT_VON_TYPE__AKTENZEICHEN_WIRTSCHAFTLICHE_JUGENDHILFE);

		pauschalbetragVollzeitpflegeTypeEClass = createEClass(PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE);
		createEReference(pauschalbetragVollzeitpflegeTypeEClass, PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG);
		createEReference(pauschalbetragVollzeitpflegeTypeEClass, PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__ANGABEN_PFLEGEKIND);
		createEReference(pauschalbetragVollzeitpflegeTypeEClass, PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__PFLEGEPERSON);
		createEReference(pauschalbetragVollzeitpflegeTypeEClass, PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__KINDER);
		createEReference(pauschalbetragVollzeitpflegeTypeEClass, PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__KONTOINFORMATIONEN);
		createEReference(pauschalbetragVollzeitpflegeTypeEClass, PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__NACHWEISE);
		createEReference(pauschalbetragVollzeitpflegeTypeEClass, PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE);
		createEReference(pauschalbetragVollzeitpflegeTypeEClass, PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__SIGNATUR);
		createEReference(pauschalbetragVollzeitpflegeTypeEClass, PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DIGITALER_RUECKKANAL);

		personendatenTypeEClass = createEClass(PERSONENDATEN_TYPE);
		createEReference(personendatenTypeEClass, PERSONENDATEN_TYPE__NAME);
		createEReference(personendatenTypeEClass, PERSONENDATEN_TYPE__KONTAKT);

		pflegekindBasisTypeEClass = createEClass(PFLEGEKIND_BASIS_TYPE);
		createEReference(pflegekindBasisTypeEClass, PFLEGEKIND_BASIS_TYPE__PERSONENDATEN);
		createEReference(pflegekindBasisTypeEClass, PFLEGEKIND_BASIS_TYPE__GEBURT);

		pflegekindTypeEClass = createEClass(PFLEGEKIND_TYPE);
		createEAttribute(pflegekindTypeEClass, PFLEGEKIND_TYPE__IN_PFLEGE_SEIT);
		createEReference(pflegekindTypeEClass, PFLEGEKIND_TYPE__PFLEGEFORM);
		createEReference(pflegekindTypeEClass, PFLEGEKIND_TYPE__PAUSCHALBETRAG_GEZAHLT_VON);

		pflegepersonBasisTypeEClass = createEClass(PFLEGEPERSON_BASIS_TYPE);
		createEReference(pflegepersonBasisTypeEClass, PFLEGEPERSON_BASIS_TYPE__PERSONENDATEN);
		createEReference(pflegepersonBasisTypeEClass, PFLEGEPERSON_BASIS_TYPE__GEBURT);
		createEAttribute(pflegepersonBasisTypeEClass, PFLEGEPERSON_BASIS_TYPE__STEUERIDENTIFIKATIONSNUMMER);

		pflegepersonTypeEClass = createEClass(PFLEGEPERSON_TYPE);
		createEAttribute(pflegepersonTypeEClass, PFLEGEPERSON_TYPE__BERATUNGSCODE);
		createEReference(pflegepersonTypeEClass, PFLEGEPERSON_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG);
		createEReference(pflegepersonTypeEClass, PFLEGEPERSON_TYPE__ALLGEMEINE_ANGABEN);
		createEReference(pflegepersonTypeEClass, PFLEGEPERSON_TYPE__EINKOMMEN_UND_WOHNEN);
		createEReference(pflegepersonTypeEClass, PFLEGEPERSON_TYPE__ANGABEN_ZU_KINDERN_DER_FAMILIE);
		createEReference(pflegepersonTypeEClass, PFLEGEPERSON_TYPE__WEITERE_PERSONEN_IM_HAUHALT);
		createEReference(pflegepersonTypeEClass, PFLEGEPERSON_TYPE__BESTIMMTES_KIND);
		createEReference(pflegepersonTypeEClass, PFLEGEPERSON_TYPE__MOEGLICHKEITEN_UND_GRENZEN);
		createEReference(pflegepersonTypeEClass, PFLEGEPERSON_TYPE__NACHWEISE);
		createEReference(pflegepersonTypeEClass, PFLEGEPERSON_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE);
		createEReference(pflegepersonTypeEClass, PFLEGEPERSON_TYPE__SIGNATUR);
		createEReference(pflegepersonTypeEClass, PFLEGEPERSON_TYPE__DIGITALER_RUECKKANAL);

		signaturTypeEClass = createEClass(SIGNATUR_TYPE);
		createEAttribute(signaturTypeEClass, SIGNATUR_TYPE__ELEKTRONISCH_SIGNIEREN);
		createEReference(signaturTypeEClass, SIGNATUR_TYPE__ANLAGE);

		sonstigeAntraegeSendenTypeEClass = createEClass(SONSTIGE_ANTRAEGE_SENDEN_TYPE);
		createEReference(sonstigeAntraegeSendenTypeEClass, SONSTIGE_ANTRAEGE_SENDEN_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG);
		createEReference(sonstigeAntraegeSendenTypeEClass, SONSTIGE_ANTRAEGE_SENDEN_TYPE__ALLGEMEINE_ANGABEN);
		createEReference(sonstigeAntraegeSendenTypeEClass, SONSTIGE_ANTRAEGE_SENDEN_TYPE__ANTRAGDETAILS);
		createEReference(sonstigeAntraegeSendenTypeEClass, SONSTIGE_ANTRAEGE_SENDEN_TYPE__PFLEGEKINDER);
		createEReference(sonstigeAntraegeSendenTypeEClass, SONSTIGE_ANTRAEGE_SENDEN_TYPE__NACHWEISE);
		createEReference(sonstigeAntraegeSendenTypeEClass, SONSTIGE_ANTRAEGE_SENDEN_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE);
		createEReference(sonstigeAntraegeSendenTypeEClass, SONSTIGE_ANTRAEGE_SENDEN_TYPE__SIGNATUR);
		createEReference(sonstigeAntraegeSendenTypeEClass, SONSTIGE_ANTRAEGE_SENDEN_TYPE__DIGITALER_RUECKKANAL);

		stiefkindadoptionTypeEClass = createEClass(STIEFKINDADOPTION_TYPE);
		createEAttribute(stiefkindadoptionTypeEClass, STIEFKINDADOPTION_TYPE__BERATUNGSCODE);
		createEReference(stiefkindadoptionTypeEClass, STIEFKINDADOPTION_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG);
		createEReference(stiefkindadoptionTypeEClass, STIEFKINDADOPTION_TYPE__ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES);
		createEReference(stiefkindadoptionTypeEClass, STIEFKINDADOPTION_TYPE__ALLGEMEINE_ANGABEN);
		createEReference(stiefkindadoptionTypeEClass, STIEFKINDADOPTION_TYPE__VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL);
		createEReference(stiefkindadoptionTypeEClass, STIEFKINDADOPTION_TYPE__ANNEHMENDER_ELTERNTEIL);
		createEReference(stiefkindadoptionTypeEClass, STIEFKINDADOPTION_TYPE__ANGABEN_ZUR_PARTNERSCHAFT);
		createEReference(stiefkindadoptionTypeEClass, STIEFKINDADOPTION_TYPE__ANGABEN_ZU_KINDERN_DER_FAMILIE);
		createEReference(stiefkindadoptionTypeEClass, STIEFKINDADOPTION_TYPE__WEITERE_PERSONEN_IM_HAUHALT);
		createEReference(stiefkindadoptionTypeEClass, STIEFKINDADOPTION_TYPE__ABGEBENDER_ELTERNTEIL);
		createEReference(stiefkindadoptionTypeEClass, STIEFKINDADOPTION_TYPE__NACHWEISE);
		createEReference(stiefkindadoptionTypeEClass, STIEFKINDADOPTION_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE);
		createEReference(stiefkindadoptionTypeEClass, STIEFKINDADOPTION_TYPE__SIGNATUR);
		createEReference(stiefkindadoptionTypeEClass, STIEFKINDADOPTION_TYPE__DIGITALER_RUECKKANAL);

		verbleibenderSorgeberechtigterElternteilTypeEClass = createEClass(VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE);
		createEReference(verbleibenderSorgeberechtigterElternteilTypeEClass, VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE__PERSONENDATEN);
		createEReference(verbleibenderSorgeberechtigterElternteilTypeEClass, VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE__STAATSANGEHOERIGKEIT);
		createEReference(verbleibenderSorgeberechtigterElternteilTypeEClass, VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE__GEBURT);
		createEAttribute(verbleibenderSorgeberechtigterElternteilTypeEClass, VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE__EINKUENFTE_AUS_TAETIGKEIT);
		createEAttribute(verbleibenderSorgeberechtigterElternteilTypeEClass, VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE__ANDERE_EINKUENFTE);
		createEAttribute(verbleibenderSorgeberechtigterElternteilTypeEClass, VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE__SCHULDVERPFLICHTUNGEN);
		createEAttribute(verbleibenderSorgeberechtigterElternteilTypeEClass, VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE__UNTERHALTSVERPFLICHTUNGEN);
		createEAttribute(verbleibenderSorgeberechtigterElternteilTypeEClass, VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE__MONATLICHE_FIXKOSTEN_UNTERKUNFT);
		createEReference(verbleibenderSorgeberechtigterElternteilTypeEClass, VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE__AUFENTHALTSSTATUS);
		createEReference(verbleibenderSorgeberechtigterElternteilTypeEClass, VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE__GESCHLECHT);

		verwandtenadoptionTypeEClass = createEClass(VERWANDTENADOPTION_TYPE);
		createEAttribute(verwandtenadoptionTypeEClass, VERWANDTENADOPTION_TYPE__BERATUNGSCODE);
		createEReference(verwandtenadoptionTypeEClass, VERWANDTENADOPTION_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG);
		createEReference(verwandtenadoptionTypeEClass, VERWANDTENADOPTION_TYPE__ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES);
		createEReference(verwandtenadoptionTypeEClass, VERWANDTENADOPTION_TYPE__ALLGEMEINE_ANGABEN);
		createEReference(verwandtenadoptionTypeEClass, VERWANDTENADOPTION_TYPE__ANNEHMENDER_ELTERNTEIL);
		createEReference(verwandtenadoptionTypeEClass, VERWANDTENADOPTION_TYPE__ANGABEN_ZUR_PARTNERSCHAFT);
		createEReference(verwandtenadoptionTypeEClass, VERWANDTENADOPTION_TYPE__ANGABEN_ZU_KINDERN_DER_FAMILIE);
		createEReference(verwandtenadoptionTypeEClass, VERWANDTENADOPTION_TYPE__WEITERE_PERSONEN_IM_HAUHALT);
		createEReference(verwandtenadoptionTypeEClass, VERWANDTENADOPTION_TYPE__ABGEBENDER_ELTERNTEIL);
		createEReference(verwandtenadoptionTypeEClass, VERWANDTENADOPTION_TYPE__NACHWEISE);
		createEReference(verwandtenadoptionTypeEClass, VERWANDTENADOPTION_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE);
		createEReference(verwandtenadoptionTypeEClass, VERWANDTENADOPTION_TYPE__SIGNATUR);
		createEReference(verwandtenadoptionTypeEClass, VERWANDTENADOPTION_TYPE__DIGITALER_RUECKKANAL);

		weiterePersonenImHauhaltTypeEClass = createEClass(WEITERE_PERSONEN_IM_HAUHALT_TYPE);
		createEReference(weiterePersonenImHauhaltTypeEClass, WEITERE_PERSONEN_IM_HAUHALT_TYPE__PERSONENDATEN);
		createEAttribute(weiterePersonenImHauhaltTypeEClass, WEITERE_PERSONEN_IM_HAUHALT_TYPE__BEZIEHUNG_ZUR_PERSON);
		createEReference(weiterePersonenImHauhaltTypeEClass, WEITERE_PERSONEN_IM_HAUHALT_TYPE__GEBURT);
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
		adoptionundpflegekinderAdoption0901TypeEClass.getESuperTypes().add(theBaukastenPackage.getNachrichtType());
		adoptionundpflegekinderPflegekinder0902TypeEClass.getESuperTypes().add(theBaukastenPackage.getNachrichtType());
		allgemeineAngabenPflegeTypeEClass.getESuperTypes().add(this.getPflegepersonBasisType());
		nachweisTypeEClass.getESuperTypes().add(theBaukastenPackage.getNachweisdokumentType());
		pflegekindTypeEClass.getESuperTypes().add(this.getPflegekindBasisType());

		// Initialize classes, features, and operations; add parameters
		initEClass(abgebenderElternteilTypeEClass, AbgebenderElternteilType.class, "AbgebenderElternteilType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbgebenderElternteilType_Elternteil(), theBaukastenPackage.getCodeKindschaftsbeziehungType(), null, "elternteil", null, 1, 1, AbgebenderElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbgebenderElternteilType_Personendaten(), this.getPersonendatenType(), null, "personendaten", null, 0, 1, AbgebenderElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbgebenderElternteilType_Geburt(), theBaukastenPackage.getGeburtOptionalType(), null, "geburt", null, 0, 1, AbgebenderElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbgebenderElternteilType_Staatsangehoerigkeit(), theBaukastenPackage.getCodeStaatsangehoerigkeitType(), null, "staatsangehoerigkeit", null, 0, 1, AbgebenderElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbgebenderElternteilType_EinstellungAdoptionsabsicht(), theDIN913792204Package.getDatatypeC(), "einstellungAdoptionsabsicht", null, 0, 1, AbgebenderElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbgebenderElternteilType_Aufenthaltsstatus(), theBaukastenPackage.getCodeAufenthaltsstatusType(), null, "aufenthaltsstatus", null, 0, 1, AbgebenderElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbgebenderElternteilType_ElternteilVerstorben(), theBaukastenPackage.getTeilbekanntesDatumType(), null, "elternteilVerstorben", null, 0, 1, AbgebenderElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adoptionundpflegekinderAdoption0901TypeEClass, AdoptionundpflegekinderAdoption0901Type.class, "AdoptionundpflegekinderAdoption0901Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdoptionundpflegekinderAdoption0901Type_Kontaktformular(), this.getKontakformularType(), null, "kontaktformular", null, 1, 1, AdoptionundpflegekinderAdoption0901Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdoptionundpflegekinderAdoption0901Type_NachweiseEinreichen(), this.getNachweiseEinreichenType(), null, "nachweiseEinreichen", null, 1, 1, AdoptionundpflegekinderAdoption0901Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdoptionundpflegekinderAdoption0901Type_Stiefkindadoption(), this.getStiefkindadoptionType(), null, "stiefkindadoption", null, 1, 1, AdoptionundpflegekinderAdoption0901Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdoptionundpflegekinderAdoption0901Type_Verwandtenadoption(), this.getVerwandtenadoptionType(), null, "verwandtenadoption", null, 1, 1, AdoptionundpflegekinderAdoption0901Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdoptionundpflegekinderAdoption0901Type_Fremdkindadoption(), this.getFremdkindadoptionType(), null, "fremdkindadoption", null, 1, 1, AdoptionundpflegekinderAdoption0901Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adoptionundpflegekinderPflegekinder0902TypeEClass, AdoptionundpflegekinderPflegekinder0902Type.class, "AdoptionundpflegekinderPflegekinder0902Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdoptionundpflegekinderPflegekinder0902Type_Kontaktformular(), this.getKontakformularType(), null, "kontaktformular", null, 1, 1, AdoptionundpflegekinderPflegekinder0902Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdoptionundpflegekinderPflegekinder0902Type_NachweiseEinreichen(), this.getNachweiseEinreichenType(), null, "nachweiseEinreichen", null, 1, 1, AdoptionundpflegekinderPflegekinder0902Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdoptionundpflegekinderPflegekinder0902Type_Pflegeperson(), this.getPflegepersonType(), null, "pflegeperson", null, 1, 1, AdoptionundpflegekinderPflegekinder0902Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdoptionundpflegekinderPflegekinder0902Type_SonstigeAntraegeSenden(), this.getSonstigeAntraegeSendenType(), null, "sonstigeAntraegeSenden", null, 1, 1, AdoptionundpflegekinderPflegekinder0902Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdoptionundpflegekinderPflegekinder0902Type_BeitragsuebernahmeUnfallversicherung(), this.getBeitragsuebernahmeUnfallversicherungType(), null, "beitragsuebernahmeUnfallversicherung", null, 1, 1, AdoptionundpflegekinderPflegekinder0902Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdoptionundpflegekinderPflegekinder0902Type_AlterssicherungPflegeperson(), this.getAlterssicherungPflegepersonType(), null, "alterssicherungPflegeperson", null, 1, 1, AdoptionundpflegekinderPflegekinder0902Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdoptionundpflegekinderPflegekinder0902Type_PauschalbetragVollzeitpflege(), this.getPauschalbetragVollzeitpflegeType(), null, "pauschalbetragVollzeitpflege", null, 1, 1, AdoptionundpflegekinderPflegekinder0902Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allgemeineAngabenFremdkindadoptionTypeEClass, AllgemeineAngabenFremdkindadoptionType.class, "AllgemeineAngabenFremdkindadoptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllgemeineAngabenFremdkindadoptionType_Personendaten(), this.getPersonendatenType(), null, "personendaten", null, 1, 1, AllgemeineAngabenFremdkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllgemeineAngabenFremdkindadoptionType_Geburt(), theBaukastenPackage.getGeburtOptionalType(), null, "geburt", null, 0, 1, AllgemeineAngabenFremdkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllgemeineAngabenFremdkindadoptionType_Staatsangehoerigkeit(), theBaukastenPackage.getCodeStaatsangehoerigkeitType(), null, "staatsangehoerigkeit", null, 0, 1, AllgemeineAngabenFremdkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllgemeineAngabenFremdkindadoptionType_Religionszugehoerigkeit(), theDIN913792204Package.getDatatypeC(), "religionszugehoerigkeit", null, 0, 1, AllgemeineAngabenFremdkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllgemeineAngabenFremdkindadoptionType_AktuelleBeruflicheTaetigkeit(), theDIN913792204Package.getDatatypeC(), "aktuelleBeruflicheTaetigkeit", null, 0, 1, AllgemeineAngabenFremdkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllgemeineAngabenFremdkindadoptionType_EinkuenfteAusTaetigkeit(), theXMLTypePackage.getFloat(), "einkuenfteAusTaetigkeit", null, 0, 1, AllgemeineAngabenFremdkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllgemeineAngabenFremdkindadoptionType_AndereEinkuenfte(), theXMLTypePackage.getFloat(), "andereEinkuenfte", null, 0, 1, AllgemeineAngabenFremdkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllgemeineAngabenFremdkindadoptionType_Schuldverpflichtungen(), theXMLTypePackage.getFloat(), "schuldverpflichtungen", null, 0, 1, AllgemeineAngabenFremdkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllgemeineAngabenFremdkindadoptionType_Unterhaltsverpflichtungen(), theXMLTypePackage.getFloat(), "unterhaltsverpflichtungen", null, 0, 1, AllgemeineAngabenFremdkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllgemeineAngabenFremdkindadoptionType_MonatlicheFixkostenUnterkunft(), theXMLTypePackage.getFloat(), "monatlicheFixkostenUnterkunft", null, 0, 1, AllgemeineAngabenFremdkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllgemeineAngabenFremdkindadoptionType_Aufenthaltsstatus(), theBaukastenPackage.getCodeAufenthaltsstatusType(), null, "aufenthaltsstatus", null, 0, 1, AllgemeineAngabenFremdkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllgemeineAngabenFremdkindadoptionType_AktuellerFamilienstand(), theDIN913792204Package.getDatatypeC(), "aktuellerFamilienstand", null, 0, 1, AllgemeineAngabenFremdkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllgemeineAngabenFremdkindadoptionType_Geschlecht(), theBaukastenPackage.getCodeGeschlechtType(), null, "geschlecht", null, 0, 1, AllgemeineAngabenFremdkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllgemeineAngabenFremdkindadoptionType_BereitsVerheiratet(), theXMLTypePackage.getBoolean(), "bereitsVerheiratet", null, 0, 1, AllgemeineAngabenFremdkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllgemeineAngabenFremdkindadoptionType_UmfangVerheiratet(), theDIN913792204Package.getDatatypeC(), "umfangVerheiratet", null, 0, 1, AllgemeineAngabenFremdkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allgemeineAngabenPflegeTypeEClass, AllgemeineAngabenPflegeType.class, "AllgemeineAngabenPflegeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAllgemeineAngabenPflegeType_Wochenstunden(), theDIN913792204Package.getDatatypeC(), "wochenstunden", null, 0, 1, AllgemeineAngabenPflegeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllgemeineAngabenPflegeType_Anschrift(), theBaukastenPackage.getMeldeanschriftType(), null, "anschrift", null, 0, 1, AllgemeineAngabenPflegeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllgemeineAngabenPflegeType_Geschlecht(), theBaukastenPackage.getCodeGeschlechtType(), null, "geschlecht", null, 0, 1, AllgemeineAngabenPflegeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allgemeineAngabenStiefkindadoptionTypeEClass, AllgemeineAngabenStiefkindadoptionType.class, "AllgemeineAngabenStiefkindadoptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAllgemeineAngabenStiefkindadoptionType_KontaktZuLeiblicherFamilie(), theXMLTypePackage.getBoolean(), "kontaktZuLeiblicherFamilie", null, 0, 1, AllgemeineAngabenStiefkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllgemeineAngabenStiefkindadoptionType_ErlaeuterungKontaktZuLeiblicherFamilie(), theDIN913792204Package.getDatatypeC(), "erlaeuterungKontaktZuLeiblicherFamilie", null, 0, 1, AllgemeineAngabenStiefkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllgemeineAngabenStiefkindadoptionType_Personensorgerecht(), theBaukastenPackage.getCodePersonensorgerechtType(), null, "personensorgerecht", null, 0, 1, AllgemeineAngabenStiefkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllgemeineAngabenStiefkindadoptionType_PersonensorgerechtBeiSonstige(), theDIN913792204Package.getDatatypeC(), "personensorgerechtBeiSonstige", null, 0, 1, AllgemeineAngabenStiefkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllgemeineAngabenStiefkindadoptionType_GeschpraechUeberAdoption(), theXMLTypePackage.getBoolean(), "geschpraechUeberAdoption", null, 0, 1, AllgemeineAngabenStiefkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllgemeineAngabenStiefkindadoptionType_ReaktionKindGespraech(), theDIN913792204Package.getDatatypeC(), "reaktionKindGespraech", null, 0, 1, AllgemeineAngabenStiefkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllgemeineAngabenStiefkindadoptionType_KontaktJugendamt(), theXMLTypePackage.getBoolean(), "kontaktJugendamt", null, 0, 1, AllgemeineAngabenStiefkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllgemeineAngabenStiefkindadoptionType_ArtKontaktJugendamt(), theDIN913792204Package.getDatatypeC(), "artKontaktJugendamt", null, 0, 1, AllgemeineAngabenStiefkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllgemeineAngabenStiefkindadoptionType_GerichtlicheRegelung(), theXMLTypePackage.getBoolean(), "gerichtlicheRegelung", null, 0, 1, AllgemeineAngabenStiefkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allgemeineAngabenVerwandtenadoptionTypeEClass, AllgemeineAngabenVerwandtenadoptionType.class, "AllgemeineAngabenVerwandtenadoptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAllgemeineAngabenVerwandtenadoptionType_HerkunftBekannt(), theXMLTypePackage.getBoolean(), "herkunftBekannt", null, 0, 1, AllgemeineAngabenVerwandtenadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllgemeineAngabenVerwandtenadoptionType_KontaktZuLeiblicherFamilie(), theXMLTypePackage.getBoolean(), "kontaktZuLeiblicherFamilie", null, 0, 1, AllgemeineAngabenVerwandtenadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllgemeineAngabenVerwandtenadoptionType_ErlaeuterungKontaktZuLeiblicherFamilie(), theDIN913792204Package.getDatatypeC(), "erlaeuterungKontaktZuLeiblicherFamilie", null, 0, 1, AllgemeineAngabenVerwandtenadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllgemeineAngabenVerwandtenadoptionType_Personensorgerecht(), theBaukastenPackage.getCodePersonensorgerechtType(), null, "personensorgerecht", null, 0, 1, AllgemeineAngabenVerwandtenadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllgemeineAngabenVerwandtenadoptionType_PersonensorgerechtBeiSonstige(), theDIN913792204Package.getDatatypeC(), "personensorgerechtBeiSonstige", null, 0, 1, AllgemeineAngabenVerwandtenadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllgemeineAngabenVerwandtenadoptionType_GeschpraechUeberAdoption(), theXMLTypePackage.getBoolean(), "geschpraechUeberAdoption", null, 0, 1, AllgemeineAngabenVerwandtenadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllgemeineAngabenVerwandtenadoptionType_ReaktionKindGespraech(), theDIN913792204Package.getDatatypeC(), "reaktionKindGespraech", null, 0, 1, AllgemeineAngabenVerwandtenadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alterssicherungPflegepersonTypeEClass, AlterssicherungPflegepersonType.class, "AlterssicherungPflegepersonType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlterssicherungPflegepersonType_DatenschutzUndEinwilligung(), this.getDatenschutzUndEinwilligungType(), null, "datenschutzUndEinwilligung", null, 1, 1, AlterssicherungPflegepersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlterssicherungPflegepersonType_AllgemeineAngaben(), this.getAllgemeineAngabenPflegeType(), null, "allgemeineAngaben", null, 1, 2, AlterssicherungPflegepersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlterssicherungPflegepersonType_AntragdetailsAlterssicherung(), this.getAntragdetailsAlterssicherungType(), null, "antragdetailsAlterssicherung", null, 1, 1, AlterssicherungPflegepersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlterssicherungPflegepersonType_Pflegekinder(), this.getPflegekindType(), null, "pflegekinder", null, 0, -1, AlterssicherungPflegepersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlterssicherungPflegepersonType_Nachweise(), theBaukastenPackage.getNachweisdokumentType(), null, "nachweise", null, 0, -1, AlterssicherungPflegepersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlterssicherungPflegepersonType_DatenschutzDerFachbehoerde(), this.getDatenschutzUndEinwilligungType(), null, "datenschutzDerFachbehoerde", null, 1, -1, AlterssicherungPflegepersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlterssicherungPflegepersonType_Signatur(), this.getSignaturType(), null, "signatur", null, 1, 1, AlterssicherungPflegepersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlterssicherungPflegepersonType_DigitalerRueckkanal(), this.getDigitalerRueckkanalType(), null, "digitalerRueckkanal", null, 0, 1, AlterssicherungPflegepersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(angabenDesZuAdoptierendenKindesTypeEClass, AngabenDesZuAdoptierendenKindesType.class, "AngabenDesZuAdoptierendenKindesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAngabenDesZuAdoptierendenKindesType_Personendaten(), this.getPersonendatenType(), null, "personendaten", null, 0, 1, AngabenDesZuAdoptierendenKindesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenDesZuAdoptierendenKindesType_Geburt(), theBaukastenPackage.getGeburtOptionalType(), null, "geburt", null, 0, 1, AngabenDesZuAdoptierendenKindesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenDesZuAdoptierendenKindesType_Staatsangehoerigkeit(), theBaukastenPackage.getCodeStaatsangehoerigkeitType(), null, "staatsangehoerigkeit", null, 0, 1, AngabenDesZuAdoptierendenKindesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenDesZuAdoptierendenKindesType_Religionszugehoerigkeit(), theDIN913792204Package.getDatatypeC(), "religionszugehoerigkeit", null, 0, 1, AngabenDesZuAdoptierendenKindesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenDesZuAdoptierendenKindesType_AusAuslandGeholt(), theXMLTypePackage.getBoolean(), "ausAuslandGeholt", null, 0, 1, AngabenDesZuAdoptierendenKindesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenDesZuAdoptierendenKindesType_Anschrift(), theBaukastenPackage.getMeldeanschriftType(), null, "anschrift", null, 0, 1, AngabenDesZuAdoptierendenKindesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenDesZuAdoptierendenKindesType_Aufenthaltsstatus(), theBaukastenPackage.getCodeAufenthaltsstatusType(), null, "aufenthaltsstatus", null, 0, 1, AngabenDesZuAdoptierendenKindesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(angabenPflegekindTypeEClass, AngabenPflegekindType.class, "AngabenPflegekindType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAngabenPflegekindType_Personendaten(), this.getPersonendatenType(), null, "personendaten", null, 0, 1, AngabenPflegekindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenPflegekindType_Geburt(), theBaukastenPackage.getGeburtOptionalType(), null, "geburt", null, 0, 1, AngabenPflegekindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenPflegekindType_Anschrift(), theBaukastenPackage.getMeldeanschriftType(), null, "anschrift", null, 1, 1, AngabenPflegekindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenPflegekindType_BeginnPflegeverhaeltnis(), theXMLTypePackage.getDate(), "beginnPflegeverhaeltnis", null, 0, 1, AngabenPflegekindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenPflegekindType_Krankenversichert(), theDIN913792204Package.getDatatypeC(), "krankenversichert", null, 0, 1, AngabenPflegekindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenPflegekindType_KrankenversichertUeberPflegeperson(), theDIN913792204Package.getDatatypeC(), "krankenversichertUeberPflegeperson", null, 0, 1, AngabenPflegekindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenPflegekindType_SchuleAusbildungsstaette(), theDIN913792204Package.getDatatypeC(), "schuleAusbildungsstaette", null, 0, 1, AngabenPflegekindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenPflegekindType_KlassenstufeAusbildungsjahr(), theXMLTypePackage.getInteger(), "klassenstufeAusbildungsjahr", null, 0, 1, AngabenPflegekindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenPflegekindType_EinkommenPflegekind(), this.getEinkommenPflegekindType(), null, "einkommenPflegekind", null, 0, 1, AngabenPflegekindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(angabenZuKindernDerFamilieTypeEClass, AngabenZuKindernDerFamilieType.class, "AngabenZuKindernDerFamilieType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAngabenZuKindernDerFamilieType_Personendaten(), this.getPersonendatenType(), null, "personendaten", null, 0, 1, AngabenZuKindernDerFamilieType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenZuKindernDerFamilieType_Geburt(), theBaukastenPackage.getGeburtOptionalType(), null, "geburt", null, 0, 1, AngabenZuKindernDerFamilieType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZuKindernDerFamilieType_VerhaeltnisKind(), theDIN913792204Package.getDatatypeC(), "verhaeltnisKind", null, 0, 1, AngabenZuKindernDerFamilieType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZuKindernDerFamilieType_ElternteilDesKindes(), theDIN913792204Package.getDatatypeC(), "elternteilDesKindes", null, 0, 1, AngabenZuKindernDerFamilieType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZuKindernDerFamilieType_KindWohnhaftHaushalt(), theXMLTypePackage.getBoolean(), "kindWohnhaftHaushalt", null, 0, 1, AngabenZuKindernDerFamilieType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZuKindernDerFamilieType_KindWohnhaftAlterntive(), theDIN913792204Package.getDatatypeC(), "kindWohnhaftAlterntive", null, 0, 1, AngabenZuKindernDerFamilieType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenZuKindernDerFamilieType_KindVerstorben(), theBaukastenPackage.getTeilbekanntesDatumType(), null, "kindVerstorben", null, 0, 1, AngabenZuKindernDerFamilieType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(angabenZurPartnerschaftTypeEClass, AngabenZurPartnerschaftType.class, "AngabenZurPartnerschaftType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAngabenZurPartnerschaftType_DauerPartnerschaft(), theXMLTypePackage.getInteger(), "dauerPartnerschaft", null, 0, 1, AngabenZurPartnerschaftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZurPartnerschaftType_DauerGemeinsamerHaushalt(), theXMLTypePackage.getInteger(), "dauerGemeinsamerHaushalt", null, 0, 1, AngabenZurPartnerschaftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZurPartnerschaftType_VerheiratetOderLebenspartnerschaft(), theXMLTypePackage.getBoolean(), "verheiratetOderLebenspartnerschaft", null, 0, 1, AngabenZurPartnerschaftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZurPartnerschaftType_DauerVerheiratetOderLebenspartnerschaft(), theXMLTypePackage.getInteger(), "dauerVerheiratetOderLebenspartnerschaft", null, 0, 1, AngabenZurPartnerschaftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZurPartnerschaftType_GespraechUeberAdoption(), theXMLTypePackage.getBoolean(), "gespraechUeberAdoption", null, 0, 1, AngabenZurPartnerschaftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZurPartnerschaftType_MeinungFamilieUndFreunde(), theDIN913792204Package.getDatatypeC(), "meinungFamilieUndFreunde", null, 0, 1, AngabenZurPartnerschaftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenZurPartnerschaftType_Anschrift(), theBaukastenPackage.getMeldeanschriftType(), null, "anschrift", null, 0, 1, AngabenZurPartnerschaftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZurPartnerschaftType_WohnverhaeltnisseAnzahlZimmer(), theXMLTypePackage.getFloat(), "wohnverhaeltnisseAnzahlZimmer", null, 0, 1, AngabenZurPartnerschaftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZurPartnerschaftType_WohnverhaeltnisseWohnflaeche(), theXMLTypePackage.getInteger(), "wohnverhaeltnisseWohnflaeche", null, 0, 1, AngabenZurPartnerschaftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZurPartnerschaftType_MieteOderEigentum(), theXMLTypePackage.getBoolean(), "mieteOderEigentum", null, 0, 1, AngabenZurPartnerschaftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZurPartnerschaftType_Garten(), theXMLTypePackage.getBoolean(), "garten", null, 0, 1, AngabenZurPartnerschaftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZurPartnerschaftType_Kinderzimmer(), theXMLTypePackage.getBoolean(), "kinderzimmer", null, 0, 1, AngabenZurPartnerschaftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZurPartnerschaftType_Haustiere(), theXMLTypePackage.getBoolean(), "haustiere", null, 0, 1, AngabenZurPartnerschaftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anliegenTypeEClass, AnliegenType.class, "AnliegenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnliegenType_WunschBeratung(), ecorePackage.getEObject(), null, "wunschBeratung", null, 0, 1, AnliegenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnliegenType_Kommentar(), theDIN913792204Package.getDatatypeC(), "kommentar", null, 0, 1, AnliegenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annehmenderElternteilTypeEClass, AnnehmenderElternteilType.class, "AnnehmenderElternteilType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnehmenderElternteilType_Personendaten(), this.getPersonendatenType(), null, "personendaten", null, 1, 1, AnnehmenderElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnehmenderElternteilType_Staatsangehoerigkeit(), theBaukastenPackage.getCodeStaatsangehoerigkeitType(), null, "staatsangehoerigkeit", null, 0, 1, AnnehmenderElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnehmenderElternteilType_Geburt(), theBaukastenPackage.getGeburtOptionalType(), null, "geburt", null, 0, 1, AnnehmenderElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnehmenderElternteilType_AktuelleBeruflicheTaetigkeit(), theDIN913792204Package.getDatatypeC(), "aktuelleBeruflicheTaetigkeit", null, 0, 1, AnnehmenderElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnehmenderElternteilType_GruendeMotiveFuerAdoption(), theDIN913792204Package.getDatatypeC(), "gruendeMotiveFuerAdoption", null, 0, 1, AnnehmenderElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnehmenderElternteilType_VeraenderungDurchAdoption(), theDIN913792204Package.getDatatypeC(), "veraenderungDurchAdoption", null, 0, 1, AnnehmenderElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnehmenderElternteilType_EinkuenfteAusTaetigkeit(), theXMLTypePackage.getFloat(), "einkuenfteAusTaetigkeit", null, 0, 1, AnnehmenderElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnehmenderElternteilType_AndereEinkuenfte(), theXMLTypePackage.getFloat(), "andereEinkuenfte", null, 0, 1, AnnehmenderElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnehmenderElternteilType_Schuldverpflichtungen(), theXMLTypePackage.getFloat(), "schuldverpflichtungen", null, 0, 1, AnnehmenderElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnehmenderElternteilType_Unterhaltsverpflichtungen(), theXMLTypePackage.getFloat(), "unterhaltsverpflichtungen", null, 0, 1, AnnehmenderElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnehmenderElternteilType_MonatlicheFixkostenUnterkunft(), theXMLTypePackage.getFloat(), "monatlicheFixkostenUnterkunft", null, 0, 1, AnnehmenderElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnehmenderElternteilType_Religionszugehoerigkeit(), theDIN913792204Package.getDatatypeC(), "religionszugehoerigkeit", null, 0, 1, AnnehmenderElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnehmenderElternteilType_Aufenthaltsstatus(), theBaukastenPackage.getCodeAufenthaltsstatusType(), null, "aufenthaltsstatus", null, 0, 1, AnnehmenderElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnehmenderElternteilType_Geschlecht(), theBaukastenPackage.getCodeGeschlechtType(), null, "geschlecht", null, 0, 1, AnnehmenderElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(antragdetailsAlterssicherungTypeEClass, AntragdetailsAlterssicherungType.class, "AntragdetailsAlterssicherungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAntragdetailsAlterssicherungType_BeantragungZuschussAlterssicherung(), theDIN913792204Package.getDatatypeC(), "beantragungZuschussAlterssicherung", null, 1, 1, AntragdetailsAlterssicherungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAntragdetailsAlterssicherungType_Zuschuesse(), theBaukastenPackage.getCodeZuschuesseType(), null, "zuschuesse", null, 1, 1, AntragdetailsAlterssicherungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAntragdetailsAlterssicherungType_HoeheZuschuesse(), theXMLTypePackage.getFloat(), "hoeheZuschuesse", null, 0, 1, AntragdetailsAlterssicherungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAntragdetailsAlterssicherungType_VonAndererStelle(), theDIN913792204Package.getDatatypeC(), "vonAndererStelle", null, 0, 1, AntragdetailsAlterssicherungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAntragdetailsAlterssicherungType_ArtHoeheAbsicherung(), theXMLTypePackage.getBoolean(), "artHoeheAbsicherung", null, 0, 1, AntragdetailsAlterssicherungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAntragdetailsAlterssicherungType_AlleinigePflegeperson(), theXMLTypePackage.getBoolean(), "alleinigePflegeperson", null, 0, 1, AntragdetailsAlterssicherungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAntragdetailsAlterssicherungType_Hauptpflegeperson(), theXMLTypePackage.getBoolean(), "hauptpflegeperson", null, 0, 1, AntragdetailsAlterssicherungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(antragdetailsTypeEClass, AntragdetailsType.class, "AntragdetailsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAntragdetailsType_Antrag(), ecorePackage.getEObject(), null, "antrag", null, 1, 1, AntragdetailsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAntragdetailsType_Information(), theDIN913792204Package.getDatatypeC(), "information", null, 0, 1, AntragdetailsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(antragdetailsUnfallversicherungTypeEClass, AntragdetailsUnfallversicherungType.class, "AntragdetailsUnfallversicherungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAntragdetailsUnfallversicherungType_BeantragungKostenUnfallversicherung(), theDIN913792204Package.getDatatypeC(), "beantragungKostenUnfallversicherung", null, 1, 1, AntragdetailsUnfallversicherungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAntragdetailsUnfallversicherungType_Zuschuesse(), theBaukastenPackage.getCodeZuschuesseType(), null, "zuschuesse", null, 1, 1, AntragdetailsUnfallversicherungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAntragdetailsUnfallversicherungType_HoeheZuschuesse(), theXMLTypePackage.getFloat(), "hoeheZuschuesse", null, 0, 1, AntragdetailsUnfallversicherungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(antragstellerTypeEClass, AntragstellerType.class, "AntragstellerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAntragstellerType_Personendaten(), this.getPersonendatenType(), null, "personendaten", null, 1, 1, AntragstellerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAntragstellerType_Fallnummer(), theDIN913792204Package.getDatatypeC(), "fallnummer", null, 0, 1, AntragstellerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAntragstellerType_Antragsdatum(), theXMLTypePackage.getDate(), "antragsdatum", null, 0, 1, AntragstellerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAntragstellerType_Geburt(), theBaukastenPackage.getGeburtOptionalType(), null, "geburt", null, 0, 1, AntragstellerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beitragsuebernahmeUnfallversicherungTypeEClass, BeitragsuebernahmeUnfallversicherungType.class, "BeitragsuebernahmeUnfallversicherungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBeitragsuebernahmeUnfallversicherungType_DatenschutzUndEinwilligung(), this.getDatenschutzUndEinwilligungType(), null, "datenschutzUndEinwilligung", null, 1, 1, BeitragsuebernahmeUnfallversicherungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeitragsuebernahmeUnfallversicherungType_AllgemeineAngaben(), this.getAllgemeineAngabenPflegeType(), null, "allgemeineAngaben", null, 1, -1, BeitragsuebernahmeUnfallversicherungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeitragsuebernahmeUnfallversicherungType_AntragdetailsUnfallversicherung(), this.getAntragdetailsUnfallversicherungType(), null, "antragdetailsUnfallversicherung", null, 1, 1, BeitragsuebernahmeUnfallversicherungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeitragsuebernahmeUnfallversicherungType_Pflegekinder(), this.getPflegekindType(), null, "pflegekinder", null, 0, -1, BeitragsuebernahmeUnfallversicherungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeitragsuebernahmeUnfallversicherungType_Nachweise(), this.getNachweisType(), null, "nachweise", null, 0, -1, BeitragsuebernahmeUnfallversicherungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeitragsuebernahmeUnfallversicherungType_DatenschutzDerFachbehoerde(), this.getDatenschutzUndEinwilligungType(), null, "datenschutzDerFachbehoerde", null, 1, -1, BeitragsuebernahmeUnfallversicherungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeitragsuebernahmeUnfallversicherungType_Signatur(), this.getSignaturType(), null, "signatur", null, 1, 1, BeitragsuebernahmeUnfallversicherungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeitragsuebernahmeUnfallversicherungType_DigitalerRueckkanal(), this.getDigitalerRueckkanalType(), null, "digitalerRueckkanal", null, 0, 1, BeitragsuebernahmeUnfallversicherungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bestimmtesKindTypeEClass, BestimmtesKindType.class, "BestimmtesKindType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBestimmtesKindType_Personendaten(), this.getPersonendatenType(), null, "personendaten", null, 0, 1, BestimmtesKindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBestimmtesKindType_Geburt(), theBaukastenPackage.getGeburtOptionalType(), null, "geburt", null, 0, 1, BestimmtesKindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBestimmtesKindType_ZustaendigesJugendamt(), theDIN913792204Package.getDatatypeC(), "zustaendigesJugendamt", null, 0, 1, BestimmtesKindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datenschutzUndEinwilligungTypeEClass, DatenschutzUndEinwilligungType.class, "DatenschutzUndEinwilligungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatenschutzUndEinwilligungType_AllgemeineDatenschutzerklaerung(), theDIN913792204Package.getDatatypeC(), "allgemeineDatenschutzerklaerung", null, 1, 1, DatenschutzUndEinwilligungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatenschutzUndEinwilligungType_KenntnissnahmeDatenschutzerklaerung(), theXMLTypePackage.getBoolean(), "kenntnissnahmeDatenschutzerklaerung", "false", 1, 1, DatenschutzUndEinwilligungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(digitalerRueckkanalTypeEClass, DigitalerRueckkanalType.class, "DigitalerRueckkanalType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDigitalerRueckkanalType_PostfachUUID(), theDIN913792204Package.getDatatypeC(), "postfachUUID", null, 1, 1, DigitalerRueckkanalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDigitalerRueckkanalType_EinverstaendnisDigitalerRueckkanal(), theXMLTypePackage.getBoolean(), "einverstaendnisDigitalerRueckkanal", null, 1, 1, DigitalerRueckkanalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AdoptionundpflegekinderAdoption0901(), this.getAdoptionundpflegekinderAdoption0901Type(), null, "adoptionundpflegekinderAdoption0901", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AdoptionundpflegekinderPflegekinder0902(), this.getAdoptionundpflegekinderPflegekinder0902Type(), null, "adoptionundpflegekinderPflegekinder0902", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(einkommenPflegekindTypeEClass, EinkommenPflegekindType.class, "EinkommenPflegekindType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEinkommenPflegekindType_EinkommenAb(), theDIN913792204Package.getDatatypeC(), "einkommenAb", null, 0, 1, EinkommenPflegekindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEinkommenPflegekindType_HoeheEinkommen(), theXMLTypePackage.getFloat(), "hoeheEinkommen", null, 0, 1, EinkommenPflegekindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEinkommenPflegekindType_BezugKindergeldAb(), theXMLTypePackage.getDate(), "bezugKindergeldAb", null, 0, 1, EinkommenPflegekindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEinkommenPflegekindType_HoeheKindergeld(), theXMLTypePackage.getFloat(), "hoeheKindergeld", null, 0, 1, EinkommenPflegekindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEinkommenPflegekindType_ArtDesEinkommens(), theBaukastenPackage.getCodeEinkommensartenType(), null, "artDesEinkommens", null, 0, 1, EinkommenPflegekindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEinkommenPflegekindType_SonstigesEinkommen(), theDIN913792204Package.getDatatypeC(), "sonstigesEinkommen", null, 0, 1, EinkommenPflegekindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEinkommenPflegekindType_ZustaendigeFamilienkasse(), theDIN913792204Package.getDatatypeC(), "zustaendigeFamilienkasse", null, 0, 1, EinkommenPflegekindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(einkommenUndWohnenTypeEClass, EinkommenUndWohnenType.class, "EinkommenUndWohnenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEinkommenUndWohnenType_EinkuenfteAusTaetigkeit(), theXMLTypePackage.getFloat(), "einkuenfteAusTaetigkeit", null, 0, 1, EinkommenUndWohnenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEinkommenUndWohnenType_AndereEinkuenfte(), theXMLTypePackage.getFloat(), "andereEinkuenfte", null, 0, 1, EinkommenUndWohnenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEinkommenUndWohnenType_Schuldverpflichtungen(), theXMLTypePackage.getFloat(), "schuldverpflichtungen", null, 0, 1, EinkommenUndWohnenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEinkommenUndWohnenType_Unterhaltsverpflichtungen(), theXMLTypePackage.getFloat(), "unterhaltsverpflichtungen", null, 0, 1, EinkommenUndWohnenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEinkommenUndWohnenType_MonatlicheFixkostenUnterkunft(), theXMLTypePackage.getFloat(), "monatlicheFixkostenUnterkunft", null, 0, 1, EinkommenUndWohnenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEinkommenUndWohnenType_WohnverhaeltnisseAnzahlZimmer(), theXMLTypePackage.getFloat(), "wohnverhaeltnisseAnzahlZimmer", null, 0, 1, EinkommenUndWohnenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEinkommenUndWohnenType_WohnverhaeltnisseWohnflaeche(), theXMLTypePackage.getInteger(), "wohnverhaeltnisseWohnflaeche", null, 0, 1, EinkommenUndWohnenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fremdkindadoptionTypeEClass, FremdkindadoptionType.class, "FremdkindadoptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFremdkindadoptionType_Beratungscode(), theDIN913792204Package.getDatatypeC(), "beratungscode", null, 1, 1, FremdkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFremdkindadoptionType_AllgemeineAngaben(), this.getAllgemeineAngabenFremdkindadoptionType(), null, "allgemeineAngaben", null, 1, 2, FremdkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFremdkindadoptionType_AngabenZurPartnerschaft(), this.getAngabenZurPartnerschaftType(), null, "angabenZurPartnerschaft", null, 1, 1, FremdkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFremdkindadoptionType_AngabenZuKindernDerFamilie(), this.getAngabenZuKindernDerFamilieType(), null, "angabenZuKindernDerFamilie", null, 0, -1, FremdkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFremdkindadoptionType_WeiterePersonenImHauhalt(), this.getWeiterePersonenImHauhaltType(), null, "weiterePersonenImHauhalt", null, 0, -1, FremdkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFremdkindadoptionType_AuseinandersetzungThemaAdoption(), theDIN913792204Package.getDatatypeC(), "auseinandersetzungThemaAdoption", null, 0, 1, FremdkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFremdkindadoptionType_Nachweise(), this.getNachweisType(), null, "nachweise", null, 0, -1, FremdkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFremdkindadoptionType_DatenschutzDerFachbehoerde(), this.getDatenschutzUndEinwilligungType(), null, "datenschutzDerFachbehoerde", null, 1, -1, FremdkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFremdkindadoptionType_Signatur(), this.getSignaturType(), null, "signatur", null, 1, 1, FremdkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFremdkindadoptionType_DigitalerRueckkanal(), this.getDigitalerRueckkanalType(), null, "digitalerRueckkanal", null, 0, 1, FremdkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFremdkindadoptionType_DatenschutzUndEinwilligung(), this.getDatenschutzUndEinwilligungType(), null, "datenschutzUndEinwilligung", null, 1, 1, FremdkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFremdkindadoptionType_AertzlicheBehandlung(), theXMLTypePackage.getBoolean(), "aertzlicheBehandlung", null, 0, 1, FremdkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kontakformularTypeEClass, KontakformularType.class, "KontakformularType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKontakformularType_DatenschutzUndEinwilligung(), this.getDatenschutzUndEinwilligungType(), null, "datenschutzUndEinwilligung", null, 1, 1, KontakformularType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKontakformularType_Personendaten(), this.getPersonendatenType(), null, "personendaten", null, 1, 1, KontakformularType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKontakformularType_Anschrift(), theBaukastenPackage.getMeldeanschriftType(), null, "anschrift", null, 1, 1, KontakformularType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKontakformularType_Anliegen(), this.getAnliegenType(), null, "anliegen", null, 1, 1, KontakformularType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKontakformularType_DatenschutzDerFachbehoerde(), this.getDatenschutzUndEinwilligungType(), null, "datenschutzDerFachbehoerde", null, 1, -1, KontakformularType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKontakformularType_DigitalerRueckkanal(), this.getDigitalerRueckkanalType(), null, "digitalerRueckkanal", null, 0, 1, KontakformularType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kontoinformationenTypeEClass, KontoinformationenType.class, "KontoinformationenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKontoinformationenType_BeantragungJugendhilfe(), theBaukastenPackage.getCodeEigenschaftType(), null, "beantragungJugendhilfe", null, 0, 1, KontoinformationenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKontoinformationenType_Bankverbindung(), theBaukastenPackage.getBankverbindungIBANOptionalType(), null, "bankverbindung", null, 0, 1, KontoinformationenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moeglichkeitenUndGrenzenTypeEClass, MoeglichkeitenUndGrenzenType.class, "MoeglichkeitenUndGrenzenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoeglichkeitenUndGrenzenType_ZutrauenKindJedenAlters(), theXMLTypePackage.getBoolean(), "zutrauenKindJedenAlters", null, 0, 1, MoeglichkeitenUndGrenzenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoeglichkeitenUndGrenzenType_ZutrauenKindAltersangabe(), theDIN913792204Package.getDatatypeC(), "zutrauenKindAltersangabe", null, 0, 1, MoeglichkeitenUndGrenzenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoeglichkeitenUndGrenzenType_ZutrauenKindBeeintraechtigung(), theXMLTypePackage.getBoolean(), "zutrauenKindBeeintraechtigung", null, 0, 1, MoeglichkeitenUndGrenzenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoeglichkeitenUndGrenzenType_ZutrauenKindKoerperlicheBeeintraechtigung(), theXMLTypePackage.getBoolean(), "zutrauenKindKoerperlicheBeeintraechtigung", null, 0, 1, MoeglichkeitenUndGrenzenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoeglichkeitenUndGrenzenType_ZutrauenKindGeistigerBeeintraechtigung(), theXMLTypePackage.getBoolean(), "zutrauenKindGeistigerBeeintraechtigung", null, 0, 1, MoeglichkeitenUndGrenzenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoeglichkeitenUndGrenzenType_ZutrauenKindPsychischerBeeintraechtigung(), theXMLTypePackage.getBoolean(), "zutrauenKindPsychischerBeeintraechtigung", null, 0, 1, MoeglichkeitenUndGrenzenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nachweiseEinreichenTypeEClass, NachweiseEinreichenType.class, "NachweiseEinreichenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNachweiseEinreichenType_DatenschutzUndEinwilligung(), this.getDatenschutzUndEinwilligungType(), null, "datenschutzUndEinwilligung", null, 1, 1, NachweiseEinreichenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachweiseEinreichenType_Antragsteller(), this.getAntragstellerType(), null, "antragsteller", null, 1, 1, NachweiseEinreichenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachweiseEinreichenType_Nachweise(), this.getNachweisType(), null, "nachweise", null, 1, -1, NachweiseEinreichenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachweiseEinreichenType_DatenschutzDerFachbehoerde(), this.getDatenschutzUndEinwilligungType(), null, "datenschutzDerFachbehoerde", null, 1, -1, NachweiseEinreichenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachweiseEinreichenType_DigitalerRueckkanal(), this.getDigitalerRueckkanalType(), null, "digitalerRueckkanal", null, 0, 1, NachweiseEinreichenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nachweisTypeEClass, NachweisType.class, "NachweisType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNachweisType_Beschreibung(), theDIN913792204Package.getDatatypeC(), "beschreibung", null, 0, 1, NachweisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pauschalbetragGezahltVonTypeEClass, PauschalbetragGezahltVonType.class, "PauschalbetragGezahltVonType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPauschalbetragGezahltVonType_Stadt(), theDIN913792204Package.getDatatypeC(), "stadt", null, 0, 1, PauschalbetragGezahltVonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPauschalbetragGezahltVonType_BezirkStadtteil(), theDIN913792204Package.getDatatypeC(), "bezirkStadtteil", null, 0, 1, PauschalbetragGezahltVonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPauschalbetragGezahltVonType_AktenzeichenWirtschaftlicheJugendhilfe(), theDIN913792204Package.getDatatypeC(), "aktenzeichenWirtschaftlicheJugendhilfe", null, 0, 1, PauschalbetragGezahltVonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pauschalbetragVollzeitpflegeTypeEClass, PauschalbetragVollzeitpflegeType.class, "PauschalbetragVollzeitpflegeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPauschalbetragVollzeitpflegeType_DatenschutzUndEinwilligung(), this.getDatenschutzUndEinwilligungType(), null, "datenschutzUndEinwilligung", null, 1, 1, PauschalbetragVollzeitpflegeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPauschalbetragVollzeitpflegeType_AngabenPflegekind(), this.getAngabenPflegekindType(), null, "angabenPflegekind", null, 1, 1, PauschalbetragVollzeitpflegeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPauschalbetragVollzeitpflegeType_Pflegeperson(), this.getPflegepersonBasisType(), null, "pflegeperson", null, 1, -1, PauschalbetragVollzeitpflegeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPauschalbetragVollzeitpflegeType_Kinder(), this.getPflegekindBasisType(), null, "kinder", null, 0, -1, PauschalbetragVollzeitpflegeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPauschalbetragVollzeitpflegeType_Kontoinformationen(), this.getKontoinformationenType(), null, "kontoinformationen", null, 0, 1, PauschalbetragVollzeitpflegeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPauschalbetragVollzeitpflegeType_Nachweise(), this.getNachweisType(), null, "nachweise", null, 1, -1, PauschalbetragVollzeitpflegeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPauschalbetragVollzeitpflegeType_DatenschutzDerFachbehoerde(), this.getDatenschutzUndEinwilligungType(), null, "datenschutzDerFachbehoerde", null, 1, -1, PauschalbetragVollzeitpflegeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPauschalbetragVollzeitpflegeType_Signatur(), this.getSignaturType(), null, "signatur", null, 1, 1, PauschalbetragVollzeitpflegeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPauschalbetragVollzeitpflegeType_DigitalerRueckkanal(), this.getDigitalerRueckkanalType(), null, "digitalerRueckkanal", null, 0, 1, PauschalbetragVollzeitpflegeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personendatenTypeEClass, PersonendatenType.class, "PersonendatenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersonendatenType_Name(), theBaukastenPackage.getNameNatuerlichePersonType(), null, "name", null, 1, 1, PersonendatenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonendatenType_Kontakt(), theBaukastenPackage.getErreichbarkeitType(), null, "kontakt", null, 0, -1, PersonendatenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pflegekindBasisTypeEClass, PflegekindBasisType.class, "PflegekindBasisType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPflegekindBasisType_Personendaten(), this.getPersonendatenType(), null, "personendaten", null, 1, 1, PflegekindBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPflegekindBasisType_Geburt(), theBaukastenPackage.getGeburtOptionalType(), null, "geburt", null, 0, 1, PflegekindBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pflegekindTypeEClass, PflegekindType.class, "PflegekindType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPflegekindType_InPflegeSeit(), theXMLTypePackage.getDate(), "inPflegeSeit", null, 0, 1, PflegekindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPflegekindType_Pflegeform(), ecorePackage.getEObject(), null, "pflegeform", null, 0, 1, PflegekindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPflegekindType_PauschalbetragGezahltVon(), this.getPauschalbetragGezahltVonType(), null, "pauschalbetragGezahltVon", null, 1, 1, PflegekindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pflegepersonBasisTypeEClass, PflegepersonBasisType.class, "PflegepersonBasisType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPflegepersonBasisType_Personendaten(), this.getPersonendatenType(), null, "personendaten", null, 1, 1, PflegepersonBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPflegepersonBasisType_Geburt(), theBaukastenPackage.getGeburtOptionalType(), null, "geburt", null, 0, 1, PflegepersonBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPflegepersonBasisType_Steueridentifikationsnummer(), theDIN913792204Package.getDatatypeC(), "steueridentifikationsnummer", null, 0, 1, PflegepersonBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pflegepersonTypeEClass, PflegepersonType.class, "PflegepersonType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPflegepersonType_Beratungscode(), theDIN913792204Package.getDatatypeC(), "beratungscode", null, 1, 1, PflegepersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPflegepersonType_DatenschutzUndEinwilligung(), this.getDatenschutzUndEinwilligungType(), null, "datenschutzUndEinwilligung", null, 1, 1, PflegepersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPflegepersonType_AllgemeineAngaben(), this.getAllgemeineAngabenPflegeType(), null, "allgemeineAngaben", null, 1, 2, PflegepersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPflegepersonType_EinkommenUndWohnen(), this.getEinkommenUndWohnenType(), null, "einkommenUndWohnen", null, 1, 1, PflegepersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPflegepersonType_AngabenZuKindernDerFamilie(), this.getAngabenZuKindernDerFamilieType(), null, "angabenZuKindernDerFamilie", null, 0, -1, PflegepersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPflegepersonType_WeiterePersonenImHauhalt(), this.getWeiterePersonenImHauhaltType(), null, "weiterePersonenImHauhalt", null, 0, -1, PflegepersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPflegepersonType_BestimmtesKind(), this.getBestimmtesKindType(), null, "bestimmtesKind", null, 0, 1, PflegepersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPflegepersonType_MoeglichkeitenUndGrenzen(), this.getMoeglichkeitenUndGrenzenType(), null, "moeglichkeitenUndGrenzen", null, 1, 1, PflegepersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPflegepersonType_Nachweise(), this.getNachweisType(), null, "nachweise", null, 0, -1, PflegepersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPflegepersonType_DatenschutzDerFachbehoerde(), this.getDatenschutzUndEinwilligungType(), null, "datenschutzDerFachbehoerde", null, 1, -1, PflegepersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPflegepersonType_Signatur(), this.getSignaturType(), null, "signatur", null, 1, 1, PflegepersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPflegepersonType_DigitalerRueckkanal(), this.getDigitalerRueckkanalType(), null, "digitalerRueckkanal", null, 0, 1, PflegepersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signaturTypeEClass, SignaturType.class, "SignaturType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignaturType_ElektronischSignieren(), theXMLTypePackage.getBoolean(), "elektronischSignieren", null, 1, 1, SignaturType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignaturType_Anlage(), this.getNachweisType(), null, "anlage", null, 0, 1, SignaturType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sonstigeAntraegeSendenTypeEClass, SonstigeAntraegeSendenType.class, "SonstigeAntraegeSendenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSonstigeAntraegeSendenType_DatenschutzUndEinwilligung(), this.getDatenschutzUndEinwilligungType(), null, "datenschutzUndEinwilligung", null, 1, 1, SonstigeAntraegeSendenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSonstigeAntraegeSendenType_AllgemeineAngaben(), this.getAllgemeineAngabenPflegeType(), null, "allgemeineAngaben", null, 1, 1, SonstigeAntraegeSendenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSonstigeAntraegeSendenType_Antragdetails(), this.getAntragdetailsType(), null, "antragdetails", null, 1, 1, SonstigeAntraegeSendenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSonstigeAntraegeSendenType_Pflegekinder(), this.getPflegekindType(), null, "pflegekinder", null, 1, -1, SonstigeAntraegeSendenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSonstigeAntraegeSendenType_Nachweise(), this.getNachweisType(), null, "nachweise", null, 0, -1, SonstigeAntraegeSendenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSonstigeAntraegeSendenType_DatenschutzDerFachbehoerde(), this.getDatenschutzUndEinwilligungType(), null, "datenschutzDerFachbehoerde", null, 1, -1, SonstigeAntraegeSendenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSonstigeAntraegeSendenType_Signatur(), this.getSignaturType(), null, "signatur", null, 1, 1, SonstigeAntraegeSendenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSonstigeAntraegeSendenType_DigitalerRueckkanal(), this.getDigitalerRueckkanalType(), null, "digitalerRueckkanal", null, 0, 1, SonstigeAntraegeSendenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stiefkindadoptionTypeEClass, StiefkindadoptionType.class, "StiefkindadoptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStiefkindadoptionType_Beratungscode(), theDIN913792204Package.getDatatypeC(), "beratungscode", null, 1, 1, StiefkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStiefkindadoptionType_DatenschutzUndEinwilligung(), this.getDatenschutzUndEinwilligungType(), null, "datenschutzUndEinwilligung", null, 1, 1, StiefkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStiefkindadoptionType_AngabenDesZuAdoptierendenKindes(), this.getAngabenDesZuAdoptierendenKindesType(), null, "angabenDesZuAdoptierendenKindes", null, 1, 1, StiefkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStiefkindadoptionType_AllgemeineAngaben(), this.getAllgemeineAngabenStiefkindadoptionType(), null, "allgemeineAngaben", null, 1, 1, StiefkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStiefkindadoptionType_VerbleibenderSorgeberechtigterElternteil(), this.getVerbleibenderSorgeberechtigterElternteilType(), null, "verbleibenderSorgeberechtigterElternteil", null, 1, 1, StiefkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStiefkindadoptionType_AnnehmenderElternteil(), this.getAnnehmenderElternteilType(), null, "annehmenderElternteil", null, 1, 1, StiefkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStiefkindadoptionType_AngabenZurPartnerschaft(), this.getAngabenZurPartnerschaftType(), null, "angabenZurPartnerschaft", null, 1, 1, StiefkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStiefkindadoptionType_AngabenZuKindernDerFamilie(), this.getAngabenZuKindernDerFamilieType(), null, "angabenZuKindernDerFamilie", null, 0, -1, StiefkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStiefkindadoptionType_WeiterePersonenImHauhalt(), this.getWeiterePersonenImHauhaltType(), null, "weiterePersonenImHauhalt", null, 0, -1, StiefkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStiefkindadoptionType_AbgebenderElternteil(), this.getAbgebenderElternteilType(), null, "abgebenderElternteil", null, 1, 1, StiefkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStiefkindadoptionType_Nachweise(), this.getNachweisType(), null, "nachweise", null, 0, -1, StiefkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStiefkindadoptionType_DatenschutzDerFachbehoerde(), this.getDatenschutzUndEinwilligungType(), null, "datenschutzDerFachbehoerde", null, 1, -1, StiefkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStiefkindadoptionType_Signatur(), this.getSignaturType(), null, "signatur", null, 1, 1, StiefkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStiefkindadoptionType_DigitalerRueckkanal(), this.getDigitalerRueckkanalType(), null, "digitalerRueckkanal", null, 0, 1, StiefkindadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verbleibenderSorgeberechtigterElternteilTypeEClass, VerbleibenderSorgeberechtigterElternteilType.class, "VerbleibenderSorgeberechtigterElternteilType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVerbleibenderSorgeberechtigterElternteilType_Personendaten(), this.getPersonendatenType(), null, "personendaten", null, 1, 1, VerbleibenderSorgeberechtigterElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerbleibenderSorgeberechtigterElternteilType_Staatsangehoerigkeit(), theBaukastenPackage.getCodeStaatsangehoerigkeitType(), null, "staatsangehoerigkeit", null, 0, 1, VerbleibenderSorgeberechtigterElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerbleibenderSorgeberechtigterElternteilType_Geburt(), theBaukastenPackage.getGeburtOptionalType(), null, "geburt", null, 0, 1, VerbleibenderSorgeberechtigterElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerbleibenderSorgeberechtigterElternteilType_EinkuenfteAusTaetigkeit(), theXMLTypePackage.getFloat(), "einkuenfteAusTaetigkeit", null, 0, 1, VerbleibenderSorgeberechtigterElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerbleibenderSorgeberechtigterElternteilType_AndereEinkuenfte(), theXMLTypePackage.getFloat(), "andereEinkuenfte", null, 0, 1, VerbleibenderSorgeberechtigterElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerbleibenderSorgeberechtigterElternteilType_Schuldverpflichtungen(), theXMLTypePackage.getFloat(), "schuldverpflichtungen", null, 0, 1, VerbleibenderSorgeberechtigterElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerbleibenderSorgeberechtigterElternteilType_Unterhaltsverpflichtungen(), theXMLTypePackage.getFloat(), "unterhaltsverpflichtungen", null, 0, 1, VerbleibenderSorgeberechtigterElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerbleibenderSorgeberechtigterElternteilType_MonatlicheFixkostenUnterkunft(), theXMLTypePackage.getFloat(), "monatlicheFixkostenUnterkunft", null, 0, 1, VerbleibenderSorgeberechtigterElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerbleibenderSorgeberechtigterElternteilType_Aufenthaltsstatus(), theBaukastenPackage.getCodeAufenthaltsstatusType(), null, "aufenthaltsstatus", null, 0, 1, VerbleibenderSorgeberechtigterElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerbleibenderSorgeberechtigterElternteilType_Geschlecht(), theBaukastenPackage.getCodeGeschlechtType(), null, "geschlecht", null, 0, 1, VerbleibenderSorgeberechtigterElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verwandtenadoptionTypeEClass, VerwandtenadoptionType.class, "VerwandtenadoptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerwandtenadoptionType_Beratungscode(), theDIN913792204Package.getDatatypeC(), "beratungscode", null, 1, 1, VerwandtenadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerwandtenadoptionType_DatenschutzUndEinwilligung(), this.getDatenschutzUndEinwilligungType(), null, "datenschutzUndEinwilligung", null, 1, 1, VerwandtenadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerwandtenadoptionType_AngabenDesZuAdoptierendenKindes(), this.getAngabenDesZuAdoptierendenKindesType(), null, "angabenDesZuAdoptierendenKindes", null, 1, 1, VerwandtenadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerwandtenadoptionType_AllgemeineAngaben(), this.getAllgemeineAngabenVerwandtenadoptionType(), null, "allgemeineAngaben", null, 1, 1, VerwandtenadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerwandtenadoptionType_AnnehmenderElternteil(), this.getAnnehmenderElternteilType(), null, "annehmenderElternteil", null, 1, -1, VerwandtenadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerwandtenadoptionType_AngabenZurPartnerschaft(), this.getAngabenZurPartnerschaftType(), null, "angabenZurPartnerschaft", null, 1, 1, VerwandtenadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerwandtenadoptionType_AngabenZuKindernDerFamilie(), this.getAngabenZuKindernDerFamilieType(), null, "angabenZuKindernDerFamilie", null, 0, -1, VerwandtenadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerwandtenadoptionType_WeiterePersonenImHauhalt(), this.getWeiterePersonenImHauhaltType(), null, "weiterePersonenImHauhalt", null, 0, -1, VerwandtenadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerwandtenadoptionType_AbgebenderElternteil(), this.getAbgebenderElternteilType(), null, "abgebenderElternteil", null, 1, 2, VerwandtenadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerwandtenadoptionType_Nachweise(), this.getNachweisType(), null, "nachweise", null, 0, -1, VerwandtenadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerwandtenadoptionType_DatenschutzDerFachbehoerde(), this.getDatenschutzUndEinwilligungType(), null, "datenschutzDerFachbehoerde", null, 1, -1, VerwandtenadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerwandtenadoptionType_Signatur(), this.getSignaturType(), null, "signatur", null, 1, 1, VerwandtenadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerwandtenadoptionType_DigitalerRueckkanal(), this.getDigitalerRueckkanalType(), null, "digitalerRueckkanal", null, 0, 1, VerwandtenadoptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weiterePersonenImHauhaltTypeEClass, WeiterePersonenImHauhaltType.class, "WeiterePersonenImHauhaltType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWeiterePersonenImHauhaltType_Personendaten(), this.getPersonendatenType(), null, "personendaten", null, 1, 1, WeiterePersonenImHauhaltType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeiterePersonenImHauhaltType_BeziehungZurPerson(), theDIN913792204Package.getDatatypeC(), "beziehungZurPerson", null, 0, 1, WeiterePersonenImHauhaltType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeiterePersonenImHauhaltType_Geburt(), theBaukastenPackage.getGeburtOptionalType(), null, "geburt", null, 0, 1, WeiterePersonenImHauhaltType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getDocumentRoot_AdoptionundpflegekinderAdoption0901(),
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <rechtsgrundlage>Rechtsgrundlage</rechtsgrundlage>\n           \n"
		   });
		addAnnotation
		  (getDocumentRoot_AdoptionundpflegekinderPflegekinder0902(),
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
		  (abgebenderElternteilTypeEClass,
		   source,
		   new String[] {
			   "name", "AbgebenderElternteilType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAbgebenderElternteilType_Elternteil(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "elternteil",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAbgebenderElternteilType_Personendaten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "personendaten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAbgebenderElternteilType_Geburt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAbgebenderElternteilType_Staatsangehoerigkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "staatsangehoerigkeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAbgebenderElternteilType_EinstellungAdoptionsabsicht(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "einstellungAdoptionsabsicht",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAbgebenderElternteilType_Aufenthaltsstatus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aufenthaltsstatus",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAbgebenderElternteilType_ElternteilVerstorben(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "elternteilVerstorben",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (adoptionundpflegekinderAdoption0901TypeEClass,
		   source,
		   new String[] {
			   "name", "adoptionundpflegekinder.adoption.0901_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAdoptionundpflegekinderAdoption0901Type_Kontaktformular(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kontaktformular",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdoptionundpflegekinderAdoption0901Type_NachweiseEinreichen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweiseEinreichen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdoptionundpflegekinderAdoption0901Type_Stiefkindadoption(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "stiefkindadoption",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdoptionundpflegekinderAdoption0901Type_Verwandtenadoption(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "verwandtenadoption",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdoptionundpflegekinderAdoption0901Type_Fremdkindadoption(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "fremdkindadoption",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (adoptionundpflegekinderPflegekinder0902TypeEClass,
		   source,
		   new String[] {
			   "name", "adoptionundpflegekinder.pflegekinder.0902_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAdoptionundpflegekinderPflegekinder0902Type_Kontaktformular(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kontaktformular",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdoptionundpflegekinderPflegekinder0902Type_NachweiseEinreichen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweiseEinreichen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdoptionundpflegekinderPflegekinder0902Type_Pflegeperson(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "pflegeperson",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdoptionundpflegekinderPflegekinder0902Type_SonstigeAntraegeSenden(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sonstigeAntraegeSenden",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdoptionundpflegekinderPflegekinder0902Type_BeitragsuebernahmeUnfallversicherung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "beitragsuebernahmeUnfallversicherung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdoptionundpflegekinderPflegekinder0902Type_AlterssicherungPflegeperson(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "alterssicherungPflegeperson",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdoptionundpflegekinderPflegekinder0902Type_PauschalbetragVollzeitpflege(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "pauschalbetragVollzeitpflege",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (allgemeineAngabenFremdkindadoptionTypeEClass,
		   source,
		   new String[] {
			   "name", "AllgemeineAngabenFremdkindadoptionType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAllgemeineAngabenFremdkindadoptionType_Personendaten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "personendaten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineAngabenFremdkindadoptionType_Geburt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineAngabenFremdkindadoptionType_Staatsangehoerigkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "staatsangehoerigkeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineAngabenFremdkindadoptionType_Religionszugehoerigkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "religionszugehoerigkeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineAngabenFremdkindadoptionType_AktuelleBeruflicheTaetigkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aktuelleBeruflicheTaetigkeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineAngabenFremdkindadoptionType_EinkuenfteAusTaetigkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "einkuenfteAusTaetigkeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineAngabenFremdkindadoptionType_AndereEinkuenfte(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "andereEinkuenfte",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineAngabenFremdkindadoptionType_Schuldverpflichtungen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "schuldverpflichtungen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineAngabenFremdkindadoptionType_Unterhaltsverpflichtungen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "unterhaltsverpflichtungen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineAngabenFremdkindadoptionType_MonatlicheFixkostenUnterkunft(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "monatlicheFixkostenUnterkunft",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineAngabenFremdkindadoptionType_Aufenthaltsstatus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aufenthaltsstatus",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineAngabenFremdkindadoptionType_AktuellerFamilienstand(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aktuellerFamilienstand",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineAngabenFremdkindadoptionType_Geschlecht(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geschlecht",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineAngabenFremdkindadoptionType_BereitsVerheiratet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bereitsVerheiratet",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineAngabenFremdkindadoptionType_UmfangVerheiratet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "umfangVerheiratet",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (allgemeineAngabenPflegeTypeEClass,
		   source,
		   new String[] {
			   "name", "AllgemeineAngabenPflegeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAllgemeineAngabenPflegeType_Wochenstunden(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wochenstunden",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineAngabenPflegeType_Anschrift(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anschrift",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineAngabenPflegeType_Geschlecht(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geschlecht",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (allgemeineAngabenStiefkindadoptionTypeEClass,
		   source,
		   new String[] {
			   "name", "AllgemeineAngabenStiefkindadoptionType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAllgemeineAngabenStiefkindadoptionType_KontaktZuLeiblicherFamilie(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kontaktZuLeiblicherFamilie",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineAngabenStiefkindadoptionType_ErlaeuterungKontaktZuLeiblicherFamilie(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "erlaeuterungKontaktZuLeiblicherFamilie",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineAngabenStiefkindadoptionType_Personensorgerecht(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "personensorgerecht",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineAngabenStiefkindadoptionType_PersonensorgerechtBeiSonstige(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "personensorgerechtBeiSonstige",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineAngabenStiefkindadoptionType_GeschpraechUeberAdoption(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geschpraechUeberAdoption",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineAngabenStiefkindadoptionType_ReaktionKindGespraech(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "reaktionKindGespraech",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineAngabenStiefkindadoptionType_KontaktJugendamt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kontaktJugendamt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineAngabenStiefkindadoptionType_ArtKontaktJugendamt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "artKontaktJugendamt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineAngabenStiefkindadoptionType_GerichtlicheRegelung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "gerichtlicheRegelung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (allgemeineAngabenVerwandtenadoptionTypeEClass,
		   source,
		   new String[] {
			   "name", "AllgemeineAngabenVerwandtenadoptionType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAllgemeineAngabenVerwandtenadoptionType_HerkunftBekannt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "herkunftBekannt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineAngabenVerwandtenadoptionType_KontaktZuLeiblicherFamilie(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kontaktZuLeiblicherFamilie",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineAngabenVerwandtenadoptionType_ErlaeuterungKontaktZuLeiblicherFamilie(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "erlaeuterungKontaktZuLeiblicherFamilie",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineAngabenVerwandtenadoptionType_Personensorgerecht(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "personensorgerecht",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineAngabenVerwandtenadoptionType_PersonensorgerechtBeiSonstige(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "personensorgerechtBeiSonstige",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineAngabenVerwandtenadoptionType_GeschpraechUeberAdoption(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geschpraechUeberAdoption",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineAngabenVerwandtenadoptionType_ReaktionKindGespraech(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "reaktionKindGespraech",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (alterssicherungPflegepersonTypeEClass,
		   source,
		   new String[] {
			   "name", "AlterssicherungPflegepersonType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAlterssicherungPflegepersonType_DatenschutzUndEinwilligung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "datenschutzUndEinwilligung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAlterssicherungPflegepersonType_AllgemeineAngaben(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "allgemeineAngaben",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAlterssicherungPflegepersonType_AntragdetailsAlterssicherung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "antragdetailsAlterssicherung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAlterssicherungPflegepersonType_Pflegekinder(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "pflegekinder",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAlterssicherungPflegepersonType_Nachweise(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweise",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAlterssicherungPflegepersonType_DatenschutzDerFachbehoerde(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "datenschutzDerFachbehoerde",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAlterssicherungPflegepersonType_Signatur(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signatur",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAlterssicherungPflegepersonType_DigitalerRueckkanal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "digitalerRueckkanal",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (angabenDesZuAdoptierendenKindesTypeEClass,
		   source,
		   new String[] {
			   "name", "AngabenDesZuAdoptierendenKindesType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAngabenDesZuAdoptierendenKindesType_Personendaten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "personendaten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenDesZuAdoptierendenKindesType_Geburt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenDesZuAdoptierendenKindesType_Staatsangehoerigkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "staatsangehoerigkeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenDesZuAdoptierendenKindesType_Religionszugehoerigkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "religionszugehoerigkeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenDesZuAdoptierendenKindesType_AusAuslandGeholt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ausAuslandGeholt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenDesZuAdoptierendenKindesType_Anschrift(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anschrift",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenDesZuAdoptierendenKindesType_Aufenthaltsstatus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aufenthaltsstatus",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (angabenPflegekindTypeEClass,
		   source,
		   new String[] {
			   "name", "AngabenPflegekindType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAngabenPflegekindType_Personendaten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "personendaten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenPflegekindType_Geburt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenPflegekindType_Anschrift(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anschrift",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenPflegekindType_BeginnPflegeverhaeltnis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "beginnPflegeverhaeltnis",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenPflegekindType_Krankenversichert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "krankenversichert",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenPflegekindType_KrankenversichertUeberPflegeperson(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "krankenversichertUeberPflegeperson",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenPflegekindType_SchuleAusbildungsstaette(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "schuleAusbildungsstaette",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenPflegekindType_KlassenstufeAusbildungsjahr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "klassenstufeAusbildungsjahr",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenPflegekindType_EinkommenPflegekind(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "einkommenPflegekind",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (angabenZuKindernDerFamilieTypeEClass,
		   source,
		   new String[] {
			   "name", "AngabenZuKindernDerFamilieType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAngabenZuKindernDerFamilieType_Personendaten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "personendaten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZuKindernDerFamilieType_Geburt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZuKindernDerFamilieType_VerhaeltnisKind(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "verhaeltnisKind",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZuKindernDerFamilieType_ElternteilDesKindes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "elternteilDesKindes",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZuKindernDerFamilieType_KindWohnhaftHaushalt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kindWohnhaftHaushalt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZuKindernDerFamilieType_KindWohnhaftAlterntive(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kindWohnhaftAlterntive",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZuKindernDerFamilieType_KindVerstorben(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kindVerstorben",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (angabenZurPartnerschaftTypeEClass,
		   source,
		   new String[] {
			   "name", "AngabenZurPartnerschaftType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAngabenZurPartnerschaftType_DauerPartnerschaft(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dauerPartnerschaft",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZurPartnerschaftType_DauerGemeinsamerHaushalt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dauerGemeinsamerHaushalt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZurPartnerschaftType_VerheiratetOderLebenspartnerschaft(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "verheiratetOderLebenspartnerschaft",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZurPartnerschaftType_DauerVerheiratetOderLebenspartnerschaft(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dauerVerheiratetOderLebenspartnerschaft",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZurPartnerschaftType_GespraechUeberAdoption(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "gespraechUeberAdoption",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZurPartnerschaftType_MeinungFamilieUndFreunde(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "meinungFamilieUndFreunde",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZurPartnerschaftType_Anschrift(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anschrift",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZurPartnerschaftType_WohnverhaeltnisseAnzahlZimmer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wohnverhaeltnisseAnzahlZimmer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZurPartnerschaftType_WohnverhaeltnisseWohnflaeche(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wohnverhaeltnisseWohnflaeche",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZurPartnerschaftType_MieteOderEigentum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "mieteOderEigentum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZurPartnerschaftType_Garten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "garten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZurPartnerschaftType_Kinderzimmer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kinderzimmer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZurPartnerschaftType_Haustiere(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "haustiere",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (anliegenTypeEClass,
		   source,
		   new String[] {
			   "name", "AnliegenType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAnliegenType_WunschBeratung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wunschBeratung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnliegenType_Kommentar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kommentar",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (annehmenderElternteilTypeEClass,
		   source,
		   new String[] {
			   "name", "AnnehmenderElternteilType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAnnehmenderElternteilType_Personendaten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "personendaten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnnehmenderElternteilType_Staatsangehoerigkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "staatsangehoerigkeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnnehmenderElternteilType_Geburt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnnehmenderElternteilType_AktuelleBeruflicheTaetigkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aktuelleBeruflicheTaetigkeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnnehmenderElternteilType_GruendeMotiveFuerAdoption(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "gruendeMotiveFuerAdoption",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnnehmenderElternteilType_VeraenderungDurchAdoption(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "veraenderungDurchAdoption",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnnehmenderElternteilType_EinkuenfteAusTaetigkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "einkuenfteAusTaetigkeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnnehmenderElternteilType_AndereEinkuenfte(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "andereEinkuenfte",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnnehmenderElternteilType_Schuldverpflichtungen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "schuldverpflichtungen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnnehmenderElternteilType_Unterhaltsverpflichtungen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "unterhaltsverpflichtungen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnnehmenderElternteilType_MonatlicheFixkostenUnterkunft(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "monatlicheFixkostenUnterkunft",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnnehmenderElternteilType_Religionszugehoerigkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "religionszugehoerigkeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnnehmenderElternteilType_Aufenthaltsstatus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aufenthaltsstatus",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnnehmenderElternteilType_Geschlecht(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geschlecht",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (antragdetailsAlterssicherungTypeEClass,
		   source,
		   new String[] {
			   "name", "AntragdetailsAlterssicherungType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAntragdetailsAlterssicherungType_BeantragungZuschussAlterssicherung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "beantragungZuschussAlterssicherung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragdetailsAlterssicherungType_Zuschuesse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zuschuesse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragdetailsAlterssicherungType_HoeheZuschuesse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hoeheZuschuesse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragdetailsAlterssicherungType_VonAndererStelle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "vonAndererStelle",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragdetailsAlterssicherungType_ArtHoeheAbsicherung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "artHoeheAbsicherung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragdetailsAlterssicherungType_AlleinigePflegeperson(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "alleinigePflegeperson",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragdetailsAlterssicherungType_Hauptpflegeperson(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hauptpflegeperson",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (antragdetailsTypeEClass,
		   source,
		   new String[] {
			   "name", "AntragdetailsType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAntragdetailsType_Antrag(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "antrag",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragdetailsType_Information(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "information",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (antragdetailsUnfallversicherungTypeEClass,
		   source,
		   new String[] {
			   "name", "AntragdetailsUnfallversicherungType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAntragdetailsUnfallversicherungType_BeantragungKostenUnfallversicherung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "beantragungKostenUnfallversicherung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragdetailsUnfallversicherungType_Zuschuesse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zuschuesse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragdetailsUnfallversicherungType_HoeheZuschuesse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hoeheZuschuesse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (antragstellerTypeEClass,
		   source,
		   new String[] {
			   "name", "AntragstellerType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAntragstellerType_Personendaten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "personendaten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragstellerType_Fallnummer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "fallnummer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragstellerType_Antragsdatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "antragsdatum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragstellerType_Geburt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (beitragsuebernahmeUnfallversicherungTypeEClass,
		   source,
		   new String[] {
			   "name", "BeitragsuebernahmeUnfallversicherungType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBeitragsuebernahmeUnfallversicherungType_DatenschutzUndEinwilligung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "datenschutzUndEinwilligung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeitragsuebernahmeUnfallversicherungType_AllgemeineAngaben(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "allgemeineAngaben",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeitragsuebernahmeUnfallversicherungType_AntragdetailsUnfallversicherung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "antragdetailsUnfallversicherung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeitragsuebernahmeUnfallversicherungType_Pflegekinder(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "pflegekinder",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeitragsuebernahmeUnfallversicherungType_Nachweise(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweise",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeitragsuebernahmeUnfallversicherungType_DatenschutzDerFachbehoerde(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "datenschutzDerFachbehoerde",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeitragsuebernahmeUnfallversicherungType_Signatur(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signatur",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeitragsuebernahmeUnfallversicherungType_DigitalerRueckkanal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "digitalerRueckkanal",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (bestimmtesKindTypeEClass,
		   source,
		   new String[] {
			   "name", "BestimmtesKindType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBestimmtesKindType_Personendaten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "personendaten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBestimmtesKindType_Geburt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBestimmtesKindType_ZustaendigesJugendamt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zustaendigesJugendamt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (datenschutzUndEinwilligungTypeEClass,
		   source,
		   new String[] {
			   "name", "DatenschutzUndEinwilligungType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDatenschutzUndEinwilligungType_AllgemeineDatenschutzerklaerung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "allgemeineDatenschutzerklaerung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDatenschutzUndEinwilligungType_KenntnissnahmeDatenschutzerklaerung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kenntnissnahmeDatenschutzerklaerung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (digitalerRueckkanalTypeEClass,
		   source,
		   new String[] {
			   "name", "DigitalerRueckkanalType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDigitalerRueckkanalType_PostfachUUID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "postfachUUID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDigitalerRueckkanalType_EinverstaendnisDigitalerRueckkanal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "einverstaendnisDigitalerRueckkanal",
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
		  (getDocumentRoot_AdoptionundpflegekinderAdoption0901(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "adoptionundpflegekinder.adoption.0901",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_AdoptionundpflegekinderPflegekinder0902(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "adoptionundpflegekinder.pflegekinder.0902",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (einkommenPflegekindTypeEClass,
		   source,
		   new String[] {
			   "name", "EinkommenPflegekindType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEinkommenPflegekindType_EinkommenAb(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "einkommenAb",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEinkommenPflegekindType_HoeheEinkommen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hoeheEinkommen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEinkommenPflegekindType_BezugKindergeldAb(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bezugKindergeldAb",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEinkommenPflegekindType_HoeheKindergeld(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hoeheKindergeld",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEinkommenPflegekindType_ArtDesEinkommens(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "artDesEinkommens",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEinkommenPflegekindType_SonstigesEinkommen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sonstigesEinkommen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEinkommenPflegekindType_ZustaendigeFamilienkasse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zustaendigeFamilienkasse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (einkommenUndWohnenTypeEClass,
		   source,
		   new String[] {
			   "name", "EinkommenUndWohnenType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEinkommenUndWohnenType_EinkuenfteAusTaetigkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "einkuenfteAusTaetigkeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEinkommenUndWohnenType_AndereEinkuenfte(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "andereEinkuenfte",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEinkommenUndWohnenType_Schuldverpflichtungen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "schuldverpflichtungen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEinkommenUndWohnenType_Unterhaltsverpflichtungen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "unterhaltsverpflichtungen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEinkommenUndWohnenType_MonatlicheFixkostenUnterkunft(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "monatlicheFixkostenUnterkunft",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEinkommenUndWohnenType_WohnverhaeltnisseAnzahlZimmer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wohnverhaeltnisseAnzahlZimmer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEinkommenUndWohnenType_WohnverhaeltnisseWohnflaeche(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wohnverhaeltnisseWohnflaeche",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (fremdkindadoptionTypeEClass,
		   source,
		   new String[] {
			   "name", "FremdkindadoptionType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFremdkindadoptionType_Beratungscode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "beratungscode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFremdkindadoptionType_AllgemeineAngaben(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "allgemeineAngaben",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFremdkindadoptionType_AngabenZurPartnerschaft(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenZurPartnerschaft",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFremdkindadoptionType_AngabenZuKindernDerFamilie(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenZuKindernDerFamilie",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFremdkindadoptionType_WeiterePersonenImHauhalt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "weiterePersonenImHauhalt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFremdkindadoptionType_AuseinandersetzungThemaAdoption(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "auseinandersetzungThemaAdoption",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFremdkindadoptionType_Nachweise(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweise",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFremdkindadoptionType_DatenschutzDerFachbehoerde(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "datenschutzDerFachbehoerde",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFremdkindadoptionType_Signatur(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signatur",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFremdkindadoptionType_DigitalerRueckkanal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "digitalerRueckkanal",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFremdkindadoptionType_DatenschutzUndEinwilligung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "datenschutzUndEinwilligung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFremdkindadoptionType_AertzlicheBehandlung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aertzlicheBehandlung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (kontakformularTypeEClass,
		   source,
		   new String[] {
			   "name", "KontakformularType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKontakformularType_DatenschutzUndEinwilligung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "datenschutzUndEinwilligung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKontakformularType_Personendaten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "personendaten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKontakformularType_Anschrift(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anschrift",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKontakformularType_Anliegen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anliegen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKontakformularType_DatenschutzDerFachbehoerde(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "datenschutzDerFachbehoerde",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKontakformularType_DigitalerRueckkanal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "digitalerRueckkanal",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (kontoinformationenTypeEClass,
		   source,
		   new String[] {
			   "name", "KontoinformationenType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKontoinformationenType_BeantragungJugendhilfe(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "beantragungJugendhilfe",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKontoinformationenType_Bankverbindung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bankverbindung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (moeglichkeitenUndGrenzenTypeEClass,
		   source,
		   new String[] {
			   "name", "MoeglichkeitenUndGrenzenType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMoeglichkeitenUndGrenzenType_ZutrauenKindJedenAlters(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zutrauenKindJedenAlters",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMoeglichkeitenUndGrenzenType_ZutrauenKindAltersangabe(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zutrauenKindAltersangabe",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMoeglichkeitenUndGrenzenType_ZutrauenKindBeeintraechtigung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zutrauenKindBeeintraechtigung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMoeglichkeitenUndGrenzenType_ZutrauenKindKoerperlicheBeeintraechtigung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zutrauenKindKoerperlicheBeeintraechtigung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMoeglichkeitenUndGrenzenType_ZutrauenKindGeistigerBeeintraechtigung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zutrauenKindGeistigerBeeintraechtigung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMoeglichkeitenUndGrenzenType_ZutrauenKindPsychischerBeeintraechtigung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zutrauenKindPsychischerBeeintraechtigung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nachweiseEinreichenTypeEClass,
		   source,
		   new String[] {
			   "name", "NachweiseEinreichenType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNachweiseEinreichenType_DatenschutzUndEinwilligung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "datenschutzUndEinwilligung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweiseEinreichenType_Antragsteller(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "antragsteller",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweiseEinreichenType_Nachweise(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweise",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweiseEinreichenType_DatenschutzDerFachbehoerde(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "datenschutzDerFachbehoerde",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweiseEinreichenType_DigitalerRueckkanal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "digitalerRueckkanal",
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
		  (getNachweisType_Beschreibung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "beschreibung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (pauschalbetragGezahltVonTypeEClass,
		   source,
		   new String[] {
			   "name", "PauschalbetragGezahltVonType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPauschalbetragGezahltVonType_Stadt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "stadt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPauschalbetragGezahltVonType_BezirkStadtteil(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bezirkStadtteil",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPauschalbetragGezahltVonType_AktenzeichenWirtschaftlicheJugendhilfe(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aktenzeichenWirtschaftlicheJugendhilfe",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (pauschalbetragVollzeitpflegeTypeEClass,
		   source,
		   new String[] {
			   "name", "PauschalbetragVollzeitpflegeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPauschalbetragVollzeitpflegeType_DatenschutzUndEinwilligung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "datenschutzUndEinwilligung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPauschalbetragVollzeitpflegeType_AngabenPflegekind(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenPflegekind",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPauschalbetragVollzeitpflegeType_Pflegeperson(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "pflegeperson",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPauschalbetragVollzeitpflegeType_Kinder(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kinder",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPauschalbetragVollzeitpflegeType_Kontoinformationen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kontoinformationen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPauschalbetragVollzeitpflegeType_Nachweise(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweise",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPauschalbetragVollzeitpflegeType_DatenschutzDerFachbehoerde(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "datenschutzDerFachbehoerde",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPauschalbetragVollzeitpflegeType_Signatur(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signatur",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPauschalbetragVollzeitpflegeType_DigitalerRueckkanal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "digitalerRueckkanal",
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
		  (getPersonendatenType_Kontakt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kontakt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (pflegekindBasisTypeEClass,
		   source,
		   new String[] {
			   "name", "PflegekindBasisType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPflegekindBasisType_Personendaten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "personendaten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPflegekindBasisType_Geburt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (pflegekindTypeEClass,
		   source,
		   new String[] {
			   "name", "PflegekindType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPflegekindType_InPflegeSeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "inPflegeSeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPflegekindType_Pflegeform(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "pflegeform",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPflegekindType_PauschalbetragGezahltVon(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "pauschalbetragGezahltVon",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (pflegepersonBasisTypeEClass,
		   source,
		   new String[] {
			   "name", "PflegepersonBasisType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPflegepersonBasisType_Personendaten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "personendaten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPflegepersonBasisType_Geburt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPflegepersonBasisType_Steueridentifikationsnummer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "steueridentifikationsnummer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (pflegepersonTypeEClass,
		   source,
		   new String[] {
			   "name", "PflegepersonType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPflegepersonType_Beratungscode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "beratungscode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPflegepersonType_DatenschutzUndEinwilligung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "datenschutzUndEinwilligung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPflegepersonType_AllgemeineAngaben(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "allgemeineAngaben",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPflegepersonType_EinkommenUndWohnen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "einkommenUndWohnen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPflegepersonType_AngabenZuKindernDerFamilie(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenZuKindernDerFamilie",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPflegepersonType_WeiterePersonenImHauhalt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "weiterePersonenImHauhalt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPflegepersonType_BestimmtesKind(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bestimmtesKind",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPflegepersonType_MoeglichkeitenUndGrenzen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "moeglichkeitenUndGrenzen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPflegepersonType_Nachweise(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweise",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPflegepersonType_DatenschutzDerFachbehoerde(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "datenschutzDerFachbehoerde",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPflegepersonType_Signatur(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signatur",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPflegepersonType_DigitalerRueckkanal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "digitalerRueckkanal",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (signaturTypeEClass,
		   source,
		   new String[] {
			   "name", "SignaturType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSignaturType_ElektronischSignieren(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "elektronischSignieren",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSignaturType_Anlage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anlage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (sonstigeAntraegeSendenTypeEClass,
		   source,
		   new String[] {
			   "name", "SonstigeAntraegeSendenType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSonstigeAntraegeSendenType_DatenschutzUndEinwilligung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "datenschutzUndEinwilligung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSonstigeAntraegeSendenType_AllgemeineAngaben(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "allgemeineAngaben",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSonstigeAntraegeSendenType_Antragdetails(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "antragdetails",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSonstigeAntraegeSendenType_Pflegekinder(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "pflegekinder",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSonstigeAntraegeSendenType_Nachweise(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweise",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSonstigeAntraegeSendenType_DatenschutzDerFachbehoerde(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "datenschutzDerFachbehoerde",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSonstigeAntraegeSendenType_Signatur(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signatur",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSonstigeAntraegeSendenType_DigitalerRueckkanal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "digitalerRueckkanal",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (stiefkindadoptionTypeEClass,
		   source,
		   new String[] {
			   "name", "StiefkindadoptionType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStiefkindadoptionType_Beratungscode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "beratungscode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStiefkindadoptionType_DatenschutzUndEinwilligung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "datenschutzUndEinwilligung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStiefkindadoptionType_AngabenDesZuAdoptierendenKindes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenDesZuAdoptierendenKindes",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStiefkindadoptionType_AllgemeineAngaben(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "allgemeineAngaben",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStiefkindadoptionType_VerbleibenderSorgeberechtigterElternteil(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "verbleibenderSorgeberechtigterElternteil",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStiefkindadoptionType_AnnehmenderElternteil(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "annehmenderElternteil",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStiefkindadoptionType_AngabenZurPartnerschaft(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenZurPartnerschaft",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStiefkindadoptionType_AngabenZuKindernDerFamilie(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenZuKindernDerFamilie",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStiefkindadoptionType_WeiterePersonenImHauhalt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "weiterePersonenImHauhalt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStiefkindadoptionType_AbgebenderElternteil(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "abgebenderElternteil",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStiefkindadoptionType_Nachweise(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweise",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStiefkindadoptionType_DatenschutzDerFachbehoerde(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "datenschutzDerFachbehoerde",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStiefkindadoptionType_Signatur(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signatur",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStiefkindadoptionType_DigitalerRueckkanal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "digitalerRueckkanal",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (verbleibenderSorgeberechtigterElternteilTypeEClass,
		   source,
		   new String[] {
			   "name", "VerbleibenderSorgeberechtigterElternteilType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getVerbleibenderSorgeberechtigterElternteilType_Personendaten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "personendaten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVerbleibenderSorgeberechtigterElternteilType_Staatsangehoerigkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "staatsangehoerigkeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVerbleibenderSorgeberechtigterElternteilType_Geburt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVerbleibenderSorgeberechtigterElternteilType_EinkuenfteAusTaetigkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "einkuenfteAusTaetigkeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVerbleibenderSorgeberechtigterElternteilType_AndereEinkuenfte(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "andereEinkuenfte",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVerbleibenderSorgeberechtigterElternteilType_Schuldverpflichtungen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "schuldverpflichtungen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVerbleibenderSorgeberechtigterElternteilType_Unterhaltsverpflichtungen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "unterhaltsverpflichtungen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVerbleibenderSorgeberechtigterElternteilType_MonatlicheFixkostenUnterkunft(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "monatlicheFixkostenUnterkunft",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVerbleibenderSorgeberechtigterElternteilType_Aufenthaltsstatus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aufenthaltsstatus",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVerbleibenderSorgeberechtigterElternteilType_Geschlecht(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geschlecht",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (verwandtenadoptionTypeEClass,
		   source,
		   new String[] {
			   "name", "VerwandtenadoptionType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getVerwandtenadoptionType_Beratungscode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "beratungscode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVerwandtenadoptionType_DatenschutzUndEinwilligung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "datenschutzUndEinwilligung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVerwandtenadoptionType_AngabenDesZuAdoptierendenKindes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenDesZuAdoptierendenKindes",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVerwandtenadoptionType_AllgemeineAngaben(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "allgemeineAngaben",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVerwandtenadoptionType_AnnehmenderElternteil(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "annehmenderElternteil",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVerwandtenadoptionType_AngabenZurPartnerschaft(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenZurPartnerschaft",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVerwandtenadoptionType_AngabenZuKindernDerFamilie(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenZuKindernDerFamilie",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVerwandtenadoptionType_WeiterePersonenImHauhalt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "weiterePersonenImHauhalt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVerwandtenadoptionType_AbgebenderElternteil(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "abgebenderElternteil",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVerwandtenadoptionType_Nachweise(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweise",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVerwandtenadoptionType_DatenschutzDerFachbehoerde(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "datenschutzDerFachbehoerde",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVerwandtenadoptionType_Signatur(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signatur",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVerwandtenadoptionType_DigitalerRueckkanal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "digitalerRueckkanal",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (weiterePersonenImHauhaltTypeEClass,
		   source,
		   new String[] {
			   "name", "WeiterePersonenImHauhaltType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getWeiterePersonenImHauhaltType_Personendaten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "personendaten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWeiterePersonenImHauhaltType_BeziehungZurPerson(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "beziehungZurPerson",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWeiterePersonenImHauhaltType_Geburt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburt",
			   "namespace", "##targetNamespace"
		   });
	}

} //AdoptionPackageImpl
