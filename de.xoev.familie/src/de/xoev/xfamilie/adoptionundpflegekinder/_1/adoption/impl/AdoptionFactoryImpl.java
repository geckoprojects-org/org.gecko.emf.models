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

import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdoptionFactoryImpl extends EFactoryImpl implements AdoptionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdoptionFactory init() {
		try {
			AdoptionFactory theAdoptionFactory = (AdoptionFactory)EPackage.Registry.INSTANCE.getEFactory(AdoptionPackage.eNS_URI);
			if (theAdoptionFactory != null) {
				return theAdoptionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AdoptionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdoptionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE: return createAbgebenderElternteilType();
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE: return createAdoptionundpflegekinderAdoption0901Type();
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE: return createAdoptionundpflegekinderPflegekinder0902Type();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE: return createAllgemeineAngabenFremdkindadoptionType();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_PFLEGE_TYPE: return createAllgemeineAngabenPflegeType();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE: return createAllgemeineAngabenStiefkindadoptionType();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE: return createAllgemeineAngabenVerwandtenadoptionType();
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE: return createAlterssicherungPflegepersonType();
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE: return createAngabenDesZuAdoptierendenKindesType();
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE: return createAngabenPflegekindType();
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE: return createAngabenZuKindernDerFamilieType();
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE: return createAngabenZurPartnerschaftType();
			case AdoptionPackage.ANLIEGEN_TYPE: return createAnliegenType();
			case AdoptionPackage.ANNEHMENDER_ELTERNTEIL_TYPE: return createAnnehmenderElternteilType();
			case AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE: return createAntragdetailsAlterssicherungType();
			case AdoptionPackage.ANTRAGDETAILS_TYPE: return createAntragdetailsType();
			case AdoptionPackage.ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE: return createAntragdetailsUnfallversicherungType();
			case AdoptionPackage.ANTRAGSTELLER_TYPE: return createAntragstellerType();
			case AdoptionPackage.BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG_TYPE: return createBeitragsuebernahmeUnfallversicherungType();
			case AdoptionPackage.BESTIMMTES_KIND_TYPE: return createBestimmtesKindType();
			case AdoptionPackage.DATENSCHUTZ_UND_EINWILLIGUNG_TYPE: return createDatenschutzUndEinwilligungType();
			case AdoptionPackage.DIGITALER_RUECKKANAL_TYPE: return createDigitalerRueckkanalType();
			case AdoptionPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE: return createEinkommenPflegekindType();
			case AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE: return createEinkommenUndWohnenType();
			case AdoptionPackage.FREMDKINDADOPTION_TYPE: return createFremdkindadoptionType();
			case AdoptionPackage.KONTAKFORMULAR_TYPE: return createKontakformularType();
			case AdoptionPackage.KONTOINFORMATIONEN_TYPE: return createKontoinformationenType();
			case AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE: return createMoeglichkeitenUndGrenzenType();
			case AdoptionPackage.NACHWEISE_EINREICHEN_TYPE: return createNachweiseEinreichenType();
			case AdoptionPackage.NACHWEIS_TYPE: return createNachweisType();
			case AdoptionPackage.PAUSCHALBETRAG_GEZAHLT_VON_TYPE: return createPauschalbetragGezahltVonType();
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE: return createPauschalbetragVollzeitpflegeType();
			case AdoptionPackage.PERSONENDATEN_TYPE: return createPersonendatenType();
			case AdoptionPackage.PFLEGEKIND_BASIS_TYPE: return createPflegekindBasisType();
			case AdoptionPackage.PFLEGEKIND_TYPE: return createPflegekindType();
			case AdoptionPackage.PFLEGEPERSON_BASIS_TYPE: return createPflegepersonBasisType();
			case AdoptionPackage.PFLEGEPERSON_TYPE: return createPflegepersonType();
			case AdoptionPackage.SIGNATUR_TYPE: return createSignaturType();
			case AdoptionPackage.SONSTIGE_ANTRAEGE_SENDEN_TYPE: return createSonstigeAntraegeSendenType();
			case AdoptionPackage.STIEFKINDADOPTION_TYPE: return createStiefkindadoptionType();
			case AdoptionPackage.VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE: return createVerbleibenderSorgeberechtigterElternteilType();
			case AdoptionPackage.VERWANDTENADOPTION_TYPE: return createVerwandtenadoptionType();
			case AdoptionPackage.WEITERE_PERSONEN_IM_HAUHALT_TYPE: return createWeiterePersonenImHauhaltType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbgebenderElternteilType createAbgebenderElternteilType() {
		AbgebenderElternteilTypeImpl abgebenderElternteilType = new AbgebenderElternteilTypeImpl();
		return abgebenderElternteilType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdoptionundpflegekinderAdoption0901Type createAdoptionundpflegekinderAdoption0901Type() {
		AdoptionundpflegekinderAdoption0901TypeImpl adoptionundpflegekinderAdoption0901Type = new AdoptionundpflegekinderAdoption0901TypeImpl();
		return adoptionundpflegekinderAdoption0901Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdoptionundpflegekinderPflegekinder0902Type createAdoptionundpflegekinderPflegekinder0902Type() {
		AdoptionundpflegekinderPflegekinder0902TypeImpl adoptionundpflegekinderPflegekinder0902Type = new AdoptionundpflegekinderPflegekinder0902TypeImpl();
		return adoptionundpflegekinderPflegekinder0902Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllgemeineAngabenFremdkindadoptionType createAllgemeineAngabenFremdkindadoptionType() {
		AllgemeineAngabenFremdkindadoptionTypeImpl allgemeineAngabenFremdkindadoptionType = new AllgemeineAngabenFremdkindadoptionTypeImpl();
		return allgemeineAngabenFremdkindadoptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllgemeineAngabenPflegeType createAllgemeineAngabenPflegeType() {
		AllgemeineAngabenPflegeTypeImpl allgemeineAngabenPflegeType = new AllgemeineAngabenPflegeTypeImpl();
		return allgemeineAngabenPflegeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllgemeineAngabenStiefkindadoptionType createAllgemeineAngabenStiefkindadoptionType() {
		AllgemeineAngabenStiefkindadoptionTypeImpl allgemeineAngabenStiefkindadoptionType = new AllgemeineAngabenStiefkindadoptionTypeImpl();
		return allgemeineAngabenStiefkindadoptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllgemeineAngabenVerwandtenadoptionType createAllgemeineAngabenVerwandtenadoptionType() {
		AllgemeineAngabenVerwandtenadoptionTypeImpl allgemeineAngabenVerwandtenadoptionType = new AllgemeineAngabenVerwandtenadoptionTypeImpl();
		return allgemeineAngabenVerwandtenadoptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlterssicherungPflegepersonType createAlterssicherungPflegepersonType() {
		AlterssicherungPflegepersonTypeImpl alterssicherungPflegepersonType = new AlterssicherungPflegepersonTypeImpl();
		return alterssicherungPflegepersonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenDesZuAdoptierendenKindesType createAngabenDesZuAdoptierendenKindesType() {
		AngabenDesZuAdoptierendenKindesTypeImpl angabenDesZuAdoptierendenKindesType = new AngabenDesZuAdoptierendenKindesTypeImpl();
		return angabenDesZuAdoptierendenKindesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenPflegekindType createAngabenPflegekindType() {
		AngabenPflegekindTypeImpl angabenPflegekindType = new AngabenPflegekindTypeImpl();
		return angabenPflegekindType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenZuKindernDerFamilieType createAngabenZuKindernDerFamilieType() {
		AngabenZuKindernDerFamilieTypeImpl angabenZuKindernDerFamilieType = new AngabenZuKindernDerFamilieTypeImpl();
		return angabenZuKindernDerFamilieType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenZurPartnerschaftType createAngabenZurPartnerschaftType() {
		AngabenZurPartnerschaftTypeImpl angabenZurPartnerschaftType = new AngabenZurPartnerschaftTypeImpl();
		return angabenZurPartnerschaftType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnliegenType createAnliegenType() {
		AnliegenTypeImpl anliegenType = new AnliegenTypeImpl();
		return anliegenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnehmenderElternteilType createAnnehmenderElternteilType() {
		AnnehmenderElternteilTypeImpl annehmenderElternteilType = new AnnehmenderElternteilTypeImpl();
		return annehmenderElternteilType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AntragdetailsAlterssicherungType createAntragdetailsAlterssicherungType() {
		AntragdetailsAlterssicherungTypeImpl antragdetailsAlterssicherungType = new AntragdetailsAlterssicherungTypeImpl();
		return antragdetailsAlterssicherungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AntragdetailsType createAntragdetailsType() {
		AntragdetailsTypeImpl antragdetailsType = new AntragdetailsTypeImpl();
		return antragdetailsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AntragdetailsUnfallversicherungType createAntragdetailsUnfallversicherungType() {
		AntragdetailsUnfallversicherungTypeImpl antragdetailsUnfallversicherungType = new AntragdetailsUnfallversicherungTypeImpl();
		return antragdetailsUnfallversicherungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AntragstellerType createAntragstellerType() {
		AntragstellerTypeImpl antragstellerType = new AntragstellerTypeImpl();
		return antragstellerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeitragsuebernahmeUnfallversicherungType createBeitragsuebernahmeUnfallversicherungType() {
		BeitragsuebernahmeUnfallversicherungTypeImpl beitragsuebernahmeUnfallversicherungType = new BeitragsuebernahmeUnfallversicherungTypeImpl();
		return beitragsuebernahmeUnfallversicherungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BestimmtesKindType createBestimmtesKindType() {
		BestimmtesKindTypeImpl bestimmtesKindType = new BestimmtesKindTypeImpl();
		return bestimmtesKindType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatenschutzUndEinwilligungType createDatenschutzUndEinwilligungType() {
		DatenschutzUndEinwilligungTypeImpl datenschutzUndEinwilligungType = new DatenschutzUndEinwilligungTypeImpl();
		return datenschutzUndEinwilligungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DigitalerRueckkanalType createDigitalerRueckkanalType() {
		DigitalerRueckkanalTypeImpl digitalerRueckkanalType = new DigitalerRueckkanalTypeImpl();
		return digitalerRueckkanalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EinkommenPflegekindType createEinkommenPflegekindType() {
		EinkommenPflegekindTypeImpl einkommenPflegekindType = new EinkommenPflegekindTypeImpl();
		return einkommenPflegekindType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EinkommenUndWohnenType createEinkommenUndWohnenType() {
		EinkommenUndWohnenTypeImpl einkommenUndWohnenType = new EinkommenUndWohnenTypeImpl();
		return einkommenUndWohnenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FremdkindadoptionType createFremdkindadoptionType() {
		FremdkindadoptionTypeImpl fremdkindadoptionType = new FremdkindadoptionTypeImpl();
		return fremdkindadoptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KontakformularType createKontakformularType() {
		KontakformularTypeImpl kontakformularType = new KontakformularTypeImpl();
		return kontakformularType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KontoinformationenType createKontoinformationenType() {
		KontoinformationenTypeImpl kontoinformationenType = new KontoinformationenTypeImpl();
		return kontoinformationenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MoeglichkeitenUndGrenzenType createMoeglichkeitenUndGrenzenType() {
		MoeglichkeitenUndGrenzenTypeImpl moeglichkeitenUndGrenzenType = new MoeglichkeitenUndGrenzenTypeImpl();
		return moeglichkeitenUndGrenzenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweiseEinreichenType createNachweiseEinreichenType() {
		NachweiseEinreichenTypeImpl nachweiseEinreichenType = new NachweiseEinreichenTypeImpl();
		return nachweiseEinreichenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweisType createNachweisType() {
		NachweisTypeImpl nachweisType = new NachweisTypeImpl();
		return nachweisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PauschalbetragGezahltVonType createPauschalbetragGezahltVonType() {
		PauschalbetragGezahltVonTypeImpl pauschalbetragGezahltVonType = new PauschalbetragGezahltVonTypeImpl();
		return pauschalbetragGezahltVonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PauschalbetragVollzeitpflegeType createPauschalbetragVollzeitpflegeType() {
		PauschalbetragVollzeitpflegeTypeImpl pauschalbetragVollzeitpflegeType = new PauschalbetragVollzeitpflegeTypeImpl();
		return pauschalbetragVollzeitpflegeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonendatenType createPersonendatenType() {
		PersonendatenTypeImpl personendatenType = new PersonendatenTypeImpl();
		return personendatenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PflegekindBasisType createPflegekindBasisType() {
		PflegekindBasisTypeImpl pflegekindBasisType = new PflegekindBasisTypeImpl();
		return pflegekindBasisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PflegekindType createPflegekindType() {
		PflegekindTypeImpl pflegekindType = new PflegekindTypeImpl();
		return pflegekindType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PflegepersonBasisType createPflegepersonBasisType() {
		PflegepersonBasisTypeImpl pflegepersonBasisType = new PflegepersonBasisTypeImpl();
		return pflegepersonBasisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PflegepersonType createPflegepersonType() {
		PflegepersonTypeImpl pflegepersonType = new PflegepersonTypeImpl();
		return pflegepersonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignaturType createSignaturType() {
		SignaturTypeImpl signaturType = new SignaturTypeImpl();
		return signaturType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SonstigeAntraegeSendenType createSonstigeAntraegeSendenType() {
		SonstigeAntraegeSendenTypeImpl sonstigeAntraegeSendenType = new SonstigeAntraegeSendenTypeImpl();
		return sonstigeAntraegeSendenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StiefkindadoptionType createStiefkindadoptionType() {
		StiefkindadoptionTypeImpl stiefkindadoptionType = new StiefkindadoptionTypeImpl();
		return stiefkindadoptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerbleibenderSorgeberechtigterElternteilType createVerbleibenderSorgeberechtigterElternteilType() {
		VerbleibenderSorgeberechtigterElternteilTypeImpl verbleibenderSorgeberechtigterElternteilType = new VerbleibenderSorgeberechtigterElternteilTypeImpl();
		return verbleibenderSorgeberechtigterElternteilType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerwandtenadoptionType createVerwandtenadoptionType() {
		VerwandtenadoptionTypeImpl verwandtenadoptionType = new VerwandtenadoptionTypeImpl();
		return verwandtenadoptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeiterePersonenImHauhaltType createWeiterePersonenImHauhaltType() {
		WeiterePersonenImHauhaltTypeImpl weiterePersonenImHauhaltType = new WeiterePersonenImHauhaltTypeImpl();
		return weiterePersonenImHauhaltType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdoptionPackage getAdoptionPackage() {
		return (AdoptionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AdoptionPackage getPackage() {
		return AdoptionPackage.eINSTANCE;
	}

} //AdoptionFactoryImpl
