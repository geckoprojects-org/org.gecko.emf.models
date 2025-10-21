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
package de.xoev.xfamilie.geburt._1.geburt.impl;

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

import de.xoev.xfamilie.geburt._1.geburt.AlleinsorgeEintragung;
import de.xoev.xfamilie.geburt._1.geburt.AngabenGesetzlicherVertreterElternteilType;
import de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type;
import de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil2Type;
import de.xoev.xfamilie.geburt._1.geburt.AngabenZumKindType;
import de.xoev.xfamilie.geburt._1.geburt.CodeAlleinsorgeEintragungType;
import de.xoev.xfamilie.geburt._1.geburt.DocumentRoot;
import de.xoev.xfamilie.geburt._1.geburt.EintragungNachweisregisterType;
import de.xoev.xfamilie.geburt._1.geburt.GeburtFactory;
import de.xoev.xfamilie.geburt._1.geburt.GeburtPackage;
import de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType;
import de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAntrag0801Type;
import de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAuskunft0803Type;
import de.xoev.xfamilie.geburt._1.geburt.SorgeErklaerungVorbeitung0802Type;
import de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterEintragung0804Type;
import de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterKorrektur0805Type;
import de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterLoeschung0806Type;
import de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType;

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
public class GeburtPackageImpl extends EPackageImpl implements GeburtPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angabenGesetzlicherVertreterElternteilTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angabenZumElternteil1TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angabenZumElternteil2TypeEClass = null;

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
	private EClass codeAlleinsorgeEintragungTypeEClass = null;

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
	private EClass eintragungNachweisregisterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nachgeburtlicheAngabenZumKindTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sorgeAlleinsorgeAntrag0801TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sorgeAlleinsorgeAuskunft0803TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sorgeErklaerungVorbeitung0802TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sorgeNachweisregisterEintragung0804TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sorgeNachweisregisterKorrektur0805TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sorgeNachweisregisterLoeschung0806TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zusatzangabenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum alleinsorgeEintragungEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType alleinsorgeEintragungObjectEDataType = null;

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
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GeburtPackageImpl() {
		super(eNS_URI, GeburtFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GeburtPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GeburtPackage init() {
		if (isInited) return (GeburtPackage)EPackage.Registry.INSTANCE.getEPackage(GeburtPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGeburtPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GeburtPackageImpl theGeburtPackage = registeredGeburtPackage instanceof GeburtPackageImpl ? (GeburtPackageImpl)registeredGeburtPackage : new GeburtPackageImpl();

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
		theGeburtPackage.createPackageContents();
		theAdoptionPackage.createPackageContents();
		theBaukastenPackage.createPackageContents();
		theAllgemeineNachrichtenPackage.createPackageContents();
		theBeistandschaftPackage.createPackageContents();
		theDSRVPackage.createPackageContents();
		theErziehungshilfePackage.createPackageContents();
		theKinderwunschPackage.createPackageContents();
		theMutterschaftsgeldPackage.createPackageContents();

		// Initialize created meta-data
		theGeburtPackage.initializePackageContents();
		theAdoptionPackage.initializePackageContents();
		theBaukastenPackage.initializePackageContents();
		theAllgemeineNachrichtenPackage.initializePackageContents();
		theBeistandschaftPackage.initializePackageContents();
		theDSRVPackage.initializePackageContents();
		theErziehungshilfePackage.initializePackageContents();
		theKinderwunschPackage.initializePackageContents();
		theMutterschaftsgeldPackage.initializePackageContents();

		// Fix loaded packages
		theElterngeldPackage.fixPackageContents();
		theUnterhaltsvorschussPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theGeburtPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GeburtPackage.eNS_URI, theGeburtPackage);
		return theGeburtPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAngabenGesetzlicherVertreterElternteilType() {
		return angabenGesetzlicherVertreterElternteilTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenGesetzlicherVertreterElternteilType_Name() {
		return (EReference)angabenGesetzlicherVertreterElternteilTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenGesetzlicherVertreterElternteilType_Geburt() {
		return (EReference)angabenGesetzlicherVertreterElternteilTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenGesetzlicherVertreterElternteilType_Anschrift() {
		return (EReference)angabenGesetzlicherVertreterElternteilTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenGesetzlicherVertreterElternteilType_AnschriftAusland() {
		return (EReference)angabenGesetzlicherVertreterElternteilTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenGesetzlicherVertreterElternteilType_Kontakt() {
		return (EReference)angabenGesetzlicherVertreterElternteilTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAngabenZumElternteil1Type() {
		return angabenZumElternteil1TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZumElternteil1Type_NameElternteil1() {
		return (EReference)angabenZumElternteil1TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZumElternteil1Type_Geburt() {
		return (EReference)angabenZumElternteil1TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZumElternteil1Type_Staatsangehoerigkeit() {
		return (EReference)angabenZumElternteil1TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZumElternteil1Type_DolmetscherBenoetigt() {
		return (EAttribute)angabenZumElternteil1TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZumElternteil1Type_Anschrift() {
		return (EReference)angabenZumElternteil1TypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZumElternteil1Type_AnschriftAusland() {
		return (EReference)angabenZumElternteil1TypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZumElternteil1Type_Kontakt() {
		return (EReference)angabenZumElternteil1TypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZumElternteil1Type_Familienstand() {
		return (EReference)angabenZumElternteil1TypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZumElternteil1Type_AnschriftPostalisch() {
		return (EReference)angabenZumElternteil1TypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAngabenZumElternteil2Type() {
		return angabenZumElternteil2TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZumElternteil2Type_NameElternteil2() {
		return (EReference)angabenZumElternteil2TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZumElternteil2Type_Geburt() {
		return (EReference)angabenZumElternteil2TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZumElternteil2Type_DolmetscherBenoetigt() {
		return (EAttribute)angabenZumElternteil2TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZumElternteil2Type_Anschrift() {
		return (EReference)angabenZumElternteil2TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZumElternteil2Type_AnschriftAusland() {
		return (EReference)angabenZumElternteil2TypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZumElternteil2Type_Kontakt() {
		return (EReference)angabenZumElternteil2TypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenZumElternteil2Type_AenderungAnschriftLetzte5Jahre() {
		return (EAttribute)angabenZumElternteil2TypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZumElternteil2Type_Familienstand() {
		return (EReference)angabenZumElternteil2TypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZumElternteil2Type_AnschriftPostalisch() {
		return (EReference)angabenZumElternteil2TypeEClass.getEStructuralFeatures().get(8);
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
	public EReference getAngabenZumKindType_NachgeburtlicheAngabenZumKind() {
		return (EReference)angabenZumKindTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenZumKindType_AngabenZumKindVorGeburt() {
		return (EReference)angabenZumKindTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeAlleinsorgeEintragungType() {
		return codeAlleinsorgeEintragungTypeEClass;
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
	public EReference getDocumentRoot_SorgeAlleinsorgeAntrag0801() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SorgeAlleinsorgeAuskunft0803() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SorgeErklaerungVorbeitung0802() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SorgeNachweisregisterEintragung0804() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SorgeNachweisregisterKorrektur0805() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SorgeNachweisregisterLoeschung0806() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEintragungNachweisregisterType() {
		return eintragungNachweisregisterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEintragungNachweisregisterType_EintragungVorhanden() {
		return (EAttribute)eintragungNachweisregisterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEintragungNachweisregisterType_EintragungSorgeregisterArt() {
		return (EReference)eintragungNachweisregisterTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEintragungNachweisregisterType_WohnortJugendamtMutter() {
		return (EAttribute)eintragungNachweisregisterTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEintragungNachweisregisterType_RegisterfuerhrendesJugendamt() {
		return (EAttribute)eintragungNachweisregisterTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNachgeburtlicheAngabenZumKindType() {
		return nachgeburtlicheAngabenZumKindTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachgeburtlicheAngabenZumKindType_NameDesKindes() {
		return (EReference)nachgeburtlicheAngabenZumKindTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachgeburtlicheAngabenZumKindType_Geburtsort() {
		return (EAttribute)nachgeburtlicheAngabenZumKindTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachgeburtlicheAngabenZumKindType_GeburtsortStaat() {
		return (EReference)nachgeburtlicheAngabenZumKindTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachgeburtlicheAngabenZumKindType_Geburtsdatum() {
		return (EReference)nachgeburtlicheAngabenZumKindTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachgeburtlicheAngabenZumKindType_GeburtsregisterNummer() {
		return (EAttribute)nachgeburtlicheAngabenZumKindTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachgeburtlicheAngabenZumKindType_Geburtsstandesamt() {
		return (EAttribute)nachgeburtlicheAngabenZumKindTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachgeburtlicheAngabenZumKindType_RegisterfuehrendeStelleARS() {
		return (EReference)nachgeburtlicheAngabenZumKindTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSorgeAlleinsorgeAntrag0801Type() {
		return sorgeAlleinsorgeAntrag0801TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSorgeAlleinsorgeAntrag0801Type_AngabenZurMutter() {
		return (EReference)sorgeAlleinsorgeAntrag0801TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSorgeAlleinsorgeAntrag0801Type_AngabenZumKind() {
		return (EReference)sorgeAlleinsorgeAntrag0801TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSorgeAlleinsorgeAntrag0801Type_Zusatzangaben() {
		return (EReference)sorgeAlleinsorgeAntrag0801TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSorgeAlleinsorgeAntrag0801Type_Terminwuensche() {
		return (EReference)sorgeAlleinsorgeAntrag0801TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSorgeAlleinsorgeAuskunft0803Type() {
		return sorgeAlleinsorgeAuskunft0803TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSorgeAlleinsorgeAuskunft0803Type_AngabenZurMutter() {
		return (EReference)sorgeAlleinsorgeAuskunft0803TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSorgeAlleinsorgeAuskunft0803Type_AngabenZumKind() {
		return (EReference)sorgeAlleinsorgeAuskunft0803TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSorgeAlleinsorgeAuskunft0803Type_Zusatzangaben() {
		return (EReference)sorgeAlleinsorgeAuskunft0803TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSorgeAlleinsorgeAuskunft0803Type_EintragungNachweisregister() {
		return (EReference)sorgeAlleinsorgeAuskunft0803TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSorgeErklaerungVorbeitung0802Type() {
		return sorgeErklaerungVorbeitung0802TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSorgeErklaerungVorbeitung0802Type_AngabenZumVater() {
		return (EReference)sorgeErklaerungVorbeitung0802TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSorgeErklaerungVorbeitung0802Type_AngabenGesetzlicherVertreterVater() {
		return (EReference)sorgeErklaerungVorbeitung0802TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSorgeErklaerungVorbeitung0802Type_AngabenZurMutter() {
		return (EReference)sorgeErklaerungVorbeitung0802TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSorgeErklaerungVorbeitung0802Type_AngabenGesetzlicherVertreterMutter() {
		return (EReference)sorgeErklaerungVorbeitung0802TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSorgeErklaerungVorbeitung0802Type_AngabenZumKind() {
		return (EReference)sorgeErklaerungVorbeitung0802TypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSorgeErklaerungVorbeitung0802Type_Terminwunsch() {
		return (EReference)sorgeErklaerungVorbeitung0802TypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSorgeNachweisregisterEintragung0804Type() {
		return sorgeNachweisregisterEintragung0804TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSorgeNachweisregisterEintragung0804Type_AngabenZurMutter() {
		return (EReference)sorgeNachweisregisterEintragung0804TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSorgeNachweisregisterEintragung0804Type_AngabenZumKind() {
		return (EReference)sorgeNachweisregisterEintragung0804TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSorgeNachweisregisterEintragung0804Type_EintragungNachweisregister() {
		return (EReference)sorgeNachweisregisterEintragung0804TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSorgeNachweisregisterKorrektur0805Type() {
		return sorgeNachweisregisterKorrektur0805TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSorgeNachweisregisterKorrektur0805Type_AngabenZurMutterAlt() {
		return (EReference)sorgeNachweisregisterKorrektur0805TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSorgeNachweisregisterKorrektur0805Type_AngabenZumKindAlt() {
		return (EReference)sorgeNachweisregisterKorrektur0805TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSorgeNachweisregisterKorrektur0805Type_EintragungNachweisregisterAlt() {
		return (EReference)sorgeNachweisregisterKorrektur0805TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSorgeNachweisregisterKorrektur0805Type_AngabenZurMutterNeu() {
		return (EReference)sorgeNachweisregisterKorrektur0805TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSorgeNachweisregisterKorrektur0805Type_AngabenZumKindNeu() {
		return (EReference)sorgeNachweisregisterKorrektur0805TypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSorgeNachweisregisterKorrektur0805Type_EintragungNachweisregisterNeu() {
		return (EReference)sorgeNachweisregisterKorrektur0805TypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSorgeNachweisregisterLoeschung0806Type() {
		return sorgeNachweisregisterLoeschung0806TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSorgeNachweisregisterLoeschung0806Type_AngabenZurMutter() {
		return (EReference)sorgeNachweisregisterLoeschung0806TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSorgeNachweisregisterLoeschung0806Type_AngabenZumKind() {
		return (EReference)sorgeNachweisregisterLoeschung0806TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZusatzangabenType() {
		return zusatzangabenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZusatzangabenType_MutterIstWarMitVaterVerheiratet() {
		return (EAttribute)zusatzangabenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZusatzangabenType_GerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige() {
		return (EAttribute)zusatzangabenTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZusatzangabenType_Nachweise() {
		return (EReference)zusatzangabenTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZusatzangabenType_MutterZumZeitpunktDerGeburtVerheiratet() {
		return (EAttribute)zusatzangabenTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZusatzangabenType_GemeinsameSorgeerklaerung() {
		return (EAttribute)zusatzangabenTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAlleinsorgeEintragung() {
		return alleinsorgeEintragungEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAlleinsorgeEintragungObject() {
		return alleinsorgeEintragungObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeburtFactory getGeburtFactory() {
		return (GeburtFactory)getEFactoryInstance();
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
		angabenGesetzlicherVertreterElternteilTypeEClass = createEClass(ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE);
		createEReference(angabenGesetzlicherVertreterElternteilTypeEClass, ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__NAME);
		createEReference(angabenGesetzlicherVertreterElternteilTypeEClass, ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__GEBURT);
		createEReference(angabenGesetzlicherVertreterElternteilTypeEClass, ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__ANSCHRIFT);
		createEReference(angabenGesetzlicherVertreterElternteilTypeEClass, ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__ANSCHRIFT_AUSLAND);
		createEReference(angabenGesetzlicherVertreterElternteilTypeEClass, ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__KONTAKT);

		angabenZumElternteil1TypeEClass = createEClass(ANGABEN_ZUM_ELTERNTEIL1_TYPE);
		createEReference(angabenZumElternteil1TypeEClass, ANGABEN_ZUM_ELTERNTEIL1_TYPE__NAME_ELTERNTEIL1);
		createEReference(angabenZumElternteil1TypeEClass, ANGABEN_ZUM_ELTERNTEIL1_TYPE__GEBURT);
		createEReference(angabenZumElternteil1TypeEClass, ANGABEN_ZUM_ELTERNTEIL1_TYPE__STAATSANGEHOERIGKEIT);
		createEAttribute(angabenZumElternteil1TypeEClass, ANGABEN_ZUM_ELTERNTEIL1_TYPE__DOLMETSCHER_BENOETIGT);
		createEReference(angabenZumElternteil1TypeEClass, ANGABEN_ZUM_ELTERNTEIL1_TYPE__ANSCHRIFT);
		createEReference(angabenZumElternteil1TypeEClass, ANGABEN_ZUM_ELTERNTEIL1_TYPE__ANSCHRIFT_AUSLAND);
		createEReference(angabenZumElternteil1TypeEClass, ANGABEN_ZUM_ELTERNTEIL1_TYPE__KONTAKT);
		createEReference(angabenZumElternteil1TypeEClass, ANGABEN_ZUM_ELTERNTEIL1_TYPE__FAMILIENSTAND);
		createEReference(angabenZumElternteil1TypeEClass, ANGABEN_ZUM_ELTERNTEIL1_TYPE__ANSCHRIFT_POSTALISCH);

		angabenZumElternteil2TypeEClass = createEClass(ANGABEN_ZUM_ELTERNTEIL2_TYPE);
		createEReference(angabenZumElternteil2TypeEClass, ANGABEN_ZUM_ELTERNTEIL2_TYPE__NAME_ELTERNTEIL2);
		createEReference(angabenZumElternteil2TypeEClass, ANGABEN_ZUM_ELTERNTEIL2_TYPE__GEBURT);
		createEAttribute(angabenZumElternteil2TypeEClass, ANGABEN_ZUM_ELTERNTEIL2_TYPE__DOLMETSCHER_BENOETIGT);
		createEReference(angabenZumElternteil2TypeEClass, ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT);
		createEReference(angabenZumElternteil2TypeEClass, ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT_AUSLAND);
		createEReference(angabenZumElternteil2TypeEClass, ANGABEN_ZUM_ELTERNTEIL2_TYPE__KONTAKT);
		createEAttribute(angabenZumElternteil2TypeEClass, ANGABEN_ZUM_ELTERNTEIL2_TYPE__AENDERUNG_ANSCHRIFT_LETZTE5_JAHRE);
		createEReference(angabenZumElternteil2TypeEClass, ANGABEN_ZUM_ELTERNTEIL2_TYPE__FAMILIENSTAND);
		createEReference(angabenZumElternteil2TypeEClass, ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT_POSTALISCH);

		angabenZumKindTypeEClass = createEClass(ANGABEN_ZUM_KIND_TYPE);
		createEReference(angabenZumKindTypeEClass, ANGABEN_ZUM_KIND_TYPE__NACHGEBURTLICHE_ANGABEN_ZUM_KIND);
		createEReference(angabenZumKindTypeEClass, ANGABEN_ZUM_KIND_TYPE__ANGABEN_ZUM_KIND_VOR_GEBURT);

		codeAlleinsorgeEintragungTypeEClass = createEClass(CODE_ALLEINSORGE_EINTRAGUNG_TYPE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SORGE_ALLEINSORGE_ANTRAG0801);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SORGE_ALLEINSORGE_AUSKUNFT0803);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SORGE_ERKLAERUNG_VORBEITUNG0802);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_EINTRAGUNG0804);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_KORREKTUR0805);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_LOESCHUNG0806);

		eintragungNachweisregisterTypeEClass = createEClass(EINTRAGUNG_NACHWEISREGISTER_TYPE);
		createEAttribute(eintragungNachweisregisterTypeEClass, EINTRAGUNG_NACHWEISREGISTER_TYPE__EINTRAGUNG_VORHANDEN);
		createEReference(eintragungNachweisregisterTypeEClass, EINTRAGUNG_NACHWEISREGISTER_TYPE__EINTRAGUNG_SORGEREGISTER_ART);
		createEAttribute(eintragungNachweisregisterTypeEClass, EINTRAGUNG_NACHWEISREGISTER_TYPE__WOHNORT_JUGENDAMT_MUTTER);
		createEAttribute(eintragungNachweisregisterTypeEClass, EINTRAGUNG_NACHWEISREGISTER_TYPE__REGISTERFUERHRENDES_JUGENDAMT);

		nachgeburtlicheAngabenZumKindTypeEClass = createEClass(NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE);
		createEReference(nachgeburtlicheAngabenZumKindTypeEClass, NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__NAME_DES_KINDES);
		createEAttribute(nachgeburtlicheAngabenZumKindTypeEClass, NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSORT);
		createEReference(nachgeburtlicheAngabenZumKindTypeEClass, NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSORT_STAAT);
		createEReference(nachgeburtlicheAngabenZumKindTypeEClass, NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSDATUM);
		createEAttribute(nachgeburtlicheAngabenZumKindTypeEClass, NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSREGISTER_NUMMER);
		createEAttribute(nachgeburtlicheAngabenZumKindTypeEClass, NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSSTANDESAMT);
		createEReference(nachgeburtlicheAngabenZumKindTypeEClass, NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__REGISTERFUEHRENDE_STELLE_ARS);

		sorgeAlleinsorgeAntrag0801TypeEClass = createEClass(SORGE_ALLEINSORGE_ANTRAG0801_TYPE);
		createEReference(sorgeAlleinsorgeAntrag0801TypeEClass, SORGE_ALLEINSORGE_ANTRAG0801_TYPE__ANGABEN_ZUR_MUTTER);
		createEReference(sorgeAlleinsorgeAntrag0801TypeEClass, SORGE_ALLEINSORGE_ANTRAG0801_TYPE__ANGABEN_ZUM_KIND);
		createEReference(sorgeAlleinsorgeAntrag0801TypeEClass, SORGE_ALLEINSORGE_ANTRAG0801_TYPE__ZUSATZANGABEN);
		createEReference(sorgeAlleinsorgeAntrag0801TypeEClass, SORGE_ALLEINSORGE_ANTRAG0801_TYPE__TERMINWUENSCHE);

		sorgeAlleinsorgeAuskunft0803TypeEClass = createEClass(SORGE_ALLEINSORGE_AUSKUNFT0803_TYPE);
		createEReference(sorgeAlleinsorgeAuskunft0803TypeEClass, SORGE_ALLEINSORGE_AUSKUNFT0803_TYPE__ANGABEN_ZUR_MUTTER);
		createEReference(sorgeAlleinsorgeAuskunft0803TypeEClass, SORGE_ALLEINSORGE_AUSKUNFT0803_TYPE__ANGABEN_ZUM_KIND);
		createEReference(sorgeAlleinsorgeAuskunft0803TypeEClass, SORGE_ALLEINSORGE_AUSKUNFT0803_TYPE__ZUSATZANGABEN);
		createEReference(sorgeAlleinsorgeAuskunft0803TypeEClass, SORGE_ALLEINSORGE_AUSKUNFT0803_TYPE__EINTRAGUNG_NACHWEISREGISTER);

		sorgeErklaerungVorbeitung0802TypeEClass = createEClass(SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE);
		createEReference(sorgeErklaerungVorbeitung0802TypeEClass, SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUM_VATER);
		createEReference(sorgeErklaerungVorbeitung0802TypeEClass, SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_GESETZLICHER_VERTRETER_VATER);
		createEReference(sorgeErklaerungVorbeitung0802TypeEClass, SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUR_MUTTER);
		createEReference(sorgeErklaerungVorbeitung0802TypeEClass, SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_GESETZLICHER_VERTRETER_MUTTER);
		createEReference(sorgeErklaerungVorbeitung0802TypeEClass, SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUM_KIND);
		createEReference(sorgeErklaerungVorbeitung0802TypeEClass, SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__TERMINWUNSCH);

		sorgeNachweisregisterEintragung0804TypeEClass = createEClass(SORGE_NACHWEISREGISTER_EINTRAGUNG0804_TYPE);
		createEReference(sorgeNachweisregisterEintragung0804TypeEClass, SORGE_NACHWEISREGISTER_EINTRAGUNG0804_TYPE__ANGABEN_ZUR_MUTTER);
		createEReference(sorgeNachweisregisterEintragung0804TypeEClass, SORGE_NACHWEISREGISTER_EINTRAGUNG0804_TYPE__ANGABEN_ZUM_KIND);
		createEReference(sorgeNachweisregisterEintragung0804TypeEClass, SORGE_NACHWEISREGISTER_EINTRAGUNG0804_TYPE__EINTRAGUNG_NACHWEISREGISTER);

		sorgeNachweisregisterKorrektur0805TypeEClass = createEClass(SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE);
		createEReference(sorgeNachweisregisterKorrektur0805TypeEClass, SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUR_MUTTER_ALT);
		createEReference(sorgeNachweisregisterKorrektur0805TypeEClass, SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUM_KIND_ALT);
		createEReference(sorgeNachweisregisterKorrektur0805TypeEClass, SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__EINTRAGUNG_NACHWEISREGISTER_ALT);
		createEReference(sorgeNachweisregisterKorrektur0805TypeEClass, SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUR_MUTTER_NEU);
		createEReference(sorgeNachweisregisterKorrektur0805TypeEClass, SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUM_KIND_NEU);
		createEReference(sorgeNachweisregisterKorrektur0805TypeEClass, SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__EINTRAGUNG_NACHWEISREGISTER_NEU);

		sorgeNachweisregisterLoeschung0806TypeEClass = createEClass(SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE);
		createEReference(sorgeNachweisregisterLoeschung0806TypeEClass, SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__ANGABEN_ZUR_MUTTER);
		createEReference(sorgeNachweisregisterLoeschung0806TypeEClass, SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__ANGABEN_ZUM_KIND);

		zusatzangabenTypeEClass = createEClass(ZUSATZANGABEN_TYPE);
		createEAttribute(zusatzangabenTypeEClass, ZUSATZANGABEN_TYPE__MUTTER_IST_WAR_MIT_VATER_VERHEIRATET);
		createEAttribute(zusatzangabenTypeEClass, ZUSATZANGABEN_TYPE__GERICHTLICHE_ENTSCHEIDUNG_ELTERLICHE_SORGE_AUCH_VORLAEUFIGE);
		createEReference(zusatzangabenTypeEClass, ZUSATZANGABEN_TYPE__NACHWEISE);
		createEAttribute(zusatzangabenTypeEClass, ZUSATZANGABEN_TYPE__MUTTER_ZUM_ZEITPUNKT_DER_GEBURT_VERHEIRATET);
		createEAttribute(zusatzangabenTypeEClass, ZUSATZANGABEN_TYPE__GEMEINSAME_SORGEERKLAERUNG);

		// Create enums
		alleinsorgeEintragungEEnum = createEEnum(ALLEINSORGE_EINTRAGUNG);

		// Create data types
		alleinsorgeEintragungObjectEDataType = createEDataType(ALLEINSORGE_EINTRAGUNG_OBJECT);
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
		codeAlleinsorgeEintragungTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		sorgeAlleinsorgeAntrag0801TypeEClass.getESuperTypes().add(theBaukastenPackage.getAntragsnachrichtType());
		sorgeAlleinsorgeAuskunft0803TypeEClass.getESuperTypes().add(theBaukastenPackage.getAntragsnachrichtType());
		sorgeErklaerungVorbeitung0802TypeEClass.getESuperTypes().add(theBaukastenPackage.getAntragsnachrichtType());
		sorgeNachweisregisterEintragung0804TypeEClass.getESuperTypes().add(theBaukastenPackage.getAntragsnachrichtType());
		sorgeNachweisregisterKorrektur0805TypeEClass.getESuperTypes().add(theBaukastenPackage.getAntragsnachrichtType());
		sorgeNachweisregisterLoeschung0806TypeEClass.getESuperTypes().add(theBaukastenPackage.getAntragsnachrichtType());

		// Initialize classes, features, and operations; add parameters
		initEClass(angabenGesetzlicherVertreterElternteilTypeEClass, AngabenGesetzlicherVertreterElternteilType.class, "AngabenGesetzlicherVertreterElternteilType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAngabenGesetzlicherVertreterElternteilType_Name(), theBaukastenPackage.getNameNatuerlichePersonType(), null, "name", null, 0, 1, AngabenGesetzlicherVertreterElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenGesetzlicherVertreterElternteilType_Geburt(), theBaukastenPackage.getGeburtType(), null, "geburt", null, 1, 1, AngabenGesetzlicherVertreterElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenGesetzlicherVertreterElternteilType_Anschrift(), theBaukastenPackage.getMeldeanschriftType(), null, "anschrift", null, 1, 1, AngabenGesetzlicherVertreterElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenGesetzlicherVertreterElternteilType_AnschriftAusland(), theBaukastenPackage.getAuslandsanschriftType(), null, "anschriftAusland", null, 0, 1, AngabenGesetzlicherVertreterElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenGesetzlicherVertreterElternteilType_Kontakt(), theBaukastenPackage.getErreichbarkeitType(), null, "kontakt", null, 0, -1, AngabenGesetzlicherVertreterElternteilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(angabenZumElternteil1TypeEClass, AngabenZumElternteil1Type.class, "AngabenZumElternteil1Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAngabenZumElternteil1Type_NameElternteil1(), theBaukastenPackage.getNameNatuerlichePersonType(), null, "nameElternteil1", null, 0, 1, AngabenZumElternteil1Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenZumElternteil1Type_Geburt(), theBaukastenPackage.getGeburtType(), null, "geburt", null, 1, 1, AngabenZumElternteil1Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenZumElternteil1Type_Staatsangehoerigkeit(), theBaukastenPackage.getCodeStaatsangehoerigkeitType(), null, "staatsangehoerigkeit", null, 1, -1, AngabenZumElternteil1Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZumElternteil1Type_DolmetscherBenoetigt(), theXMLTypePackage.getBoolean(), "dolmetscherBenoetigt", null, 0, 1, AngabenZumElternteil1Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenZumElternteil1Type_Anschrift(), theBaukastenPackage.getMeldeanschriftType(), null, "anschrift", null, 0, -1, AngabenZumElternteil1Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenZumElternteil1Type_AnschriftAusland(), theBaukastenPackage.getAuslandsanschriftType(), null, "anschriftAusland", null, 0, 1, AngabenZumElternteil1Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenZumElternteil1Type_Kontakt(), theBaukastenPackage.getErreichbarkeitType(), null, "kontakt", null, 0, -1, AngabenZumElternteil1Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenZumElternteil1Type_Familienstand(), theBaukastenPackage.getCodeFamilienstandType(), null, "familienstand", null, 0, 1, AngabenZumElternteil1Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenZumElternteil1Type_AnschriftPostalisch(), theBaukastenPackage.getPostalischeInlandsanschriftType(), null, "anschriftPostalisch", null, 0, 1, AngabenZumElternteil1Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(angabenZumElternteil2TypeEClass, AngabenZumElternteil2Type.class, "AngabenZumElternteil2Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAngabenZumElternteil2Type_NameElternteil2(), theBaukastenPackage.getNameNatuerlichePersonType(), null, "nameElternteil2", null, 1, 1, AngabenZumElternteil2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenZumElternteil2Type_Geburt(), theBaukastenPackage.getGeburtType(), null, "geburt", null, 1, 1, AngabenZumElternteil2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZumElternteil2Type_DolmetscherBenoetigt(), theXMLTypePackage.getBoolean(), "dolmetscherBenoetigt", null, 0, 1, AngabenZumElternteil2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenZumElternteil2Type_Anschrift(), theBaukastenPackage.getMeldeanschriftType(), null, "anschrift", null, 0, -1, AngabenZumElternteil2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenZumElternteil2Type_AnschriftAusland(), theBaukastenPackage.getAuslandsanschriftType(), null, "anschriftAusland", null, 0, 1, AngabenZumElternteil2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenZumElternteil2Type_Kontakt(), theBaukastenPackage.getErreichbarkeitType(), null, "kontakt", null, 0, -1, AngabenZumElternteil2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenZumElternteil2Type_AenderungAnschriftLetzte5Jahre(), theXMLTypePackage.getBoolean(), "aenderungAnschriftLetzte5Jahre", null, 0, 1, AngabenZumElternteil2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenZumElternteil2Type_Familienstand(), theBaukastenPackage.getCodeFamilienstandType(), null, "familienstand", null, 0, 1, AngabenZumElternteil2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenZumElternteil2Type_AnschriftPostalisch(), theBaukastenPackage.getPostalischeInlandsanschriftType(), null, "anschriftPostalisch", null, 0, 1, AngabenZumElternteil2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(angabenZumKindTypeEClass, AngabenZumKindType.class, "AngabenZumKindType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAngabenZumKindType_NachgeburtlicheAngabenZumKind(), this.getNachgeburtlicheAngabenZumKindType(), null, "nachgeburtlicheAngabenZumKind", null, 0, 1, AngabenZumKindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngabenZumKindType_AngabenZumKindVorGeburt(), theBaukastenPackage.getTeilbekanntesDatumType(), null, "angabenZumKindVorGeburt", null, 0, 1, AngabenZumKindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeAlleinsorgeEintragungTypeEClass, CodeAlleinsorgeEintragungType.class, "CodeAlleinsorgeEintragungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SorgeAlleinsorgeAntrag0801(), this.getSorgeAlleinsorgeAntrag0801Type(), null, "sorgeAlleinsorgeAntrag0801", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SorgeAlleinsorgeAuskunft0803(), this.getSorgeAlleinsorgeAuskunft0803Type(), null, "sorgeAlleinsorgeAuskunft0803", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SorgeErklaerungVorbeitung0802(), this.getSorgeErklaerungVorbeitung0802Type(), null, "sorgeErklaerungVorbeitung0802", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SorgeNachweisregisterEintragung0804(), this.getSorgeNachweisregisterEintragung0804Type(), null, "sorgeNachweisregisterEintragung0804", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SorgeNachweisregisterKorrektur0805(), this.getSorgeNachweisregisterKorrektur0805Type(), null, "sorgeNachweisregisterKorrektur0805", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SorgeNachweisregisterLoeschung0806(), this.getSorgeNachweisregisterLoeschung0806Type(), null, "sorgeNachweisregisterLoeschung0806", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(eintragungNachweisregisterTypeEClass, EintragungNachweisregisterType.class, "EintragungNachweisregisterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEintragungNachweisregisterType_EintragungVorhanden(), theXMLTypePackage.getBoolean(), "eintragungVorhanden", null, 1, 1, EintragungNachweisregisterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEintragungNachweisregisterType_EintragungSorgeregisterArt(), this.getCodeAlleinsorgeEintragungType(), null, "eintragungSorgeregisterArt", null, 0, -1, EintragungNachweisregisterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEintragungNachweisregisterType_WohnortJugendamtMutter(), theDIN913792204Package.getDatatypeC(), "wohnortJugendamtMutter", null, 0, 1, EintragungNachweisregisterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEintragungNachweisregisterType_RegisterfuerhrendesJugendamt(), theDIN913792204Package.getDatatypeC(), "registerfuerhrendesJugendamt", null, 0, 1, EintragungNachweisregisterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nachgeburtlicheAngabenZumKindTypeEClass, NachgeburtlicheAngabenZumKindType.class, "NachgeburtlicheAngabenZumKindType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNachgeburtlicheAngabenZumKindType_NameDesKindes(), theBaukastenPackage.getNameNatuerlichePersonType(), null, "nameDesKindes", null, 1, -1, NachgeburtlicheAngabenZumKindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachgeburtlicheAngabenZumKindType_Geburtsort(), theDIN913792204Package.getDatatypeC(), "geburtsort", null, 1, 1, NachgeburtlicheAngabenZumKindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachgeburtlicheAngabenZumKindType_GeburtsortStaat(), theBaukastenPackage.getCodeStaatType(), null, "geburtsortStaat", null, 0, 1, NachgeburtlicheAngabenZumKindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachgeburtlicheAngabenZumKindType_Geburtsdatum(), theBaukastenPackage.getTeilbekanntesDatumType(), null, "geburtsdatum", null, 1, 1, NachgeburtlicheAngabenZumKindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachgeburtlicheAngabenZumKindType_GeburtsregisterNummer(), theDIN913792204Package.getDatatypeC(), "geburtsregisterNummer", null, 0, 1, NachgeburtlicheAngabenZumKindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachgeburtlicheAngabenZumKindType_Geburtsstandesamt(), theDIN913792204Package.getDatatypeC(), "geburtsstandesamt", null, 0, 1, NachgeburtlicheAngabenZumKindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachgeburtlicheAngabenZumKindType_RegisterfuehrendeStelleARS(), theBaukastenPackage.getCodeGemeindeVZRegionalschluesselType(), null, "registerfuehrendeStelleARS", null, 0, 1, NachgeburtlicheAngabenZumKindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sorgeAlleinsorgeAntrag0801TypeEClass, SorgeAlleinsorgeAntrag0801Type.class, "SorgeAlleinsorgeAntrag0801Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSorgeAlleinsorgeAntrag0801Type_AngabenZurMutter(), this.getAngabenZumElternteil2Type(), null, "angabenZurMutter", null, 1, 1, SorgeAlleinsorgeAntrag0801Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSorgeAlleinsorgeAntrag0801Type_AngabenZumKind(), this.getAngabenZumKindType(), null, "angabenZumKind", null, 1, 1, SorgeAlleinsorgeAntrag0801Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSorgeAlleinsorgeAntrag0801Type_Zusatzangaben(), this.getZusatzangabenType(), null, "zusatzangaben", null, 0, 1, SorgeAlleinsorgeAntrag0801Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSorgeAlleinsorgeAntrag0801Type_Terminwuensche(), theBaukastenPackage.getTerminwunschType(), null, "terminwuensche", null, 0, -1, SorgeAlleinsorgeAntrag0801Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sorgeAlleinsorgeAuskunft0803TypeEClass, SorgeAlleinsorgeAuskunft0803Type.class, "SorgeAlleinsorgeAuskunft0803Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSorgeAlleinsorgeAuskunft0803Type_AngabenZurMutter(), this.getAngabenZumElternteil2Type(), null, "angabenZurMutter", null, 1, 1, SorgeAlleinsorgeAuskunft0803Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSorgeAlleinsorgeAuskunft0803Type_AngabenZumKind(), this.getAngabenZumKindType(), null, "angabenZumKind", null, 1, 1, SorgeAlleinsorgeAuskunft0803Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSorgeAlleinsorgeAuskunft0803Type_Zusatzangaben(), this.getZusatzangabenType(), null, "zusatzangaben", null, 0, 1, SorgeAlleinsorgeAuskunft0803Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSorgeAlleinsorgeAuskunft0803Type_EintragungNachweisregister(), this.getEintragungNachweisregisterType(), null, "eintragungNachweisregister", null, 1, 1, SorgeAlleinsorgeAuskunft0803Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sorgeErklaerungVorbeitung0802TypeEClass, SorgeErklaerungVorbeitung0802Type.class, "SorgeErklaerungVorbeitung0802Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSorgeErklaerungVorbeitung0802Type_AngabenZumVater(), this.getAngabenZumElternteil1Type(), null, "angabenZumVater", null, 1, 1, SorgeErklaerungVorbeitung0802Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSorgeErklaerungVorbeitung0802Type_AngabenGesetzlicherVertreterVater(), this.getAngabenGesetzlicherVertreterElternteilType(), null, "angabenGesetzlicherVertreterVater", null, 0, -1, SorgeErklaerungVorbeitung0802Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSorgeErklaerungVorbeitung0802Type_AngabenZurMutter(), this.getAngabenZumElternteil2Type(), null, "angabenZurMutter", null, 1, 1, SorgeErklaerungVorbeitung0802Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSorgeErklaerungVorbeitung0802Type_AngabenGesetzlicherVertreterMutter(), this.getAngabenGesetzlicherVertreterElternteilType(), null, "angabenGesetzlicherVertreterMutter", null, 0, -1, SorgeErklaerungVorbeitung0802Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSorgeErklaerungVorbeitung0802Type_AngabenZumKind(), this.getAngabenZumKindType(), null, "angabenZumKind", null, 1, 1, SorgeErklaerungVorbeitung0802Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSorgeErklaerungVorbeitung0802Type_Terminwunsch(), theBaukastenPackage.getTerminwunschType(), null, "terminwunsch", null, 0, -1, SorgeErklaerungVorbeitung0802Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sorgeNachweisregisterEintragung0804TypeEClass, SorgeNachweisregisterEintragung0804Type.class, "SorgeNachweisregisterEintragung0804Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSorgeNachweisregisterEintragung0804Type_AngabenZurMutter(), this.getAngabenZumElternteil2Type(), null, "angabenZurMutter", null, 1, 1, SorgeNachweisregisterEintragung0804Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSorgeNachweisregisterEintragung0804Type_AngabenZumKind(), this.getAngabenZumKindType(), null, "angabenZumKind", null, 1, 1, SorgeNachweisregisterEintragung0804Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSorgeNachweisregisterEintragung0804Type_EintragungNachweisregister(), this.getEintragungNachweisregisterType(), null, "eintragungNachweisregister", null, 1, 1, SorgeNachweisregisterEintragung0804Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sorgeNachweisregisterKorrektur0805TypeEClass, SorgeNachweisregisterKorrektur0805Type.class, "SorgeNachweisregisterKorrektur0805Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSorgeNachweisregisterKorrektur0805Type_AngabenZurMutterAlt(), this.getAngabenZumElternteil2Type(), null, "angabenZurMutterAlt", null, 1, 1, SorgeNachweisregisterKorrektur0805Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSorgeNachweisregisterKorrektur0805Type_AngabenZumKindAlt(), this.getAngabenZumKindType(), null, "angabenZumKindAlt", null, 1, 1, SorgeNachweisregisterKorrektur0805Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSorgeNachweisregisterKorrektur0805Type_EintragungNachweisregisterAlt(), this.getEintragungNachweisregisterType(), null, "eintragungNachweisregisterAlt", null, 1, 1, SorgeNachweisregisterKorrektur0805Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSorgeNachweisregisterKorrektur0805Type_AngabenZurMutterNeu(), this.getAngabenZumElternteil2Type(), null, "angabenZurMutterNeu", null, 0, 1, SorgeNachweisregisterKorrektur0805Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSorgeNachweisregisterKorrektur0805Type_AngabenZumKindNeu(), this.getAngabenZumKindType(), null, "angabenZumKindNeu", null, 0, 1, SorgeNachweisregisterKorrektur0805Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSorgeNachweisregisterKorrektur0805Type_EintragungNachweisregisterNeu(), this.getEintragungNachweisregisterType(), null, "eintragungNachweisregisterNeu", null, 0, 1, SorgeNachweisregisterKorrektur0805Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sorgeNachweisregisterLoeschung0806TypeEClass, SorgeNachweisregisterLoeschung0806Type.class, "SorgeNachweisregisterLoeschung0806Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSorgeNachweisregisterLoeschung0806Type_AngabenZurMutter(), this.getAngabenZumElternteil2Type(), null, "angabenZurMutter", null, 1, 1, SorgeNachweisregisterLoeschung0806Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSorgeNachweisregisterLoeschung0806Type_AngabenZumKind(), this.getAngabenZumKindType(), null, "angabenZumKind", null, 1, 1, SorgeNachweisregisterLoeschung0806Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zusatzangabenTypeEClass, ZusatzangabenType.class, "ZusatzangabenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZusatzangabenType_MutterIstWarMitVaterVerheiratet(), theXMLTypePackage.getBoolean(), "mutterIstWarMitVaterVerheiratet", null, 1, 1, ZusatzangabenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZusatzangabenType_GerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige(), theXMLTypePackage.getBoolean(), "gerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige", null, 1, 1, ZusatzangabenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZusatzangabenType_Nachweise(), theBaukastenPackage.getNachweisdokumentType(), null, "nachweise", null, 0, -1, ZusatzangabenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZusatzangabenType_MutterZumZeitpunktDerGeburtVerheiratet(), theXMLTypePackage.getBoolean(), "mutterZumZeitpunktDerGeburtVerheiratet", null, 0, 1, ZusatzangabenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZusatzangabenType_GemeinsameSorgeerklaerung(), theXMLTypePackage.getBoolean(), "gemeinsameSorgeerklaerung", null, 0, 1, ZusatzangabenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(alleinsorgeEintragungEEnum, AlleinsorgeEintragung.class, "AlleinsorgeEintragung");
		addEEnumLiteral(alleinsorgeEintragungEEnum, AlleinsorgeEintragung._01);
		addEEnumLiteral(alleinsorgeEintragungEEnum, AlleinsorgeEintragung._02);
		addEEnumLiteral(alleinsorgeEintragungEEnum, AlleinsorgeEintragung._03);
		addEEnumLiteral(alleinsorgeEintragungEEnum, AlleinsorgeEintragung._04);

		// Initialize data types
		initEDataType(alleinsorgeEintragungObjectEDataType, AlleinsorgeEintragung.class, "AlleinsorgeEintragungObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (alleinsorgeEintragungEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>AlleinsorgeEintragung</nameLang>\n                   \n    <nameKurz>AlleinsorgeEintragung</nameKurz>\n                   \n    <nameTechnisch>alleinsorgeEintragung</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:alleinsorgeeintragung</kennung>\n                   \n    <beschreibung>Art der Eintragung in einem Sorgeregister.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>2.0</version>\n                   \n    <beschreibung>Art der Eintragung in einem Sorgeregister.</beschreibung>\n                   \n    <datumGueltigkeitAb>2024-05-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (alleinsorgeEintragungEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Sorgeerkl\u00e4rung</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (alleinsorgeEintragungEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Gerichtliche Entscheidung</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (alleinsorgeEintragungEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Sperrvermerk</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (alleinsorgeEintragungEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Gerichtliche Entscheidung: Alleinsorge</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (codeAlleinsorgeEintragungTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>AlleinsorgeEintragung</nameLang>\n                   \n    <nameKurz>AlleinsorgeEintragung</nameKurz>\n                   \n    <nameTechnisch>alleinsorgeEintragung</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:alleinsorgeeintragung</kennung>\n                   \n    <beschreibung>Art der Eintragung in einem Sorgeregister.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>2.0</version>\n                   \n    <beschreibung>Art der Eintragung in einem Sorgeregister.</beschreibung>\n                   \n    <datumGueltigkeitAb>2024-05-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (getDocumentRoot_SorgeAlleinsorgeAntrag0801(),
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <rechtsgrundlage>\u00a758a SGB 8</rechtsgrundlage>\n           \n"
		   });
		addAnnotation
		  (getDocumentRoot_SorgeErklaerungVorbeitung0802(),
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <rechtsgrundlage>\u00a7\u00a7 1626ff BGB; \u00a7\u00a7 59, 87e SGB VIII; \u00a7\u00a7 10, 12, 13, 17, 51 BeurkG; \u00a733 PStV</rechtsgrundlage>\n           \n"
		   });
		addAnnotation
		  (getNachgeburtlicheAngabenZumKindType_GeburtsortStaat(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>Deutschland wird immer durch Weglassen dieses Elementes abgebildet.</implementationHint>\n                 \n"
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
		  (alleinsorgeEintragungEEnum,
		   source,
		   new String[] {
			   "name", "alleinsorgeEintragung"
		   });
		addAnnotation
		  (alleinsorgeEintragungObjectEDataType,
		   source,
		   new String[] {
			   "name", "alleinsorgeEintragung:Object",
			   "baseType", "alleinsorgeEintragung"
		   });
		addAnnotation
		  (angabenGesetzlicherVertreterElternteilTypeEClass,
		   source,
		   new String[] {
			   "name", "AngabenGesetzlicherVertreterElternteilType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAngabenGesetzlicherVertreterElternteilType_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenGesetzlicherVertreterElternteilType_Geburt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenGesetzlicherVertreterElternteilType_Anschrift(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anschrift",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenGesetzlicherVertreterElternteilType_AnschriftAusland(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anschriftAusland",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenGesetzlicherVertreterElternteilType_Kontakt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kontakt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (angabenZumElternteil1TypeEClass,
		   source,
		   new String[] {
			   "name", "AngabenZumElternteil1Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAngabenZumElternteil1Type_NameElternteil1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nameElternteil1",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumElternteil1Type_Geburt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumElternteil1Type_Staatsangehoerigkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "staatsangehoerigkeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumElternteil1Type_DolmetscherBenoetigt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dolmetscherBenoetigt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumElternteil1Type_Anschrift(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anschrift",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumElternteil1Type_AnschriftAusland(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anschriftAusland",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumElternteil1Type_Kontakt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kontakt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumElternteil1Type_Familienstand(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "familienstand",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumElternteil1Type_AnschriftPostalisch(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anschriftPostalisch",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (angabenZumElternteil2TypeEClass,
		   source,
		   new String[] {
			   "name", "AngabenZumElternteil2Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAngabenZumElternteil2Type_NameElternteil2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nameElternteil2",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumElternteil2Type_Geburt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumElternteil2Type_DolmetscherBenoetigt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dolmetscherBenoetigt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumElternteil2Type_Anschrift(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anschrift",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumElternteil2Type_AnschriftAusland(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anschriftAusland",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumElternteil2Type_Kontakt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kontakt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumElternteil2Type_AenderungAnschriftLetzte5Jahre(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aenderungAnschriftLetzte5Jahre",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumElternteil2Type_Familienstand(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "familienstand",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumElternteil2Type_AnschriftPostalisch(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "anschriftPostalisch",
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
		  (getAngabenZumKindType_NachgeburtlicheAngabenZumKind(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachgeburtlicheAngabenZumKind",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenZumKindType_AngabenZumKindVorGeburt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenZumKindVorGeburt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (codeAlleinsorgeEintragungTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.AlleinsorgeEintragungType",
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
		  (getDocumentRoot_SorgeAlleinsorgeAntrag0801(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sorge.alleinsorge.antrag.0801",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_SorgeAlleinsorgeAuskunft0803(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sorge.alleinsorge.auskunft.0803",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_SorgeErklaerungVorbeitung0802(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sorge.erklaerung.vorbeitung.0802",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_SorgeNachweisregisterEintragung0804(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sorge.nachweisregister.eintragung.0804",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_SorgeNachweisregisterKorrektur0805(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sorge.nachweisregister.korrektur.0805",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_SorgeNachweisregisterLoeschung0806(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sorge.nachweisregister.loeschung.0806",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (eintragungNachweisregisterTypeEClass,
		   source,
		   new String[] {
			   "name", "EintragungNachweisregisterType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEintragungNachweisregisterType_EintragungVorhanden(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "eintragungVorhanden",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEintragungNachweisregisterType_EintragungSorgeregisterArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "eintragungSorgeregisterArt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEintragungNachweisregisterType_WohnortJugendamtMutter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wohnortJugendamtMutter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEintragungNachweisregisterType_RegisterfuerhrendesJugendamt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "registerfuerhrendesJugendamt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nachgeburtlicheAngabenZumKindTypeEClass,
		   source,
		   new String[] {
			   "name", "NachgeburtlicheAngabenZumKindType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNachgeburtlicheAngabenZumKindType_NameDesKindes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nameDesKindes",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachgeburtlicheAngabenZumKindType_Geburtsort(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsort",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachgeburtlicheAngabenZumKindType_GeburtsortStaat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsortStaat",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachgeburtlicheAngabenZumKindType_Geburtsdatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsdatum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachgeburtlicheAngabenZumKindType_GeburtsregisterNummer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsregisterNummer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachgeburtlicheAngabenZumKindType_Geburtsstandesamt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburtsstandesamt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachgeburtlicheAngabenZumKindType_RegisterfuehrendeStelleARS(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "registerfuehrendeStelleARS",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (sorgeAlleinsorgeAntrag0801TypeEClass,
		   source,
		   new String[] {
			   "name", "sorge.alleinsorge.antrag.0801_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSorgeAlleinsorgeAntrag0801Type_AngabenZurMutter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenZurMutter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSorgeAlleinsorgeAntrag0801Type_AngabenZumKind(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenZumKind",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSorgeAlleinsorgeAntrag0801Type_Zusatzangaben(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zusatzangaben",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSorgeAlleinsorgeAntrag0801Type_Terminwuensche(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "terminwuensche",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (sorgeAlleinsorgeAuskunft0803TypeEClass,
		   source,
		   new String[] {
			   "name", "sorge.alleinsorge.auskunft.0803_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSorgeAlleinsorgeAuskunft0803Type_AngabenZurMutter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenZurMutter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSorgeAlleinsorgeAuskunft0803Type_AngabenZumKind(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenZumKind",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSorgeAlleinsorgeAuskunft0803Type_Zusatzangaben(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zusatzangaben",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSorgeAlleinsorgeAuskunft0803Type_EintragungNachweisregister(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "eintragungNachweisregister",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (sorgeErklaerungVorbeitung0802TypeEClass,
		   source,
		   new String[] {
			   "name", "sorge.erklaerung.vorbeitung.0802_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSorgeErklaerungVorbeitung0802Type_AngabenZumVater(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenZumVater",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSorgeErklaerungVorbeitung0802Type_AngabenGesetzlicherVertreterVater(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenGesetzlicherVertreterVater",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSorgeErklaerungVorbeitung0802Type_AngabenZurMutter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenZurMutter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSorgeErklaerungVorbeitung0802Type_AngabenGesetzlicherVertreterMutter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenGesetzlicherVertreterMutter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSorgeErklaerungVorbeitung0802Type_AngabenZumKind(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenZumKind",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSorgeErklaerungVorbeitung0802Type_Terminwunsch(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "terminwunsch",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (sorgeNachweisregisterEintragung0804TypeEClass,
		   source,
		   new String[] {
			   "name", "sorge.nachweisregister.eintragung.0804_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSorgeNachweisregisterEintragung0804Type_AngabenZurMutter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenZurMutter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSorgeNachweisregisterEintragung0804Type_AngabenZumKind(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenZumKind",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSorgeNachweisregisterEintragung0804Type_EintragungNachweisregister(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "eintragungNachweisregister",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (sorgeNachweisregisterKorrektur0805TypeEClass,
		   source,
		   new String[] {
			   "name", "sorge.nachweisregister.korrektur.0805_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSorgeNachweisregisterKorrektur0805Type_AngabenZurMutterAlt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenZurMutterAlt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSorgeNachweisregisterKorrektur0805Type_AngabenZumKindAlt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenZumKindAlt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSorgeNachweisregisterKorrektur0805Type_EintragungNachweisregisterAlt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "eintragungNachweisregisterAlt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSorgeNachweisregisterKorrektur0805Type_AngabenZurMutterNeu(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenZurMutterNeu",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSorgeNachweisregisterKorrektur0805Type_AngabenZumKindNeu(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenZumKindNeu",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSorgeNachweisregisterKorrektur0805Type_EintragungNachweisregisterNeu(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "eintragungNachweisregisterNeu",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (sorgeNachweisregisterLoeschung0806TypeEClass,
		   source,
		   new String[] {
			   "name", "sorge.nachweisregister.loeschung.0806_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSorgeNachweisregisterLoeschung0806Type_AngabenZurMutter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenZurMutter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSorgeNachweisregisterLoeschung0806Type_AngabenZumKind(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenZumKind",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (zusatzangabenTypeEClass,
		   source,
		   new String[] {
			   "name", "ZusatzangabenType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZusatzangabenType_MutterIstWarMitVaterVerheiratet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "mutterIstWarMitVaterVerheiratet",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getZusatzangabenType_GerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "gerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getZusatzangabenType_Nachweise(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachweise",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getZusatzangabenType_MutterZumZeitpunktDerGeburtVerheiratet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "mutterZumZeitpunktDerGeburtVerheiratet",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getZusatzangabenType_GemeinsameSorgeerklaerung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "gemeinsameSorgeerklaerung",
			   "namespace", "##targetNamespace"
		   });
	}

} //GeburtPackageImpl
