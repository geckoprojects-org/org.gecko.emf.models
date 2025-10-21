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
package de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl;

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

import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenETType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilEingliederungType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilHJVType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindEingliederungType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHZEType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichHZEType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichKontaktformularType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AnliegensklaerungAnfrageType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AnliegensklaerungType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Aufenthaltsort;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AuswahlBescheidartHZE;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AuswahlBescheidartType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Auswahlderhilfehze;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.BegruendungDesHilfebedarfsType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.CodeAufenthaltType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.CodeAuswahlDerHilfeHzEType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.CodeHZEIchBinType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.CodeVerhaeltnisJugendlichHZEType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErreichbarkeitHZEType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfeFactory;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweisType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseDatenschutzType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHJVType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHZEType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenKontaktformularType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersonIdentifikationType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Verhaeltnisjugendlichhze;

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
public class ErziehungshilfePackageImpl extends EPackageImpl implements ErziehungshilfePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angabenElternteilEingliederungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angabenElternteilHJVTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angabenETTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angabenKindEingliederungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angabenKindHJVTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angabenKindHZETypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angabenZuJugendlichHZETypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angabenZuJugendlichKontaktformularTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anliegensklaerungAnfrageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anliegensklaerungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass antragstellenderETTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auswahlBescheidartTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass begruendungDesHilfebedarfsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeAufenthaltTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeAuswahlDerHilfeHzETypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeHZEIchBinTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeVerhaeltnisJugendlichHZETypeEClass = null;

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
	private EClass erreichbarkeitHZETypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hilfenZurErziehungAnfrageHJV0702TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hilfenZurErziehungAntrag0701TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hilfenZurErziehungEingliederungshilfe0703TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hilfenZurErziehungNachweisnachricht0711TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hilfenZurErziehungWiderspruch0704TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nachweiseDatenschutzTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nachweiseHZETypeEClass = null;

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
	private EClass persoenlicheAngabenEingliederungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persoenlicheAngabenHJVTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persoenlicheAngabenHZETypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persoenlicheAngabenKontaktformularTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personIdentifikationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aufenthaltsortEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum auswahlBescheidartHZEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum auswahlderhilfehzeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum verhaeltnisjugendlichhzeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType aufenthaltsortObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType auswahlBescheidartHZEObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType auswahlderhilfehzeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType verhaeltnisjugendlichhzeObjectEDataType = null;

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
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ErziehungshilfePackageImpl() {
		super(eNS_URI, ErziehungshilfeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ErziehungshilfePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ErziehungshilfePackage init() {
		if (isInited) return (ErziehungshilfePackage)EPackage.Registry.INSTANCE.getEPackage(ErziehungshilfePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredErziehungshilfePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ErziehungshilfePackageImpl theErziehungshilfePackage = registeredErziehungshilfePackage instanceof ErziehungshilfePackageImpl ? (ErziehungshilfePackageImpl)registeredErziehungshilfePackage : new ErziehungshilfePackageImpl();

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
		theErziehungshilfePackage.createPackageContents();
		theAdoptionPackage.createPackageContents();
		theBaukastenPackage.createPackageContents();
		theAllgemeineNachrichtenPackage.createPackageContents();
		theBeistandschaftPackage.createPackageContents();
		theDSRVPackage.createPackageContents();
		theGeburtPackage.createPackageContents();
		theKinderwunschPackage.createPackageContents();
		theMutterschaftsgeldPackage.createPackageContents();

		// Initialize created meta-data
		theErziehungshilfePackage.initializePackageContents();
		theAdoptionPackage.initializePackageContents();
		theBaukastenPackage.initializePackageContents();
		theAllgemeineNachrichtenPackage.initializePackageContents();
		theBeistandschaftPackage.initializePackageContents();
		theDSRVPackage.initializePackageContents();
		theGeburtPackage.initializePackageContents();
		theKinderwunschPackage.initializePackageContents();
		theMutterschaftsgeldPackage.initializePackageContents();

		// Fix loaded packages
		theElterngeldPackage.fixPackageContents();
		theUnterhaltsvorschussPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theErziehungshilfePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ErziehungshilfePackage.eNS_URI, theErziehungshilfePackage);
		return theErziehungshilfePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAngabenElternteilEingliederungType() {
		return angabenElternteilEingliederungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenElternteilEingliederungType_Namen() {
		return (EReference)angabenElternteilEingliederungTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenElternteilEingliederungType_AngabenGeburtElternteil() {
		return (EReference)angabenElternteilEingliederungTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenElternteilEingliederungType_AktuelleAnschrift() {
		return (EReference)angabenElternteilEingliederungTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenElternteilEingliederungType_Kontaktdaten() {
		return (EReference)angabenElternteilEingliederungTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAngabenElternteilHJVType() {
		return angabenElternteilHJVTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenElternteilHJVType_Namen() {
		return (EReference)angabenElternteilHJVTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenElternteilHJVType_Geburtsdatum() {
		return (EAttribute)angabenElternteilHJVTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenElternteilHJVType_AktuelleAnschrift() {
		return (EReference)angabenElternteilHJVTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenElternteilHJVType_Kontaktdaten() {
		return (EReference)angabenElternteilHJVTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAngabenETType() {
		return angabenETTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenETType_Namen() {
		return (EReference)angabenETTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenETType_Kontaktdaten() {
		return (EReference)angabenETTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAngabenKindEingliederungType() {
		return angabenKindEingliederungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenKindEingliederungType_Namen() {
		return (EReference)angabenKindEingliederungTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenKindEingliederungType_Geburtsdatum() {
		return (EAttribute)angabenKindEingliederungTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenKindEingliederungType_Geschlecht() {
		return (EReference)angabenKindEingliederungTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenKindEingliederungType_Aufenthaltsort() {
		return (EReference)angabenKindEingliederungTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenKindEingliederungType_JugendlichAufenthaltsortSonstige() {
		return (EAttribute)angabenKindEingliederungTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenKindEingliederungType_AktuelleAnschrift() {
		return (EReference)angabenKindEingliederungTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenKindEingliederungType_Anschriftsaenderung() {
		return (EAttribute)angabenKindEingliederungTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenKindEingliederungType_SeelischeBehinderung() {
		return (EAttribute)angabenKindEingliederungTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenKindEingliederungType_ArtDerBehinderung() {
		return (EAttribute)angabenKindEingliederungTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenKindEingliederungType_AerztlicherNachweis() {
		return (EAttribute)angabenKindEingliederungTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAngabenKindHJVType() {
		return angabenKindHJVTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenKindHJVType_Namen() {
		return (EReference)angabenKindHJVTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenKindHJVType_Geburtsdatum() {
		return (EAttribute)angabenKindHJVTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenKindHJVType_Geschlecht() {
		return (EReference)angabenKindHJVTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenKindHJVType_Aufenthaltsort() {
		return (EReference)angabenKindHJVTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenKindHJVType_JugendlichAufenthaltsortSonstige() {
		return (EAttribute)angabenKindHJVTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenKindHJVType_AktuelleAnschrift() {
		return (EReference)angabenKindHJVTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenKindHJVType_Anschriftsaenderung() {
		return (EAttribute)angabenKindHJVTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAngabenKindHZEType() {
		return angabenKindHZETypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenKindHZEType_Namen() {
		return (EReference)angabenKindHZETypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenKindHZEType_Geburtsdatum() {
		return (EAttribute)angabenKindHZETypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAngabenZuJugendlichHZEType() {
		return angabenZuJugendlichHZETypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZuJugendlichHZEType_NameDerDesJugendlichen() {
		return (EReference)angabenZuJugendlichHZETypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZuJugendlichHZEType_Geburtsdatum() {
		return (EAttribute)angabenZuJugendlichHZETypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZuJugendlichHZEType_AktuelleAnschrift() {
		return (EReference)angabenZuJugendlichHZETypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZuJugendlichHZEType_Anschriftsaenderung() {
		return (EAttribute)angabenZuJugendlichHZETypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZuJugendlichHZEType_AbweichendeAnschrift() {
		return (EReference)angabenZuJugendlichHZETypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAngabenZuJugendlichKontaktformularType() {
		return angabenZuJugendlichKontaktformularTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZuJugendlichKontaktformularType_NameDerDesJugendlichen() {
		return (EReference)angabenZuJugendlichKontaktformularTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZuJugendlichKontaktformularType_Geburtsdatum() {
		return (EAttribute)angabenZuJugendlichKontaktformularTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZuJugendlichKontaktformularType_AnschriftStimmtUeberein() {
		return (EAttribute)angabenZuJugendlichKontaktformularTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZuJugendlichKontaktformularType_AktuelleAnschrift() {
		return (EReference)angabenZuJugendlichKontaktformularTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnliegensklaerungAnfrageType() {
		return anliegensklaerungAnfrageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnliegensklaerungAnfrageType_AnliegenVerhaeltnisJugendlich() {
		return (EReference)anliegensklaerungAnfrageTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnliegensklaerungAnfrageType_SorgeberechtigtAbfrage() {
		return (EAttribute)anliegensklaerungAnfrageTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnliegensklaerungAnfrageType_GemeinsamSorgeberechtigt() {
		return (EAttribute)anliegensklaerungAnfrageTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnliegensklaerungType() {
		return anliegensklaerungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnliegensklaerungType_AnliegenVerhaeltnisJugendlich() {
		return (EReference)anliegensklaerungTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnliegensklaerungType_GemeinsamSorgeberechtigt() {
		return (EAttribute)anliegensklaerungTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAntragstellenderETType() {
		return antragstellenderETTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderETType_Namen() {
		return (EReference)antragstellenderETTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAntragstellenderETType_Geburtsort() {
		return (EAttribute)antragstellenderETTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAntragstellenderETType_Geburtsdatum() {
		return (EAttribute)antragstellenderETTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderETType_Adresse() {
		return (EReference)antragstellenderETTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAntragstellenderETType_AbweichendeAdresse() {
		return (EAttribute)antragstellenderETTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderETType_AbweichendeAdressePerso() {
		return (EReference)antragstellenderETTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderETType_Kontaktdaten() {
		return (EReference)antragstellenderETTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuswahlBescheidartType() {
		return auswahlBescheidartTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBegruendungDesHilfebedarfsType() {
		return begruendungDesHilfebedarfsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBegruendungDesHilfebedarfsType_GrundBeantragung() {
		return (EAttribute)begruendungDesHilfebedarfsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBegruendungDesHilfebedarfsType_HilfeVomJugendamt() {
		return (EAttribute)begruendungDesHilfebedarfsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeAufenthaltType() {
		return codeAufenthaltTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeAuswahlDerHilfeHzEType() {
		return codeAuswahlDerHilfeHzETypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeHZEIchBinType() {
		return codeHZEIchBinTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeVerhaeltnisJugendlichHZEType() {
		return codeVerhaeltnisJugendlichHZETypeEClass;
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
	public EReference getDocumentRoot_HilfenZurErziehungAnfrageHJV0702() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_HilfenZurErziehungAntrag0701() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_HilfenZurErziehungEingliederungshilfe0703() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_HilfenZurErziehungNachweisnachricht0711() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_HilfenZurErziehungWiderspruch0704() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getErreichbarkeitHZEType() {
		return erreichbarkeitHZETypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getErreichbarkeitHZEType_ZeitErreichbarkeitHZE() {
		return (EAttribute)erreichbarkeitHZETypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHilfenZurErziehungAnfrageHJV0702Type() {
		return hilfenZurErziehungAnfrageHJV0702TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHilfenZurErziehungAnfrageHJV0702Type_AuswahlAnfrageHJV() {
		return (EReference)hilfenZurErziehungAnfrageHJV0702TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHilfenZurErziehungAnfrageHJV0702Type_AnliegensklaerungHJV() {
		return (EReference)hilfenZurErziehungAnfrageHJV0702TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHilfenZurErziehungAnfrageHJV0702Type_PersoenlicheAngabenHJV() {
		return (EReference)hilfenZurErziehungAnfrageHJV0702TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHilfenZurErziehungAnfrageHJV0702Type_BegruendungHJV() {
		return (EReference)hilfenZurErziehungAnfrageHJV0702TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHilfenZurErziehungAnfrageHJV0702Type_AngabenAndererElternteil() {
		return (EReference)hilfenZurErziehungAnfrageHJV0702TypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHilfenZurErziehungAnfrageHJV0702Type_Dsgvo() {
		return (EReference)hilfenZurErziehungAnfrageHJV0702TypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHilfenZurErziehungAnfrageHJV0702Type_RichtigkeitAngaben() {
		return (EAttribute)hilfenZurErziehungAnfrageHJV0702TypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHilfenZurErziehungAnfrageHJV0702Type_EinwilligungZwischenspeichern() {
		return (EAttribute)hilfenZurErziehungAnfrageHJV0702TypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHilfenZurErziehungAntrag0701Type() {
		return hilfenZurErziehungAntrag0701TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHilfenZurErziehungAntrag0701Type_AuswahlDerHilfeHZE() {
		return (EReference)hilfenZurErziehungAntrag0701TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHilfenZurErziehungAntrag0701Type_AnliegensklaerungHZE() {
		return (EReference)hilfenZurErziehungAntrag0701TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHilfenZurErziehungAntrag0701Type_PruefcodeHZE() {
		return (EAttribute)hilfenZurErziehungAntrag0701TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHilfenZurErziehungAntrag0701Type_PersoenlicheAngabenZuIhrerPerson() {
		return (EReference)hilfenZurErziehungAntrag0701TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHilfenZurErziehungAntrag0701Type_AndererElternteil() {
		return (EReference)hilfenZurErziehungAntrag0701TypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHilfenZurErziehungAntrag0701Type_AngabenKindHZE() {
		return (EReference)hilfenZurErziehungAntrag0701TypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHilfenZurErziehungAntrag0701Type_NachweiseHZE() {
		return (EReference)hilfenZurErziehungAntrag0701TypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHilfenZurErziehungAntrag0701Type_Dsgvo() {
		return (EReference)hilfenZurErziehungAntrag0701TypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHilfenZurErziehungAntrag0701Type_ZusatzNachrichtHZE() {
		return (EAttribute)hilfenZurErziehungAntrag0701TypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHilfenZurErziehungAntrag0701Type_EinwilligungZwischenspeichern() {
		return (EAttribute)hilfenZurErziehungAntrag0701TypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHilfenZurErziehungEingliederungshilfe0703Type() {
		return hilfenZurErziehungEingliederungshilfe0703TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHilfenZurErziehungEingliederungshilfe0703Type_AuswahlAnfrageEingliederung() {
		return (EReference)hilfenZurErziehungEingliederungshilfe0703TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHilfenZurErziehungEingliederungshilfe0703Type_AnliegensklaerungEingliederung() {
		return (EReference)hilfenZurErziehungEingliederungshilfe0703TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHilfenZurErziehungEingliederungshilfe0703Type_PersoenlicheAngabenZuIhrerPerson() {
		return (EReference)hilfenZurErziehungEingliederungshilfe0703TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHilfenZurErziehungEingliederungshilfe0703Type_AngabenKind() {
		return (EReference)hilfenZurErziehungEingliederungshilfe0703TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHilfenZurErziehungEingliederungshilfe0703Type_BegruendungHZE() {
		return (EReference)hilfenZurErziehungEingliederungshilfe0703TypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHilfenZurErziehungEingliederungshilfe0703Type_AngabenElternteile() {
		return (EReference)hilfenZurErziehungEingliederungshilfe0703TypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHilfenZurErziehungEingliederungshilfe0703Type_Dsgvo() {
		return (EReference)hilfenZurErziehungEingliederungshilfe0703TypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHilfenZurErziehungEingliederungshilfe0703Type_RichtigkeitAngaben() {
		return (EAttribute)hilfenZurErziehungEingliederungshilfe0703TypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHilfenZurErziehungEingliederungshilfe0703Type_EinwilligungZwischenspeichern() {
		return (EAttribute)hilfenZurErziehungEingliederungshilfe0703TypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHilfenZurErziehungNachweisnachricht0711Type() {
		return hilfenZurErziehungNachweisnachricht0711TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHilfenZurErziehungNachweisnachricht0711Type_PersoenlicheAngabenZuIhrerPerson() {
		return (EReference)hilfenZurErziehungNachweisnachricht0711TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHilfenZurErziehungNachweisnachricht0711Type_AngabenKind() {
		return (EReference)hilfenZurErziehungNachweisnachricht0711TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHilfenZurErziehungNachweisnachricht0711Type_Jugendamt() {
		return (EAttribute)hilfenZurErziehungNachweisnachricht0711TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHilfenZurErziehungNachweisnachricht0711Type_Bearbeitungsnummer() {
		return (EAttribute)hilfenZurErziehungNachweisnachricht0711TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHilfenZurErziehungNachweisnachricht0711Type_Antragsdatum() {
		return (EAttribute)hilfenZurErziehungNachweisnachricht0711TypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHilfenZurErziehungNachweisnachricht0711Type_Nachweis() {
		return (EReference)hilfenZurErziehungNachweisnachricht0711TypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHilfenZurErziehungNachweisnachricht0711Type_ZusatznachrichtHZE() {
		return (EAttribute)hilfenZurErziehungNachweisnachricht0711TypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHilfenZurErziehungWiderspruch0704Type() {
		return hilfenZurErziehungWiderspruch0704TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHilfenZurErziehungWiderspruch0704Type_PersoenlicheAngabenZuIhrerPerson() {
		return (EReference)hilfenZurErziehungWiderspruch0704TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHilfenZurErziehungWiderspruch0704Type_Aktenzeichen() {
		return (EAttribute)hilfenZurErziehungWiderspruch0704TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHilfenZurErziehungWiderspruch0704Type_Bescheiddatum() {
		return (EAttribute)hilfenZurErziehungWiderspruch0704TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHilfenZurErziehungWiderspruch0704Type_BegruendungWiderspruch() {
		return (EAttribute)hilfenZurErziehungWiderspruch0704TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHilfenZurErziehungWiderspruch0704Type_BestaetigungWiderspruch() {
		return (EAttribute)hilfenZurErziehungWiderspruch0704TypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHilfenZurErziehungWiderspruch0704Type_Nachweis() {
		return (EReference)hilfenZurErziehungWiderspruch0704TypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHilfenZurErziehungWiderspruch0704Type_AuswahlBescheidart() {
		return (EReference)hilfenZurErziehungWiderspruch0704TypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNachweiseDatenschutzType() {
		return nachweiseDatenschutzTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachweiseDatenschutzType_Nachweis() {
		return (EReference)nachweiseDatenschutzTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachweiseDatenschutzType_ZustimmungET2() {
		return (EAttribute)nachweiseDatenschutzTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachweiseDatenschutzType_RichtigkeitAngaben() {
		return (EAttribute)nachweiseDatenschutzTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNachweiseHZEType() {
		return nachweiseHZETypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachweiseHZEType_Sorgerechtsnachweis() {
		return (EReference)nachweiseHZETypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachweiseHZEType_Identitaetsnachweis() {
		return (EReference)nachweiseHZETypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachweiseHZEType_WeitereNachweise() {
		return (EReference)nachweiseHZETypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachweiseHZEType_NachweisMeldebescheinigung() {
		return (EReference)nachweiseHZETypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachweiseHZEType_Anmerkungen() {
		return (EAttribute)nachweiseHZETypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachweiseHZEType_Dsgvo() {
		return (EReference)nachweiseHZETypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachweiseHZEType_RichtigkeitAngaben() {
		return (EAttribute)nachweiseHZETypeEClass.getEStructuralFeatures().get(6);
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
	public EClass getPersoenlicheAngabenEingliederungType() {
		return persoenlicheAngabenEingliederungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersoenlicheAngabenEingliederungType_Namen() {
		return (EReference)persoenlicheAngabenEingliederungTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersoenlicheAngabenEingliederungType_Geburtsdatum() {
		return (EAttribute)persoenlicheAngabenEingliederungTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersoenlicheAngabenEingliederungType_AktuelleAnschrift() {
		return (EReference)persoenlicheAngabenEingliederungTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersoenlicheAngabenEingliederungType_Anschriftsaenderung() {
		return (EAttribute)persoenlicheAngabenEingliederungTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersoenlicheAngabenEingliederungType_WeichtAnschriftAb() {
		return (EAttribute)persoenlicheAngabenEingliederungTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersoenlicheAngabenEingliederungType_AbweichendeAnschrift() {
		return (EReference)persoenlicheAngabenEingliederungTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersoenlicheAngabenEingliederungType_Kontaktdaten() {
		return (EReference)persoenlicheAngabenEingliederungTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersoenlicheAngabenEingliederungType_SeelischeBehinderung() {
		return (EAttribute)persoenlicheAngabenEingliederungTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersoenlicheAngabenEingliederungType_ArtDerBehinderung() {
		return (EAttribute)persoenlicheAngabenEingliederungTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersoenlicheAngabenEingliederungType_AerztlicherNachweis() {
		return (EAttribute)persoenlicheAngabenEingliederungTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersoenlicheAngabenHJVType() {
		return persoenlicheAngabenHJVTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersoenlicheAngabenHJVType_Namen() {
		return (EReference)persoenlicheAngabenHJVTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersoenlicheAngabenHJVType_Geburtsdatum() {
		return (EAttribute)persoenlicheAngabenHJVTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersoenlicheAngabenHJVType_AktuelleAnschrift() {
		return (EReference)persoenlicheAngabenHJVTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersoenlicheAngabenHJVType_Anschriftsaenderung() {
		return (EAttribute)persoenlicheAngabenHJVTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersoenlicheAngabenHJVType_WeichtAnschriftAb() {
		return (EAttribute)persoenlicheAngabenHJVTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersoenlicheAngabenHJVType_AbweichendeAnschrift() {
		return (EReference)persoenlicheAngabenHJVTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersoenlicheAngabenHJVType_Kontaktdaten() {
		return (EReference)persoenlicheAngabenHJVTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersoenlicheAngabenHJVType_AufenthaltsortSonstige() {
		return (EAttribute)persoenlicheAngabenHJVTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersoenlicheAngabenHZEType() {
		return persoenlicheAngabenHZETypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersoenlicheAngabenHZEType_Namen() {
		return (EReference)persoenlicheAngabenHZETypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersoenlicheAngabenHZEType_Geburtsdatum() {
		return (EAttribute)persoenlicheAngabenHZETypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersoenlicheAngabenHZEType_AktuelleAnschrift() {
		return (EReference)persoenlicheAngabenHZETypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersoenlicheAngabenHZEType_WeichtAnschriftAb() {
		return (EAttribute)persoenlicheAngabenHZETypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersoenlicheAngabenHZEType_AbweichendeAnschrift() {
		return (EReference)persoenlicheAngabenHZETypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersoenlicheAngabenHZEType_Kontaktdaten() {
		return (EReference)persoenlicheAngabenHZETypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersoenlicheAngabenKontaktformularType() {
		return persoenlicheAngabenKontaktformularTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersoenlicheAngabenKontaktformularType_Namen() {
		return (EReference)persoenlicheAngabenKontaktformularTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersoenlicheAngabenKontaktformularType_AktuelleAnschrift() {
		return (EReference)persoenlicheAngabenKontaktformularTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersoenlicheAngabenKontaktformularType_Kontaktdaten() {
		return (EReference)persoenlicheAngabenKontaktformularTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersonIdentifikationType() {
		return personIdentifikationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersonIdentifikationType_Namen() {
		return (EReference)personIdentifikationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersonIdentifikationType_Geburtsdatum() {
		return (EAttribute)personIdentifikationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAufenthaltsort() {
		return aufenthaltsortEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAuswahlBescheidartHZE() {
		return auswahlBescheidartHZEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAuswahlderhilfehze() {
		return auswahlderhilfehzeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVerhaeltnisjugendlichhze() {
		return verhaeltnisjugendlichhzeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAufenthaltsortObject() {
		return aufenthaltsortObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAuswahlBescheidartHZEObject() {
		return auswahlBescheidartHZEObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAuswahlderhilfehzeObject() {
		return auswahlderhilfehzeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVerhaeltnisjugendlichhzeObject() {
		return verhaeltnisjugendlichhzeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErziehungshilfeFactory getErziehungshilfeFactory() {
		return (ErziehungshilfeFactory)getEFactoryInstance();
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
		angabenElternteilEingliederungTypeEClass = createEClass(ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE);
		createEReference(angabenElternteilEingliederungTypeEClass, ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__NAMEN);
		createEReference(angabenElternteilEingliederungTypeEClass, ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__ANGABEN_GEBURT_ELTERNTEIL);
		createEReference(angabenElternteilEingliederungTypeEClass, ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__AKTUELLE_ANSCHRIFT);
		createEReference(angabenElternteilEingliederungTypeEClass, ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__KONTAKTDATEN);

		angabenElternteilHJVTypeEClass = createEClass(ANGABEN_ELTERNTEIL_HJV_TYPE);
		createEReference(angabenElternteilHJVTypeEClass, ANGABEN_ELTERNTEIL_HJV_TYPE__NAMEN);
		createEAttribute(angabenElternteilHJVTypeEClass, ANGABEN_ELTERNTEIL_HJV_TYPE__GEBURTSDATUM);
		createEReference(angabenElternteilHJVTypeEClass, ANGABEN_ELTERNTEIL_HJV_TYPE__AKTUELLE_ANSCHRIFT);
		createEReference(angabenElternteilHJVTypeEClass, ANGABEN_ELTERNTEIL_HJV_TYPE__KONTAKTDATEN);

		angabenETTypeEClass = createEClass(ANGABEN_ET_TYPE);
		createEReference(angabenETTypeEClass, ANGABEN_ET_TYPE__NAMEN);
		createEReference(angabenETTypeEClass, ANGABEN_ET_TYPE__KONTAKTDATEN);

		angabenKindEingliederungTypeEClass = createEClass(ANGABEN_KIND_EINGLIEDERUNG_TYPE);
		createEReference(angabenKindEingliederungTypeEClass, ANGABEN_KIND_EINGLIEDERUNG_TYPE__NAMEN);
		createEAttribute(angabenKindEingliederungTypeEClass, ANGABEN_KIND_EINGLIEDERUNG_TYPE__GEBURTSDATUM);
		createEReference(angabenKindEingliederungTypeEClass, ANGABEN_KIND_EINGLIEDERUNG_TYPE__GESCHLECHT);
		createEReference(angabenKindEingliederungTypeEClass, ANGABEN_KIND_EINGLIEDERUNG_TYPE__AUFENTHALTSORT);
		createEAttribute(angabenKindEingliederungTypeEClass, ANGABEN_KIND_EINGLIEDERUNG_TYPE__JUGENDLICH_AUFENTHALTSORT_SONSTIGE);
		createEReference(angabenKindEingliederungTypeEClass, ANGABEN_KIND_EINGLIEDERUNG_TYPE__AKTUELLE_ANSCHRIFT);
		createEAttribute(angabenKindEingliederungTypeEClass, ANGABEN_KIND_EINGLIEDERUNG_TYPE__ANSCHRIFTSAENDERUNG);
		createEAttribute(angabenKindEingliederungTypeEClass, ANGABEN_KIND_EINGLIEDERUNG_TYPE__SEELISCHE_BEHINDERUNG);
		createEAttribute(angabenKindEingliederungTypeEClass, ANGABEN_KIND_EINGLIEDERUNG_TYPE__ART_DER_BEHINDERUNG);
		createEAttribute(angabenKindEingliederungTypeEClass, ANGABEN_KIND_EINGLIEDERUNG_TYPE__AERZTLICHER_NACHWEIS);

		angabenKindHJVTypeEClass = createEClass(ANGABEN_KIND_HJV_TYPE);
		createEReference(angabenKindHJVTypeEClass, ANGABEN_KIND_HJV_TYPE__NAMEN);
		createEAttribute(angabenKindHJVTypeEClass, ANGABEN_KIND_HJV_TYPE__GEBURTSDATUM);
		createEReference(angabenKindHJVTypeEClass, ANGABEN_KIND_HJV_TYPE__GESCHLECHT);
		createEReference(angabenKindHJVTypeEClass, ANGABEN_KIND_HJV_TYPE__AUFENTHALTSORT);
		createEAttribute(angabenKindHJVTypeEClass, ANGABEN_KIND_HJV_TYPE__JUGENDLICH_AUFENTHALTSORT_SONSTIGE);
		createEReference(angabenKindHJVTypeEClass, ANGABEN_KIND_HJV_TYPE__AKTUELLE_ANSCHRIFT);
		createEAttribute(angabenKindHJVTypeEClass, ANGABEN_KIND_HJV_TYPE__ANSCHRIFTSAENDERUNG);

		angabenKindHZETypeEClass = createEClass(ANGABEN_KIND_HZE_TYPE);
		createEReference(angabenKindHZETypeEClass, ANGABEN_KIND_HZE_TYPE__NAMEN);
		createEAttribute(angabenKindHZETypeEClass, ANGABEN_KIND_HZE_TYPE__GEBURTSDATUM);

		angabenZuJugendlichHZETypeEClass = createEClass(ANGABEN_ZU_JUGENDLICH_HZE_TYPE);
		createEReference(angabenZuJugendlichHZETypeEClass, ANGABEN_ZU_JUGENDLICH_HZE_TYPE__NAME_DER_DES_JUGENDLICHEN);
		createEAttribute(angabenZuJugendlichHZETypeEClass, ANGABEN_ZU_JUGENDLICH_HZE_TYPE__GEBURTSDATUM);
		createEReference(angabenZuJugendlichHZETypeEClass, ANGABEN_ZU_JUGENDLICH_HZE_TYPE__AKTUELLE_ANSCHRIFT);
		createEAttribute(angabenZuJugendlichHZETypeEClass, ANGABEN_ZU_JUGENDLICH_HZE_TYPE__ANSCHRIFTSAENDERUNG);
		createEReference(angabenZuJugendlichHZETypeEClass, ANGABEN_ZU_JUGENDLICH_HZE_TYPE__ABWEICHENDE_ANSCHRIFT);

		angabenZuJugendlichKontaktformularTypeEClass = createEClass(ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE);
		createEReference(angabenZuJugendlichKontaktformularTypeEClass, ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__NAME_DER_DES_JUGENDLICHEN);
		createEAttribute(angabenZuJugendlichKontaktformularTypeEClass, ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__GEBURTSDATUM);
		createEAttribute(angabenZuJugendlichKontaktformularTypeEClass, ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__ANSCHRIFT_STIMMT_UEBEREIN);
		createEReference(angabenZuJugendlichKontaktformularTypeEClass, ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__AKTUELLE_ANSCHRIFT);

		anliegensklaerungAnfrageTypeEClass = createEClass(ANLIEGENSKLAERUNG_ANFRAGE_TYPE);
		createEReference(anliegensklaerungAnfrageTypeEClass, ANLIEGENSKLAERUNG_ANFRAGE_TYPE__ANLIEGEN_VERHAELTNIS_JUGENDLICH);
		createEAttribute(anliegensklaerungAnfrageTypeEClass, ANLIEGENSKLAERUNG_ANFRAGE_TYPE__SORGEBERECHTIGT_ABFRAGE);
		createEAttribute(anliegensklaerungAnfrageTypeEClass, ANLIEGENSKLAERUNG_ANFRAGE_TYPE__GEMEINSAM_SORGEBERECHTIGT);

		anliegensklaerungTypeEClass = createEClass(ANLIEGENSKLAERUNG_TYPE);
		createEReference(anliegensklaerungTypeEClass, ANLIEGENSKLAERUNG_TYPE__ANLIEGEN_VERHAELTNIS_JUGENDLICH);
		createEAttribute(anliegensklaerungTypeEClass, ANLIEGENSKLAERUNG_TYPE__GEMEINSAM_SORGEBERECHTIGT);

		antragstellenderETTypeEClass = createEClass(ANTRAGSTELLENDER_ET_TYPE);
		createEReference(antragstellenderETTypeEClass, ANTRAGSTELLENDER_ET_TYPE__NAMEN);
		createEAttribute(antragstellenderETTypeEClass, ANTRAGSTELLENDER_ET_TYPE__GEBURTSORT);
		createEAttribute(antragstellenderETTypeEClass, ANTRAGSTELLENDER_ET_TYPE__GEBURTSDATUM);
		createEReference(antragstellenderETTypeEClass, ANTRAGSTELLENDER_ET_TYPE__ADRESSE);
		createEAttribute(antragstellenderETTypeEClass, ANTRAGSTELLENDER_ET_TYPE__ABWEICHENDE_ADRESSE);
		createEReference(antragstellenderETTypeEClass, ANTRAGSTELLENDER_ET_TYPE__ABWEICHENDE_ADRESSE_PERSO);
		createEReference(antragstellenderETTypeEClass, ANTRAGSTELLENDER_ET_TYPE__KONTAKTDATEN);

		auswahlBescheidartTypeEClass = createEClass(AUSWAHL_BESCHEIDART_TYPE);

		begruendungDesHilfebedarfsTypeEClass = createEClass(BEGRUENDUNG_DES_HILFEBEDARFS_TYPE);
		createEAttribute(begruendungDesHilfebedarfsTypeEClass, BEGRUENDUNG_DES_HILFEBEDARFS_TYPE__GRUND_BEANTRAGUNG);
		createEAttribute(begruendungDesHilfebedarfsTypeEClass, BEGRUENDUNG_DES_HILFEBEDARFS_TYPE__HILFE_VOM_JUGENDAMT);

		codeAufenthaltTypeEClass = createEClass(CODE_AUFENTHALT_TYPE);

		codeAuswahlDerHilfeHzETypeEClass = createEClass(CODE_AUSWAHL_DER_HILFE_HZ_ETYPE);

		codeHZEIchBinTypeEClass = createEClass(CODE_HZE_ICH_BIN_TYPE);

		codeVerhaeltnisJugendlichHZETypeEClass = createEClass(CODE_VERHAELTNIS_JUGENDLICH_HZE_TYPE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_ANTRAG0701);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704);

		erreichbarkeitHZETypeEClass = createEClass(ERREICHBARKEIT_HZE_TYPE);
		createEAttribute(erreichbarkeitHZETypeEClass, ERREICHBARKEIT_HZE_TYPE__ZEIT_ERREICHBARKEIT_HZE);

		hilfenZurErziehungAnfrageHJV0702TypeEClass = createEClass(HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE);
		createEReference(hilfenZurErziehungAnfrageHJV0702TypeEClass, HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__AUSWAHL_ANFRAGE_HJV);
		createEReference(hilfenZurErziehungAnfrageHJV0702TypeEClass, HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__ANLIEGENSKLAERUNG_HJV);
		createEReference(hilfenZurErziehungAnfrageHJV0702TypeEClass, HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__PERSOENLICHE_ANGABEN_HJV);
		createEReference(hilfenZurErziehungAnfrageHJV0702TypeEClass, HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__BEGRUENDUNG_HJV);
		createEReference(hilfenZurErziehungAnfrageHJV0702TypeEClass, HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__ANGABEN_ANDERER_ELTERNTEIL);
		createEReference(hilfenZurErziehungAnfrageHJV0702TypeEClass, HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__DSGVO);
		createEAttribute(hilfenZurErziehungAnfrageHJV0702TypeEClass, HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__RICHTIGKEIT_ANGABEN);
		createEAttribute(hilfenZurErziehungAnfrageHJV0702TypeEClass, HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__EINWILLIGUNG_ZWISCHENSPEICHERN);

		hilfenZurErziehungAntrag0701TypeEClass = createEClass(HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE);
		createEReference(hilfenZurErziehungAntrag0701TypeEClass, HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__AUSWAHL_DER_HILFE_HZE);
		createEReference(hilfenZurErziehungAntrag0701TypeEClass, HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANLIEGENSKLAERUNG_HZE);
		createEAttribute(hilfenZurErziehungAntrag0701TypeEClass, HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__PRUEFCODE_HZE);
		createEReference(hilfenZurErziehungAntrag0701TypeEClass, HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON);
		createEReference(hilfenZurErziehungAntrag0701TypeEClass, HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANDERER_ELTERNTEIL);
		createEReference(hilfenZurErziehungAntrag0701TypeEClass, HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANGABEN_KIND_HZE);
		createEReference(hilfenZurErziehungAntrag0701TypeEClass, HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__NACHWEISE_HZE);
		createEReference(hilfenZurErziehungAntrag0701TypeEClass, HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__DSGVO);
		createEAttribute(hilfenZurErziehungAntrag0701TypeEClass, HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ZUSATZ_NACHRICHT_HZE);
		createEAttribute(hilfenZurErziehungAntrag0701TypeEClass, HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__EINWILLIGUNG_ZWISCHENSPEICHERN);

		hilfenZurErziehungEingliederungshilfe0703TypeEClass = createEClass(HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE);
		createEReference(hilfenZurErziehungEingliederungshilfe0703TypeEClass, HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__AUSWAHL_ANFRAGE_EINGLIEDERUNG);
		createEReference(hilfenZurErziehungEingliederungshilfe0703TypeEClass, HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANLIEGENSKLAERUNG_EINGLIEDERUNG);
		createEReference(hilfenZurErziehungEingliederungshilfe0703TypeEClass, HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON);
		createEReference(hilfenZurErziehungEingliederungshilfe0703TypeEClass, HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANGABEN_KIND);
		createEReference(hilfenZurErziehungEingliederungshilfe0703TypeEClass, HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__BEGRUENDUNG_HZE);
		createEReference(hilfenZurErziehungEingliederungshilfe0703TypeEClass, HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANGABEN_ELTERNTEILE);
		createEReference(hilfenZurErziehungEingliederungshilfe0703TypeEClass, HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__DSGVO);
		createEAttribute(hilfenZurErziehungEingliederungshilfe0703TypeEClass, HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__RICHTIGKEIT_ANGABEN);
		createEAttribute(hilfenZurErziehungEingliederungshilfe0703TypeEClass, HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__EINWILLIGUNG_ZWISCHENSPEICHERN);

		hilfenZurErziehungNachweisnachricht0711TypeEClass = createEClass(HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE);
		createEReference(hilfenZurErziehungNachweisnachricht0711TypeEClass, HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON);
		createEReference(hilfenZurErziehungNachweisnachricht0711TypeEClass, HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__ANGABEN_KIND);
		createEAttribute(hilfenZurErziehungNachweisnachricht0711TypeEClass, HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__JUGENDAMT);
		createEAttribute(hilfenZurErziehungNachweisnachricht0711TypeEClass, HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__BEARBEITUNGSNUMMER);
		createEAttribute(hilfenZurErziehungNachweisnachricht0711TypeEClass, HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__ANTRAGSDATUM);
		createEReference(hilfenZurErziehungNachweisnachricht0711TypeEClass, HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__NACHWEIS);
		createEAttribute(hilfenZurErziehungNachweisnachricht0711TypeEClass, HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__ZUSATZNACHRICHT_HZE);

		hilfenZurErziehungWiderspruch0704TypeEClass = createEClass(HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE);
		createEReference(hilfenZurErziehungWiderspruch0704TypeEClass, HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON);
		createEAttribute(hilfenZurErziehungWiderspruch0704TypeEClass, HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__AKTENZEICHEN);
		createEAttribute(hilfenZurErziehungWiderspruch0704TypeEClass, HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__BESCHEIDDATUM);
		createEAttribute(hilfenZurErziehungWiderspruch0704TypeEClass, HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__BEGRUENDUNG_WIDERSPRUCH);
		createEAttribute(hilfenZurErziehungWiderspruch0704TypeEClass, HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__BESTAETIGUNG_WIDERSPRUCH);
		createEReference(hilfenZurErziehungWiderspruch0704TypeEClass, HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__NACHWEIS);
		createEReference(hilfenZurErziehungWiderspruch0704TypeEClass, HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__AUSWAHL_BESCHEIDART);

		nachweiseDatenschutzTypeEClass = createEClass(NACHWEISE_DATENSCHUTZ_TYPE);
		createEReference(nachweiseDatenschutzTypeEClass, NACHWEISE_DATENSCHUTZ_TYPE__NACHWEIS);
		createEAttribute(nachweiseDatenschutzTypeEClass, NACHWEISE_DATENSCHUTZ_TYPE__ZUSTIMMUNG_ET2);
		createEAttribute(nachweiseDatenschutzTypeEClass, NACHWEISE_DATENSCHUTZ_TYPE__RICHTIGKEIT_ANGABEN);

		nachweiseHZETypeEClass = createEClass(NACHWEISE_HZE_TYPE);
		createEReference(nachweiseHZETypeEClass, NACHWEISE_HZE_TYPE__SORGERECHTSNACHWEIS);
		createEReference(nachweiseHZETypeEClass, NACHWEISE_HZE_TYPE__IDENTITAETSNACHWEIS);
		createEReference(nachweiseHZETypeEClass, NACHWEISE_HZE_TYPE__WEITERE_NACHWEISE);
		createEReference(nachweiseHZETypeEClass, NACHWEISE_HZE_TYPE__NACHWEIS_MELDEBESCHEINIGUNG);
		createEAttribute(nachweiseHZETypeEClass, NACHWEISE_HZE_TYPE__ANMERKUNGEN);
		createEReference(nachweiseHZETypeEClass, NACHWEISE_HZE_TYPE__DSGVO);
		createEAttribute(nachweiseHZETypeEClass, NACHWEISE_HZE_TYPE__RICHTIGKEIT_ANGABEN);

		nachweisTypeEClass = createEClass(NACHWEIS_TYPE);
		createEAttribute(nachweisTypeEClass, NACHWEIS_TYPE__NACHWEIS_BESCHREIBUNG);
		createEReference(nachweisTypeEClass, NACHWEIS_TYPE__NACHWEIS_DOKUMENT);

		persoenlicheAngabenEingliederungTypeEClass = createEClass(PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE);
		createEReference(persoenlicheAngabenEingliederungTypeEClass, PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE__NAMEN);
		createEAttribute(persoenlicheAngabenEingliederungTypeEClass, PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE__GEBURTSDATUM);
		createEReference(persoenlicheAngabenEingliederungTypeEClass, PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE__AKTUELLE_ANSCHRIFT);
		createEAttribute(persoenlicheAngabenEingliederungTypeEClass, PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE__ANSCHRIFTSAENDERUNG);
		createEAttribute(persoenlicheAngabenEingliederungTypeEClass, PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE__WEICHT_ANSCHRIFT_AB);
		createEReference(persoenlicheAngabenEingliederungTypeEClass, PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE__ABWEICHENDE_ANSCHRIFT);
		createEReference(persoenlicheAngabenEingliederungTypeEClass, PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE__KONTAKTDATEN);
		createEAttribute(persoenlicheAngabenEingliederungTypeEClass, PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE__SEELISCHE_BEHINDERUNG);
		createEAttribute(persoenlicheAngabenEingliederungTypeEClass, PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE__ART_DER_BEHINDERUNG);
		createEAttribute(persoenlicheAngabenEingliederungTypeEClass, PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE__AERZTLICHER_NACHWEIS);

		persoenlicheAngabenHJVTypeEClass = createEClass(PERSOENLICHE_ANGABEN_HJV_TYPE);
		createEReference(persoenlicheAngabenHJVTypeEClass, PERSOENLICHE_ANGABEN_HJV_TYPE__NAMEN);
		createEAttribute(persoenlicheAngabenHJVTypeEClass, PERSOENLICHE_ANGABEN_HJV_TYPE__GEBURTSDATUM);
		createEReference(persoenlicheAngabenHJVTypeEClass, PERSOENLICHE_ANGABEN_HJV_TYPE__AKTUELLE_ANSCHRIFT);
		createEAttribute(persoenlicheAngabenHJVTypeEClass, PERSOENLICHE_ANGABEN_HJV_TYPE__ANSCHRIFTSAENDERUNG);
		createEAttribute(persoenlicheAngabenHJVTypeEClass, PERSOENLICHE_ANGABEN_HJV_TYPE__WEICHT_ANSCHRIFT_AB);
		createEReference(persoenlicheAngabenHJVTypeEClass, PERSOENLICHE_ANGABEN_HJV_TYPE__ABWEICHENDE_ANSCHRIFT);
		createEReference(persoenlicheAngabenHJVTypeEClass, PERSOENLICHE_ANGABEN_HJV_TYPE__KONTAKTDATEN);
		createEAttribute(persoenlicheAngabenHJVTypeEClass, PERSOENLICHE_ANGABEN_HJV_TYPE__AUFENTHALTSORT_SONSTIGE);

		persoenlicheAngabenHZETypeEClass = createEClass(PERSOENLICHE_ANGABEN_HZE_TYPE);
		createEReference(persoenlicheAngabenHZETypeEClass, PERSOENLICHE_ANGABEN_HZE_TYPE__NAMEN);
		createEAttribute(persoenlicheAngabenHZETypeEClass, PERSOENLICHE_ANGABEN_HZE_TYPE__GEBURTSDATUM);
		createEReference(persoenlicheAngabenHZETypeEClass, PERSOENLICHE_ANGABEN_HZE_TYPE__AKTUELLE_ANSCHRIFT);
		createEAttribute(persoenlicheAngabenHZETypeEClass, PERSOENLICHE_ANGABEN_HZE_TYPE__WEICHT_ANSCHRIFT_AB);
		createEReference(persoenlicheAngabenHZETypeEClass, PERSOENLICHE_ANGABEN_HZE_TYPE__ABWEICHENDE_ANSCHRIFT);
		createEReference(persoenlicheAngabenHZETypeEClass, PERSOENLICHE_ANGABEN_HZE_TYPE__KONTAKTDATEN);

		persoenlicheAngabenKontaktformularTypeEClass = createEClass(PERSOENLICHE_ANGABEN_KONTAKTFORMULAR_TYPE);
		createEReference(persoenlicheAngabenKontaktformularTypeEClass, PERSOENLICHE_ANGABEN_KONTAKTFORMULAR_TYPE__NAMEN);
		createEReference(persoenlicheAngabenKontaktformularTypeEClass, PERSOENLICHE_ANGABEN_KONTAKTFORMULAR_TYPE__AKTUELLE_ANSCHRIFT);
		createEReference(persoenlicheAngabenKontaktformularTypeEClass, PERSOENLICHE_ANGABEN_KONTAKTFORMULAR_TYPE__KONTAKTDATEN);

		personIdentifikationTypeEClass = createEClass(PERSON_IDENTIFIKATION_TYPE);
		createEReference(personIdentifikationTypeEClass, PERSON_IDENTIFIKATION_TYPE__NAMEN);
		createEAttribute(personIdentifikationTypeEClass, PERSON_IDENTIFIKATION_TYPE__GEBURTSDATUM);

		// Create enums
		aufenthaltsortEEnum = createEEnum(AUFENTHALTSORT);
		auswahlBescheidartHZEEEnum = createEEnum(AUSWAHL_BESCHEIDART_HZE);
		auswahlderhilfehzeEEnum = createEEnum(AUSWAHLDERHILFEHZE);
		verhaeltnisjugendlichhzeEEnum = createEEnum(VERHAELTNISJUGENDLICHHZE);

		// Create data types
		aufenthaltsortObjectEDataType = createEDataType(AUFENTHALTSORT_OBJECT);
		auswahlBescheidartHZEObjectEDataType = createEDataType(AUSWAHL_BESCHEIDART_HZE_OBJECT);
		auswahlderhilfehzeObjectEDataType = createEDataType(AUSWAHLDERHILFEHZE_OBJECT);
		verhaeltnisjugendlichhzeObjectEDataType = createEDataType(VERHAELTNISJUGENDLICHHZE_OBJECT);
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
		Code10Package theCode10Package = (Code10Package)EPackage.Registry.INSTANCE.getEPackage(Code10Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		auswahlBescheidartTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeAufenthaltTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeAuswahlDerHilfeHzETypeEClass.getESuperTypes().add(theCode10Package.getCode());
		codeVerhaeltnisJugendlichHZETypeEClass.getESuperTypes().add(theCode10Package.getCode());
		erreichbarkeitHZETypeEClass.getESuperTypes().add(theBaukastenPackage.getErreichbarkeitType());
		hilfenZurErziehungAnfrageHJV0702TypeEClass.getESuperTypes().add(theBaukastenPackage.getAntragsnachrichtType());
		hilfenZurErziehungAntrag0701TypeEClass.getESuperTypes().add(theBaukastenPackage.getAntragsnachrichtType());
		hilfenZurErziehungEingliederungshilfe0703TypeEClass.getESuperTypes().add(theBaukastenPackage.getAntragsnachrichtType());
		hilfenZurErziehungNachweisnachricht0711TypeEClass.getESuperTypes().add(theBaukastenPackage.getNachrichtType());
		hilfenZurErziehungWiderspruch0704TypeEClass.getESuperTypes().add(theBaukastenPackage.getNachrichtType());

		// Initialize classes, features, and operations; add parameters
		initEClass(angabenElternteilEingliederungTypeEClass, AngabenElternteilEingliederungType.class, "AngabenElternteilEingliederungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAngabenElternteilEingliederungType_Namen(), theBaukastenPackage.getNameNatuerlichePersonVornameVerpflichtendType(), null, "namen", null, 1, 1, AngabenElternteilEingliederungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenElternteilEingliederungType_AngabenGeburtElternteil(), theBaukastenPackage.getGeburtGeburtsortOptionalType(), null, "angabenGeburtElternteil", null, 0, 1, AngabenElternteilEingliederungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenElternteilEingliederungType_AktuelleAnschrift(), theBaukastenPackage.getPostalischeInlandsanschriftBasisType(), null, "aktuelleAnschrift", null, 1, 1, AngabenElternteilEingliederungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenElternteilEingliederungType_Kontaktdaten(), theBaukastenPackage.getErreichbarkeitType(), null, "kontaktdaten", null, 0, 1, AngabenElternteilEingliederungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(angabenElternteilHJVTypeEClass, AngabenElternteilHJVType.class, "AngabenElternteilHJVType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAngabenElternteilHJVType_Namen(), theBaukastenPackage.getNameNatuerlichePersonVornameVerpflichtendType(), null, "namen", null, 1, 1, AngabenElternteilHJVType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenElternteilHJVType_Geburtsdatum(), theBaukastenPackage.getTagesdatumType(), "geburtsdatum", null, 1, 1, AngabenElternteilHJVType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenElternteilHJVType_AktuelleAnschrift(), theBaukastenPackage.getPostalischeInlandsanschriftBasisType(), null, "aktuelleAnschrift", null, 1, 1, AngabenElternteilHJVType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenElternteilHJVType_Kontaktdaten(), theBaukastenPackage.getErreichbarkeitType(), null, "kontaktdaten", null, 0, 1, AngabenElternteilHJVType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(angabenETTypeEClass, AngabenETType.class, "AngabenETType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAngabenETType_Namen(), theBaukastenPackage.getNameNatuerlichePersonVornameVerpflichtendType(), null, "namen", null, 1, 1, AngabenETType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenETType_Kontaktdaten(), theBaukastenPackage.getErreichbarkeitType(), null, "kontaktdaten", null, 0, 2, AngabenETType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(angabenKindEingliederungTypeEClass, AngabenKindEingliederungType.class, "AngabenKindEingliederungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAngabenKindEingliederungType_Namen(), theBaukastenPackage.getNameNatuerlichePersonVornameVerpflichtendType(), null, "namen", null, 1, 1, AngabenKindEingliederungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenKindEingliederungType_Geburtsdatum(), theBaukastenPackage.getTagesdatumType(), "geburtsdatum", null, 1, 1, AngabenKindEingliederungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenKindEingliederungType_Geschlecht(), theBaukastenPackage.getCodeGeschlechtType(), null, "geschlecht", null, 1, 1, AngabenKindEingliederungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenKindEingliederungType_Aufenthaltsort(), this.getCodeAufenthaltType(), null, "aufenthaltsort", null, 1, 1, AngabenKindEingliederungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenKindEingliederungType_JugendlichAufenthaltsortSonstige(), theDIN913792204Package.getDatatypeC(), "jugendlichAufenthaltsortSonstige", null, 0, 1, AngabenKindEingliederungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenKindEingliederungType_AktuelleAnschrift(), theBaukastenPackage.getPostalischeInlandsanschriftBasisType(), null, "aktuelleAnschrift", null, 1, 1, AngabenKindEingliederungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenKindEingliederungType_Anschriftsaenderung(), theXMLTypePackage.getBoolean(), "anschriftsaenderung", null, 1, 1, AngabenKindEingliederungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenKindEingliederungType_SeelischeBehinderung(), theXMLTypePackage.getBoolean(), "seelischeBehinderung", null, 0, 1, AngabenKindEingliederungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenKindEingliederungType_ArtDerBehinderung(), theDIN913792204Package.getDatatypeC(), "artDerBehinderung", null, 0, 1, AngabenKindEingliederungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenKindEingliederungType_AerztlicherNachweis(), theXMLTypePackage.getBoolean(), "aerztlicherNachweis", null, 0, 1, AngabenKindEingliederungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(angabenKindHJVTypeEClass, AngabenKindHJVType.class, "AngabenKindHJVType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAngabenKindHJVType_Namen(), theBaukastenPackage.getNameNatuerlichePersonVornameVerpflichtendType(), null, "namen", null, 1, 1, AngabenKindHJVType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenKindHJVType_Geburtsdatum(), theBaukastenPackage.getTagesdatumType(), "geburtsdatum", null, 1, 1, AngabenKindHJVType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenKindHJVType_Geschlecht(), theBaukastenPackage.getCodeGeschlechtType(), null, "geschlecht", null, 1, 1, AngabenKindHJVType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenKindHJVType_Aufenthaltsort(), this.getCodeAufenthaltType(), null, "aufenthaltsort", null, 1, 1, AngabenKindHJVType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenKindHJVType_JugendlichAufenthaltsortSonstige(), theDIN913792204Package.getDatatypeC(), "jugendlichAufenthaltsortSonstige", null, 0, 1, AngabenKindHJVType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenKindHJVType_AktuelleAnschrift(), theBaukastenPackage.getPostalischeInlandsanschriftBasisType(), null, "aktuelleAnschrift", null, 1, 1, AngabenKindHJVType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenKindHJVType_Anschriftsaenderung(), theXMLTypePackage.getBoolean(), "anschriftsaenderung", null, 1, 1, AngabenKindHJVType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(angabenKindHZETypeEClass, AngabenKindHZEType.class, "AngabenKindHZEType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAngabenKindHZEType_Namen(), theBaukastenPackage.getNameNatuerlichePersonOhneGeburtsnameType(), null, "namen", null, 0, 1, AngabenKindHZEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenKindHZEType_Geburtsdatum(), theBaukastenPackage.getTagesdatumType(), "geburtsdatum", null, 0, 1, AngabenKindHZEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(angabenZuJugendlichHZETypeEClass, AngabenZuJugendlichHZEType.class, "AngabenZuJugendlichHZEType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAngabenZuJugendlichHZEType_NameDerDesJugendlichen(), theBaukastenPackage.getNameNatuerlichePersonVornameVerpflichtendType(), null, "nameDerDesJugendlichen", null, 1, -1, AngabenZuJugendlichHZEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZuJugendlichHZEType_Geburtsdatum(), theBaukastenPackage.getTagesdatumType(), "geburtsdatum", null, 1, 1, AngabenZuJugendlichHZEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenZuJugendlichHZEType_AktuelleAnschrift(), theBaukastenPackage.getPostalischeInlandsanschriftBasisType(), null, "aktuelleAnschrift", null, 1, 1, AngabenZuJugendlichHZEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZuJugendlichHZEType_Anschriftsaenderung(), theXMLTypePackage.getBoolean(), "anschriftsaenderung", null, 0, 1, AngabenZuJugendlichHZEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenZuJugendlichHZEType_AbweichendeAnschrift(), theBaukastenPackage.getPostalischeInlandsanschriftBasisType(), null, "abweichendeAnschrift", null, 0, 1, AngabenZuJugendlichHZEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(angabenZuJugendlichKontaktformularTypeEClass, AngabenZuJugendlichKontaktformularType.class, "AngabenZuJugendlichKontaktformularType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAngabenZuJugendlichKontaktformularType_NameDerDesJugendlichen(), theBaukastenPackage.getNameNatuerlichePersonVornameVerpflichtendType(), null, "nameDerDesJugendlichen", null, 1, -1, AngabenZuJugendlichKontaktformularType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZuJugendlichKontaktformularType_Geburtsdatum(), theBaukastenPackage.getTagesdatumType(), "geburtsdatum", null, 0, 1, AngabenZuJugendlichKontaktformularType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZuJugendlichKontaktformularType_AnschriftStimmtUeberein(), theXMLTypePackage.getBoolean(), "anschriftStimmtUeberein", null, 0, 1, AngabenZuJugendlichKontaktformularType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenZuJugendlichKontaktformularType_AktuelleAnschrift(), theBaukastenPackage.getPostalischeInlandsanschriftBasisType(), null, "aktuelleAnschrift", null, 0, 1, AngabenZuJugendlichKontaktformularType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anliegensklaerungAnfrageTypeEClass, AnliegensklaerungAnfrageType.class, "AnliegensklaerungAnfrageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnliegensklaerungAnfrageType_AnliegenVerhaeltnisJugendlich(), this.getCodeVerhaeltnisJugendlichHZEType(), null, "anliegenVerhaeltnisJugendlich", null, 1, 1, AnliegensklaerungAnfrageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnliegensklaerungAnfrageType_SorgeberechtigtAbfrage(), theXMLTypePackage.getBoolean(), "sorgeberechtigtAbfrage", null, 1, 1, AnliegensklaerungAnfrageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnliegensklaerungAnfrageType_GemeinsamSorgeberechtigt(), theXMLTypePackage.getBoolean(), "gemeinsamSorgeberechtigt", null, 1, 1, AnliegensklaerungAnfrageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anliegensklaerungTypeEClass, AnliegensklaerungType.class, "AnliegensklaerungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnliegensklaerungType_AnliegenVerhaeltnisJugendlich(), this.getCodeVerhaeltnisJugendlichHZEType(), null, "anliegenVerhaeltnisJugendlich", null, 1, 1, AnliegensklaerungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnliegensklaerungType_GemeinsamSorgeberechtigt(), theXMLTypePackage.getBoolean(), "gemeinsamSorgeberechtigt", null, 1, 1, AnliegensklaerungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(antragstellenderETTypeEClass, AntragstellenderETType.class, "AntragstellenderETType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAntragstellenderETType_Namen(), theBaukastenPackage.getNameNatuerlichePersonVornameVerpflichtendType(), null, "namen", null, 1, 1, AntragstellenderETType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAntragstellenderETType_Geburtsort(), theDIN913792204Package.getDatatypeC(), "geburtsort", null, 0, 1, AntragstellenderETType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAntragstellenderETType_Geburtsdatum(), theBaukastenPackage.getTagesdatumType(), "geburtsdatum", null, 1, 1, AntragstellenderETType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAntragstellenderETType_Adresse(), theBaukastenPackage.getPostalischeInlandsanschriftBasisType(), null, "adresse", null, 1, 1, AntragstellenderETType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAntragstellenderETType_AbweichendeAdresse(), theXMLTypePackage.getBoolean(), "abweichendeAdresse", null, 1, 1, AntragstellenderETType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAntragstellenderETType_AbweichendeAdressePerso(), theBaukastenPackage.getPostalischeInlandsanschriftBasisType(), null, "abweichendeAdressePerso", null, 0, 1, AntragstellenderETType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAntragstellenderETType_Kontaktdaten(), theBaukastenPackage.getErreichbarkeitType(), null, "kontaktdaten", null, 0, 1, AntragstellenderETType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(auswahlBescheidartTypeEClass, AuswahlBescheidartType.class, "AuswahlBescheidartType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(begruendungDesHilfebedarfsTypeEClass, BegruendungDesHilfebedarfsType.class, "BegruendungDesHilfebedarfsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBegruendungDesHilfebedarfsType_GrundBeantragung(), theDIN913792204Package.getDatatypeC(), "grundBeantragung", null, 0, 1, BegruendungDesHilfebedarfsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBegruendungDesHilfebedarfsType_HilfeVomJugendamt(), theDIN913792204Package.getDatatypeC(), "hilfeVomJugendamt", null, 0, 1, BegruendungDesHilfebedarfsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeAufenthaltTypeEClass, CodeAufenthaltType.class, "CodeAufenthaltType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeAuswahlDerHilfeHzETypeEClass, CodeAuswahlDerHilfeHzEType.class, "CodeAuswahlDerHilfeHzEType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeHZEIchBinTypeEClass, CodeHZEIchBinType.class, "CodeHZEIchBinType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeVerhaeltnisJugendlichHZETypeEClass, CodeVerhaeltnisJugendlichHZEType.class, "CodeVerhaeltnisJugendlichHZEType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_HilfenZurErziehungAnfrageHJV0702(), this.getHilfenZurErziehungAnfrageHJV0702Type(), null, "hilfenZurErziehungAnfrageHJV0702", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_HilfenZurErziehungAntrag0701(), this.getHilfenZurErziehungAntrag0701Type(), null, "hilfenZurErziehungAntrag0701", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_HilfenZurErziehungEingliederungshilfe0703(), this.getHilfenZurErziehungEingliederungshilfe0703Type(), null, "hilfenZurErziehungEingliederungshilfe0703", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_HilfenZurErziehungNachweisnachricht0711(), this.getHilfenZurErziehungNachweisnachricht0711Type(), null, "hilfenZurErziehungNachweisnachricht0711", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_HilfenZurErziehungWiderspruch0704(), this.getHilfenZurErziehungWiderspruch0704Type(), null, "hilfenZurErziehungWiderspruch0704", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(erreichbarkeitHZETypeEClass, ErreichbarkeitHZEType.class, "ErreichbarkeitHZEType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErreichbarkeitHZEType_ZeitErreichbarkeitHZE(), theDIN913792204Package.getDatatypeC(), "zeitErreichbarkeitHZE", null, 0, 1, ErreichbarkeitHZEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hilfenZurErziehungAnfrageHJV0702TypeEClass, HilfenZurErziehungAnfrageHJV0702Type.class, "HilfenZurErziehungAnfrageHJV0702Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHilfenZurErziehungAnfrageHJV0702Type_AuswahlAnfrageHJV(), this.getCodeAuswahlDerHilfeHzEType(), null, "auswahlAnfrageHJV", null, 1, 1, HilfenZurErziehungAnfrageHJV0702Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHilfenZurErziehungAnfrageHJV0702Type_AnliegensklaerungHJV(), this.getAnliegensklaerungAnfrageType(), null, "anliegensklaerungHJV", null, 0, 1, HilfenZurErziehungAnfrageHJV0702Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHilfenZurErziehungAnfrageHJV0702Type_PersoenlicheAngabenHJV(), this.getPersoenlicheAngabenHJVType(), null, "persoenlicheAngabenHJV", null, 0, 1, HilfenZurErziehungAnfrageHJV0702Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHilfenZurErziehungAnfrageHJV0702Type_BegruendungHJV(), this.getBegruendungDesHilfebedarfsType(), null, "begruendungHJV", null, 0, 1, HilfenZurErziehungAnfrageHJV0702Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHilfenZurErziehungAnfrageHJV0702Type_AngabenAndererElternteil(), this.getAngabenElternteilHJVType(), null, "angabenAndererElternteil", null, 0, 1, HilfenZurErziehungAnfrageHJV0702Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHilfenZurErziehungAnfrageHJV0702Type_Dsgvo(), theBaukastenPackage.getDatenschutzerklaerungenType(), null, "dsgvo", null, 0, 1, HilfenZurErziehungAnfrageHJV0702Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHilfenZurErziehungAnfrageHJV0702Type_RichtigkeitAngaben(), theXMLTypePackage.getBoolean(), "richtigkeitAngaben", "true", 1, 1, HilfenZurErziehungAnfrageHJV0702Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHilfenZurErziehungAnfrageHJV0702Type_EinwilligungZwischenspeichern(), theXMLTypePackage.getBoolean(), "einwilligungZwischenspeichern", null, 0, 1, HilfenZurErziehungAnfrageHJV0702Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hilfenZurErziehungAntrag0701TypeEClass, HilfenZurErziehungAntrag0701Type.class, "HilfenZurErziehungAntrag0701Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHilfenZurErziehungAntrag0701Type_AuswahlDerHilfeHZE(), this.getCodeAuswahlDerHilfeHzEType(), null, "auswahlDerHilfeHZE", null, 1, 1, HilfenZurErziehungAntrag0701Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHilfenZurErziehungAntrag0701Type_AnliegensklaerungHZE(), this.getAnliegensklaerungType(), null, "anliegensklaerungHZE", null, 1, 1, HilfenZurErziehungAntrag0701Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHilfenZurErziehungAntrag0701Type_PruefcodeHZE(), theDIN913792204Package.getDatatypeC(), "pruefcodeHZE", null, 1, 1, HilfenZurErziehungAntrag0701Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHilfenZurErziehungAntrag0701Type_PersoenlicheAngabenZuIhrerPerson(), this.getPersoenlicheAngabenHZEType(), null, "persoenlicheAngabenZuIhrerPerson", null, 1, 1, HilfenZurErziehungAntrag0701Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHilfenZurErziehungAntrag0701Type_AndererElternteil(), this.getAngabenETType(), null, "andererElternteil", null, 1, 1, HilfenZurErziehungAntrag0701Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHilfenZurErziehungAntrag0701Type_AngabenKindHZE(), this.getAngabenKindHZEType(), null, "angabenKindHZE", null, 0, 1, HilfenZurErziehungAntrag0701Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHilfenZurErziehungAntrag0701Type_NachweiseHZE(), this.getNachweiseHZEType(), null, "nachweiseHZE", null, 1, 1, HilfenZurErziehungAntrag0701Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHilfenZurErziehungAntrag0701Type_Dsgvo(), theBaukastenPackage.getDatenschutzerklaerungenType(), null, "dsgvo", null, 0, 1, HilfenZurErziehungAntrag0701Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHilfenZurErziehungAntrag0701Type_ZusatzNachrichtHZE(), theDIN913792204Package.getDatatypeC(), "zusatzNachrichtHZE", null, 0, 1, HilfenZurErziehungAntrag0701Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHilfenZurErziehungAntrag0701Type_EinwilligungZwischenspeichern(), theXMLTypePackage.getBoolean(), "einwilligungZwischenspeichern", null, 0, 1, HilfenZurErziehungAntrag0701Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hilfenZurErziehungEingliederungshilfe0703TypeEClass, HilfenZurErziehungEingliederungshilfe0703Type.class, "HilfenZurErziehungEingliederungshilfe0703Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHilfenZurErziehungEingliederungshilfe0703Type_AuswahlAnfrageEingliederung(), this.getCodeAuswahlDerHilfeHzEType(), null, "auswahlAnfrageEingliederung", null, 1, 1, HilfenZurErziehungEingliederungshilfe0703Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHilfenZurErziehungEingliederungshilfe0703Type_AnliegensklaerungEingliederung(), this.getAnliegensklaerungAnfrageType(), null, "anliegensklaerungEingliederung", null, 0, 1, HilfenZurErziehungEingliederungshilfe0703Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHilfenZurErziehungEingliederungshilfe0703Type_PersoenlicheAngabenZuIhrerPerson(), this.getPersoenlicheAngabenEingliederungType(), null, "persoenlicheAngabenZuIhrerPerson", null, 0, 1, HilfenZurErziehungEingliederungshilfe0703Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHilfenZurErziehungEingliederungshilfe0703Type_AngabenKind(), this.getAngabenKindEingliederungType(), null, "angabenKind", null, 0, 1, HilfenZurErziehungEingliederungshilfe0703Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHilfenZurErziehungEingliederungshilfe0703Type_BegruendungHZE(), this.getBegruendungDesHilfebedarfsType(), null, "begruendungHZE", null, 0, 1, HilfenZurErziehungEingliederungshilfe0703Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHilfenZurErziehungEingliederungshilfe0703Type_AngabenElternteile(), this.getAngabenElternteilEingliederungType(), null, "angabenElternteile", null, 0, 2, HilfenZurErziehungEingliederungshilfe0703Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHilfenZurErziehungEingliederungshilfe0703Type_Dsgvo(), theBaukastenPackage.getDatenschutzerklaerungenType(), null, "dsgvo", null, 0, 1, HilfenZurErziehungEingliederungshilfe0703Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHilfenZurErziehungEingliederungshilfe0703Type_RichtigkeitAngaben(), theXMLTypePackage.getBoolean(), "richtigkeitAngaben", "true", 0, 1, HilfenZurErziehungEingliederungshilfe0703Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHilfenZurErziehungEingliederungshilfe0703Type_EinwilligungZwischenspeichern(), theXMLTypePackage.getBoolean(), "einwilligungZwischenspeichern", null, 0, 1, HilfenZurErziehungEingliederungshilfe0703Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hilfenZurErziehungNachweisnachricht0711TypeEClass, HilfenZurErziehungNachweisnachricht0711Type.class, "HilfenZurErziehungNachweisnachricht0711Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHilfenZurErziehungNachweisnachricht0711Type_PersoenlicheAngabenZuIhrerPerson(), this.getPersoenlicheAngabenHZEType(), null, "persoenlicheAngabenZuIhrerPerson", null, 1, 1, HilfenZurErziehungNachweisnachricht0711Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHilfenZurErziehungNachweisnachricht0711Type_AngabenKind(), this.getAngabenKindHZEType(), null, "angabenKind", null, 1, 1, HilfenZurErziehungNachweisnachricht0711Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHilfenZurErziehungNachweisnachricht0711Type_Jugendamt(), theDIN913792204Package.getDatatypeC(), "jugendamt", null, 1, 1, HilfenZurErziehungNachweisnachricht0711Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHilfenZurErziehungNachweisnachricht0711Type_Bearbeitungsnummer(), theDIN913792204Package.getDatatypeC(), "bearbeitungsnummer", null, 1, 1, HilfenZurErziehungNachweisnachricht0711Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHilfenZurErziehungNachweisnachricht0711Type_Antragsdatum(), theBaukastenPackage.getTagesdatumType(), "antragsdatum", null, 1, 1, HilfenZurErziehungNachweisnachricht0711Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHilfenZurErziehungNachweisnachricht0711Type_Nachweis(), this.getNachweiseHZEType(), null, "nachweis", null, 1, -1, HilfenZurErziehungNachweisnachricht0711Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHilfenZurErziehungNachweisnachricht0711Type_ZusatznachrichtHZE(), theDIN913792204Package.getDatatypeC(), "zusatznachrichtHZE", null, 0, 1, HilfenZurErziehungNachweisnachricht0711Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hilfenZurErziehungWiderspruch0704TypeEClass, HilfenZurErziehungWiderspruch0704Type.class, "HilfenZurErziehungWiderspruch0704Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHilfenZurErziehungWiderspruch0704Type_PersoenlicheAngabenZuIhrerPerson(), this.getPersoenlicheAngabenHZEType(), null, "persoenlicheAngabenZuIhrerPerson", null, 1, 1, HilfenZurErziehungWiderspruch0704Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHilfenZurErziehungWiderspruch0704Type_Aktenzeichen(), theDIN913792204Package.getDatatypeC(), "aktenzeichen", null, 1, 1, HilfenZurErziehungWiderspruch0704Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHilfenZurErziehungWiderspruch0704Type_Bescheiddatum(), theBaukastenPackage.getTagesdatumType(), "bescheiddatum", null, 1, 1, HilfenZurErziehungWiderspruch0704Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHilfenZurErziehungWiderspruch0704Type_BegruendungWiderspruch(), theDIN913792204Package.getDatatypeC(), "begruendungWiderspruch", null, 1, 1, HilfenZurErziehungWiderspruch0704Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHilfenZurErziehungWiderspruch0704Type_BestaetigungWiderspruch(), theXMLTypePackage.getBoolean(), "bestaetigungWiderspruch", "false", 1, 1, HilfenZurErziehungWiderspruch0704Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHilfenZurErziehungWiderspruch0704Type_Nachweis(), this.getNachweiseHZEType(), null, "nachweis", null, 0, -1, HilfenZurErziehungWiderspruch0704Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHilfenZurErziehungWiderspruch0704Type_AuswahlBescheidart(), this.getAuswahlBescheidartType(), null, "auswahlBescheidart", null, 1, 1, HilfenZurErziehungWiderspruch0704Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nachweiseDatenschutzTypeEClass, NachweiseDatenschutzType.class, "NachweiseDatenschutzType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNachweiseDatenschutzType_Nachweis(), this.getNachweisType(), null, "nachweis", null, 0, -1, NachweiseDatenschutzType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachweiseDatenschutzType_ZustimmungET2(), theXMLTypePackage.getBoolean(), "zustimmungET2", "false", 0, 1, NachweiseDatenschutzType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachweiseDatenschutzType_RichtigkeitAngaben(), theXMLTypePackage.getBoolean(), "richtigkeitAngaben", "false", 0, 1, NachweiseDatenschutzType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nachweiseHZETypeEClass, NachweiseHZEType.class, "NachweiseHZEType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNachweiseHZEType_Sorgerechtsnachweis(), theBaukastenPackage.getNachweisdokumentType(), null, "sorgerechtsnachweis", null, 0, -1, NachweiseHZEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachweiseHZEType_Identitaetsnachweis(), theBaukastenPackage.getNachweisdokumentType(), null, "identitaetsnachweis", null, 0, -1, NachweiseHZEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachweiseHZEType_WeitereNachweise(), theBaukastenPackage.getNachweisdokumentType(), null, "weitereNachweise", null, 0, -1, NachweiseHZEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachweiseHZEType_NachweisMeldebescheinigung(), theBaukastenPackage.getNachweisdokumentType(), null, "nachweisMeldebescheinigung", null, 0, -1, NachweiseHZEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachweiseHZEType_Anmerkungen(), theDIN913792204Package.getDatatypeC(), "anmerkungen", null, 0, 1, NachweiseHZEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachweiseHZEType_Dsgvo(), theBaukastenPackage.getDatenschutzerklaerungenType(), null, "dsgvo", null, 1, 1, NachweiseHZEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachweiseHZEType_RichtigkeitAngaben(), theXMLTypePackage.getBoolean(), "richtigkeitAngaben", null, 1, 1, NachweiseHZEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nachweisTypeEClass, NachweisType.class, "NachweisType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNachweisType_NachweisBeschreibung(), theDIN913792204Package.getDatatypeC(), "nachweisBeschreibung", null, 0, 1, NachweisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachweisType_NachweisDokument(), theBaukastenPackage.getNachweisdokumentType(), null, "nachweisDokument", null, 1, 1, NachweisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persoenlicheAngabenEingliederungTypeEClass, PersoenlicheAngabenEingliederungType.class, "PersoenlicheAngabenEingliederungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersoenlicheAngabenEingliederungType_Namen(), theBaukastenPackage.getNameNatuerlichePersonVornameVerpflichtendType(), null, "namen", null, 1, 1, PersoenlicheAngabenEingliederungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersoenlicheAngabenEingliederungType_Geburtsdatum(), theBaukastenPackage.getTagesdatumType(), "geburtsdatum", null, 1, 1, PersoenlicheAngabenEingliederungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersoenlicheAngabenEingliederungType_AktuelleAnschrift(), theBaukastenPackage.getPostalischeInlandsanschriftBasisType(), null, "aktuelleAnschrift", null, 1, 1, PersoenlicheAngabenEingliederungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersoenlicheAngabenEingliederungType_Anschriftsaenderung(), theXMLTypePackage.getBoolean(), "anschriftsaenderung", null, 1, 1, PersoenlicheAngabenEingliederungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersoenlicheAngabenEingliederungType_WeichtAnschriftAb(), theXMLTypePackage.getBoolean(), "weichtAnschriftAb", null, 0, 1, PersoenlicheAngabenEingliederungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersoenlicheAngabenEingliederungType_AbweichendeAnschrift(), theBaukastenPackage.getPostalischeInlandsanschriftBasisType(), null, "abweichendeAnschrift", null, 0, 1, PersoenlicheAngabenEingliederungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersoenlicheAngabenEingliederungType_Kontaktdaten(), this.getErreichbarkeitHZEType(), null, "kontaktdaten", null, 1, -1, PersoenlicheAngabenEingliederungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersoenlicheAngabenEingliederungType_SeelischeBehinderung(), theXMLTypePackage.getBoolean(), "seelischeBehinderung", null, 0, 1, PersoenlicheAngabenEingliederungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersoenlicheAngabenEingliederungType_ArtDerBehinderung(), theDIN913792204Package.getDatatypeC(), "artDerBehinderung", null, 0, 1, PersoenlicheAngabenEingliederungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersoenlicheAngabenEingliederungType_AerztlicherNachweis(), theXMLTypePackage.getBoolean(), "aerztlicherNachweis", null, 0, 1, PersoenlicheAngabenEingliederungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persoenlicheAngabenHJVTypeEClass, PersoenlicheAngabenHJVType.class, "PersoenlicheAngabenHJVType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersoenlicheAngabenHJVType_Namen(), theBaukastenPackage.getNameNatuerlichePersonVornameVerpflichtendType(), null, "namen", null, 1, 1, PersoenlicheAngabenHJVType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersoenlicheAngabenHJVType_Geburtsdatum(), theBaukastenPackage.getTagesdatumType(), "geburtsdatum", null, 1, 1, PersoenlicheAngabenHJVType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersoenlicheAngabenHJVType_AktuelleAnschrift(), theBaukastenPackage.getPostalischeInlandsanschriftBasisType(), null, "aktuelleAnschrift", null, 1, 1, PersoenlicheAngabenHJVType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersoenlicheAngabenHJVType_Anschriftsaenderung(), theXMLTypePackage.getBoolean(), "anschriftsaenderung", null, 1, 1, PersoenlicheAngabenHJVType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersoenlicheAngabenHJVType_WeichtAnschriftAb(), theXMLTypePackage.getBoolean(), "weichtAnschriftAb", null, 0, 1, PersoenlicheAngabenHJVType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersoenlicheAngabenHJVType_AbweichendeAnschrift(), theBaukastenPackage.getPostalischeInlandsanschriftBasisType(), null, "abweichendeAnschrift", null, 0, 1, PersoenlicheAngabenHJVType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersoenlicheAngabenHJVType_Kontaktdaten(), this.getErreichbarkeitHZEType(), null, "kontaktdaten", null, 1, -1, PersoenlicheAngabenHJVType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersoenlicheAngabenHJVType_AufenthaltsortSonstige(), theDIN913792204Package.getDatatypeC(), "aufenthaltsortSonstige", null, 0, 1, PersoenlicheAngabenHJVType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persoenlicheAngabenHZETypeEClass, PersoenlicheAngabenHZEType.class, "PersoenlicheAngabenHZEType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersoenlicheAngabenHZEType_Namen(), theBaukastenPackage.getNameNatuerlichePersonVornameVerpflichtendType(), null, "namen", null, 1, 1, PersoenlicheAngabenHZEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersoenlicheAngabenHZEType_Geburtsdatum(), theBaukastenPackage.getTagesdatumType(), "geburtsdatum", null, 1, 1, PersoenlicheAngabenHZEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersoenlicheAngabenHZEType_AktuelleAnschrift(), theBaukastenPackage.getPostalischeInlandsanschriftBasisType(), null, "aktuelleAnschrift", null, 1, 1, PersoenlicheAngabenHZEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersoenlicheAngabenHZEType_WeichtAnschriftAb(), theXMLTypePackage.getBoolean(), "weichtAnschriftAb", null, 0, 1, PersoenlicheAngabenHZEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersoenlicheAngabenHZEType_AbweichendeAnschrift(), theBaukastenPackage.getPostalischeInlandsanschriftBasisType(), null, "abweichendeAnschrift", null, 0, 1, PersoenlicheAngabenHZEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersoenlicheAngabenHZEType_Kontaktdaten(), this.getErreichbarkeitHZEType(), null, "kontaktdaten", null, 0, -1, PersoenlicheAngabenHZEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persoenlicheAngabenKontaktformularTypeEClass, PersoenlicheAngabenKontaktformularType.class, "PersoenlicheAngabenKontaktformularType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersoenlicheAngabenKontaktformularType_Namen(), theBaukastenPackage.getNameNatuerlichePersonVornameVerpflichtendType(), null, "namen", null, 1, 1, PersoenlicheAngabenKontaktformularType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersoenlicheAngabenKontaktformularType_AktuelleAnschrift(), theBaukastenPackage.getPostalischeInlandsanschriftBasisType(), null, "aktuelleAnschrift", null, 0, 1, PersoenlicheAngabenKontaktformularType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersoenlicheAngabenKontaktformularType_Kontaktdaten(), theBaukastenPackage.getErreichbarkeitType(), null, "kontaktdaten", null, 1, -1, PersoenlicheAngabenKontaktformularType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personIdentifikationTypeEClass, PersonIdentifikationType.class, "PersonIdentifikationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersonIdentifikationType_Namen(), theBaukastenPackage.getNameNatuerlichePersonType(), null, "namen", null, 1, 1, PersonIdentifikationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonIdentifikationType_Geburtsdatum(), theBaukastenPackage.getTagesdatumType(), "geburtsdatum", null, 1, 1, PersonIdentifikationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(aufenthaltsortEEnum, Aufenthaltsort.class, "Aufenthaltsort");
		addEEnumLiteral(aufenthaltsortEEnum, Aufenthaltsort.EIHA);
		addEEnumLiteral(aufenthaltsortEEnum, Aufenthaltsort.ELHA);
		addEEnumLiteral(aufenthaltsortEEnum, Aufenthaltsort.JUHI);
		addEEnumLiteral(aufenthaltsortEEnum, Aufenthaltsort.KRHA);
		addEEnumLiteral(aufenthaltsortEEnum, Aufenthaltsort.SOAU);

		initEEnum(auswahlBescheidartHZEEEnum, AuswahlBescheidartHZE.class, "AuswahlBescheidartHZE");
		addEEnumLiteral(auswahlBescheidartHZEEEnum, AuswahlBescheidartHZE._01);
		addEEnumLiteral(auswahlBescheidartHZEEEnum, AuswahlBescheidartHZE._02);
		addEEnumLiteral(auswahlBescheidartHZEEEnum, AuswahlBescheidartHZE._03);

		initEEnum(auswahlderhilfehzeEEnum, Auswahlderhilfehze.class, "Auswahlderhilfehze");
		addEEnumLiteral(auswahlderhilfehzeEEnum, Auswahlderhilfehze._01);
		addEEnumLiteral(auswahlderhilfehzeEEnum, Auswahlderhilfehze._02);
		addEEnumLiteral(auswahlderhilfehzeEEnum, Auswahlderhilfehze._03);

		initEEnum(verhaeltnisjugendlichhzeEEnum, Verhaeltnisjugendlichhze.class, "Verhaeltnisjugendlichhze");
		addEEnumLiteral(verhaeltnisjugendlichhzeEEnum, Verhaeltnisjugendlichhze.JM);
		addEEnumLiteral(verhaeltnisjugendlichhzeEEnum, Verhaeltnisjugendlichhze.JV);
		addEEnumLiteral(verhaeltnisjugendlichhzeEEnum, Verhaeltnisjugendlichhze.MU);
		addEEnumLiteral(verhaeltnisjugendlichhzeEEnum, Verhaeltnisjugendlichhze.PF);
		addEEnumLiteral(verhaeltnisjugendlichhzeEEnum, Verhaeltnisjugendlichhze.UN);
		addEEnumLiteral(verhaeltnisjugendlichhzeEEnum, Verhaeltnisjugendlichhze.VA);
		addEEnumLiteral(verhaeltnisjugendlichhzeEEnum, Verhaeltnisjugendlichhze.VO);

		// Initialize data types
		initEDataType(aufenthaltsortObjectEDataType, Aufenthaltsort.class, "AufenthaltsortObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(auswahlBescheidartHZEObjectEDataType, AuswahlBescheidartHZE.class, "AuswahlBescheidartHZEObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(auswahlderhilfehzeObjectEDataType, Auswahlderhilfehze.class, "AuswahlderhilfehzeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(verhaeltnisjugendlichhzeObjectEDataType, Verhaeltnisjugendlichhze.class, "VerhaeltnisjugendlichhzeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (aufenthaltsortEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Aufenthaltsort</nameLang>\n                   \n    <nameKurz>Aufenthaltsort</nameKurz>\n                   \n    <nameTechnisch>aufenthaltsort</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:aufenthaltsort</kennung>\n                   \n    <beschreibung>Die Liste codiert den Aufenthaltsort im Antrag zur Jugendhilfe.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (aufenthaltsortEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Eigener Haushalt</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (aufenthaltsortEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Elterlicher Haushalt</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (aufenthaltsortEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Jugendhilfeeinrichtung</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (aufenthaltsortEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Krankenhaus</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (aufenthaltsortEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Sonstiger Aufenthalt</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (auswahlBescheidartHZEEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>BescheidartHZE</nameLang>\n                   \n    <nameKurz>BescheidartHZE</nameKurz>\n                   \n    <nameTechnisch>auswahlBescheidartHZE</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:auswahlbescheidarthze</kennung>\n                   \n    <beschreibung>Auswahl der Bescheidart f\u00fcr HZE.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>Gibt die Arten der Anliegen f\u00fcr Beistandsschaft an. </beschreibung>\n                   \n    <datumGueltigkeitAb>2023-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (auswahlBescheidartHZEEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Bewilligungsbescheid</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (auswahlBescheidartHZEEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Ablehnungsbescheid</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (auswahlBescheidartHZEEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Zahlungsbescheid</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (auswahlderhilfehzeEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>AuswahlDerHilfeHzE</nameLang>\n                   \n    <nameKurz>AuswahlDerHilfeHzE</nameKurz>\n                   \n    <nameTechnisch>auswahlderhilfehze</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:auswahlderhilfehze</kennung>\n                   \n    <beschreibung>Die Art der Hilfe f\u00fcr Hilfe zur Erziehung.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>Gibt die Arten der Anliegen f\u00fcr Hilfen zur Erziehung an. </beschreibung>\n                   \n    <datumGueltigkeitAb>2023-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (auswahlderhilfehzeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Hilfen zur Erziehung</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (auswahlderhilfehzeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Hilfe f\u00fcr junge Vollj\u00e4hrige</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (auswahlderhilfehzeEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Eingliederungshilfe</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (codeAufenthaltTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Aufenthaltsort</nameLang>\n                   \n    <nameKurz>Aufenthaltsort</nameKurz>\n                   \n    <nameTechnisch>aufenthaltsort</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:aufenthaltsort</kennung>\n                   \n    <beschreibung>Die Liste codiert den Aufenthaltsort im Antrag zur Jugendhilfe.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (codeAuswahlDerHilfeHzETypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>AuswahlDerHilfeHzE</nameLang>\n                   \n    <nameKurz>AuswahlDerHilfeHzE</nameKurz>\n                   \n    <nameTechnisch>auswahlderhilfehze</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:auswahlderhilfehze</kennung>\n                   \n    <beschreibung>Die Art der Hilfe f\u00fcr Hilfe zur Erziehung.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>Gibt die Arten der Anliegen f\u00fcr Hilfen zur Erziehung an. </beschreibung>\n                   \n    <datumGueltigkeitAb>2023-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (codeVerhaeltnisJugendlichHZETypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>VerhaeltnisJugendlichHZE</nameLang>\n                   \n    <nameKurz>VerhaeltnisJugendlichHZE</nameKurz>\n                   \n    <nameTechnisch>verhaeltnisjugendlichhze</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:verhaeltnisjugendlichhze</kennung>\n                   \n    <beschreibung>Die Liste codiert das Verh\u00e4ltnis der antragstellenden Person zum Kind bzw. zur/m Jungendichen.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (getDocumentRoot_HilfenZurErziehungAnfrageHJV0702(),
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <rechtsgrundlage>Rechtgrundlage</rechtsgrundlage>\n           \n"
		   });
		addAnnotation
		  (getDocumentRoot_HilfenZurErziehungAntrag0701(),
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <rechtsgrundlage>Rechtgrundlage</rechtsgrundlage>\n           \n"
		   });
		addAnnotation
		  (getDocumentRoot_HilfenZurErziehungEingliederungshilfe0703(),
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <rechtsgrundlage>Rechtgrundlage</rechtsgrundlage>\n           \n"
		   });
		addAnnotation
		  (getDocumentRoot_HilfenZurErziehungNachweisnachricht0711(),
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <rechtsgrundlage>Rechtsgrundlage sind die Sozialgesetzbuecher aber kann je nach der jeweiligen Fachnachricht abweichen. </rechtsgrundlage>\n           \n"
		   });
		addAnnotation
		  (getDocumentRoot_HilfenZurErziehungWiderspruch0704(),
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <rechtsgrundlage>Rechtsgrundlage sind die Sozialgesetzbuecher aber kann je nach der jeweiligen Fachnachricht abweichen. </rechtsgrundlage>\n           \n"
		   });
		addAnnotation
		  (verhaeltnisjugendlichhzeEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>VerhaeltnisJugendlichHZE</nameLang>\n                   \n    <nameKurz>VerhaeltnisJugendlichHZE</nameKurz>\n                   \n    <nameTechnisch>verhaeltnisjugendlichhze</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:verhaeltnisjugendlichhze</kennung>\n                   \n    <beschreibung>Die Liste codiert das Verh\u00e4ltnis der antragstellenden Person zum Kind bzw. zur/m Jungendichen.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (verhaeltnisjugendlichhzeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Junge*r Mensch (zwischen 15 und 21 Jahre)</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (verhaeltnisjugendlichhzeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Junge*r Vollj\u00e4hrige*r (zwischen 18 und 27 Jahre alt)</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (verhaeltnisjugendlichhzeEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Mutter des Kindes</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (verhaeltnisjugendlichhzeEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Pfleger*in</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (verhaeltnisjugendlichhzeEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Keine der genannten Personen</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (verhaeltnisjugendlichhzeEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Vater des Kindes</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (verhaeltnisjugendlichhzeEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Vormund*in</beschreibung>\n                 \n"
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
		  (angabenElternteilEingliederungTypeEClass,
		   source,
		   new String[] {
			   "name", "AngabenElternteilEingliederungType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAngabenElternteilEingliederungType_Namen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "namen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenElternteilEingliederungType_AngabenGeburtElternteil(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenGeburtElternteil",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenElternteilEingliederungType_AktuelleAnschrift(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aktuelleAnschrift",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenElternteilEingliederungType_Kontaktdaten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kontaktdaten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (angabenElternteilHJVTypeEClass,
		   source,
		   new String[] {
			   "name", "AngabenElternteilHJVType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAngabenElternteilHJVType_Namen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "namen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenElternteilHJVType_Geburtsdatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsdatum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenElternteilHJVType_AktuelleAnschrift(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aktuelleAnschrift",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenElternteilHJVType_Kontaktdaten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kontaktdaten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (angabenETTypeEClass,
		   source,
		   new String[] {
			   "name", "AngabenETType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAngabenETType_Namen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "namen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenETType_Kontaktdaten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kontaktdaten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (angabenKindEingliederungTypeEClass,
		   source,
		   new String[] {
			   "name", "AngabenKindEingliederungType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAngabenKindEingliederungType_Namen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "namen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenKindEingliederungType_Geburtsdatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsdatum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenKindEingliederungType_Geschlecht(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geschlecht",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenKindEingliederungType_Aufenthaltsort(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aufenthaltsort",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenKindEingliederungType_JugendlichAufenthaltsortSonstige(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "jugendlichAufenthaltsortSonstige",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenKindEingliederungType_AktuelleAnschrift(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aktuelleAnschrift",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenKindEingliederungType_Anschriftsaenderung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anschriftsaenderung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenKindEingliederungType_SeelischeBehinderung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "seelischeBehinderung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenKindEingliederungType_ArtDerBehinderung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "artDerBehinderung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenKindEingliederungType_AerztlicherNachweis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aerztlicherNachweis",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (angabenKindHJVTypeEClass,
		   source,
		   new String[] {
			   "name", "AngabenKindHJVType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAngabenKindHJVType_Namen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "namen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenKindHJVType_Geburtsdatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsdatum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenKindHJVType_Geschlecht(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geschlecht",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenKindHJVType_Aufenthaltsort(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aufenthaltsort",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenKindHJVType_JugendlichAufenthaltsortSonstige(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "jugendlichAufenthaltsortSonstige",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenKindHJVType_AktuelleAnschrift(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aktuelleAnschrift",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenKindHJVType_Anschriftsaenderung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anschriftsaenderung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (angabenKindHZETypeEClass,
		   source,
		   new String[] {
			   "name", "AngabenKindHZEType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAngabenKindHZEType_Namen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "namen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenKindHZEType_Geburtsdatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsdatum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (angabenZuJugendlichHZETypeEClass,
		   source,
		   new String[] {
			   "name", "AngabenZuJugendlichHZEType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAngabenZuJugendlichHZEType_NameDerDesJugendlichen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nameDerDesJugendlichen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZuJugendlichHZEType_Geburtsdatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsdatum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZuJugendlichHZEType_AktuelleAnschrift(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aktuelleAnschrift",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZuJugendlichHZEType_Anschriftsaenderung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anschriftsaenderung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZuJugendlichHZEType_AbweichendeAnschrift(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "abweichendeAnschrift",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (angabenZuJugendlichKontaktformularTypeEClass,
		   source,
		   new String[] {
			   "name", "AngabenZuJugendlichKontaktformularType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAngabenZuJugendlichKontaktformularType_NameDerDesJugendlichen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nameDerDesJugendlichen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZuJugendlichKontaktformularType_Geburtsdatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsdatum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZuJugendlichKontaktformularType_AnschriftStimmtUeberein(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anschriftStimmtUeberein",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZuJugendlichKontaktformularType_AktuelleAnschrift(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aktuelleAnschrift",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (anliegensklaerungAnfrageTypeEClass,
		   source,
		   new String[] {
			   "name", "AnliegensklaerungAnfrageType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAnliegensklaerungAnfrageType_AnliegenVerhaeltnisJugendlich(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anliegenVerhaeltnisJugendlich",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnliegensklaerungAnfrageType_SorgeberechtigtAbfrage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sorgeberechtigtAbfrage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnliegensklaerungAnfrageType_GemeinsamSorgeberechtigt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "gemeinsamSorgeberechtigt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (anliegensklaerungTypeEClass,
		   source,
		   new String[] {
			   "name", "AnliegensklaerungType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAnliegensklaerungType_AnliegenVerhaeltnisJugendlich(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anliegenVerhaeltnisJugendlich",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnliegensklaerungType_GemeinsamSorgeberechtigt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "gemeinsamSorgeberechtigt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (antragstellenderETTypeEClass,
		   source,
		   new String[] {
			   "name", "AntragstellenderETType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAntragstellenderETType_Namen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "namen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragstellenderETType_Geburtsort(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsort",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragstellenderETType_Geburtsdatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsdatum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragstellenderETType_Adresse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "adresse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragstellenderETType_AbweichendeAdresse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "abweichendeAdresse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragstellenderETType_AbweichendeAdressePerso(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "abweichendeAdressePerso",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragstellenderETType_Kontaktdaten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kontaktdaten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (aufenthaltsortEEnum,
		   source,
		   new String[] {
			   "name", "aufenthaltsort"
		   });
		addAnnotation
		  (aufenthaltsortObjectEDataType,
		   source,
		   new String[] {
			   "name", "aufenthaltsort:Object",
			   "baseType", "aufenthaltsort"
		   });
		addAnnotation
		  (auswahlBescheidartHZEEEnum,
		   source,
		   new String[] {
			   "name", "auswahlBescheidartHZE"
		   });
		addAnnotation
		  (auswahlBescheidartHZEObjectEDataType,
		   source,
		   new String[] {
			   "name", "auswahlBescheidartHZE:Object",
			   "baseType", "auswahlBescheidartHZE"
		   });
		addAnnotation
		  (auswahlBescheidartTypeEClass,
		   source,
		   new String[] {
			   "name", "auswahlBescheidart_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (auswahlderhilfehzeEEnum,
		   source,
		   new String[] {
			   "name", "auswahlderhilfehze"
		   });
		addAnnotation
		  (auswahlderhilfehzeObjectEDataType,
		   source,
		   new String[] {
			   "name", "auswahlderhilfehze:Object",
			   "baseType", "auswahlderhilfehze"
		   });
		addAnnotation
		  (begruendungDesHilfebedarfsTypeEClass,
		   source,
		   new String[] {
			   "name", "BegruendungDesHilfebedarfsType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBegruendungDesHilfebedarfsType_GrundBeantragung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "grundBeantragung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBegruendungDesHilfebedarfsType_HilfeVomJugendamt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hilfeVomJugendamt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (codeAufenthaltTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.AufenthaltType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeAuswahlDerHilfeHzETypeEClass,
		   source,
		   new String[] {
			   "name", "Code.AuswahlDerHilfeHzEType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (codeHZEIchBinTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.HZEIchBinType",
			   "kind", "empty"
		   });
		addAnnotation
		  (codeVerhaeltnisJugendlichHZETypeEClass,
		   source,
		   new String[] {
			   "name", "Code.VerhaeltnisJugendlichHZEType",
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
		  (getDocumentRoot_HilfenZurErziehungAnfrageHJV0702(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hilfenZurErziehung.anfrageHJV.0702",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_HilfenZurErziehungAntrag0701(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hilfenZurErziehung.antrag.0701",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_HilfenZurErziehungEingliederungshilfe0703(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hilfenZurErziehung.eingliederungshilfe.0703",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_HilfenZurErziehungNachweisnachricht0711(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hilfenZurErziehung.nachweisnachricht.0711",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_HilfenZurErziehungWiderspruch0704(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hilfenZurErziehung.widerspruch.0704",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (erreichbarkeitHZETypeEClass,
		   source,
		   new String[] {
			   "name", "ErreichbarkeitHZEType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getErreichbarkeitHZEType_ZeitErreichbarkeitHZE(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zeitErreichbarkeitHZE",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (hilfenZurErziehungAnfrageHJV0702TypeEClass,
		   source,
		   new String[] {
			   "name", "hilfenZurErziehung.anfrageHJV.0702_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHilfenZurErziehungAnfrageHJV0702Type_AuswahlAnfrageHJV(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "auswahlAnfrageHJV",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungAnfrageHJV0702Type_AnliegensklaerungHJV(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anliegensklaerungHJV",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungAnfrageHJV0702Type_PersoenlicheAngabenHJV(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "persoenlicheAngabenHJV",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungAnfrageHJV0702Type_BegruendungHJV(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "begruendungHJV",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungAnfrageHJV0702Type_AngabenAndererElternteil(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenAndererElternteil",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungAnfrageHJV0702Type_Dsgvo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dsgvo",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungAnfrageHJV0702Type_RichtigkeitAngaben(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "richtigkeitAngaben",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungAnfrageHJV0702Type_EinwilligungZwischenspeichern(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "einwilligungZwischenspeichern",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (hilfenZurErziehungAntrag0701TypeEClass,
		   source,
		   new String[] {
			   "name", "hilfenZurErziehung.antrag.0701_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHilfenZurErziehungAntrag0701Type_AuswahlDerHilfeHZE(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "auswahlDerHilfeHZE",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungAntrag0701Type_AnliegensklaerungHZE(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anliegensklaerungHZE",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungAntrag0701Type_PruefcodeHZE(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "pruefcodeHZE",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungAntrag0701Type_PersoenlicheAngabenZuIhrerPerson(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "persoenlicheAngabenZuIhrerPerson",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungAntrag0701Type_AndererElternteil(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "andererElternteil",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungAntrag0701Type_AngabenKindHZE(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenKindHZE",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungAntrag0701Type_NachweiseHZE(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweiseHZE",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungAntrag0701Type_Dsgvo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dsgvo",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungAntrag0701Type_ZusatzNachrichtHZE(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zusatzNachrichtHZE",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungAntrag0701Type_EinwilligungZwischenspeichern(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "einwilligungZwischenspeichern",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (hilfenZurErziehungEingliederungshilfe0703TypeEClass,
		   source,
		   new String[] {
			   "name", "hilfenZurErziehung.eingliederungshilfe.0703_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHilfenZurErziehungEingliederungshilfe0703Type_AuswahlAnfrageEingliederung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "auswahlAnfrageEingliederung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungEingliederungshilfe0703Type_AnliegensklaerungEingliederung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anliegensklaerungEingliederung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungEingliederungshilfe0703Type_PersoenlicheAngabenZuIhrerPerson(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "persoenlicheAngabenZuIhrerPerson",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungEingliederungshilfe0703Type_AngabenKind(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenKind",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungEingliederungshilfe0703Type_BegruendungHZE(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "begruendungHZE",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungEingliederungshilfe0703Type_AngabenElternteile(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenElternteile",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungEingliederungshilfe0703Type_Dsgvo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dsgvo",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungEingliederungshilfe0703Type_RichtigkeitAngaben(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "richtigkeitAngaben",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungEingliederungshilfe0703Type_EinwilligungZwischenspeichern(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "einwilligungZwischenspeichern",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (hilfenZurErziehungNachweisnachricht0711TypeEClass,
		   source,
		   new String[] {
			   "name", "hilfenZurErziehung.nachweisnachricht.0711_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHilfenZurErziehungNachweisnachricht0711Type_PersoenlicheAngabenZuIhrerPerson(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "persoenlicheAngabenZuIhrerPerson",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungNachweisnachricht0711Type_AngabenKind(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenKind",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungNachweisnachricht0711Type_Jugendamt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "jugendamt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungNachweisnachricht0711Type_Bearbeitungsnummer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bearbeitungsnummer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungNachweisnachricht0711Type_Antragsdatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "antragsdatum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungNachweisnachricht0711Type_Nachweis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweis",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungNachweisnachricht0711Type_ZusatznachrichtHZE(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zusatznachrichtHZE",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (hilfenZurErziehungWiderspruch0704TypeEClass,
		   source,
		   new String[] {
			   "name", "hilfenZurErziehung.widerspruch.0704_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHilfenZurErziehungWiderspruch0704Type_PersoenlicheAngabenZuIhrerPerson(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "persoenlicheAngabenZuIhrerPerson",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungWiderspruch0704Type_Aktenzeichen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aktenzeichen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungWiderspruch0704Type_Bescheiddatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bescheiddatum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungWiderspruch0704Type_BegruendungWiderspruch(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "begruendungWiderspruch",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungWiderspruch0704Type_BestaetigungWiderspruch(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bestaetigungWiderspruch",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungWiderspruch0704Type_Nachweis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweis",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHilfenZurErziehungWiderspruch0704Type_AuswahlBescheidart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "auswahlBescheidart",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nachweiseDatenschutzTypeEClass,
		   source,
		   new String[] {
			   "name", "NachweiseDatenschutzType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNachweiseDatenschutzType_Nachweis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweis",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweiseDatenschutzType_ZustimmungET2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zustimmungET2",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweiseDatenschutzType_RichtigkeitAngaben(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "richtigkeitAngaben",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nachweiseHZETypeEClass,
		   source,
		   new String[] {
			   "name", "NachweiseHZEType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNachweiseHZEType_Sorgerechtsnachweis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sorgerechtsnachweis",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweiseHZEType_Identitaetsnachweis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "identitaetsnachweis",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweiseHZEType_WeitereNachweise(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "weitereNachweise",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweiseHZEType_NachweisMeldebescheinigung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweisMeldebescheinigung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweiseHZEType_Anmerkungen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anmerkungen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweiseHZEType_Dsgvo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dsgvo",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachweiseHZEType_RichtigkeitAngaben(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "richtigkeitAngaben",
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
		  (persoenlicheAngabenEingliederungTypeEClass,
		   source,
		   new String[] {
			   "name", "PersoenlicheAngabenEingliederungType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPersoenlicheAngabenEingliederungType_Namen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "namen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersoenlicheAngabenEingliederungType_Geburtsdatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsdatum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersoenlicheAngabenEingliederungType_AktuelleAnschrift(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aktuelleAnschrift",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersoenlicheAngabenEingliederungType_Anschriftsaenderung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anschriftsaenderung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersoenlicheAngabenEingliederungType_WeichtAnschriftAb(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "weichtAnschriftAb",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersoenlicheAngabenEingliederungType_AbweichendeAnschrift(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "abweichendeAnschrift",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersoenlicheAngabenEingliederungType_Kontaktdaten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kontaktdaten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersoenlicheAngabenEingliederungType_SeelischeBehinderung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "seelischeBehinderung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersoenlicheAngabenEingliederungType_ArtDerBehinderung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "artDerBehinderung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersoenlicheAngabenEingliederungType_AerztlicherNachweis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aerztlicherNachweis",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (persoenlicheAngabenHJVTypeEClass,
		   source,
		   new String[] {
			   "name", "PersoenlicheAngabenHJVType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPersoenlicheAngabenHJVType_Namen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "namen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersoenlicheAngabenHJVType_Geburtsdatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsdatum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersoenlicheAngabenHJVType_AktuelleAnschrift(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aktuelleAnschrift",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersoenlicheAngabenHJVType_Anschriftsaenderung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anschriftsaenderung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersoenlicheAngabenHJVType_WeichtAnschriftAb(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "weichtAnschriftAb",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersoenlicheAngabenHJVType_AbweichendeAnschrift(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "abweichendeAnschrift",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersoenlicheAngabenHJVType_Kontaktdaten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kontaktdaten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersoenlicheAngabenHJVType_AufenthaltsortSonstige(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aufenthaltsortSonstige",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (persoenlicheAngabenHZETypeEClass,
		   source,
		   new String[] {
			   "name", "PersoenlicheAngabenHZEType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPersoenlicheAngabenHZEType_Namen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "namen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersoenlicheAngabenHZEType_Geburtsdatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsdatum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersoenlicheAngabenHZEType_AktuelleAnschrift(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aktuelleAnschrift",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersoenlicheAngabenHZEType_WeichtAnschriftAb(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "weichtAnschriftAb",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersoenlicheAngabenHZEType_AbweichendeAnschrift(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "abweichendeAnschrift",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersoenlicheAngabenHZEType_Kontaktdaten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kontaktdaten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (persoenlicheAngabenKontaktformularTypeEClass,
		   source,
		   new String[] {
			   "name", "PersoenlicheAngabenKontaktformularType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPersoenlicheAngabenKontaktformularType_Namen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "namen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersoenlicheAngabenKontaktformularType_AktuelleAnschrift(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aktuelleAnschrift",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersoenlicheAngabenKontaktformularType_Kontaktdaten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kontaktdaten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (personIdentifikationTypeEClass,
		   source,
		   new String[] {
			   "name", "PersonIdentifikationType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPersonIdentifikationType_Namen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "namen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersonIdentifikationType_Geburtsdatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsdatum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (verhaeltnisjugendlichhzeEEnum,
		   source,
		   new String[] {
			   "name", "verhaeltnisjugendlichhze"
		   });
		addAnnotation
		  (verhaeltnisjugendlichhzeObjectEDataType,
		   source,
		   new String[] {
			   "name", "verhaeltnisjugendlichhze:Object",
			   "baseType", "verhaeltnisjugendlichhze"
		   });
	}

} //ErziehungshilfePackageImpl
