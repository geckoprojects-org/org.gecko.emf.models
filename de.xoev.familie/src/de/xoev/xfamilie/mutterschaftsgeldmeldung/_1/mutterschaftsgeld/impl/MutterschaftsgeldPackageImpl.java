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
package de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl;

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

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage;

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl;

import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenEntbindungType;
import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenMutterschaftsgeldType;
import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungRueckType;
import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungType;
import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.CodeKennzeichenMutterschaftsgeldType;
import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.DocumentRoot;
import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.Kennzeichenmutterschaftsgeld;
import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldFactory;
import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage;
import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungAnforderung0501Type;
import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungRueckmeldung0502Type;
import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.StornierungType;
import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.StornierungType1;

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
public class MutterschaftsgeldPackageImpl extends EPackageImpl implements MutterschaftsgeldPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angabenEntbindungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angabenMutterschaftsgeldTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass antragstellenderElternteilMutterschaftsgeldmeldungRueckTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass antragstellenderElternteilMutterschaftsgeldmeldungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeKennzeichenMutterschaftsgeldTypeEClass = null;

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
	private EClass mutterschaftsgeldmeldungAnforderung0501TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mutterschaftsgeldmeldungRueckmeldung0502TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stornierungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stornierungType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum kennzeichenmutterschaftsgeldEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kennzeichenmutterschaftsgeldObjectEDataType = null;

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
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MutterschaftsgeldPackageImpl() {
		super(eNS_URI, MutterschaftsgeldFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MutterschaftsgeldPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MutterschaftsgeldPackage init() {
		if (isInited) return (MutterschaftsgeldPackage)EPackage.Registry.INSTANCE.getEPackage(MutterschaftsgeldPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMutterschaftsgeldPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MutterschaftsgeldPackageImpl theMutterschaftsgeldPackage = registeredMutterschaftsgeldPackage instanceof MutterschaftsgeldPackageImpl ? (MutterschaftsgeldPackageImpl)registeredMutterschaftsgeldPackage : new MutterschaftsgeldPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KinderwunschPackage.eNS_URI);
		KinderwunschPackageImpl theKinderwunschPackage = (KinderwunschPackageImpl)(registeredPackage instanceof KinderwunschPackageImpl ? registeredPackage : KinderwunschPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI);
		UnterhaltsvorschussPackageImpl theUnterhaltsvorschussPackage = (UnterhaltsvorschussPackageImpl)(registeredPackage instanceof UnterhaltsvorschussPackageImpl ? registeredPackage : UnterhaltsvorschussPackage.eINSTANCE);

		// Load packages
		theElterngeldPackage.loadPackage();
		theUnterhaltsvorschussPackage.loadPackage();

		// Create package meta-data objects
		theMutterschaftsgeldPackage.createPackageContents();
		theAdoptionPackage.createPackageContents();
		theBaukastenPackage.createPackageContents();
		theAllgemeineNachrichtenPackage.createPackageContents();
		theBeistandschaftPackage.createPackageContents();
		theDSRVPackage.createPackageContents();
		theGeburtPackage.createPackageContents();
		theErziehungshilfePackage.createPackageContents();
		theKinderwunschPackage.createPackageContents();

		// Initialize created meta-data
		theMutterschaftsgeldPackage.initializePackageContents();
		theAdoptionPackage.initializePackageContents();
		theBaukastenPackage.initializePackageContents();
		theAllgemeineNachrichtenPackage.initializePackageContents();
		theBeistandschaftPackage.initializePackageContents();
		theDSRVPackage.initializePackageContents();
		theGeburtPackage.initializePackageContents();
		theErziehungshilfePackage.initializePackageContents();
		theKinderwunschPackage.initializePackageContents();

		// Fix loaded packages
		theElterngeldPackage.fixPackageContents();
		theUnterhaltsvorschussPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theMutterschaftsgeldPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MutterschaftsgeldPackage.eNS_URI, theMutterschaftsgeldPackage);
		return theMutterschaftsgeldPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAngabenEntbindungType() {
		return angabenEntbindungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenEntbindungType_AngabenMutterschaftsgeld() {
		return (EReference)angabenEntbindungTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenEntbindungType_EntbindungstagKrankenkasse() {
		return (EAttribute)angabenEntbindungTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAngabenMutterschaftsgeldType() {
		return angabenMutterschaftsgeldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenMutterschaftsgeldType_MutterschaftsgeldzahlungAb() {
		return (EAttribute)angabenMutterschaftsgeldTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenMutterschaftsgeldType_MutterschaftsgeldzahlungBis() {
		return (EAttribute)angabenMutterschaftsgeldTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenMutterschaftsgeldType_MutterschaftsgeldzahlungHoehe() {
		return (EAttribute)angabenMutterschaftsgeldTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAntragstellenderElternteilMutterschaftsgeldmeldungRueckType() {
		return antragstellenderElternteilMutterschaftsgeldmeldungRueckTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilMutterschaftsgeldmeldungRueckType_Name() {
		return (EReference)antragstellenderElternteilMutterschaftsgeldmeldungRueckTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilMutterschaftsgeldmeldungRueckType_Geburt() {
		return (EReference)antragstellenderElternteilMutterschaftsgeldmeldungRueckTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAntragstellenderElternteilMutterschaftsgeldmeldungRueckType_Krankenversichertennummer() {
		return (EAttribute)antragstellenderElternteilMutterschaftsgeldmeldungRueckTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAntragstellenderElternteilMutterschaftsgeldmeldungType() {
		return antragstellenderElternteilMutterschaftsgeldmeldungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilMutterschaftsgeldmeldungType_Name() {
		return (EReference)antragstellenderElternteilMutterschaftsgeldmeldungTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilMutterschaftsgeldmeldungType_Geburt() {
		return (EReference)antragstellenderElternteilMutterschaftsgeldmeldungTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAntragstellenderElternteilMutterschaftsgeldmeldungType_Entbindungstag() {
		return (EAttribute)antragstellenderElternteilMutterschaftsgeldmeldungTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAntragstellenderElternteilMutterschaftsgeldmeldungType_KennzeichenMehrlingsgeburt() {
		return (EAttribute)antragstellenderElternteilMutterschaftsgeldmeldungTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAntragstellenderElternteilMutterschaftsgeldmeldungType_Krankenversichertennummer() {
		return (EAttribute)antragstellenderElternteilMutterschaftsgeldmeldungTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeKennzeichenMutterschaftsgeldType() {
		return codeKennzeichenMutterschaftsgeldTypeEClass;
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
	public EReference getDocumentRoot_MutterschaftsgeldmeldungAnforderung0501() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MutterschaftsgeldmeldungRueckmeldung0502() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMutterschaftsgeldmeldungAnforderung0501Type() {
		return mutterschaftsgeldmeldungAnforderung0501TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMutterschaftsgeldmeldungAnforderung0501Type_AktenzeichenElterngeldstelle() {
		return (EAttribute)mutterschaftsgeldmeldungAnforderung0501TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMutterschaftsgeldmeldungAnforderung0501Type_AntragstellenderElternteil() {
		return (EReference)mutterschaftsgeldmeldungAnforderung0501TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMutterschaftsgeldmeldungAnforderung0501Type_Einwilligung() {
		return (EAttribute)mutterschaftsgeldmeldungAnforderung0501TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMutterschaftsgeldmeldungAnforderung0501Type_Stornierung() {
		return (EReference)mutterschaftsgeldmeldungAnforderung0501TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMutterschaftsgeldmeldungRueckmeldung0502Type() {
		return mutterschaftsgeldmeldungRueckmeldung0502TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMutterschaftsgeldmeldungRueckmeldung0502Type_AktenzeichenElterngeldstelle() {
		return (EAttribute)mutterschaftsgeldmeldungRueckmeldung0502TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMutterschaftsgeldmeldungRueckmeldung0502Type_AntragstellenderElternteil() {
		return (EReference)mutterschaftsgeldmeldungRueckmeldung0502TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMutterschaftsgeldmeldungRueckmeldung0502Type_AngabenEntbindung() {
		return (EReference)mutterschaftsgeldmeldungRueckmeldung0502TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMutterschaftsgeldmeldungRueckmeldung0502Type_Stornierung() {
		return (EReference)mutterschaftsgeldmeldungRueckmeldung0502TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMutterschaftsgeldmeldungRueckmeldung0502Type_KennzeichenMutterschaftsgeld() {
		return (EReference)mutterschaftsgeldmeldungRueckmeldung0502TypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStornierungType() {
		return stornierungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStornierungType_Stornokennzeichen() {
		return (EAttribute)stornierungTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStornierungType_DatensatzIDUrsprungsmeldung() {
		return (EAttribute)stornierungTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStornierungType1() {
		return stornierungType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStornierungType1_Stornokennzeichen() {
		return (EAttribute)stornierungType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStornierungType1_DatensatzIDUrsprungsmeldung() {
		return (EAttribute)stornierungType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getKennzeichenmutterschaftsgeld() {
		return kennzeichenmutterschaftsgeldEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getKennzeichenmutterschaftsgeldObject() {
		return kennzeichenmutterschaftsgeldObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MutterschaftsgeldFactory getMutterschaftsgeldFactory() {
		return (MutterschaftsgeldFactory)getEFactoryInstance();
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
		angabenEntbindungTypeEClass = createEClass(ANGABEN_ENTBINDUNG_TYPE);
		createEReference(angabenEntbindungTypeEClass, ANGABEN_ENTBINDUNG_TYPE__ANGABEN_MUTTERSCHAFTSGELD);
		createEAttribute(angabenEntbindungTypeEClass, ANGABEN_ENTBINDUNG_TYPE__ENTBINDUNGSTAG_KRANKENKASSE);

		angabenMutterschaftsgeldTypeEClass = createEClass(ANGABEN_MUTTERSCHAFTSGELD_TYPE);
		createEAttribute(angabenMutterschaftsgeldTypeEClass, ANGABEN_MUTTERSCHAFTSGELD_TYPE__MUTTERSCHAFTSGELDZAHLUNG_AB);
		createEAttribute(angabenMutterschaftsgeldTypeEClass, ANGABEN_MUTTERSCHAFTSGELD_TYPE__MUTTERSCHAFTSGELDZAHLUNG_BIS);
		createEAttribute(angabenMutterschaftsgeldTypeEClass, ANGABEN_MUTTERSCHAFTSGELD_TYPE__MUTTERSCHAFTSGELDZAHLUNG_HOEHE);

		antragstellenderElternteilMutterschaftsgeldmeldungRueckTypeEClass = createEClass(ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE);
		createEReference(antragstellenderElternteilMutterschaftsgeldmeldungRueckTypeEClass, ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE__NAME);
		createEReference(antragstellenderElternteilMutterschaftsgeldmeldungRueckTypeEClass, ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE__GEBURT);
		createEAttribute(antragstellenderElternteilMutterschaftsgeldmeldungRueckTypeEClass, ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE__KRANKENVERSICHERTENNUMMER);

		antragstellenderElternteilMutterschaftsgeldmeldungTypeEClass = createEClass(ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_TYPE);
		createEReference(antragstellenderElternteilMutterschaftsgeldmeldungTypeEClass, ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_TYPE__NAME);
		createEReference(antragstellenderElternteilMutterschaftsgeldmeldungTypeEClass, ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_TYPE__GEBURT);
		createEAttribute(antragstellenderElternteilMutterschaftsgeldmeldungTypeEClass, ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_TYPE__ENTBINDUNGSTAG);
		createEAttribute(antragstellenderElternteilMutterschaftsgeldmeldungTypeEClass, ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_TYPE__KENNZEICHEN_MEHRLINGSGEBURT);
		createEAttribute(antragstellenderElternteilMutterschaftsgeldmeldungTypeEClass, ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_TYPE__KRANKENVERSICHERTENNUMMER);

		codeKennzeichenMutterschaftsgeldTypeEClass = createEClass(CODE_KENNZEICHEN_MUTTERSCHAFTSGELD_TYPE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502);

		mutterschaftsgeldmeldungAnforderung0501TypeEClass = createEClass(MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE);
		createEAttribute(mutterschaftsgeldmeldungAnforderung0501TypeEClass, MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__AKTENZEICHEN_ELTERNGELDSTELLE);
		createEReference(mutterschaftsgeldmeldungAnforderung0501TypeEClass, MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__ANTRAGSTELLENDER_ELTERNTEIL);
		createEAttribute(mutterschaftsgeldmeldungAnforderung0501TypeEClass, MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__EINWILLIGUNG);
		createEReference(mutterschaftsgeldmeldungAnforderung0501TypeEClass, MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__STORNIERUNG);

		mutterschaftsgeldmeldungRueckmeldung0502TypeEClass = createEClass(MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE);
		createEAttribute(mutterschaftsgeldmeldungRueckmeldung0502TypeEClass, MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__AKTENZEICHEN_ELTERNGELDSTELLE);
		createEReference(mutterschaftsgeldmeldungRueckmeldung0502TypeEClass, MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__ANTRAGSTELLENDER_ELTERNTEIL);
		createEReference(mutterschaftsgeldmeldungRueckmeldung0502TypeEClass, MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__ANGABEN_ENTBINDUNG);
		createEReference(mutterschaftsgeldmeldungRueckmeldung0502TypeEClass, MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__STORNIERUNG);
		createEReference(mutterschaftsgeldmeldungRueckmeldung0502TypeEClass, MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__KENNZEICHEN_MUTTERSCHAFTSGELD);

		stornierungTypeEClass = createEClass(STORNIERUNG_TYPE);
		createEAttribute(stornierungTypeEClass, STORNIERUNG_TYPE__STORNOKENNZEICHEN);
		createEAttribute(stornierungTypeEClass, STORNIERUNG_TYPE__DATENSATZ_ID_URSPRUNGSMELDUNG);

		stornierungType1EClass = createEClass(STORNIERUNG_TYPE1);
		createEAttribute(stornierungType1EClass, STORNIERUNG_TYPE1__STORNOKENNZEICHEN);
		createEAttribute(stornierungType1EClass, STORNIERUNG_TYPE1__DATENSATZ_ID_URSPRUNGSMELDUNG);

		// Create enums
		kennzeichenmutterschaftsgeldEEnum = createEEnum(KENNZEICHENMUTTERSCHAFTSGELD);

		// Create data types
		kennzeichenmutterschaftsgeldObjectEDataType = createEDataType(KENNZEICHENMUTTERSCHAFTSGELD_OBJECT);
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
		codeKennzeichenMutterschaftsgeldTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		mutterschaftsgeldmeldungAnforderung0501TypeEClass.getESuperTypes().add(theBaukastenPackage.getNachrichtType());
		mutterschaftsgeldmeldungRueckmeldung0502TypeEClass.getESuperTypes().add(theBaukastenPackage.getNachrichtType());

		// Initialize classes, features, and operations; add parameters
		initEClass(angabenEntbindungTypeEClass, AngabenEntbindungType.class, "AngabenEntbindungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAngabenEntbindungType_AngabenMutterschaftsgeld(), this.getAngabenMutterschaftsgeldType(), null, "angabenMutterschaftsgeld", null, 1, -1, AngabenEntbindungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenEntbindungType_EntbindungstagKrankenkasse(), theBaukastenPackage.getTagesdatumType(), "entbindungstagKrankenkasse", null, 0, 1, AngabenEntbindungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(angabenMutterschaftsgeldTypeEClass, AngabenMutterschaftsgeldType.class, "AngabenMutterschaftsgeldType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAngabenMutterschaftsgeldType_MutterschaftsgeldzahlungAb(), theBaukastenPackage.getTagesdatumType(), "mutterschaftsgeldzahlungAb", null, 1, 1, AngabenMutterschaftsgeldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenMutterschaftsgeldType_MutterschaftsgeldzahlungBis(), theBaukastenPackage.getTagesdatumType(), "mutterschaftsgeldzahlungBis", null, 0, 1, AngabenMutterschaftsgeldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngabenMutterschaftsgeldType_MutterschaftsgeldzahlungHoehe(), theXMLTypePackage.getDecimal(), "mutterschaftsgeldzahlungHoehe", null, 0, 1, AngabenMutterschaftsgeldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(antragstellenderElternteilMutterschaftsgeldmeldungRueckTypeEClass, AntragstellenderElternteilMutterschaftsgeldmeldungRueckType.class, "AntragstellenderElternteilMutterschaftsgeldmeldungRueckType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAntragstellenderElternteilMutterschaftsgeldmeldungRueckType_Name(), theBaukastenPackage.getNameNatuerlichePersonType(), null, "name", null, 0, 1, AntragstellenderElternteilMutterschaftsgeldmeldungRueckType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAntragstellenderElternteilMutterschaftsgeldmeldungRueckType_Geburt(), theBaukastenPackage.getTeilbekanntesDatumType(), null, "geburt", null, 0, 1, AntragstellenderElternteilMutterschaftsgeldmeldungRueckType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAntragstellenderElternteilMutterschaftsgeldmeldungRueckType_Krankenversichertennummer(), theBaukastenPackage.getKrankenversichertennummerType(), "krankenversichertennummer", null, 0, 1, AntragstellenderElternteilMutterschaftsgeldmeldungRueckType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(antragstellenderElternteilMutterschaftsgeldmeldungTypeEClass, AntragstellenderElternteilMutterschaftsgeldmeldungType.class, "AntragstellenderElternteilMutterschaftsgeldmeldungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAntragstellenderElternteilMutterschaftsgeldmeldungType_Name(), theBaukastenPackage.getNameNatuerlichePersonType(), null, "name", null, 1, 1, AntragstellenderElternteilMutterschaftsgeldmeldungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAntragstellenderElternteilMutterschaftsgeldmeldungType_Geburt(), theBaukastenPackage.getTeilbekanntesDatumType(), null, "geburt", null, 1, 1, AntragstellenderElternteilMutterschaftsgeldmeldungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAntragstellenderElternteilMutterschaftsgeldmeldungType_Entbindungstag(), theBaukastenPackage.getTagesdatumType(), "entbindungstag", null, 1, 1, AntragstellenderElternteilMutterschaftsgeldmeldungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAntragstellenderElternteilMutterschaftsgeldmeldungType_KennzeichenMehrlingsgeburt(), theXMLTypePackage.getBoolean(), "kennzeichenMehrlingsgeburt", null, 1, 1, AntragstellenderElternteilMutterschaftsgeldmeldungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAntragstellenderElternteilMutterschaftsgeldmeldungType_Krankenversichertennummer(), theBaukastenPackage.getKrankenversichertennummerType(), "krankenversichertennummer", null, 1, 1, AntragstellenderElternteilMutterschaftsgeldmeldungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeKennzeichenMutterschaftsgeldTypeEClass, CodeKennzeichenMutterschaftsgeldType.class, "CodeKennzeichenMutterschaftsgeldType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MutterschaftsgeldmeldungAnforderung0501(), this.getMutterschaftsgeldmeldungAnforderung0501Type(), null, "mutterschaftsgeldmeldungAnforderung0501", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MutterschaftsgeldmeldungRueckmeldung0502(), this.getMutterschaftsgeldmeldungRueckmeldung0502Type(), null, "mutterschaftsgeldmeldungRueckmeldung0502", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(mutterschaftsgeldmeldungAnforderung0501TypeEClass, MutterschaftsgeldmeldungAnforderung0501Type.class, "MutterschaftsgeldmeldungAnforderung0501Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMutterschaftsgeldmeldungAnforderung0501Type_AktenzeichenElterngeldstelle(), theDIN913792204Package.getDatatypeC(), "aktenzeichenElterngeldstelle", null, 1, 1, MutterschaftsgeldmeldungAnforderung0501Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMutterschaftsgeldmeldungAnforderung0501Type_AntragstellenderElternteil(), this.getAntragstellenderElternteilMutterschaftsgeldmeldungType(), null, "antragstellenderElternteil", null, 1, 1, MutterschaftsgeldmeldungAnforderung0501Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMutterschaftsgeldmeldungAnforderung0501Type_Einwilligung(), theXMLTypePackage.getBoolean(), "einwilligung", "true", 1, 1, MutterschaftsgeldmeldungAnforderung0501Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMutterschaftsgeldmeldungAnforderung0501Type_Stornierung(), this.getStornierungType1(), null, "stornierung", null, 0, 1, MutterschaftsgeldmeldungAnforderung0501Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mutterschaftsgeldmeldungRueckmeldung0502TypeEClass, MutterschaftsgeldmeldungRueckmeldung0502Type.class, "MutterschaftsgeldmeldungRueckmeldung0502Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMutterschaftsgeldmeldungRueckmeldung0502Type_AktenzeichenElterngeldstelle(), theDIN913792204Package.getDatatypeC(), "aktenzeichenElterngeldstelle", null, 1, 1, MutterschaftsgeldmeldungRueckmeldung0502Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMutterschaftsgeldmeldungRueckmeldung0502Type_AntragstellenderElternteil(), this.getAntragstellenderElternteilMutterschaftsgeldmeldungRueckType(), null, "antragstellenderElternteil", null, 0, 1, MutterschaftsgeldmeldungRueckmeldung0502Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMutterschaftsgeldmeldungRueckmeldung0502Type_AngabenEntbindung(), this.getAngabenEntbindungType(), null, "angabenEntbindung", null, 0, 1, MutterschaftsgeldmeldungRueckmeldung0502Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMutterschaftsgeldmeldungRueckmeldung0502Type_Stornierung(), this.getStornierungType(), null, "stornierung", null, 0, 1, MutterschaftsgeldmeldungRueckmeldung0502Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMutterschaftsgeldmeldungRueckmeldung0502Type_KennzeichenMutterschaftsgeld(), this.getCodeKennzeichenMutterschaftsgeldType(), null, "kennzeichenMutterschaftsgeld", null, 0, 1, MutterschaftsgeldmeldungRueckmeldung0502Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stornierungTypeEClass, StornierungType.class, "StornierungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStornierungType_Stornokennzeichen(), theXMLTypePackage.getBoolean(), "stornokennzeichen", null, 1, 1, StornierungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStornierungType_DatensatzIDUrsprungsmeldung(), theBaukastenPackage.getUUIDType(), "datensatzIDUrsprungsmeldung", null, 1, 1, StornierungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stornierungType1EClass, StornierungType1.class, "StornierungType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStornierungType1_Stornokennzeichen(), theXMLTypePackage.getBoolean(), "stornokennzeichen", null, 1, 1, StornierungType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStornierungType1_DatensatzIDUrsprungsmeldung(), theBaukastenPackage.getUUIDType(), "datensatzIDUrsprungsmeldung", null, 1, 1, StornierungType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(kennzeichenmutterschaftsgeldEEnum, Kennzeichenmutterschaftsgeld.class, "Kennzeichenmutterschaftsgeld");
		addEEnumLiteral(kennzeichenmutterschaftsgeldEEnum, Kennzeichenmutterschaftsgeld._01);
		addEEnumLiteral(kennzeichenmutterschaftsgeldEEnum, Kennzeichenmutterschaftsgeld._02);
		addEEnumLiteral(kennzeichenmutterschaftsgeldEEnum, Kennzeichenmutterschaftsgeld._03);
		addEEnumLiteral(kennzeichenmutterschaftsgeldEEnum, Kennzeichenmutterschaftsgeld._04);
		addEEnumLiteral(kennzeichenmutterschaftsgeldEEnum, Kennzeichenmutterschaftsgeld._05);
		addEEnumLiteral(kennzeichenmutterschaftsgeldEEnum, Kennzeichenmutterschaftsgeld._06);

		// Initialize data types
		initEDataType(kennzeichenmutterschaftsgeldObjectEDataType, Kennzeichenmutterschaftsgeld.class, "KennzeichenmutterschaftsgeldObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (codeKennzeichenMutterschaftsgeldTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>KennzeichenMutterschaftsgeld</nameLang>\n                   \n    <nameKurz>KennzeichenMutterschaftsgeld</nameKurz>\n                   \n    <nameTechnisch>kennzeichenmutterschaftsgeld</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:kennzeichenmutterschaftsgeld</kennung>\n                   \n    <beschreibung>Die Liste codiert das Kennzeichen zum Mutterschaftsgeld.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (getDocumentRoot_MutterschaftsgeldmeldungAnforderung0501(),
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <rechtsgrundlage>Paragraf 203 SGB V</rechtsgrundlage>\n           \n"
		   });
		addAnnotation
		  (getDocumentRoot_MutterschaftsgeldmeldungRueckmeldung0502(),
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <rechtsgrundlage>Paragraf 203 SGB V</rechtsgrundlage>\n           \n"
		   });
		addAnnotation
		  (kennzeichenmutterschaftsgeldEEnum,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>KennzeichenMutterschaftsgeld</nameLang>\n                   \n    <nameKurz>KennzeichenMutterschaftsgeld</nameKurz>\n                   \n    <nameTechnisch>kennzeichenmutterschaftsgeld</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xfamilie:codeliste:kennzeichenmutterschaftsgeld</kennung>\n                   \n    <beschreibung>Die Liste codiert das Kennzeichen zum Mutterschaftsgeld.</beschreibung>\n                   \n    <herausgebernameLang>XFamilie</herausgebernameLang>\n                   \n    <herausgebernameKurz>XFamilie</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <beschreibung>[nd]</beschreibung>\n                   \n    <datumGueltigkeitAb>2022-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n           \n"
		   });
		addAnnotation
		  (kennzeichenmutterschaftsgeldEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Keine Mitgliedschaft</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (kennzeichenmutterschaftsgeldEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Kein Anspruch auf Mutterschaftsgeld</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (kennzeichenmutterschaftsgeldEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Kein Antrag auf Mutterschaftsgeld gestellt</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (kennzeichenmutterschaftsgeldEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Noch keine Angabe m\u00f6glich</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (kennzeichenmutterschaftsgeldEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Mehrlingsgeburt</beschreibung>\n                 \n"
		   });
		addAnnotation
		  (kennzeichenmutterschaftsgeldEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <beschreibung>Mehrlingsschwangerschaft, kein Ende der Mutterschaftsgeldzahlung bestimmbar</beschreibung>\n                 \n"
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
		  (angabenEntbindungTypeEClass,
		   source,
		   new String[] {
			   "name", "AngabenEntbindungType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAngabenEntbindungType_AngabenMutterschaftsgeld(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenMutterschaftsgeld",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenEntbindungType_EntbindungstagKrankenkasse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "entbindungstagKrankenkasse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (angabenMutterschaftsgeldTypeEClass,
		   source,
		   new String[] {
			   "name", "angabenMutterschaftsgeld_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAngabenMutterschaftsgeldType_MutterschaftsgeldzahlungAb(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "mutterschaftsgeldzahlungAb",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenMutterschaftsgeldType_MutterschaftsgeldzahlungBis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "mutterschaftsgeldzahlungBis",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAngabenMutterschaftsgeldType_MutterschaftsgeldzahlungHoehe(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "mutterschaftsgeldzahlungHoehe",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (antragstellenderElternteilMutterschaftsgeldmeldungRueckTypeEClass,
		   source,
		   new String[] {
			   "name", "AntragstellenderElternteil.MutterschaftsgeldmeldungRueckType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAntragstellenderElternteilMutterschaftsgeldmeldungRueckType_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragstellenderElternteilMutterschaftsgeldmeldungRueckType_Geburt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragstellenderElternteilMutterschaftsgeldmeldungRueckType_Krankenversichertennummer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "krankenversichertennummer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (antragstellenderElternteilMutterschaftsgeldmeldungTypeEClass,
		   source,
		   new String[] {
			   "name", "AntragstellenderElternteil.MutterschaftsgeldmeldungType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAntragstellenderElternteilMutterschaftsgeldmeldungType_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragstellenderElternteilMutterschaftsgeldmeldungType_Geburt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geburt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragstellenderElternteilMutterschaftsgeldmeldungType_Entbindungstag(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "entbindungstag",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragstellenderElternteilMutterschaftsgeldmeldungType_KennzeichenMehrlingsgeburt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kennzeichenMehrlingsgeburt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAntragstellenderElternteilMutterschaftsgeldmeldungType_Krankenversichertennummer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "krankenversichertennummer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (codeKennzeichenMutterschaftsgeldTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.KennzeichenMutterschaftsgeldType",
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
		  (getDocumentRoot_MutterschaftsgeldmeldungAnforderung0501(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "mutterschaftsgeldmeldung.anforderung.0501",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_MutterschaftsgeldmeldungRueckmeldung0502(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "mutterschaftsgeldmeldung.rueckmeldung.0502",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (kennzeichenmutterschaftsgeldEEnum,
		   source,
		   new String[] {
			   "name", "kennzeichenmutterschaftsgeld"
		   });
		addAnnotation
		  (kennzeichenmutterschaftsgeldObjectEDataType,
		   source,
		   new String[] {
			   "name", "kennzeichenmutterschaftsgeld:Object",
			   "baseType", "kennzeichenmutterschaftsgeld"
		   });
		addAnnotation
		  (mutterschaftsgeldmeldungAnforderung0501TypeEClass,
		   source,
		   new String[] {
			   "name", "mutterschaftsgeldmeldung.anforderung.0501_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMutterschaftsgeldmeldungAnforderung0501Type_AktenzeichenElterngeldstelle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aktenzeichenElterngeldstelle",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMutterschaftsgeldmeldungAnforderung0501Type_AntragstellenderElternteil(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "antragstellenderElternteil",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMutterschaftsgeldmeldungAnforderung0501Type_Einwilligung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "einwilligung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMutterschaftsgeldmeldungAnforderung0501Type_Stornierung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "stornierung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (mutterschaftsgeldmeldungRueckmeldung0502TypeEClass,
		   source,
		   new String[] {
			   "name", "mutterschaftsgeldmeldung.rueckmeldung.0502_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMutterschaftsgeldmeldungRueckmeldung0502Type_AktenzeichenElterngeldstelle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aktenzeichenElterngeldstelle",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMutterschaftsgeldmeldungRueckmeldung0502Type_AntragstellenderElternteil(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "antragstellenderElternteil",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMutterschaftsgeldmeldungRueckmeldung0502Type_AngabenEntbindung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "angabenEntbindung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMutterschaftsgeldmeldungRueckmeldung0502Type_Stornierung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "stornierung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMutterschaftsgeldmeldungRueckmeldung0502Type_KennzeichenMutterschaftsgeld(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kennzeichenMutterschaftsgeld",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (stornierungTypeEClass,
		   source,
		   new String[] {
			   "name", "stornierung_._1_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStornierungType_Stornokennzeichen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "stornokennzeichen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStornierungType_DatensatzIDUrsprungsmeldung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "datensatzID.Ursprungsmeldung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (stornierungType1EClass,
		   source,
		   new String[] {
			   "name", "stornierung_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStornierungType1_Stornokennzeichen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "stornokennzeichen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStornierungType1_DatensatzIDUrsprungsmeldung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "datensatzID.Ursprungsmeldung",
			   "namespace", "##targetNamespace"
		   });
	}

} //MutterschaftsgeldPackageImpl
