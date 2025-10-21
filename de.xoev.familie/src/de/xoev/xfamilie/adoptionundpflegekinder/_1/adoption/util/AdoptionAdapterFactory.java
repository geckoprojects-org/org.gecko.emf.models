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
package de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.util;

import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.*;

import de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage
 * @generated
 */
public class AdoptionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AdoptionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdoptionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AdoptionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdoptionSwitch<Adapter> modelSwitch =
		new AdoptionSwitch<Adapter>() {
			@Override
			public Adapter caseAbgebenderElternteilType(AbgebenderElternteilType object) {
				return createAbgebenderElternteilTypeAdapter();
			}
			@Override
			public Adapter caseAdoptionundpflegekinderAdoption0901Type(AdoptionundpflegekinderAdoption0901Type object) {
				return createAdoptionundpflegekinderAdoption0901TypeAdapter();
			}
			@Override
			public Adapter caseAdoptionundpflegekinderPflegekinder0902Type(AdoptionundpflegekinderPflegekinder0902Type object) {
				return createAdoptionundpflegekinderPflegekinder0902TypeAdapter();
			}
			@Override
			public Adapter caseAllgemeineAngabenFremdkindadoptionType(AllgemeineAngabenFremdkindadoptionType object) {
				return createAllgemeineAngabenFremdkindadoptionTypeAdapter();
			}
			@Override
			public Adapter caseAllgemeineAngabenPflegeType(AllgemeineAngabenPflegeType object) {
				return createAllgemeineAngabenPflegeTypeAdapter();
			}
			@Override
			public Adapter caseAllgemeineAngabenStiefkindadoptionType(AllgemeineAngabenStiefkindadoptionType object) {
				return createAllgemeineAngabenStiefkindadoptionTypeAdapter();
			}
			@Override
			public Adapter caseAllgemeineAngabenVerwandtenadoptionType(AllgemeineAngabenVerwandtenadoptionType object) {
				return createAllgemeineAngabenVerwandtenadoptionTypeAdapter();
			}
			@Override
			public Adapter caseAlterssicherungPflegepersonType(AlterssicherungPflegepersonType object) {
				return createAlterssicherungPflegepersonTypeAdapter();
			}
			@Override
			public Adapter caseAngabenDesZuAdoptierendenKindesType(AngabenDesZuAdoptierendenKindesType object) {
				return createAngabenDesZuAdoptierendenKindesTypeAdapter();
			}
			@Override
			public Adapter caseAngabenPflegekindType(AngabenPflegekindType object) {
				return createAngabenPflegekindTypeAdapter();
			}
			@Override
			public Adapter caseAngabenZuKindernDerFamilieType(AngabenZuKindernDerFamilieType object) {
				return createAngabenZuKindernDerFamilieTypeAdapter();
			}
			@Override
			public Adapter caseAngabenZurPartnerschaftType(AngabenZurPartnerschaftType object) {
				return createAngabenZurPartnerschaftTypeAdapter();
			}
			@Override
			public Adapter caseAnliegenType(AnliegenType object) {
				return createAnliegenTypeAdapter();
			}
			@Override
			public Adapter caseAnnehmenderElternteilType(AnnehmenderElternteilType object) {
				return createAnnehmenderElternteilTypeAdapter();
			}
			@Override
			public Adapter caseAntragdetailsAlterssicherungType(AntragdetailsAlterssicherungType object) {
				return createAntragdetailsAlterssicherungTypeAdapter();
			}
			@Override
			public Adapter caseAntragdetailsType(AntragdetailsType object) {
				return createAntragdetailsTypeAdapter();
			}
			@Override
			public Adapter caseAntragdetailsUnfallversicherungType(AntragdetailsUnfallversicherungType object) {
				return createAntragdetailsUnfallversicherungTypeAdapter();
			}
			@Override
			public Adapter caseAntragstellerType(AntragstellerType object) {
				return createAntragstellerTypeAdapter();
			}
			@Override
			public Adapter caseBeitragsuebernahmeUnfallversicherungType(BeitragsuebernahmeUnfallversicherungType object) {
				return createBeitragsuebernahmeUnfallversicherungTypeAdapter();
			}
			@Override
			public Adapter caseBestimmtesKindType(BestimmtesKindType object) {
				return createBestimmtesKindTypeAdapter();
			}
			@Override
			public Adapter caseDatenschutzUndEinwilligungType(DatenschutzUndEinwilligungType object) {
				return createDatenschutzUndEinwilligungTypeAdapter();
			}
			@Override
			public Adapter caseDigitalerRueckkanalType(DigitalerRueckkanalType object) {
				return createDigitalerRueckkanalTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEinkommenPflegekindType(EinkommenPflegekindType object) {
				return createEinkommenPflegekindTypeAdapter();
			}
			@Override
			public Adapter caseEinkommenUndWohnenType(EinkommenUndWohnenType object) {
				return createEinkommenUndWohnenTypeAdapter();
			}
			@Override
			public Adapter caseFremdkindadoptionType(FremdkindadoptionType object) {
				return createFremdkindadoptionTypeAdapter();
			}
			@Override
			public Adapter caseKontakformularType(KontakformularType object) {
				return createKontakformularTypeAdapter();
			}
			@Override
			public Adapter caseKontoinformationenType(KontoinformationenType object) {
				return createKontoinformationenTypeAdapter();
			}
			@Override
			public Adapter caseMoeglichkeitenUndGrenzenType(MoeglichkeitenUndGrenzenType object) {
				return createMoeglichkeitenUndGrenzenTypeAdapter();
			}
			@Override
			public Adapter caseNachweiseEinreichenType(NachweiseEinreichenType object) {
				return createNachweiseEinreichenTypeAdapter();
			}
			@Override
			public Adapter caseNachweisType(NachweisType object) {
				return createNachweisTypeAdapter();
			}
			@Override
			public Adapter casePauschalbetragGezahltVonType(PauschalbetragGezahltVonType object) {
				return createPauschalbetragGezahltVonTypeAdapter();
			}
			@Override
			public Adapter casePauschalbetragVollzeitpflegeType(PauschalbetragVollzeitpflegeType object) {
				return createPauschalbetragVollzeitpflegeTypeAdapter();
			}
			@Override
			public Adapter casePersonendatenType(PersonendatenType object) {
				return createPersonendatenTypeAdapter();
			}
			@Override
			public Adapter casePflegekindBasisType(PflegekindBasisType object) {
				return createPflegekindBasisTypeAdapter();
			}
			@Override
			public Adapter casePflegekindType(PflegekindType object) {
				return createPflegekindTypeAdapter();
			}
			@Override
			public Adapter casePflegepersonBasisType(PflegepersonBasisType object) {
				return createPflegepersonBasisTypeAdapter();
			}
			@Override
			public Adapter casePflegepersonType(PflegepersonType object) {
				return createPflegepersonTypeAdapter();
			}
			@Override
			public Adapter caseSignaturType(SignaturType object) {
				return createSignaturTypeAdapter();
			}
			@Override
			public Adapter caseSonstigeAntraegeSendenType(SonstigeAntraegeSendenType object) {
				return createSonstigeAntraegeSendenTypeAdapter();
			}
			@Override
			public Adapter caseStiefkindadoptionType(StiefkindadoptionType object) {
				return createStiefkindadoptionTypeAdapter();
			}
			@Override
			public Adapter caseVerbleibenderSorgeberechtigterElternteilType(VerbleibenderSorgeberechtigterElternteilType object) {
				return createVerbleibenderSorgeberechtigterElternteilTypeAdapter();
			}
			@Override
			public Adapter caseVerwandtenadoptionType(VerwandtenadoptionType object) {
				return createVerwandtenadoptionTypeAdapter();
			}
			@Override
			public Adapter caseWeiterePersonenImHauhaltType(WeiterePersonenImHauhaltType object) {
				return createWeiterePersonenImHauhaltTypeAdapter();
			}
			@Override
			public Adapter caseNachrichtType(NachrichtType object) {
				return createNachrichtTypeAdapter();
			}
			@Override
			public Adapter caseNachweisdokumentType(NachweisdokumentType object) {
				return createNachweisdokumentTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType <em>Abgebender Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType
	 * @generated
	 */
	public Adapter createAbgebenderElternteilTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderAdoption0901Type <em>Adoptionundpflegekinder Adoption0901 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderAdoption0901Type
	 * @generated
	 */
	public Adapter createAdoptionundpflegekinderAdoption0901TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type <em>Adoptionundpflegekinder Pflegekinder0902 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type
	 * @generated
	 */
	public Adapter createAdoptionundpflegekinderPflegekinder0902TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType <em>Allgemeine Angaben Fremdkindadoption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType
	 * @generated
	 */
	public Adapter createAllgemeineAngabenFremdkindadoptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenPflegeType <em>Allgemeine Angaben Pflege Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenPflegeType
	 * @generated
	 */
	public Adapter createAllgemeineAngabenPflegeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType <em>Allgemeine Angaben Stiefkindadoption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType
	 * @generated
	 */
	public Adapter createAllgemeineAngabenStiefkindadoptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenVerwandtenadoptionType <em>Allgemeine Angaben Verwandtenadoption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenVerwandtenadoptionType
	 * @generated
	 */
	public Adapter createAllgemeineAngabenVerwandtenadoptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AlterssicherungPflegepersonType <em>Alterssicherung Pflegeperson Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AlterssicherungPflegepersonType
	 * @generated
	 */
	public Adapter createAlterssicherungPflegepersonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType <em>Angaben Des Zu Adoptierenden Kindes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType
	 * @generated
	 */
	public Adapter createAngabenDesZuAdoptierendenKindesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType <em>Angaben Pflegekind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType
	 * @generated
	 */
	public Adapter createAngabenPflegekindTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType <em>Angaben Zu Kindern Der Familie Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType
	 * @generated
	 */
	public Adapter createAngabenZuKindernDerFamilieTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType <em>Angaben Zur Partnerschaft Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType
	 * @generated
	 */
	public Adapter createAngabenZurPartnerschaftTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnliegenType <em>Anliegen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnliegenType
	 * @generated
	 */
	public Adapter createAnliegenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType <em>Annehmender Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType
	 * @generated
	 */
	public Adapter createAnnehmenderElternteilTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType <em>Antragdetails Alterssicherung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType
	 * @generated
	 */
	public Adapter createAntragdetailsAlterssicherungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsType <em>Antragdetails Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsType
	 * @generated
	 */
	public Adapter createAntragdetailsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsUnfallversicherungType <em>Antragdetails Unfallversicherung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsUnfallversicherungType
	 * @generated
	 */
	public Adapter createAntragdetailsUnfallversicherungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragstellerType <em>Antragsteller Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragstellerType
	 * @generated
	 */
	public Adapter createAntragstellerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BeitragsuebernahmeUnfallversicherungType <em>Beitragsuebernahme Unfallversicherung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BeitragsuebernahmeUnfallversicherungType
	 * @generated
	 */
	public Adapter createBeitragsuebernahmeUnfallversicherungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BestimmtesKindType <em>Bestimmtes Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BestimmtesKindType
	 * @generated
	 */
	public Adapter createBestimmtesKindTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DatenschutzUndEinwilligungType <em>Datenschutz Und Einwilligung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DatenschutzUndEinwilligungType
	 * @generated
	 */
	public Adapter createDatenschutzUndEinwilligungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DigitalerRueckkanalType <em>Digitaler Rueckkanal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DigitalerRueckkanalType
	 * @generated
	 */
	public Adapter createDigitalerRueckkanalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType <em>Einkommen Pflegekind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType
	 * @generated
	 */
	public Adapter createEinkommenPflegekindTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType <em>Einkommen Und Wohnen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType
	 * @generated
	 */
	public Adapter createEinkommenUndWohnenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType <em>Fremdkindadoption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType
	 * @generated
	 */
	public Adapter createFremdkindadoptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontakformularType <em>Kontakformular Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontakformularType
	 * @generated
	 */
	public Adapter createKontakformularTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontoinformationenType <em>Kontoinformationen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontoinformationenType
	 * @generated
	 */
	public Adapter createKontoinformationenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType <em>Moeglichkeiten Und Grenzen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType
	 * @generated
	 */
	public Adapter createMoeglichkeitenUndGrenzenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweiseEinreichenType <em>Nachweise Einreichen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweiseEinreichenType
	 * @generated
	 */
	public Adapter createNachweiseEinreichenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweisType <em>Nachweis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweisType
	 * @generated
	 */
	public Adapter createNachweisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragGezahltVonType <em>Pauschalbetrag Gezahlt Von Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragGezahltVonType
	 * @generated
	 */
	public Adapter createPauschalbetragGezahltVonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragVollzeitpflegeType <em>Pauschalbetrag Vollzeitpflege Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragVollzeitpflegeType
	 * @generated
	 */
	public Adapter createPauschalbetragVollzeitpflegeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PersonendatenType <em>Personendaten Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PersonendatenType
	 * @generated
	 */
	public Adapter createPersonendatenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegekindBasisType <em>Pflegekind Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegekindBasisType
	 * @generated
	 */
	public Adapter createPflegekindBasisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegekindType <em>Pflegekind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegekindType
	 * @generated
	 */
	public Adapter createPflegekindTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonBasisType <em>Pflegeperson Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonBasisType
	 * @generated
	 */
	public Adapter createPflegepersonBasisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonType <em>Pflegeperson Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonType
	 * @generated
	 */
	public Adapter createPflegepersonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SignaturType <em>Signatur Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SignaturType
	 * @generated
	 */
	public Adapter createSignaturTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType <em>Sonstige Antraege Senden Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType
	 * @generated
	 */
	public Adapter createSonstigeAntraegeSendenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType <em>Stiefkindadoption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType
	 * @generated
	 */
	public Adapter createStiefkindadoptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType <em>Verbleibender Sorgeberechtigter Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType
	 * @generated
	 */
	public Adapter createVerbleibenderSorgeberechtigterElternteilTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType <em>Verwandtenadoption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType
	 * @generated
	 */
	public Adapter createVerwandtenadoptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.WeiterePersonenImHauhaltType <em>Weitere Personen Im Hauhalt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.WeiterePersonenImHauhaltType
	 * @generated
	 */
	public Adapter createWeiterePersonenImHauhaltTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType <em>Nachricht Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType
	 * @generated
	 */
	public Adapter createNachrichtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType <em>Nachweisdokument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType
	 * @generated
	 */
	public Adapter createNachweisdokumentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AdoptionAdapterFactory
