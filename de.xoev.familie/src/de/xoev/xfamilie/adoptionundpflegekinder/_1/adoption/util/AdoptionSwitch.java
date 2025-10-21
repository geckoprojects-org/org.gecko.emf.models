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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage
 * @generated
 */
public class AdoptionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AdoptionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdoptionSwitch() {
		if (modelPackage == null) {
			modelPackage = AdoptionPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE: {
				AbgebenderElternteilType abgebenderElternteilType = (AbgebenderElternteilType)theEObject;
				T result = caseAbgebenderElternteilType(abgebenderElternteilType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE: {
				AdoptionundpflegekinderAdoption0901Type adoptionundpflegekinderAdoption0901Type = (AdoptionundpflegekinderAdoption0901Type)theEObject;
				T result = caseAdoptionundpflegekinderAdoption0901Type(adoptionundpflegekinderAdoption0901Type);
				if (result == null) result = caseNachrichtType(adoptionundpflegekinderAdoption0901Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE: {
				AdoptionundpflegekinderPflegekinder0902Type adoptionundpflegekinderPflegekinder0902Type = (AdoptionundpflegekinderPflegekinder0902Type)theEObject;
				T result = caseAdoptionundpflegekinderPflegekinder0902Type(adoptionundpflegekinderPflegekinder0902Type);
				if (result == null) result = caseNachrichtType(adoptionundpflegekinderPflegekinder0902Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE: {
				AllgemeineAngabenFremdkindadoptionType allgemeineAngabenFremdkindadoptionType = (AllgemeineAngabenFremdkindadoptionType)theEObject;
				T result = caseAllgemeineAngabenFremdkindadoptionType(allgemeineAngabenFremdkindadoptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.ALLGEMEINE_ANGABEN_PFLEGE_TYPE: {
				AllgemeineAngabenPflegeType allgemeineAngabenPflegeType = (AllgemeineAngabenPflegeType)theEObject;
				T result = caseAllgemeineAngabenPflegeType(allgemeineAngabenPflegeType);
				if (result == null) result = casePflegepersonBasisType(allgemeineAngabenPflegeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE: {
				AllgemeineAngabenStiefkindadoptionType allgemeineAngabenStiefkindadoptionType = (AllgemeineAngabenStiefkindadoptionType)theEObject;
				T result = caseAllgemeineAngabenStiefkindadoptionType(allgemeineAngabenStiefkindadoptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE: {
				AllgemeineAngabenVerwandtenadoptionType allgemeineAngabenVerwandtenadoptionType = (AllgemeineAngabenVerwandtenadoptionType)theEObject;
				T result = caseAllgemeineAngabenVerwandtenadoptionType(allgemeineAngabenVerwandtenadoptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE: {
				AlterssicherungPflegepersonType alterssicherungPflegepersonType = (AlterssicherungPflegepersonType)theEObject;
				T result = caseAlterssicherungPflegepersonType(alterssicherungPflegepersonType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE: {
				AngabenDesZuAdoptierendenKindesType angabenDesZuAdoptierendenKindesType = (AngabenDesZuAdoptierendenKindesType)theEObject;
				T result = caseAngabenDesZuAdoptierendenKindesType(angabenDesZuAdoptierendenKindesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE: {
				AngabenPflegekindType angabenPflegekindType = (AngabenPflegekindType)theEObject;
				T result = caseAngabenPflegekindType(angabenPflegekindType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE: {
				AngabenZuKindernDerFamilieType angabenZuKindernDerFamilieType = (AngabenZuKindernDerFamilieType)theEObject;
				T result = caseAngabenZuKindernDerFamilieType(angabenZuKindernDerFamilieType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE: {
				AngabenZurPartnerschaftType angabenZurPartnerschaftType = (AngabenZurPartnerschaftType)theEObject;
				T result = caseAngabenZurPartnerschaftType(angabenZurPartnerschaftType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.ANLIEGEN_TYPE: {
				AnliegenType anliegenType = (AnliegenType)theEObject;
				T result = caseAnliegenType(anliegenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.ANNEHMENDER_ELTERNTEIL_TYPE: {
				AnnehmenderElternteilType annehmenderElternteilType = (AnnehmenderElternteilType)theEObject;
				T result = caseAnnehmenderElternteilType(annehmenderElternteilType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE: {
				AntragdetailsAlterssicherungType antragdetailsAlterssicherungType = (AntragdetailsAlterssicherungType)theEObject;
				T result = caseAntragdetailsAlterssicherungType(antragdetailsAlterssicherungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.ANTRAGDETAILS_TYPE: {
				AntragdetailsType antragdetailsType = (AntragdetailsType)theEObject;
				T result = caseAntragdetailsType(antragdetailsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE: {
				AntragdetailsUnfallversicherungType antragdetailsUnfallversicherungType = (AntragdetailsUnfallversicherungType)theEObject;
				T result = caseAntragdetailsUnfallversicherungType(antragdetailsUnfallversicherungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.ANTRAGSTELLER_TYPE: {
				AntragstellerType antragstellerType = (AntragstellerType)theEObject;
				T result = caseAntragstellerType(antragstellerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG_TYPE: {
				BeitragsuebernahmeUnfallversicherungType beitragsuebernahmeUnfallversicherungType = (BeitragsuebernahmeUnfallversicherungType)theEObject;
				T result = caseBeitragsuebernahmeUnfallversicherungType(beitragsuebernahmeUnfallversicherungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.BESTIMMTES_KIND_TYPE: {
				BestimmtesKindType bestimmtesKindType = (BestimmtesKindType)theEObject;
				T result = caseBestimmtesKindType(bestimmtesKindType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.DATENSCHUTZ_UND_EINWILLIGUNG_TYPE: {
				DatenschutzUndEinwilligungType datenschutzUndEinwilligungType = (DatenschutzUndEinwilligungType)theEObject;
				T result = caseDatenschutzUndEinwilligungType(datenschutzUndEinwilligungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.DIGITALER_RUECKKANAL_TYPE: {
				DigitalerRueckkanalType digitalerRueckkanalType = (DigitalerRueckkanalType)theEObject;
				T result = caseDigitalerRueckkanalType(digitalerRueckkanalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE: {
				EinkommenPflegekindType einkommenPflegekindType = (EinkommenPflegekindType)theEObject;
				T result = caseEinkommenPflegekindType(einkommenPflegekindType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE: {
				EinkommenUndWohnenType einkommenUndWohnenType = (EinkommenUndWohnenType)theEObject;
				T result = caseEinkommenUndWohnenType(einkommenUndWohnenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.FREMDKINDADOPTION_TYPE: {
				FremdkindadoptionType fremdkindadoptionType = (FremdkindadoptionType)theEObject;
				T result = caseFremdkindadoptionType(fremdkindadoptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.KONTAKFORMULAR_TYPE: {
				KontakformularType kontakformularType = (KontakformularType)theEObject;
				T result = caseKontakformularType(kontakformularType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.KONTOINFORMATIONEN_TYPE: {
				KontoinformationenType kontoinformationenType = (KontoinformationenType)theEObject;
				T result = caseKontoinformationenType(kontoinformationenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE: {
				MoeglichkeitenUndGrenzenType moeglichkeitenUndGrenzenType = (MoeglichkeitenUndGrenzenType)theEObject;
				T result = caseMoeglichkeitenUndGrenzenType(moeglichkeitenUndGrenzenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.NACHWEISE_EINREICHEN_TYPE: {
				NachweiseEinreichenType nachweiseEinreichenType = (NachweiseEinreichenType)theEObject;
				T result = caseNachweiseEinreichenType(nachweiseEinreichenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.NACHWEIS_TYPE: {
				NachweisType nachweisType = (NachweisType)theEObject;
				T result = caseNachweisType(nachweisType);
				if (result == null) result = caseNachweisdokumentType(nachweisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.PAUSCHALBETRAG_GEZAHLT_VON_TYPE: {
				PauschalbetragGezahltVonType pauschalbetragGezahltVonType = (PauschalbetragGezahltVonType)theEObject;
				T result = casePauschalbetragGezahltVonType(pauschalbetragGezahltVonType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE: {
				PauschalbetragVollzeitpflegeType pauschalbetragVollzeitpflegeType = (PauschalbetragVollzeitpflegeType)theEObject;
				T result = casePauschalbetragVollzeitpflegeType(pauschalbetragVollzeitpflegeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.PERSONENDATEN_TYPE: {
				PersonendatenType personendatenType = (PersonendatenType)theEObject;
				T result = casePersonendatenType(personendatenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.PFLEGEKIND_BASIS_TYPE: {
				PflegekindBasisType pflegekindBasisType = (PflegekindBasisType)theEObject;
				T result = casePflegekindBasisType(pflegekindBasisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.PFLEGEKIND_TYPE: {
				PflegekindType pflegekindType = (PflegekindType)theEObject;
				T result = casePflegekindType(pflegekindType);
				if (result == null) result = casePflegekindBasisType(pflegekindType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.PFLEGEPERSON_BASIS_TYPE: {
				PflegepersonBasisType pflegepersonBasisType = (PflegepersonBasisType)theEObject;
				T result = casePflegepersonBasisType(pflegepersonBasisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.PFLEGEPERSON_TYPE: {
				PflegepersonType pflegepersonType = (PflegepersonType)theEObject;
				T result = casePflegepersonType(pflegepersonType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.SIGNATUR_TYPE: {
				SignaturType signaturType = (SignaturType)theEObject;
				T result = caseSignaturType(signaturType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.SONSTIGE_ANTRAEGE_SENDEN_TYPE: {
				SonstigeAntraegeSendenType sonstigeAntraegeSendenType = (SonstigeAntraegeSendenType)theEObject;
				T result = caseSonstigeAntraegeSendenType(sonstigeAntraegeSendenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.STIEFKINDADOPTION_TYPE: {
				StiefkindadoptionType stiefkindadoptionType = (StiefkindadoptionType)theEObject;
				T result = caseStiefkindadoptionType(stiefkindadoptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE: {
				VerbleibenderSorgeberechtigterElternteilType verbleibenderSorgeberechtigterElternteilType = (VerbleibenderSorgeberechtigterElternteilType)theEObject;
				T result = caseVerbleibenderSorgeberechtigterElternteilType(verbleibenderSorgeberechtigterElternteilType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.VERWANDTENADOPTION_TYPE: {
				VerwandtenadoptionType verwandtenadoptionType = (VerwandtenadoptionType)theEObject;
				T result = caseVerwandtenadoptionType(verwandtenadoptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdoptionPackage.WEITERE_PERSONEN_IM_HAUHALT_TYPE: {
				WeiterePersonenImHauhaltType weiterePersonenImHauhaltType = (WeiterePersonenImHauhaltType)theEObject;
				T result = caseWeiterePersonenImHauhaltType(weiterePersonenImHauhaltType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abgebender Elternteil Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abgebender Elternteil Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbgebenderElternteilType(AbgebenderElternteilType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adoptionundpflegekinder Adoption0901 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adoptionundpflegekinder Adoption0901 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdoptionundpflegekinderAdoption0901Type(AdoptionundpflegekinderAdoption0901Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adoptionundpflegekinder Pflegekinder0902 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adoptionundpflegekinder Pflegekinder0902 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdoptionundpflegekinderPflegekinder0902Type(AdoptionundpflegekinderPflegekinder0902Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allgemeine Angaben Fremdkindadoption Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allgemeine Angaben Fremdkindadoption Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllgemeineAngabenFremdkindadoptionType(AllgemeineAngabenFremdkindadoptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allgemeine Angaben Pflege Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allgemeine Angaben Pflege Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllgemeineAngabenPflegeType(AllgemeineAngabenPflegeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allgemeine Angaben Stiefkindadoption Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allgemeine Angaben Stiefkindadoption Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllgemeineAngabenStiefkindadoptionType(AllgemeineAngabenStiefkindadoptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allgemeine Angaben Verwandtenadoption Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allgemeine Angaben Verwandtenadoption Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllgemeineAngabenVerwandtenadoptionType(AllgemeineAngabenVerwandtenadoptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alterssicherung Pflegeperson Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alterssicherung Pflegeperson Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlterssicherungPflegepersonType(AlterssicherungPflegepersonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angaben Des Zu Adoptierenden Kindes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angaben Des Zu Adoptierenden Kindes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngabenDesZuAdoptierendenKindesType(AngabenDesZuAdoptierendenKindesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angaben Pflegekind Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angaben Pflegekind Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngabenPflegekindType(AngabenPflegekindType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angaben Zu Kindern Der Familie Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angaben Zu Kindern Der Familie Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngabenZuKindernDerFamilieType(AngabenZuKindernDerFamilieType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angaben Zur Partnerschaft Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angaben Zur Partnerschaft Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngabenZurPartnerschaftType(AngabenZurPartnerschaftType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anliegen Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anliegen Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnliegenType(AnliegenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annehmender Elternteil Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annehmender Elternteil Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnehmenderElternteilType(AnnehmenderElternteilType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Antragdetails Alterssicherung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Antragdetails Alterssicherung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAntragdetailsAlterssicherungType(AntragdetailsAlterssicherungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Antragdetails Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Antragdetails Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAntragdetailsType(AntragdetailsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Antragdetails Unfallversicherung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Antragdetails Unfallversicherung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAntragdetailsUnfallversicherungType(AntragdetailsUnfallversicherungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Antragsteller Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Antragsteller Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAntragstellerType(AntragstellerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Beitragsuebernahme Unfallversicherung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Beitragsuebernahme Unfallversicherung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeitragsuebernahmeUnfallversicherungType(BeitragsuebernahmeUnfallversicherungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bestimmtes Kind Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bestimmtes Kind Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBestimmtesKindType(BestimmtesKindType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datenschutz Und Einwilligung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datenschutz Und Einwilligung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatenschutzUndEinwilligungType(DatenschutzUndEinwilligungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digitaler Rueckkanal Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digitaler Rueckkanal Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDigitalerRueckkanalType(DigitalerRueckkanalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Einkommen Pflegekind Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Einkommen Pflegekind Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEinkommenPflegekindType(EinkommenPflegekindType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Einkommen Und Wohnen Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Einkommen Und Wohnen Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEinkommenUndWohnenType(EinkommenUndWohnenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fremdkindadoption Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fremdkindadoption Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFremdkindadoptionType(FremdkindadoptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kontakformular Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kontakformular Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKontakformularType(KontakformularType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kontoinformationen Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kontoinformationen Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKontoinformationenType(KontoinformationenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Moeglichkeiten Und Grenzen Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Moeglichkeiten Und Grenzen Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoeglichkeitenUndGrenzenType(MoeglichkeitenUndGrenzenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nachweise Einreichen Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nachweise Einreichen Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNachweiseEinreichenType(NachweiseEinreichenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nachweis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nachweis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNachweisType(NachweisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pauschalbetrag Gezahlt Von Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pauschalbetrag Gezahlt Von Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePauschalbetragGezahltVonType(PauschalbetragGezahltVonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pauschalbetrag Vollzeitpflege Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pauschalbetrag Vollzeitpflege Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePauschalbetragVollzeitpflegeType(PauschalbetragVollzeitpflegeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Personendaten Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Personendaten Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonendatenType(PersonendatenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pflegekind Basis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pflegekind Basis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePflegekindBasisType(PflegekindBasisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pflegekind Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pflegekind Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePflegekindType(PflegekindType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pflegeperson Basis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pflegeperson Basis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePflegepersonBasisType(PflegepersonBasisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pflegeperson Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pflegeperson Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePflegepersonType(PflegepersonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signatur Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signatur Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignaturType(SignaturType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sonstige Antraege Senden Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sonstige Antraege Senden Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSonstigeAntraegeSendenType(SonstigeAntraegeSendenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stiefkindadoption Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stiefkindadoption Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStiefkindadoptionType(StiefkindadoptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verbleibender Sorgeberechtigter Elternteil Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verbleibender Sorgeberechtigter Elternteil Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerbleibenderSorgeberechtigterElternteilType(VerbleibenderSorgeberechtigterElternteilType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verwandtenadoption Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verwandtenadoption Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerwandtenadoptionType(VerwandtenadoptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weitere Personen Im Hauhalt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weitere Personen Im Hauhalt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeiterePersonenImHauhaltType(WeiterePersonenImHauhaltType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nachricht Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nachricht Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNachrichtType(NachrichtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nachweisdokument Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nachweisdokument Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNachweisdokumentType(NachweisdokumentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AdoptionSwitch
