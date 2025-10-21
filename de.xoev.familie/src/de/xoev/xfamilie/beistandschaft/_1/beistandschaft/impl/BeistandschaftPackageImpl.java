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
package de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl;

import de.xoev.kosit.datentyp._202204.din91379.DIN913792204Package;

import de.xoev.schemata.code.code.Code10Package;

import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage;

import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl;

import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage;

import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeineNachrichtenPackageImpl;

import de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage;

import de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl;

import de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindBeendigungType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.Anliegenbeistandschaft;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.AnliegensklaerungBSSType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilBeendigungType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftFactory;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.Bezugoeffentlicherleistungen;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeAnliegenBeistandschaftType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeBezugOeffentlicherLeistungenType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeEinkommenAndererElternteilType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeInhaberElterlicheSorgeType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeUnterhaltstitelBestehtType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeZahlungsartBSSType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.DocumentRoot;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.Einkommenandererelternteil;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.GeburtType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.Inhaberelterlichesorge;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.NachweisType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.NachweiseBSSType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.Unterhaltstitelbesteht;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereKinderType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.Zahlungsartbss;

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
public class BeistandschaftPackageImpl extends EPackageImpl implements BeistandschaftPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andererElternteilTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angabenZumKindBeendigungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angabenZumKindTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angabenZumUnterhaltTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anliegensklaerungBSSTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass antragstellenderElternteilBeendigungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass antragstellenderElternteilTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ausbildungUndEinkuenfteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beistandschaftAntrag0601TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beistandschaftBeendigung0604TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeAnliegenBeistandschaftTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeBezugOeffentlicherLeistungenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeEinkommenAndererElternteilTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeInhaberElterlicheSorgeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeUnterhaltstitelBestehtTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeZahlungsartBSSTypeEClass = null;

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
	private EClass geburtTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nachweiseBSSTypeEClass = null;

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
	private EClass weitereAngabenZumAnderenElternteilTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weitereKinderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum anliegenbeistandschaftEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bezugoeffentlicherleistungenEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum einkommenandererelternteilEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum inhaberelterlichesorgeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unterhaltstitelbestehtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum zahlungsartbssEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType anliegenbeistandschaftObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezugoeffentlicherleistungenObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType einkommenandererelternteilObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType inhaberelterlichesorgeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unterhaltstitelbestehtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType zahlungsartbssObjectEDataType = null;

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
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BeistandschaftPackageImpl() {
		super(eNS_URI, BeistandschaftFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BeistandschaftPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BeistandschaftPackage init() {
		if (isInited) return (BeistandschaftPackage)EPackage.Registry.INSTANCE.getEPackage(BeistandschaftPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBeistandschaftPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BeistandschaftPackageImpl theBeistandschaftPackage = registeredBeistandschaftPackage instanceof BeistandschaftPackageImpl ? (BeistandschaftPackageImpl)registeredBeistandschaftPackage : new BeistandschaftPackageImpl();

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
		theBeistandschaftPackage.createPackageContents();
		theAdoptionPackage.createPackageContents();
		theBaukastenPackage.createPackageContents();
		theAllgemeineNachrichtenPackage.createPackageContents();
		theDSRVPackage.createPackageContents();
		theGeburtPackage.createPackageContents();
		theErziehungshilfePackage.createPackageContents();
		theKinderwunschPackage.createPackageContents();
		theMutterschaftsgeldPackage.createPackageContents();

		// Initialize created meta-data
		theBeistandschaftPackage.initializePackageContents();
		theAdoptionPackage.initializePackageContents();
		theBaukastenPackage.initializePackageContents();
		theAllgemeineNachrichtenPackage.initializePackageContents();
		theDSRVPackage.initializePackageContents();
		theGeburtPackage.initializePackageContents();
		theErziehungshilfePackage.initializePackageContents();
		theKinderwunschPackage.initializePackageContents();
		theMutterschaftsgeldPackage.initializePackageContents();

		// Fix loaded packages
		theElterngeldPackage.fixPackageContents();
		theUnterhaltsvorschussPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theBeistandschaftPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BeistandschaftPackage.eNS_URI, theBeistandschaftPackage);
		return theBeistandschaftPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAndererElternteilType() {
		return andererElternteilTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAndererElternteilType_AngabenZumAnderenElternteil() {
		return (EAttribute)andererElternteilTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAndererElternteilType_Namen() {
		return (EReference)andererElternteilTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAndererElternteilType_Geburtsdaten() {
		return (EReference)andererElternteilTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAndererElternteilType_Familienstand() {
		return (EReference)andererElternteilTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAndererElternteilType_AngabenZurAdresse() {
		return (EAttribute)andererElternteilTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAndererElternteilType_Adresse() {
		return (EReference)andererElternteilTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAndererElternteilType_Erreichbarkeit() {
		return (EReference)andererElternteilTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAndererElternteilType_AnerkennungVaterschaft() {
		return (EAttribute)andererElternteilTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAndererElternteilType_WeitereAngabenzumAnderenElternteil() {
		return (EReference)andererElternteilTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAngabenZumKindBeendigungType() {
		return angabenZumKindBeendigungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZumKindBeendigungType_NameDesKindes() {
		return (EReference)angabenZumKindBeendigungTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZumKindBeendigungType_Geburtsdaten() {
		return (EReference)angabenZumKindBeendigungTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZumKindBeendigungType_AnschriftStimmtMitAntragstellendemElternteilUeberein() {
		return (EAttribute)angabenZumKindBeendigungTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZumKindBeendigungType_KindAdresse() {
		return (EReference)angabenZumKindBeendigungTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZumKindBeendigungType_AktenzeichenVorgangsnummer() {
		return (EAttribute)angabenZumKindBeendigungTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAngabenZumKindType() {
		return angabenZumKindTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZumKindType_KindBereitsGeboren() {
		return (EAttribute)angabenZumKindTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZumKindType_VoraussichtlicherEntbindungstermin() {
		return (EAttribute)angabenZumKindTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZumKindType_NameDesKindes() {
		return (EReference)angabenZumKindTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZumKindType_Geburtsdaten() {
		return (EReference)angabenZumKindTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZumKindType_Geburtenregisternummer() {
		return (EAttribute)angabenZumKindTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZumKindType_KindWohnhaftBei() {
		return (EReference)angabenZumKindTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZumKindType_KindLebtBeiSonstige() {
		return (EAttribute)angabenZumKindTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZumKindType_AusbildungUndEinkuenfte() {
		return (EReference)angabenZumKindTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZumKindType_WeitereKinderImHaushalt() {
		return (EAttribute)angabenZumKindTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZumKindType_WeitereKinder() {
		return (EReference)angabenZumKindTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAngabenZumUnterhaltType() {
		return angabenZumUnterhaltTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZumUnterhaltType_AngabenZumUnterhaltstitel() {
		return (EReference)angabenZumUnterhaltTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZumUnterhaltType_BemuehungUnterhaltszahlung() {
		return (EAttribute)angabenZumUnterhaltTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZumUnterhaltType_BisherigeBemuehungen() {
		return (EAttribute)angabenZumUnterhaltTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZumUnterhaltType_ZahltBereits() {
		return (EAttribute)angabenZumUnterhaltTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZumUnterhaltType_HoeheZahlung() {
		return (EAttribute)angabenZumUnterhaltTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZumUnterhaltType_LetzteZahlungAm() {
		return (EAttribute)angabenZumUnterhaltTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZumUnterhaltType_RegelmaessigeZahlung() {
		return (EAttribute)angabenZumUnterhaltTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZumUnterhaltType_AngabenZurZahlung() {
		return (EAttribute)angabenZumUnterhaltTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZumUnterhaltType_GeltendmachungUnterhaltsrueckstaende() {
		return (EAttribute)angabenZumUnterhaltTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZumUnterhaltType_AngabeUnterhaltsrueckstaende() {
		return (EAttribute)angabenZumUnterhaltTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZumUnterhaltType_FreiwilligerVerzichtAufUnterhalt() {
		return (EAttribute)angabenZumUnterhaltTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZumUnterhaltType_UnterhaltVerzichtZeitraum() {
		return (EAttribute)angabenZumUnterhaltTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZumUnterhaltType_Zahlung() {
		return (EReference)angabenZumUnterhaltTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZumUnterhaltType_BankverbindungZahlungJugendamt() {
		return (EReference)angabenZumUnterhaltTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZumUnterhaltType_BankverbindungDirektzahlung() {
		return (EReference)angabenZumUnterhaltTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnliegensklaerungBSSType() {
		return anliegensklaerungBSSTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnliegensklaerungBSSType_AnliegenBeistandschaft() {
		return (EReference)anliegensklaerungBSSTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnliegensklaerungBSSType_VaterschaftAnerkannt() {
		return (EAttribute)anliegensklaerungBSSTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnliegensklaerungBSSType_InhaberElterlicheSorge() {
		return (EReference)anliegensklaerungBSSTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAntragstellenderElternteilBeendigungType() {
		return antragstellenderElternteilBeendigungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilBeendigungType_Namen() {
		return (EReference)antragstellenderElternteilBeendigungTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilBeendigungType_Geburtsdaten() {
		return (EReference)antragstellenderElternteilBeendigungTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilBeendigungType_Adresse() {
		return (EReference)antragstellenderElternteilBeendigungTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAntragstellenderElternteilBeendigungType_AbweichendeAdresse() {
		return (EAttribute)antragstellenderElternteilBeendigungTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilBeendigungType_AbweichendeAdressePerso() {
		return (EReference)antragstellenderElternteilBeendigungTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilBeendigungType_AbweichendeAdresseNachweis() {
		return (EReference)antragstellenderElternteilBeendigungTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAntragstellenderElternteilType() {
		return antragstellenderElternteilTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilType_Namen() {
		return (EReference)antragstellenderElternteilTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilType_Geburtsdaten() {
		return (EReference)antragstellenderElternteilTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilType_Familienstand() {
		return (EReference)antragstellenderElternteilTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilType_Adresse() {
		return (EReference)antragstellenderElternteilTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAntragstellenderElternteilType_AbweichendeAdresse() {
		return (EAttribute)antragstellenderElternteilTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilType_AbweichendeAdressePerso() {
		return (EReference)antragstellenderElternteilTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilType_Erreichbarkeit() {
		return (EReference)antragstellenderElternteilTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilType_OeffentlicheLeistungen() {
		return (EReference)antragstellenderElternteilTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAntragstellenderElternteilType_SonstigeLeistungenBeschreibung() {
		return (EAttribute)antragstellenderElternteilTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAusbildungUndEinkuenfteType() {
		return ausbildungUndEinkuenfteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAusbildungUndEinkuenfteType_KindInAusbildung() {
		return (EAttribute)ausbildungUndEinkuenfteTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAusbildungUndEinkuenfteType_Ausbildungsjahr() {
		return (EAttribute)ausbildungUndEinkuenfteTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAusbildungUndEinkuenfteType_EinkuenfteKind() {
		return (EAttribute)ausbildungUndEinkuenfteTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAusbildungUndEinkuenfteType_EinkuenfteArt() {
		return (EAttribute)ausbildungUndEinkuenfteTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAusbildungUndEinkuenfteType_Kindergeld() {
		return (EAttribute)ausbildungUndEinkuenfteTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBeistandschaftAntrag0601Type() {
		return beistandschaftAntrag0601TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeistandschaftAntrag0601Type_Anliegensklaerung() {
		return (EReference)beistandschaftAntrag0601TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeistandschaftAntrag0601Type_AntragstellenderElternteil() {
		return (EReference)beistandschaftAntrag0601TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeistandschaftAntrag0601Type_AngabenZumKind() {
		return (EReference)beistandschaftAntrag0601TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeistandschaftAntrag0601Type_AngabenZumAnderenElternteil() {
		return (EReference)beistandschaftAntrag0601TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeistandschaftAntrag0601Type_AngabenZumUnterhalt() {
		return (EReference)beistandschaftAntrag0601TypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeistandschaftAntrag0601Type_Nachweise() {
		return (EReference)beistandschaftAntrag0601TypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBeistandschaftAntrag0601Type_WartenAufUnterschrift() {
		return (EAttribute)beistandschaftAntrag0601TypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeistandschaftAntrag0601Type_Dsgvo() {
		return (EReference)beistandschaftAntrag0601TypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBeistandschaftAntrag0601Type_RichtigkeitDerAngaben() {
		return (EAttribute)beistandschaftAntrag0601TypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeistandschaftAntrag0601Type_PdfAntrag() {
		return (EReference)beistandschaftAntrag0601TypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBeistandschaftAntrag0601Type_MerkblattUVG() {
		return (EAttribute)beistandschaftAntrag0601TypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBeistandschaftBeendigung0604Type() {
		return beistandschaftBeendigung0604TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeistandschaftBeendigung0604Type_AntragstellenderElternteilBeendigung() {
		return (EReference)beistandschaftBeendigung0604TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeistandschaftBeendigung0604Type_AngabenZumKindBeendigung() {
		return (EReference)beistandschaftBeendigung0604TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBeistandschaftBeendigung0604Type_BeendigungBestaetigung() {
		return (EAttribute)beistandschaftBeendigung0604TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeistandschaftBeendigung0604Type_Dsgvo() {
		return (EReference)beistandschaftBeendigung0604TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBeistandschaftBeendigung0604Type_RichtigkeitDerAngaben() {
		return (EAttribute)beistandschaftBeendigung0604TypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBeistandschaftBeendigung0604Type_WartenAufUnterschrift() {
		return (EAttribute)beistandschaftBeendigung0604TypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeAnliegenBeistandschaftType() {
		return codeAnliegenBeistandschaftTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeBezugOeffentlicherLeistungenType() {
		return codeBezugOeffentlicherLeistungenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeEinkommenAndererElternteilType() {
		return codeEinkommenAndererElternteilTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeInhaberElterlicheSorgeType() {
		return codeInhaberElterlicheSorgeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeUnterhaltstitelBestehtType() {
		return codeUnterhaltstitelBestehtTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeZahlungsartBSSType() {
		return codeZahlungsartBSSTypeEClass;
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
	public EReference getDocumentRoot_BeistandschaftAntrag0601() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_BeistandschaftBeendigung0604() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeburtType() {
		return geburtTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeburtType_Geburtsort() {
		return (EAttribute)geburtTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeburtType_GeburtsortStaat() {
		return (EReference)geburtTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeburtType_Geburtsdatum() {
		return (EReference)geburtTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNachweiseBSSType() {
		return nachweiseBSSTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachweiseBSSType_Sorgerechtsnachweis() {
		return (EReference)nachweiseBSSTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachweiseBSSType_Identitaetsnachweis() {
		return (EReference)nachweiseBSSTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachweiseBSSType_WeitereNachweise() {
		return (EReference)nachweiseBSSTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachweiseBSSType_NachweisMeldebescheinigung() {
		return (EReference)nachweiseBSSTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachweiseBSSType_Anmerkungen() {
		return (EAttribute)nachweiseBSSTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachweiseBSSType_Dsgvo() {
		return (EReference)nachweiseBSSTypeEClass.getEStructuralFeatures().get(5);
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
	public EAttribute getNachweisType_NachweisBeschreibung() {
		return (EAttribute)nachweisTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachweisType_NachweisDokument() {
		return (EReference)nachweisTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWeitereAngabenZumAnderenElternteilType() {
		return weitereAngabenZumAnderenElternteilTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeitereAngabenZumAnderenElternteilType_Berufausausbildung() {
		return (EAttribute)weitereAngabenZumAnderenElternteilTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeitereAngabenZumAnderenElternteilType_AngabenBerufsausbildung() {
		return (EAttribute)weitereAngabenZumAnderenElternteilTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeitereAngabenZumAnderenElternteilType_Einkommensverhaeltnisse() {
		return (EAttribute)weitereAngabenZumAnderenElternteilTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeitereAngabenZumAnderenElternteilType_Nettoeinkommen() {
		return (EAttribute)weitereAngabenZumAnderenElternteilTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeitereAngabenZumAnderenElternteilType_Einkommen() {
		return (EReference)weitereAngabenZumAnderenElternteilTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeitereAngabenZumAnderenElternteilType_WeitereKinder() {
		return (EAttribute)weitereAngabenZumAnderenElternteilTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeitereAngabenZumAnderenElternteilType_WeitereKinderImHaushalt() {
		return (EAttribute)weitereAngabenZumAnderenElternteilTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeitereAngabenZumAnderenElternteilType_WeitereKinderAngaben() {
		return (EReference)weitereAngabenZumAnderenElternteilTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWeitereKinderType() {
		return weitereKinderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeitereKinderType_Name() {
		return (EReference)weitereKinderTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeitereKinderType_Geburtsdatum() {
		return (EAttribute)weitereKinderTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAnliegenbeistandschaft() {
		return anliegenbeistandschaftEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBezugoeffentlicherleistungen() {
		return bezugoeffentlicherleistungenEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEinkommenandererelternteil() {
		return einkommenandererelternteilEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getInhaberelterlichesorge() {
		return inhaberelterlichesorgeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUnterhaltstitelbesteht() {
		return unterhaltstitelbestehtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getZahlungsartbss() {
		return zahlungsartbssEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAnliegenbeistandschaftObject() {
		return anliegenbeistandschaftObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezugoeffentlicherleistungenObject() {
		return bezugoeffentlicherleistungenObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEinkommenandererelternteilObject() {
		return einkommenandererelternteilObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getInhaberelterlichesorgeObject() {
		return inhaberelterlichesorgeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUnterhaltstitelbestehtObject() {
		return unterhaltstitelbestehtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getZahlungsartbssObject() {
		return zahlungsartbssObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeistandschaftFactory getBeistandschaftFactory() {
		return (BeistandschaftFactory)getEFactoryInstance();
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
		andererElternteilTypeEClass = createEClass(ANDERER_ELTERNTEIL_TYPE);
		createEAttribute(andererElternteilTypeEClass, ANDERER_ELTERNTEIL_TYPE__ANGABEN_ZUM_ANDEREN_ELTERNTEIL);
		createEReference(andererElternteilTypeEClass, ANDERER_ELTERNTEIL_TYPE__NAMEN);
		createEReference(andererElternteilTypeEClass, ANDERER_ELTERNTEIL_TYPE__GEBURTSDATEN);
		createEReference(andererElternteilTypeEClass, ANDERER_ELTERNTEIL_TYPE__FAMILIENSTAND);
		createEAttribute(andererElternteilTypeEClass, ANDERER_ELTERNTEIL_TYPE__ANGABEN_ZUR_ADRESSE);
		createEReference(andererElternteilTypeEClass, ANDERER_ELTERNTEIL_TYPE__ADRESSE);
		createEReference(andererElternteilTypeEClass, ANDERER_ELTERNTEIL_TYPE__ERREICHBARKEIT);
		createEAttribute(andererElternteilTypeEClass, ANDERER_ELTERNTEIL_TYPE__ANERKENNUNG_VATERSCHAFT);
		createEReference(andererElternteilTypeEClass, ANDERER_ELTERNTEIL_TYPE__WEITERE_ANGABENZUM_ANDEREN_ELTERNTEIL);

		angabenZumKindBeendigungTypeEClass = createEClass(ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE);
		createEReference(angabenZumKindBeendigungTypeEClass, ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__NAME_DES_KINDES);
		createEReference(angabenZumKindBeendigungTypeEClass, ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__GEBURTSDATEN);
		createEAttribute(angabenZumKindBeendigungTypeEClass, ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__ANSCHRIFT_STIMMT_MIT_ANTRAGSTELLENDEM_ELTERNTEIL_UEBEREIN);
		createEReference(angabenZumKindBeendigungTypeEClass, ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__KIND_ADRESSE);
		createEAttribute(angabenZumKindBeendigungTypeEClass, ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__AKTENZEICHEN_VORGANGSNUMMER);

		angabenZumKindTypeEClass = createEClass(ANGABEN_ZUM_KIND_TYPE);
		createEAttribute(angabenZumKindTypeEClass, ANGABEN_ZUM_KIND_TYPE__KIND_BEREITS_GEBOREN);
		createEAttribute(angabenZumKindTypeEClass, ANGABEN_ZUM_KIND_TYPE__VORAUSSICHTLICHER_ENTBINDUNGSTERMIN);
		createEReference(angabenZumKindTypeEClass, ANGABEN_ZUM_KIND_TYPE__NAME_DES_KINDES);
		createEReference(angabenZumKindTypeEClass, ANGABEN_ZUM_KIND_TYPE__GEBURTSDATEN);
		createEAttribute(angabenZumKindTypeEClass, ANGABEN_ZUM_KIND_TYPE__GEBURTENREGISTERNUMMER);
		createEReference(angabenZumKindTypeEClass, ANGABEN_ZUM_KIND_TYPE__KIND_WOHNHAFT_BEI);
		createEAttribute(angabenZumKindTypeEClass, ANGABEN_ZUM_KIND_TYPE__KIND_LEBT_BEI_SONSTIGE);
		createEReference(angabenZumKindTypeEClass, ANGABEN_ZUM_KIND_TYPE__AUSBILDUNG_UND_EINKUENFTE);
		createEAttribute(angabenZumKindTypeEClass, ANGABEN_ZUM_KIND_TYPE__WEITERE_KINDER_IM_HAUSHALT);
		createEReference(angabenZumKindTypeEClass, ANGABEN_ZUM_KIND_TYPE__WEITERE_KINDER);

		angabenZumUnterhaltTypeEClass = createEClass(ANGABEN_ZUM_UNTERHALT_TYPE);
		createEReference(angabenZumUnterhaltTypeEClass, ANGABEN_ZUM_UNTERHALT_TYPE__ANGABEN_ZUM_UNTERHALTSTITEL);
		createEAttribute(angabenZumUnterhaltTypeEClass, ANGABEN_ZUM_UNTERHALT_TYPE__BEMUEHUNG_UNTERHALTSZAHLUNG);
		createEAttribute(angabenZumUnterhaltTypeEClass, ANGABEN_ZUM_UNTERHALT_TYPE__BISHERIGE_BEMUEHUNGEN);
		createEAttribute(angabenZumUnterhaltTypeEClass, ANGABEN_ZUM_UNTERHALT_TYPE__ZAHLT_BEREITS);
		createEAttribute(angabenZumUnterhaltTypeEClass, ANGABEN_ZUM_UNTERHALT_TYPE__HOEHE_ZAHLUNG);
		createEAttribute(angabenZumUnterhaltTypeEClass, ANGABEN_ZUM_UNTERHALT_TYPE__LETZTE_ZAHLUNG_AM);
		createEAttribute(angabenZumUnterhaltTypeEClass, ANGABEN_ZUM_UNTERHALT_TYPE__REGELMAESSIGE_ZAHLUNG);
		createEAttribute(angabenZumUnterhaltTypeEClass, ANGABEN_ZUM_UNTERHALT_TYPE__ANGABEN_ZUR_ZAHLUNG);
		createEAttribute(angabenZumUnterhaltTypeEClass, ANGABEN_ZUM_UNTERHALT_TYPE__GELTENDMACHUNG_UNTERHALTSRUECKSTAENDE);
		createEAttribute(angabenZumUnterhaltTypeEClass, ANGABEN_ZUM_UNTERHALT_TYPE__ANGABE_UNTERHALTSRUECKSTAENDE);
		createEAttribute(angabenZumUnterhaltTypeEClass, ANGABEN_ZUM_UNTERHALT_TYPE__FREIWILLIGER_VERZICHT_AUF_UNTERHALT);
		createEAttribute(angabenZumUnterhaltTypeEClass, ANGABEN_ZUM_UNTERHALT_TYPE__UNTERHALT_VERZICHT_ZEITRAUM);
		createEReference(angabenZumUnterhaltTypeEClass, ANGABEN_ZUM_UNTERHALT_TYPE__ZAHLUNG);
		createEReference(angabenZumUnterhaltTypeEClass, ANGABEN_ZUM_UNTERHALT_TYPE__BANKVERBINDUNG_ZAHLUNG_JUGENDAMT);
		createEReference(angabenZumUnterhaltTypeEClass, ANGABEN_ZUM_UNTERHALT_TYPE__BANKVERBINDUNG_DIREKTZAHLUNG);

		anliegensklaerungBSSTypeEClass = createEClass(ANLIEGENSKLAERUNG_BSS_TYPE);
		createEReference(anliegensklaerungBSSTypeEClass, ANLIEGENSKLAERUNG_BSS_TYPE__ANLIEGEN_BEISTANDSCHAFT);
		createEAttribute(anliegensklaerungBSSTypeEClass, ANLIEGENSKLAERUNG_BSS_TYPE__VATERSCHAFT_ANERKANNT);
		createEReference(anliegensklaerungBSSTypeEClass, ANLIEGENSKLAERUNG_BSS_TYPE__INHABER_ELTERLICHE_SORGE);

		antragstellenderElternteilBeendigungTypeEClass = createEClass(ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE);
		createEReference(antragstellenderElternteilBeendigungTypeEClass, ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__NAMEN);
		createEReference(antragstellenderElternteilBeendigungTypeEClass, ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__GEBURTSDATEN);
		createEReference(antragstellenderElternteilBeendigungTypeEClass, ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ADRESSE);
		createEAttribute(antragstellenderElternteilBeendigungTypeEClass, ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ABWEICHENDE_ADRESSE);
		createEReference(antragstellenderElternteilBeendigungTypeEClass, ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ABWEICHENDE_ADRESSE_PERSO);
		createEReference(antragstellenderElternteilBeendigungTypeEClass, ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ABWEICHENDE_ADRESSE_NACHWEIS);

		antragstellenderElternteilTypeEClass = createEClass(ANTRAGSTELLENDER_ELTERNTEIL_TYPE);
		createEReference(antragstellenderElternteilTypeEClass, ANTRAGSTELLENDER_ELTERNTEIL_TYPE__NAMEN);
		createEReference(antragstellenderElternteilTypeEClass, ANTRAGSTELLENDER_ELTERNTEIL_TYPE__GEBURTSDATEN);
		createEReference(antragstellenderElternteilTypeEClass, ANTRAGSTELLENDER_ELTERNTEIL_TYPE__FAMILIENSTAND);
		createEReference(antragstellenderElternteilTypeEClass, ANTRAGSTELLENDER_ELTERNTEIL_TYPE__ADRESSE);
		createEAttribute(antragstellenderElternteilTypeEClass, ANTRAGSTELLENDER_ELTERNTEIL_TYPE__ABWEICHENDE_ADRESSE);
		createEReference(antragstellenderElternteilTypeEClass, ANTRAGSTELLENDER_ELTERNTEIL_TYPE__ABWEICHENDE_ADRESSE_PERSO);
		createEReference(antragstellenderElternteilTypeEClass, ANTRAGSTELLENDER_ELTERNTEIL_TYPE__ERREICHBARKEIT);
		createEReference(antragstellenderElternteilTypeEClass, ANTRAGSTELLENDER_ELTERNTEIL_TYPE__OEFFENTLICHE_LEISTUNGEN);
		createEAttribute(antragstellenderElternteilTypeEClass, ANTRAGSTELLENDER_ELTERNTEIL_TYPE__SONSTIGE_LEISTUNGEN_BESCHREIBUNG);

		ausbildungUndEinkuenfteTypeEClass = createEClass(AUSBILDUNG_UND_EINKUENFTE_TYPE);
		createEAttribute(ausbildungUndEinkuenfteTypeEClass, AUSBILDUNG_UND_EINKUENFTE_TYPE__KIND_IN_AUSBILDUNG);
		createEAttribute(ausbildungUndEinkuenfteTypeEClass, AUSBILDUNG_UND_EINKUENFTE_TYPE__AUSBILDUNGSJAHR);
		createEAttribute(ausbildungUndEinkuenfteTypeEClass, AUSBILDUNG_UND_EINKUENFTE_TYPE__EINKUENFTE_KIND);
		createEAttribute(ausbildungUndEinkuenfteTypeEClass, AUSBILDUNG_UND_EINKUENFTE_TYPE__EINKUENFTE_ART);
		createEAttribute(ausbildungUndEinkuenfteTypeEClass, AUSBILDUNG_UND_EINKUENFTE_TYPE__KINDERGELD);

		beistandschaftAntrag0601TypeEClass = createEClass(BEISTANDSCHAFT_ANTRAG0601_TYPE);
		createEReference(beistandschaftAntrag0601TypeEClass, BEISTANDSCHAFT_ANTRAG0601_TYPE__ANLIEGENSKLAERUNG);
		createEReference(beistandschaftAntrag0601TypeEClass, BEISTANDSCHAFT_ANTRAG0601_TYPE__ANTRAGSTELLENDER_ELTERNTEIL);
		createEReference(beistandschaftAntrag0601TypeEClass, BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_KIND);
		createEReference(beistandschaftAntrag0601TypeEClass, BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_ANDEREN_ELTERNTEIL);
		createEReference(beistandschaftAntrag0601TypeEClass, BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_UNTERHALT);
		createEReference(beistandschaftAntrag0601TypeEClass, BEISTANDSCHAFT_ANTRAG0601_TYPE__NACHWEISE);
		createEAttribute(beistandschaftAntrag0601TypeEClass, BEISTANDSCHAFT_ANTRAG0601_TYPE__WARTEN_AUF_UNTERSCHRIFT);
		createEReference(beistandschaftAntrag0601TypeEClass, BEISTANDSCHAFT_ANTRAG0601_TYPE__DSGVO);
		createEAttribute(beistandschaftAntrag0601TypeEClass, BEISTANDSCHAFT_ANTRAG0601_TYPE__RICHTIGKEIT_DER_ANGABEN);
		createEReference(beistandschaftAntrag0601TypeEClass, BEISTANDSCHAFT_ANTRAG0601_TYPE__PDF_ANTRAG);
		createEAttribute(beistandschaftAntrag0601TypeEClass, BEISTANDSCHAFT_ANTRAG0601_TYPE__MERKBLATT_UVG);

		beistandschaftBeendigung0604TypeEClass = createEClass(BEISTANDSCHAFT_BEENDIGUNG0604_TYPE);
		createEReference(beistandschaftBeendigung0604TypeEClass, BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG);
		createEReference(beistandschaftBeendigung0604TypeEClass, BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__ANGABEN_ZUM_KIND_BEENDIGUNG);
		createEAttribute(beistandschaftBeendigung0604TypeEClass, BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__BEENDIGUNG_BESTAETIGUNG);
		createEReference(beistandschaftBeendigung0604TypeEClass, BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__DSGVO);
		createEAttribute(beistandschaftBeendigung0604TypeEClass, BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__RICHTIGKEIT_DER_ANGABEN);
		createEAttribute(beistandschaftBeendigung0604TypeEClass, BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__WARTEN_AUF_UNTERSCHRIFT);

		codeAnliegenBeistandschaftTypeEClass = createEClass(CODE_ANLIEGEN_BEISTANDSCHAFT_TYPE);

		codeBezugOeffentlicherLeistungenTypeEClass = createEClass(CODE_BEZUG_OEFFENTLICHER_LEISTUNGEN_TYPE);

		codeEinkommenAndererElternteilTypeEClass = createEClass(CODE_EINKOMMEN_ANDERER_ELTERNTEIL_TYPE);

		codeInhaberElterlicheSorgeTypeEClass = createEClass(CODE_INHABER_ELTERLICHE_SORGE_TYPE);

		codeUnterhaltstitelBestehtTypeEClass = createEClass(CODE_UNTERHALTSTITEL_BESTEHT_TYPE);

		codeZahlungsartBSSTypeEClass = createEClass(CODE_ZAHLUNGSART_BSS_TYPE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BEISTANDSCHAFT_ANTRAG0601);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BEISTANDSCHAFT_BEENDIGUNG0604);

		geburtTypeEClass = createEClass(GEBURT_TYPE);
		createEAttribute(geburtTypeEClass, GEBURT_TYPE__GEBURTSORT);
		createEReference(geburtTypeEClass, GEBURT_TYPE__GEBURTSORT_STAAT);
		createEReference(geburtTypeEClass, GEBURT_TYPE__GEBURTSDATUM);

		nachweiseBSSTypeEClass = createEClass(NACHWEISE_BSS_TYPE);
		createEReference(nachweiseBSSTypeEClass, NACHWEISE_BSS_TYPE__SORGERECHTSNACHWEIS);
		createEReference(nachweiseBSSTypeEClass, NACHWEISE_BSS_TYPE__IDENTITAETSNACHWEIS);
		createEReference(nachweiseBSSTypeEClass, NACHWEISE_BSS_TYPE__WEITERE_NACHWEISE);
		createEReference(nachweiseBSSTypeEClass, NACHWEISE_BSS_TYPE__NACHWEIS_MELDEBESCHEINIGUNG);
		createEAttribute(nachweiseBSSTypeEClass, NACHWEISE_BSS_TYPE__ANMERKUNGEN);
		createEReference(nachweiseBSSTypeEClass, NACHWEISE_BSS_TYPE__DSGVO);

		nachweisTypeEClass = createEClass(NACHWEIS_TYPE);
		createEAttribute(nachweisTypeEClass, NACHWEIS_TYPE__NACHWEIS_BESCHREIBUNG);
		createEReference(nachweisTypeEClass, NACHWEIS_TYPE__NACHWEIS_DOKUMENT);

		weitereAngabenZumAnderenElternteilTypeEClass = createEClass(WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE);
		createEAttribute(weitereAngabenZumAnderenElternteilTypeEClass, WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__BERUFAUSAUSBILDUNG);
		createEAttribute(weitereAngabenZumAnderenElternteilTypeEClass, WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__ANGABEN_BERUFSAUSBILDUNG);
		createEAttribute(weitereAngabenZumAnderenElternteilTypeEClass, WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__EINKOMMENSVERHAELTNISSE);
		createEAttribute(weitereAngabenZumAnderenElternteilTypeEClass, WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__NETTOEINKOMMEN);
		createEReference(weitereAngabenZumAnderenElternteilTypeEClass, WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__EINKOMMEN);
		createEAttribute(weitereAngabenZumAnderenElternteilTypeEClass, WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__WEITERE_KINDER);
		createEAttribute(weitereAngabenZumAnderenElternteilTypeEClass, WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__WEITERE_KINDER_IM_HAUSHALT);
		createEReference(weitereAngabenZumAnderenElternteilTypeEClass, WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__WEITERE_KINDER_ANGABEN);

		weitereKinderTypeEClass = createEClass(WEITERE_KINDER_TYPE);
		createEReference(weitereKinderTypeEClass, WEITERE_KINDER_TYPE__NAME);
		createEAttribute(weitereKinderTypeEClass, WEITERE_KINDER_TYPE__GEBURTSDATUM);

		// Create enums
		anliegenbeistandschaftEEnum = createEEnum(ANLIEGENBEISTANDSCHAFT);
		bezugoeffentlicherleistungenEEnum = createEEnum(BEZUGOEFFENTLICHERLEISTUNGEN);
		einkommenandererelternteilEEnum = createEEnum(EINKOMMENANDERERELTERNTEIL);
		inhaberelterlichesorgeEEnum = createEEnum(INHABERELTERLICHESORGE);
		unterhaltstitelbestehtEEnum = createEEnum(UNTERHALTSTITELBESTEHT);
		zahlungsartbssEEnum = createEEnum(ZAHLUNGSARTBSS);

		// Create data types
		anliegenbeistandschaftObjectEDataType = createEDataType(ANLIEGENBEISTANDSCHAFT_OBJECT);
		bezugoeffentlicherleistungenObjectEDataType = createEDataType(BEZUGOEFFENTLICHERLEISTUNGEN_OBJECT);
		einkommenandererelternteilObjectEDataType = createEDataType(EINKOMMENANDERERELTERNTEIL_OBJECT);
		inhaberelterlichesorgeObjectEDataType = createEDataType(INHABERELTERLICHESORGE_OBJECT);
		unterhaltstitelbestehtObjectEDataType = createEDataType(UNTERHALTSTITELBESTEHT_OBJECT);
		zahlungsartbssObjectEDataType = createEDataType(ZAHLUNGSARTBSS_OBJECT);
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
		BaukastenPackage theBaukastenPackage = (BaukastenPackage)EPackage.Registry.INSTANCE.getEPackage(BaukastenPackage.eNS_URI);
		DIN913792204Package theDIN913792204Package = (DIN913792204Package)EPackage.Registry.INSTANCE.getEPackage(DIN913792204Package.eNS_URI);
		Code10Package theCode10Package = (Code10Package)EPackage.Registry.INSTANCE.getEPackage(Code10Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		beistandschaftAntrag0601TypeEClass.getESuperTypes().add(theBaukastenPackage.getAntragsnachrichtType());
		beistandschaftBeendigung0604TypeEClass.getESuperTypes().add(theBaukastenPackage.getAntragsnachrichtType());
		codeAnliegenBeistandschaftTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeBezugOeffentlicherLeistungenTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeEinkommenAndererElternteilTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeInhaberElterlicheSorgeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeUnterhaltstitelBestehtTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeZahlungsartBSSTypeEClass.getESuperTypes().add(theCode10Package.getCode());

		// Initialize classes, features, and operations; add parameters
		initEClass(andererElternteilTypeEClass, AndererElternteilType.class, "AndererElternteilType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAndererElternteilType_AngabenZumAnderenElternteil(), theXMLTypePackage.getBoolean(), "angabenZumAnderenElternteil", null, 1, 1, AndererElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAndererElternteilType_Namen(), theBaukastenPackage.getNameNatuerlichePersonType(), null, "namen", null, 0, 1, AndererElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAndererElternteilType_Geburtsdaten(), this.getGeburtType(), null, "geburtsdaten", null, 0, 1, AndererElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAndererElternteilType_Familienstand(), theBaukastenPackage.getCodeFamilienstandType(), null, "familienstand", null, 0, 1, AndererElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAndererElternteilType_AngabenZurAdresse(), theXMLTypePackage.getBoolean(), "angabenZurAdresse", null, 0, 1, AndererElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAndererElternteilType_Adresse(), theBaukastenPackage.getPostalischeInlandsanschriftBasisType(), null, "adresse", null, 0, 1, AndererElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAndererElternteilType_Erreichbarkeit(), theBaukastenPackage.getErreichbarkeitType(), null, "erreichbarkeit", null, 0, -1, AndererElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAndererElternteilType_AnerkennungVaterschaft(), theXMLTypePackage.getBoolean(), "anerkennungVaterschaft", null, 0, 1, AndererElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAndererElternteilType_WeitereAngabenzumAnderenElternteil(), this.getWeitereAngabenZumAnderenElternteilType(), null, "weitereAngabenzumAnderenElternteil", null, 0, 1, AndererElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(angabenZumKindBeendigungTypeEClass, AngabenZumKindBeendigungType.class, "AngabenZumKindBeendigungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAngabenZumKindBeendigungType_NameDesKindes(), theBaukastenPackage.getNameNatuerlichePersonType(), null, "nameDesKindes", null, 0, 1, AngabenZumKindBeendigungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenZumKindBeendigungType_Geburtsdaten(), theBaukastenPackage.getGeburtType(), null, "geburtsdaten", null, 0, 1, AngabenZumKindBeendigungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZumKindBeendigungType_AnschriftStimmtMitAntragstellendemElternteilUeberein(), theXMLTypePackage.getBoolean(), "anschriftStimmtMitAntragstellendemElternteilUeberein", null, 1, 1, AngabenZumKindBeendigungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenZumKindBeendigungType_KindAdresse(), theBaukastenPackage.getPostalischeInlandsanschriftBasisType(), null, "kindAdresse", null, 0, 1, AngabenZumKindBeendigungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZumKindBeendigungType_AktenzeichenVorgangsnummer(), theDIN913792204Package.getDatatypeC(), "aktenzeichenVorgangsnummer", null, 0, 1, AngabenZumKindBeendigungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(angabenZumKindTypeEClass, AngabenZumKindType.class, "AngabenZumKindType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAngabenZumKindType_KindBereitsGeboren(), theXMLTypePackage.getBoolean(), "kindBereitsGeboren", null, 1, 1, AngabenZumKindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZumKindType_VoraussichtlicherEntbindungstermin(), theBaukastenPackage.getTagesdatumType(), "voraussichtlicherEntbindungstermin", null, 0, 1, AngabenZumKindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenZumKindType_NameDesKindes(), theBaukastenPackage.getNameNatuerlichePersonOhneGeburtsnameType(), null, "nameDesKindes", null, 0, 1, AngabenZumKindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenZumKindType_Geburtsdaten(), theBaukastenPackage.getGeburtType(), null, "geburtsdaten", null, 0, 1, AngabenZumKindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZumKindType_Geburtenregisternummer(), theDIN913792204Package.getDatatypeC(), "geburtenregisternummer", null, 0, 1, AngabenZumKindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenZumKindType_KindWohnhaftBei(), theBaukastenPackage.getCodeKindWohnhaftBeiType(), null, "kindWohnhaftBei", null, 0, 1, AngabenZumKindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZumKindType_KindLebtBeiSonstige(), theDIN913792204Package.getDatatypeC(), "kindLebtBeiSonstige", null, 0, 1, AngabenZumKindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenZumKindType_AusbildungUndEinkuenfte(), this.getAusbildungUndEinkuenfteType(), null, "ausbildungUndEinkuenfte", null, 0, 1, AngabenZumKindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZumKindType_WeitereKinderImHaushalt(), theXMLTypePackage.getBoolean(), "weitereKinderImHaushalt", null, 0, -1, AngabenZumKindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenZumKindType_WeitereKinder(), this.getWeitereKinderType(), null, "weitereKinder", null, 0, -1, AngabenZumKindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(angabenZumUnterhaltTypeEClass, AngabenZumUnterhaltType.class, "AngabenZumUnterhaltType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAngabenZumUnterhaltType_AngabenZumUnterhaltstitel(), this.getCodeUnterhaltstitelBestehtType(), null, "angabenZumUnterhaltstitel", null, 1, 1, AngabenZumUnterhaltType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZumUnterhaltType_BemuehungUnterhaltszahlung(), theXMLTypePackage.getBoolean(), "bemuehungUnterhaltszahlung", null, 0, 1, AngabenZumUnterhaltType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZumUnterhaltType_BisherigeBemuehungen(), theDIN913792204Package.getDatatypeC(), "bisherigeBemuehungen", null, 0, 1, AngabenZumUnterhaltType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZumUnterhaltType_ZahltBereits(), theXMLTypePackage.getBoolean(), "zahltBereits", null, 1, 1, AngabenZumUnterhaltType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZumUnterhaltType_HoeheZahlung(), theXMLTypePackage.getFloat(), "hoeheZahlung", null, 0, 1, AngabenZumUnterhaltType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZumUnterhaltType_LetzteZahlungAm(), theBaukastenPackage.getTagesdatumType(), "letzteZahlungAm", null, 0, 1, AngabenZumUnterhaltType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZumUnterhaltType_RegelmaessigeZahlung(), theXMLTypePackage.getBoolean(), "regelmaessigeZahlung", null, 1, 1, AngabenZumUnterhaltType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZumUnterhaltType_AngabenZurZahlung(), theDIN913792204Package.getDatatypeC(), "angabenZurZahlung", null, 0, 1, AngabenZumUnterhaltType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZumUnterhaltType_GeltendmachungUnterhaltsrueckstaende(), theXMLTypePackage.getBoolean(), "geltendmachungUnterhaltsrueckstaende", null, 1, 1, AngabenZumUnterhaltType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZumUnterhaltType_AngabeUnterhaltsrueckstaende(), theDIN913792204Package.getDatatypeC(), "angabeUnterhaltsrueckstaende", null, 0, 1, AngabenZumUnterhaltType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZumUnterhaltType_FreiwilligerVerzichtAufUnterhalt(), theXMLTypePackage.getBoolean(), "freiwilligerVerzichtAufUnterhalt", null, 1, 1, AngabenZumUnterhaltType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZumUnterhaltType_UnterhaltVerzichtZeitraum(), theDIN913792204Package.getDatatypeC(), "unterhaltVerzichtZeitraum", null, 0, 1, AngabenZumUnterhaltType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenZumUnterhaltType_Zahlung(), this.getCodeZahlungsartBSSType(), null, "zahlung", null, 0, 1, AngabenZumUnterhaltType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenZumUnterhaltType_BankverbindungZahlungJugendamt(), theBaukastenPackage.getBankverbindungType(), null, "bankverbindungZahlungJugendamt", null, 0, 1, AngabenZumUnterhaltType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenZumUnterhaltType_BankverbindungDirektzahlung(), theBaukastenPackage.getBankverbindungType(), null, "bankverbindungDirektzahlung", null, 0, 1, AngabenZumUnterhaltType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anliegensklaerungBSSTypeEClass, AnliegensklaerungBSSType.class, "AnliegensklaerungBSSType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnliegensklaerungBSSType_AnliegenBeistandschaft(), this.getCodeAnliegenBeistandschaftType(), null, "anliegenBeistandschaft", null, 1, 1, AnliegensklaerungBSSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnliegensklaerungBSSType_VaterschaftAnerkannt(), theXMLTypePackage.getBoolean(), "vaterschaftAnerkannt", null, 0, 1, AnliegensklaerungBSSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnliegensklaerungBSSType_InhaberElterlicheSorge(), this.getCodeInhaberElterlicheSorgeType(), null, "inhaberElterlicheSorge", null, 0, 1, AnliegensklaerungBSSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(antragstellenderElternteilBeendigungTypeEClass, AntragstellenderElternteilBeendigungType.class, "AntragstellenderElternteilBeendigungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAntragstellenderElternteilBeendigungType_Namen(), theBaukastenPackage.getNameNatuerlichePersonType(), null, "namen", null, 1, 1, AntragstellenderElternteilBeendigungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAntragstellenderElternteilBeendigungType_Geburtsdaten(), theBaukastenPackage.getGeburtType(), null, "geburtsdaten", null, 1, 1, AntragstellenderElternteilBeendigungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAntragstellenderElternteilBeendigungType_Adresse(), theBaukastenPackage.getPostalischeInlandsanschriftBasisType(), null, "adresse", null, 1, 1, AntragstellenderElternteilBeendigungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAntragstellenderElternteilBeendigungType_AbweichendeAdresse(), theXMLTypePackage.getBoolean(), "abweichendeAdresse", null, 1, 1, AntragstellenderElternteilBeendigungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAntragstellenderElternteilBeendigungType_AbweichendeAdressePerso(), theBaukastenPackage.getPostalischeInlandsanschriftBasisType(), null, "abweichendeAdressePerso", null, 0, 1, AntragstellenderElternteilBeendigungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAntragstellenderElternteilBeendigungType_AbweichendeAdresseNachweis(), theBaukastenPackage.getNachweisdokumentType(), null, "abweichendeAdresseNachweis", null, 0, -1, AntragstellenderElternteilBeendigungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(antragstellenderElternteilTypeEClass, AntragstellenderElternteilType.class, "AntragstellenderElternteilType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAntragstellenderElternteilType_Namen(), theBaukastenPackage.getNameNatuerlichePersonType(), null, "namen", null, 1, 1, AntragstellenderElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAntragstellenderElternteilType_Geburtsdaten(), theBaukastenPackage.getGeburtType(), null, "geburtsdaten", null, 1, 1, AntragstellenderElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAntragstellenderElternteilType_Familienstand(), theBaukastenPackage.getCodeFamilienstandType(), null, "familienstand", null, 0, 1, AntragstellenderElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAntragstellenderElternteilType_Adresse(), theBaukastenPackage.getPostalischeInlandsanschriftBasisType(), null, "adresse", null, 1, 1, AntragstellenderElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAntragstellenderElternteilType_AbweichendeAdresse(), theXMLTypePackage.getBoolean(), "abweichendeAdresse", null, 1, 1, AntragstellenderElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAntragstellenderElternteilType_AbweichendeAdressePerso(), theBaukastenPackage.getPostalischeInlandsanschriftBasisType(), null, "abweichendeAdressePerso", null, 0, 1, AntragstellenderElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAntragstellenderElternteilType_Erreichbarkeit(), theBaukastenPackage.getErreichbarkeitType(), null, "erreichbarkeit", null, 0, -1, AntragstellenderElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAntragstellenderElternteilType_OeffentlicheLeistungen(), this.getCodeBezugOeffentlicherLeistungenType(), null, "oeffentlicheLeistungen", null, 0, -1, AntragstellenderElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAntragstellenderElternteilType_SonstigeLeistungenBeschreibung(), theDIN913792204Package.getDatatypeC(), "sonstigeLeistungenBeschreibung", null, 0, 1, AntragstellenderElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ausbildungUndEinkuenfteTypeEClass, AusbildungUndEinkuenfteType.class, "AusbildungUndEinkuenfteType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAusbildungUndEinkuenfteType_KindInAusbildung(), theXMLTypePackage.getBoolean(), "kindInAusbildung", null, 0, 1, AusbildungUndEinkuenfteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAusbildungUndEinkuenfteType_Ausbildungsjahr(), theXMLTypePackage.getNonNegativeInteger(), "ausbildungsjahr", null, 0, 1, AusbildungUndEinkuenfteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAusbildungUndEinkuenfteType_EinkuenfteKind(), theXMLTypePackage.getBoolean(), "einkuenfteKind", null, 0, 1, AusbildungUndEinkuenfteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAusbildungUndEinkuenfteType_EinkuenfteArt(), theDIN913792204Package.getDatatypeC(), "einkuenfteArt", null, 0, 1, AusbildungUndEinkuenfteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAusbildungUndEinkuenfteType_Kindergeld(), theXMLTypePackage.getBoolean(), "kindergeld", null, 0, 1, AusbildungUndEinkuenfteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beistandschaftAntrag0601TypeEClass, BeistandschaftAntrag0601Type.class, "BeistandschaftAntrag0601Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBeistandschaftAntrag0601Type_Anliegensklaerung(), this.getAnliegensklaerungBSSType(), null, "anliegensklaerung", null, 1, 1, BeistandschaftAntrag0601Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeistandschaftAntrag0601Type_AntragstellenderElternteil(), this.getAntragstellenderElternteilType(), null, "antragstellenderElternteil", null, 1, 1, BeistandschaftAntrag0601Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeistandschaftAntrag0601Type_AngabenZumKind(), this.getAngabenZumKindType(), null, "angabenZumKind", null, 1, 1, BeistandschaftAntrag0601Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeistandschaftAntrag0601Type_AngabenZumAnderenElternteil(), this.getAndererElternteilType(), null, "angabenZumAnderenElternteil", null, 0, 1, BeistandschaftAntrag0601Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeistandschaftAntrag0601Type_AngabenZumUnterhalt(), this.getAngabenZumUnterhaltType(), null, "angabenZumUnterhalt", null, 0, 1, BeistandschaftAntrag0601Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeistandschaftAntrag0601Type_Nachweise(), this.getNachweiseBSSType(), null, "nachweise", null, 0, 1, BeistandschaftAntrag0601Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeistandschaftAntrag0601Type_WartenAufUnterschrift(), theXMLTypePackage.getBoolean(), "wartenAufUnterschrift", null, 1, 1, BeistandschaftAntrag0601Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeistandschaftAntrag0601Type_Dsgvo(), theBaukastenPackage.getDatenschutzerklaerungenType(), null, "dsgvo", null, 1, 1, BeistandschaftAntrag0601Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeistandschaftAntrag0601Type_RichtigkeitDerAngaben(), theXMLTypePackage.getBoolean(), "richtigkeitDerAngaben", null, 1, 1, BeistandschaftAntrag0601Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeistandschaftAntrag0601Type_PdfAntrag(), theBaukastenPackage.getNachweisdokumentType(), null, "pdfAntrag", null, 0, 1, BeistandschaftAntrag0601Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeistandschaftAntrag0601Type_MerkblattUVG(), theXMLTypePackage.getBoolean(), "merkblattUVG", null, 0, 1, BeistandschaftAntrag0601Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beistandschaftBeendigung0604TypeEClass, BeistandschaftBeendigung0604Type.class, "BeistandschaftBeendigung0604Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBeistandschaftBeendigung0604Type_AntragstellenderElternteilBeendigung(), this.getAntragstellenderElternteilBeendigungType(), null, "antragstellenderElternteilBeendigung", null, 1, 1, BeistandschaftBeendigung0604Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeistandschaftBeendigung0604Type_AngabenZumKindBeendigung(), this.getAngabenZumKindBeendigungType(), null, "angabenZumKindBeendigung", null, 1, 10, BeistandschaftBeendigung0604Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeistandschaftBeendigung0604Type_BeendigungBestaetigung(), theXMLTypePackage.getBoolean(), "beendigungBestaetigung", null, 1, 1, BeistandschaftBeendigung0604Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeistandschaftBeendigung0604Type_Dsgvo(), theBaukastenPackage.getDatenschutzerklaerungenType(), null, "dsgvo", null, 1, 1, BeistandschaftBeendigung0604Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeistandschaftBeendigung0604Type_RichtigkeitDerAngaben(), theXMLTypePackage.getBoolean(), "richtigkeitDerAngaben", null, 1, 1, BeistandschaftBeendigung0604Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeistandschaftBeendigung0604Type_WartenAufUnterschrift(), theXMLTypePackage.getBoolean(), "wartenAufUnterschrift", null, 1, 1, BeistandschaftBeendigung0604Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeAnliegenBeistandschaftTypeEClass, CodeAnliegenBeistandschaftType.class, "CodeAnliegenBeistandschaftType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeBezugOeffentlicherLeistungenTypeEClass, CodeBezugOeffentlicherLeistungenType.class, "CodeBezugOeffentlicherLeistungenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeEinkommenAndererElternteilTypeEClass, CodeEinkommenAndererElternteilType.class, "CodeEinkommenAndererElternteilType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeInhaberElterlicheSorgeTypeEClass, CodeInhaberElterlicheSorgeType.class, "CodeInhaberElterlicheSorgeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeUnterhaltstitelBestehtTypeEClass, CodeUnterhaltstitelBestehtType.class, "CodeUnterhaltstitelBestehtType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeZahlungsartBSSTypeEClass, CodeZahlungsartBSSType.class, "CodeZahlungsartBSSType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BeistandschaftAntrag0601(), this.getBeistandschaftAntrag0601Type(), null, "beistandschaftAntrag0601", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BeistandschaftBeendigung0604(), this.getBeistandschaftBeendigung0604Type(), null, "beistandschaftBeendigung0604", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(geburtTypeEClass, GeburtType.class, "GeburtType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeburtType_Geburtsort(), theDIN913792204Package.getDatatypeC(), "geburtsort", null, 0, 1, GeburtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeburtType_GeburtsortStaat(), theBaukastenPackage.getCodeStaatType(), null, "geburtsortStaat", null, 0, 1, GeburtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeburtType_Geburtsdatum(), theBaukastenPackage.getTeilbekanntesDatumType(), null, "geburtsdatum", null, 0, 1, GeburtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nachweiseBSSTypeEClass, NachweiseBSSType.class, "NachweiseBSSType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNachweiseBSSType_Sorgerechtsnachweis(), theBaukastenPackage.getNachweisdokumentType(), null, "sorgerechtsnachweis", null, 0, -1, NachweiseBSSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachweiseBSSType_Identitaetsnachweis(), theBaukastenPackage.getNachweisdokumentType(), null, "identitaetsnachweis", null, 0, -1, NachweiseBSSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachweiseBSSType_WeitereNachweise(), theBaukastenPackage.getNachweisdokumentType(), null, "weitereNachweise", null, 0, -1, NachweiseBSSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachweiseBSSType_NachweisMeldebescheinigung(), theBaukastenPackage.getNachweisdokumentType(), null, "nachweisMeldebescheinigung", null, 0, -1, NachweiseBSSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachweiseBSSType_Anmerkungen(), theDIN913792204Package.getDatatypeC(), "anmerkungen", null, 0, 1, NachweiseBSSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachweiseBSSType_Dsgvo(), theBaukastenPackage.getDatenschutzerklaerungenType(), null, "dsgvo", null, 1, 1, NachweiseBSSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nachweisTypeEClass, NachweisType.class, "NachweisType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNachweisType_NachweisBeschreibung(), theDIN913792204Package.getDatatypeC(), "nachweisBeschreibung", null, 0, 1, NachweisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachweisType_NachweisDokument(), theBaukastenPackage.getNachweisdokumentType(), null, "nachweisDokument", null, 0, -1, NachweisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weitereAngabenZumAnderenElternteilTypeEClass, WeitereAngabenZumAnderenElternteilType.class, "WeitereAngabenZumAnderenElternteilType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWeitereAngabenZumAnderenElternteilType_Berufausausbildung(), theXMLTypePackage.getBoolean(), "berufausausbildung", null, 0, 1, WeitereAngabenZumAnderenElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeitereAngabenZumAnderenElternteilType_AngabenBerufsausbildung(), theDIN913792204Package.getDatatypeC(), "angabenBerufsausbildung", null, 0, 1, WeitereAngabenZumAnderenElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeitereAngabenZumAnderenElternteilType_Einkommensverhaeltnisse(), theXMLTypePackage.getBoolean(), "einkommensverhaeltnisse", null, 0, 1, WeitereAngabenZumAnderenElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeitereAngabenZumAnderenElternteilType_Nettoeinkommen(), theXMLTypePackage.getFloat(), "nettoeinkommen", null, 0, 1, WeitereAngabenZumAnderenElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeitereAngabenZumAnderenElternteilType_Einkommen(), this.getCodeEinkommenAndererElternteilType(), null, "einkommen", null, 0, -1, WeitereAngabenZumAnderenElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeitereAngabenZumAnderenElternteilType_WeitereKinder(), theXMLTypePackage.getBoolean(), "weitereKinder", null, 0, 1, WeitereAngabenZumAnderenElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeitereAngabenZumAnderenElternteilType_WeitereKinderImHaushalt(), theXMLTypePackage.getBoolean(), "weitereKinderImHaushalt", null, 0, 1, WeitereAngabenZumAnderenElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeitereAngabenZumAnderenElternteilType_WeitereKinderAngaben(), this.getWeitereKinderType(), null, "weitereKinderAngaben", null, 0, -1, WeitereAngabenZumAnderenElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weitereKinderTypeEClass, WeitereKinderType.class, "WeitereKinderType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWeitereKinderType_Name(), theBaukastenPackage.getNameNatuerlichePersonOhneGeburtsnameType(), null, "name", null, 0, 1, WeitereKinderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeitereKinderType_Geburtsdatum(), theBaukastenPackage.getTagesdatumType(), "geburtsdatum", null, 0, 1, WeitereKinderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(anliegenbeistandschaftEEnum, Anliegenbeistandschaft.class, "Anliegenbeistandschaft");
		addEEnumLiteral(anliegenbeistandschaftEEnum, Anliegenbeistandschaft.B);
		addEEnumLiteral(anliegenbeistandschaftEEnum, Anliegenbeistandschaft.U);
		addEEnumLiteral(anliegenbeistandschaftEEnum, Anliegenbeistandschaft.V);
		addEEnumLiteral(anliegenbeistandschaftEEnum, Anliegenbeistandschaft.VU);

		initEEnum(bezugoeffentlicherleistungenEEnum, Bezugoeffentlicherleistungen.class, "Bezugoeffentlicherleistungen");
		addEEnumLiteral(bezugoeffentlicherleistungenEEnum, Bezugoeffentlicherleistungen._01);
		addEEnumLiteral(bezugoeffentlicherleistungenEEnum, Bezugoeffentlicherleistungen._02);
		addEEnumLiteral(bezugoeffentlicherleistungenEEnum, Bezugoeffentlicherleistungen._03);
		addEEnumLiteral(bezugoeffentlicherleistungenEEnum, Bezugoeffentlicherleistungen._04);

		initEEnum(einkommenandererelternteilEEnum, Einkommenandererelternteil.class, "Einkommenandererelternteil");
		addEEnumLiteral(einkommenandererelternteilEEnum, Einkommenandererelternteil._01);
		addEEnumLiteral(einkommenandererelternteilEEnum, Einkommenandererelternteil._02);
		addEEnumLiteral(einkommenandererelternteilEEnum, Einkommenandererelternteil._03);
		addEEnumLiteral(einkommenandererelternteilEEnum, Einkommenandererelternteil._04);
		addEEnumLiteral(einkommenandererelternteilEEnum, Einkommenandererelternteil._05);
		addEEnumLiteral(einkommenandererelternteilEEnum, Einkommenandererelternteil._06);
		addEEnumLiteral(einkommenandererelternteilEEnum, Einkommenandererelternteil._07);

		initEEnum(inhaberelterlichesorgeEEnum, Inhaberelterlichesorge.class, "Inhaberelterlichesorge");
		addEEnumLiteral(inhaberelterlichesorgeEEnum, Inhaberelterlichesorge._01);
		addEEnumLiteral(inhaberelterlichesorgeEEnum, Inhaberelterlichesorge._02);
		addEEnumLiteral(inhaberelterlichesorgeEEnum, Inhaberelterlichesorge._03);

		initEEnum(unterhaltstitelbestehtEEnum, Unterhaltstitelbesteht.class, "Unterhaltstitelbesteht");
		addEEnumLiteral(unterhaltstitelbestehtEEnum, Unterhaltstitelbesteht._01);
		addEEnumLiteral(unterhaltstitelbestehtEEnum, Unterhaltstitelbesteht._02);
		addEEnumLiteral(unterhaltstitelbestehtEEnum, Unterhaltstitelbesteht._03);

		initEEnum(zahlungsartbssEEnum, Zahlungsartbss.class, "Zahlungsartbss");
		addEEnumLiteral(zahlungsartbssEEnum, Zahlungsartbss._01);
		addEEnumLiteral(zahlungsartbssEEnum, Zahlungsartbss._02);

		// Initialize data types
		initEDataType(anliegenbeistandschaftObjectEDataType, Anliegenbeistandschaft.class, "AnliegenbeistandschaftObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bezugoeffentlicherleistungenObjectEDataType, Bezugoeffentlicherleistungen.class, "BezugoeffentlicherleistungenObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(einkommenandererelternteilObjectEDataType, Einkommenandererelternteil.class, "EinkommenandererelternteilObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(inhaberelterlichesorgeObjectEDataType, Inhaberelterlichesorge.class, "InhaberelterlichesorgeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unterhaltstitelbestehtObjectEDataType, Unterhaltstitelbesteht.class, "UnterhaltstitelbestehtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(zahlungsartbssObjectEDataType, Zahlungsartbss.class, "ZahlungsartbssObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (anliegenbeistandschaftEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>AnliegenBeistandschaft</nameLang>\n                   \n    <nameKurz>AnliegenBeistandschaft</nameKurz>\n                   \n    <nameTechnisch>anliegenbeistandschaft</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:anliegenbeistandschaft</kennung>\n                   \n    <beschreibung>Die Art der Anliegen f\u00fcr Beistandschaft.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>Gibt die Arten der Anliegen f\u00fcr Beistandsschaft an. </beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (anliegenbeistandschaftEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Beratung</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (anliegenbeistandschaftEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Unterhaltsanspr\u00fcche des Kindes durchsetzen</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (anliegenbeistandschaftEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Vaterschaft des Kindes feststellen</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (anliegenbeistandschaftEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Vaterschaft des Kindes feststellen lassen und Unterhaltsanspr\u00fcche des Kindes durchsetzen.</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (bezugoeffentlicherleistungenEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>BezugOeffentlicherLeistungen</nameLang>\n                   \n    <nameKurz>BezugOeffentlicherLeistungen</nameKurz>\n                   \n    <nameTechnisch>bezugoeffentlicherleistungen</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:bezugoeffentlicherleistungen</kennung>\n                   \n    <beschreibung>Die Liste gibt an, welche \u00f6ffentlichen Leistungen von der betroffenen Person erhaten werden.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (bezugoeffentlicherleistungenEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Bezug von Sozialhilfe (SGB XII)</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (bezugoeffentlicherleistungenEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Bezug von Arbeitslosengeld II (SBG II)</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (bezugoeffentlicherleistungenEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Bezug von Unterhaltsvorschuss</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (bezugoeffentlicherleistungenEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Bezug Sonstiger Leistungen</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (codeAnliegenBeistandschaftTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>AnliegenBeistandschaft</nameLang>\n                   \n    <nameKurz>AnliegenBeistandschaft</nameKurz>\n                   \n    <nameTechnisch>anliegenbeistandschaft</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:anliegenbeistandschaft</kennung>\n                   \n    <beschreibung>Die Art der Anliegen f\u00fcr Beistandschaft.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>Gibt die Arten der Anliegen f\u00fcr Beistandsschaft an. </beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (codeBezugOeffentlicherLeistungenTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>BezugOeffentlicherLeistungen</nameLang>\n                   \n    <nameKurz>BezugOeffentlicherLeistungen</nameKurz>\n                   \n    <nameTechnisch>bezugoeffentlicherleistungen</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:bezugoeffentlicherleistungen</kennung>\n                   \n    <beschreibung>Die Liste gibt an, welche \u00f6ffentlichen Leistungen von der betroffenen Person erhaten werden.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (codeEinkommenAndererElternteilTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>EinkommenAndererElternteil</nameLang>\n                   \n    <nameKurz>EinkommenAndererElternteil</nameKurz>\n                   \n    <nameTechnisch>einkommenandererelternteil</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:einkommenandererelternteil</kennung>\n                   \n    <beschreibung>Die Liste codiert die Einkommensarten des anderen Elternteils im Antrag zur Beistandschaft.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>2.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2025-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (codeInhaberElterlicheSorgeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>InhaberElterlicheSorge</nameLang>\n                   \n    <nameKurz>InhaberElterlicheSorge</nameKurz>\n                   \n    <nameTechnisch>inhaberelterlichesorge</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:inhaberelterlichesorge</kennung>\n                   \n    <beschreibung>Die Liste gibt an, bei welcher Person die elterliche Sorge liegt.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (codeUnterhaltstitelBestehtTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>UnterhaltstitelBesteht</nameLang>\n                   \n    <nameKurz>UnterhaltstitelBesteht</nameKurz>\n                   \n    <nameTechnisch>unterhaltstitelbesteht</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:unterhaltstitelbesteht</kennung>\n                   \n    <beschreibung>Die Liste codiert, ob bereits ein Unterhaltstitel besteht.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (codeZahlungsartBSSTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>ZahlungsartBSS</nameLang>\n                   \n    <nameKurz>ZahlungsartBSS</nameKurz>\n                   \n    <nameTechnisch>zahlungsartbss</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:zahlungsartbss</kennung>\n                   \n    <beschreibung>Die Liste codiert, wie eine Unterhaltszahlung geregelt sein soll.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (getDocumentRoot_BeistandschaftAntrag0601(),
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <rechtsgrundlage/>\n           \n"
		   });
		addAnnotation
		  (getDocumentRoot_BeistandschaftBeendigung0604(),
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <rechtsgrundlage/>\n           \n"
		   });
		addAnnotation
		  (einkommenandererelternteilEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>EinkommenAndererElternteil</nameLang>\n                   \n    <nameKurz>EinkommenAndererElternteil</nameKurz>\n                   \n    <nameTechnisch>einkommenandererelternteil</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:einkommenandererelternteil</kennung>\n                   \n    <beschreibung>Die Liste codiert die Einkommensarten des anderen Elternteils im Antrag zur Beistandschaft.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>2.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2025-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (einkommenandererelternteilEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Erwerbst\u00e4tigkeit</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (einkommenandererelternteilEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Arbeitslosengeld I/B\u00fcrgergeld</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (einkommenandererelternteilEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Arbeitslosengeld II (SGB II)</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (einkommenandererelternteilEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Rente</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (einkommenandererelternteilEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Sozialhilfe (SGB XII)</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (einkommenandererelternteilEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Verm\u00f6gen</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (einkommenandererelternteilEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Eink\u00fcnfte aus Vermietung und Verpachtung (Paragraf21 EStG)</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (getGeburtType_GeburtsortStaat(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>Deutschland wird immer durch Weglassen dieses Elementes abgebildet.</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (inhaberelterlichesorgeEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>InhaberElterlicheSorge</nameLang>\n                   \n    <nameKurz>InhaberElterlicheSorge</nameKurz>\n                   \n    <nameTechnisch>inhaberelterlichesorge</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:inhaberelterlichesorge</kennung>\n                   \n    <beschreibung>Die Liste gibt an, bei welcher Person die elterliche Sorge liegt.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (inhaberelterlichesorgeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Ich bin alleinige(r) Inhaber(in) der elterlichen Sorge</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (inhaberelterlichesorgeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Es besteht gemeinsame elterliche Sorge. Das Kind befindet sich in meiner Obhut</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (inhaberelterlichesorgeEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Ich bin nach Paragraf 1776 BGB berufender Vormund des Kindes</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (unterhaltstitelbestehtEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>UnterhaltstitelBesteht</nameLang>\n                   \n    <nameKurz>UnterhaltstitelBesteht</nameKurz>\n                   \n    <nameTechnisch>unterhaltstitelbesteht</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:unterhaltstitelbesteht</kennung>\n                   \n    <beschreibung>Die Liste codiert, ob bereits ein Unterhaltstitel besteht.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (unterhaltstitelbestehtEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Ja</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (unterhaltstitelbestehtEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Nein</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (unterhaltstitelbestehtEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Ich bin mir nicht sicher</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (zahlungsartbssEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>ZahlungsartBSS</nameLang>\n                   \n    <nameKurz>ZahlungsartBSS</nameKurz>\n                   \n    <nameTechnisch>zahlungsartbss</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:zahlungsartbss</kennung>\n                   \n    <beschreibung>Die Liste codiert, wie eine Unterhaltszahlung geregelt sein soll.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (zahlungsartbssEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Zahlung an Jugendamt</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (zahlungsartbssEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Direktzahlung</beschreibung>\n                 \n"
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
		  (andererElternteilTypeEClass,
		   source,
		   new String[] {
			   "name", "AndererElternteilType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAndererElternteilType_AngabenZumAnderenElternteil(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenZumAnderenElternteil",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAndererElternteilType_Namen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "namen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAndererElternteilType_Geburtsdaten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsdaten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAndererElternteilType_Familienstand(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "familienstand",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAndererElternteilType_AngabenZurAdresse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenZurAdresse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAndererElternteilType_Adresse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "adresse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAndererElternteilType_Erreichbarkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "erreichbarkeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAndererElternteilType_AnerkennungVaterschaft(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anerkennungVaterschaft",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAndererElternteilType_WeitereAngabenzumAnderenElternteil(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "weitereAngabenzumAnderenElternteil",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (angabenZumKindBeendigungTypeEClass,
		   source,
		   new String[] {
			   "name", "AngabenZumKindBeendigungType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAngabenZumKindBeendigungType_NameDesKindes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nameDesKindes",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumKindBeendigungType_Geburtsdaten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsdaten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumKindBeendigungType_AnschriftStimmtMitAntragstellendemElternteilUeberein(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anschriftStimmtMitAntragstellendemElternteilUeberein",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumKindBeendigungType_KindAdresse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kindAdresse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumKindBeendigungType_AktenzeichenVorgangsnummer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aktenzeichenVorgangsnummer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (angabenZumKindTypeEClass,
		   source,
		   new String[] {
			   "name", "AngabenZumKindType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAngabenZumKindType_KindBereitsGeboren(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kindBereitsGeboren",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumKindType_VoraussichtlicherEntbindungstermin(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "voraussichtlicherEntbindungstermin",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumKindType_NameDesKindes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nameDesKindes",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumKindType_Geburtsdaten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsdaten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumKindType_Geburtenregisternummer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtenregisternummer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumKindType_KindWohnhaftBei(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kindWohnhaftBei",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumKindType_KindLebtBeiSonstige(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kindLebtBeiSonstige",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumKindType_AusbildungUndEinkuenfte(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ausbildungUndEinkuenfte",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumKindType_WeitereKinderImHaushalt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "weitereKinderImHaushalt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumKindType_WeitereKinder(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "weitereKinder",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (angabenZumUnterhaltTypeEClass,
		   source,
		   new String[] {
			   "name", "AngabenZumUnterhaltType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAngabenZumUnterhaltType_AngabenZumUnterhaltstitel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenZumUnterhaltstitel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumUnterhaltType_BemuehungUnterhaltszahlung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bemuehungUnterhaltszahlung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumUnterhaltType_BisherigeBemuehungen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bisherigeBemuehungen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumUnterhaltType_ZahltBereits(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zahltBereits",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumUnterhaltType_HoeheZahlung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hoeheZahlung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumUnterhaltType_LetzteZahlungAm(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "letzteZahlungAm",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumUnterhaltType_RegelmaessigeZahlung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "regelmaessigeZahlung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumUnterhaltType_AngabenZurZahlung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenZurZahlung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumUnterhaltType_GeltendmachungUnterhaltsrueckstaende(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geltendmachungUnterhaltsrueckstaende",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumUnterhaltType_AngabeUnterhaltsrueckstaende(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabeUnterhaltsrueckstaende",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumUnterhaltType_FreiwilligerVerzichtAufUnterhalt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "freiwilligerVerzichtAufUnterhalt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumUnterhaltType_UnterhaltVerzichtZeitraum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "unterhaltVerzichtZeitraum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumUnterhaltType_Zahlung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zahlung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumUnterhaltType_BankverbindungZahlungJugendamt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bankverbindungZahlungJugendamt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumUnterhaltType_BankverbindungDirektzahlung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bankverbindungDirektzahlung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (anliegenbeistandschaftEEnum,
		   source,
		   new String[] {
			   "name", "anliegenbeistandschaft"
		   });
		addAnnotation
		  (anliegenbeistandschaftObjectEDataType,
		   source,
		   new String[] {
			   "name", "anliegenbeistandschaft:Object",
			   "baseType", "anliegenbeistandschaft"
		   });
		addAnnotation
		  (anliegensklaerungBSSTypeEClass,
		   source,
		   new String[] {
			   "name", "AnliegensklaerungBSSType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAnliegensklaerungBSSType_AnliegenBeistandschaft(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anliegenBeistandschaft",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnliegensklaerungBSSType_VaterschaftAnerkannt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "vaterschaftAnerkannt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnliegensklaerungBSSType_InhaberElterlicheSorge(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "inhaberElterlicheSorge",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (antragstellenderElternteilBeendigungTypeEClass,
		   source,
		   new String[] {
			   "name", "AntragstellenderElternteilBeendigungType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAntragstellenderElternteilBeendigungType_Namen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "namen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragstellenderElternteilBeendigungType_Geburtsdaten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsdaten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragstellenderElternteilBeendigungType_Adresse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "adresse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragstellenderElternteilBeendigungType_AbweichendeAdresse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "abweichendeAdresse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragstellenderElternteilBeendigungType_AbweichendeAdressePerso(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "abweichendeAdressePerso",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragstellenderElternteilBeendigungType_AbweichendeAdresseNachweis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "abweichendeAdresseNachweis",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (antragstellenderElternteilTypeEClass,
		   source,
		   new String[] {
			   "name", "AntragstellenderElternteilType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAntragstellenderElternteilType_Namen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "namen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragstellenderElternteilType_Geburtsdaten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsdaten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragstellenderElternteilType_Familienstand(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "familienstand",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragstellenderElternteilType_Adresse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "adresse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragstellenderElternteilType_AbweichendeAdresse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "abweichendeAdresse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragstellenderElternteilType_AbweichendeAdressePerso(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "abweichendeAdressePerso",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragstellenderElternteilType_Erreichbarkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "erreichbarkeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragstellenderElternteilType_OeffentlicheLeistungen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "oeffentlicheLeistungen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragstellenderElternteilType_SonstigeLeistungenBeschreibung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sonstigeLeistungenBeschreibung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (ausbildungUndEinkuenfteTypeEClass,
		   source,
		   new String[] {
			   "name", "AusbildungUndEinkuenfteType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAusbildungUndEinkuenfteType_KindInAusbildung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kindInAusbildung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAusbildungUndEinkuenfteType_Ausbildungsjahr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ausbildungsjahr",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAusbildungUndEinkuenfteType_EinkuenfteKind(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "einkuenfteKind",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAusbildungUndEinkuenfteType_EinkuenfteArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "einkuenfteArt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAusbildungUndEinkuenfteType_Kindergeld(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kindergeld",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (beistandschaftAntrag0601TypeEClass,
		   source,
		   new String[] {
			   "name", "beistandschaft.antrag.0601_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBeistandschaftAntrag0601Type_Anliegensklaerung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anliegensklaerung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeistandschaftAntrag0601Type_AntragstellenderElternteil(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "antragstellenderElternteil",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeistandschaftAntrag0601Type_AngabenZumKind(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenZumKind",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeistandschaftAntrag0601Type_AngabenZumAnderenElternteil(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenZumAnderenElternteil",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeistandschaftAntrag0601Type_AngabenZumUnterhalt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenZumUnterhalt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeistandschaftAntrag0601Type_Nachweise(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweise",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeistandschaftAntrag0601Type_WartenAufUnterschrift(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wartenAufUnterschrift",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeistandschaftAntrag0601Type_Dsgvo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dsgvo",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeistandschaftAntrag0601Type_RichtigkeitDerAngaben(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "richtigkeitDerAngaben",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeistandschaftAntrag0601Type_PdfAntrag(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "pdfAntrag",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeistandschaftAntrag0601Type_MerkblattUVG(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "merkblattUVG",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (beistandschaftBeendigung0604TypeEClass,
		   source,
		   new String[] {
			   "name", "beistandschaft.beendigung.0604_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBeistandschaftBeendigung0604Type_AntragstellenderElternteilBeendigung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "antragstellenderElternteilBeendigung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeistandschaftBeendigung0604Type_AngabenZumKindBeendigung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenZumKindBeendigung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeistandschaftBeendigung0604Type_BeendigungBestaetigung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "beendigungBestaetigung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeistandschaftBeendigung0604Type_Dsgvo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dsgvo",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeistandschaftBeendigung0604Type_RichtigkeitDerAngaben(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "richtigkeitDerAngaben",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeistandschaftBeendigung0604Type_WartenAufUnterschrift(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wartenAufUnterschrift",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (bezugoeffentlicherleistungenEEnum,
		   source,
		   new String[] {
			   "name", "bezugoeffentlicherleistungen"
		   });
		addAnnotation
		  (bezugoeffentlicherleistungenObjectEDataType,
		   source,
		   new String[] {
			   "name", "bezugoeffentlicherleistungen:Object",
			   "baseType", "bezugoeffentlicherleistungen"
		   });
		addAnnotation
		  (codeAnliegenBeistandschaftTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.AnliegenBeistandschaftType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeBezugOeffentlicherLeistungenTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.BezugOeffentlicherLeistungenType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeEinkommenAndererElternteilTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.EinkommenAndererElternteilType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeInhaberElterlicheSorgeTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.InhaberElterlicheSorgeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeUnterhaltstitelBestehtTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.UnterhaltstitelBestehtType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeZahlungsartBSSTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.ZahlungsartBSSType",
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
		  (getDocumentRoot_BeistandschaftAntrag0601(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "beistandschaft.antrag.0601",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_BeistandschaftBeendigung0604(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "beistandschaft.beendigung.0604",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (einkommenandererelternteilEEnum,
		   source,
		   new String[] {
			   "name", "einkommenandererelternteil"
		   });
		addAnnotation
		  (einkommenandererelternteilObjectEDataType,
		   source,
		   new String[] {
			   "name", "einkommenandererelternteil:Object",
			   "baseType", "einkommenandererelternteil"
		   });
		addAnnotation
		  (geburtTypeEClass,
		   source,
		   new String[] {
			   "name", "GeburtType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGeburtType_Geburtsort(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsort",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGeburtType_GeburtsortStaat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsortStaat",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGeburtType_Geburtsdatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsdatum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (inhaberelterlichesorgeEEnum,
		   source,
		   new String[] {
			   "name", "inhaberelterlichesorge"
		   });
		addAnnotation
		  (inhaberelterlichesorgeObjectEDataType,
		   source,
		   new String[] {
			   "name", "inhaberelterlichesorge:Object",
			   "baseType", "inhaberelterlichesorge"
		   });
		addAnnotation
		  (nachweiseBSSTypeEClass,
		   source,
		   new String[] {
			   "name", "NachweiseBSSType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNachweiseBSSType_Sorgerechtsnachweis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sorgerechtsnachweis",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweiseBSSType_Identitaetsnachweis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "identitaetsnachweis",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweiseBSSType_WeitereNachweise(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "weitereNachweise",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweiseBSSType_NachweisMeldebescheinigung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweisMeldebescheinigung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweiseBSSType_Anmerkungen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anmerkungen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweiseBSSType_Dsgvo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dsgvo",
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
		  (getNachweisType_NachweisBeschreibung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweisBeschreibung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweisType_NachweisDokument(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweisDokument",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (unterhaltstitelbestehtEEnum,
		   source,
		   new String[] {
			   "name", "unterhaltstitelbesteht"
		   });
		addAnnotation
		  (unterhaltstitelbestehtObjectEDataType,
		   source,
		   new String[] {
			   "name", "unterhaltstitelbesteht:Object",
			   "baseType", "unterhaltstitelbesteht"
		   });
		addAnnotation
		  (weitereAngabenZumAnderenElternteilTypeEClass,
		   source,
		   new String[] {
			   "name", "WeitereAngabenZumAnderenElternteilType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getWeitereAngabenZumAnderenElternteilType_Berufausausbildung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "berufausausbildung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWeitereAngabenZumAnderenElternteilType_AngabenBerufsausbildung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenBerufsausbildung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWeitereAngabenZumAnderenElternteilType_Einkommensverhaeltnisse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "einkommensverhaeltnisse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWeitereAngabenZumAnderenElternteilType_Nettoeinkommen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nettoeinkommen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWeitereAngabenZumAnderenElternteilType_Einkommen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "einkommen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWeitereAngabenZumAnderenElternteilType_WeitereKinder(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "weitereKinder",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWeitereAngabenZumAnderenElternteilType_WeitereKinderImHaushalt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "weitereKinderImHaushalt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWeitereAngabenZumAnderenElternteilType_WeitereKinderAngaben(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "weitereKinderAngaben",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (weitereKinderTypeEClass,
		   source,
		   new String[] {
			   "name", "WeitereKinderType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getWeitereKinderType_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWeitereKinderType_Geburtsdatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsdatum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (zahlungsartbssEEnum,
		   source,
		   new String[] {
			   "name", "zahlungsartbss"
		   });
		addAnnotation
		  (zahlungsartbssObjectEDataType,
		   source,
		   new String[] {
			   "name", "zahlungsartbss:Object",
			   "baseType", "zahlungsartbss"
		   });
	}

} //BeistandschaftPackageImpl
