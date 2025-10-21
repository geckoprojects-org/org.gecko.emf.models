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
package de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.util;

import de.xoev.schemata.code.code.Code;

import de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType;
import de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType;

import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.*;

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
 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage
 * @generated
 */
public class ErziehungshilfeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ErziehungshilfePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErziehungshilfeSwitch() {
		if (modelPackage == null) {
			modelPackage = ErziehungshilfePackage.eINSTANCE;
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
			case ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE: {
				AngabenElternteilEingliederungType angabenElternteilEingliederungType = (AngabenElternteilEingliederungType)theEObject;
				T result = caseAngabenElternteilEingliederungType(angabenElternteilEingliederungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErziehungshilfePackage.ANGABEN_ELTERNTEIL_HJV_TYPE: {
				AngabenElternteilHJVType angabenElternteilHJVType = (AngabenElternteilHJVType)theEObject;
				T result = caseAngabenElternteilHJVType(angabenElternteilHJVType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErziehungshilfePackage.ANGABEN_ET_TYPE: {
				AngabenETType angabenETType = (AngabenETType)theEObject;
				T result = caseAngabenETType(angabenETType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE: {
				AngabenKindEingliederungType angabenKindEingliederungType = (AngabenKindEingliederungType)theEObject;
				T result = caseAngabenKindEingliederungType(angabenKindEingliederungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErziehungshilfePackage.ANGABEN_KIND_HJV_TYPE: {
				AngabenKindHJVType angabenKindHJVType = (AngabenKindHJVType)theEObject;
				T result = caseAngabenKindHJVType(angabenKindHJVType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErziehungshilfePackage.ANGABEN_KIND_HZE_TYPE: {
				AngabenKindHZEType angabenKindHZEType = (AngabenKindHZEType)theEObject;
				T result = caseAngabenKindHZEType(angabenKindHZEType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE: {
				AngabenZuJugendlichHZEType angabenZuJugendlichHZEType = (AngabenZuJugendlichHZEType)theEObject;
				T result = caseAngabenZuJugendlichHZEType(angabenZuJugendlichHZEType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE: {
				AngabenZuJugendlichKontaktformularType angabenZuJugendlichKontaktformularType = (AngabenZuJugendlichKontaktformularType)theEObject;
				T result = caseAngabenZuJugendlichKontaktformularType(angabenZuJugendlichKontaktformularType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErziehungshilfePackage.ANLIEGENSKLAERUNG_ANFRAGE_TYPE: {
				AnliegensklaerungAnfrageType anliegensklaerungAnfrageType = (AnliegensklaerungAnfrageType)theEObject;
				T result = caseAnliegensklaerungAnfrageType(anliegensklaerungAnfrageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErziehungshilfePackage.ANLIEGENSKLAERUNG_TYPE: {
				AnliegensklaerungType anliegensklaerungType = (AnliegensklaerungType)theEObject;
				T result = caseAnliegensklaerungType(anliegensklaerungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE: {
				AntragstellenderETType antragstellenderETType = (AntragstellenderETType)theEObject;
				T result = caseAntragstellenderETType(antragstellenderETType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErziehungshilfePackage.AUSWAHL_BESCHEIDART_TYPE: {
				AuswahlBescheidartType auswahlBescheidartType = (AuswahlBescheidartType)theEObject;
				T result = caseAuswahlBescheidartType(auswahlBescheidartType);
				if (result == null) result = caseCode(auswahlBescheidartType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErziehungshilfePackage.BEGRUENDUNG_DES_HILFEBEDARFS_TYPE: {
				BegruendungDesHilfebedarfsType begruendungDesHilfebedarfsType = (BegruendungDesHilfebedarfsType)theEObject;
				T result = caseBegruendungDesHilfebedarfsType(begruendungDesHilfebedarfsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErziehungshilfePackage.CODE_AUFENTHALT_TYPE: {
				CodeAufenthaltType codeAufenthaltType = (CodeAufenthaltType)theEObject;
				T result = caseCodeAufenthaltType(codeAufenthaltType);
				if (result == null) result = caseCode(codeAufenthaltType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErziehungshilfePackage.CODE_AUSWAHL_DER_HILFE_HZ_ETYPE: {
				CodeAuswahlDerHilfeHzEType codeAuswahlDerHilfeHzEType = (CodeAuswahlDerHilfeHzEType)theEObject;
				T result = caseCodeAuswahlDerHilfeHzEType(codeAuswahlDerHilfeHzEType);
				if (result == null) result = caseCode(codeAuswahlDerHilfeHzEType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErziehungshilfePackage.CODE_HZE_ICH_BIN_TYPE: {
				CodeHZEIchBinType codeHZEIchBinType = (CodeHZEIchBinType)theEObject;
				T result = caseCodeHZEIchBinType(codeHZEIchBinType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErziehungshilfePackage.CODE_VERHAELTNIS_JUGENDLICH_HZE_TYPE: {
				CodeVerhaeltnisJugendlichHZEType codeVerhaeltnisJugendlichHZEType = (CodeVerhaeltnisJugendlichHZEType)theEObject;
				T result = caseCodeVerhaeltnisJugendlichHZEType(codeVerhaeltnisJugendlichHZEType);
				if (result == null) result = caseCode(codeVerhaeltnisJugendlichHZEType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErziehungshilfePackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErziehungshilfePackage.ERREICHBARKEIT_HZE_TYPE: {
				ErreichbarkeitHZEType erreichbarkeitHZEType = (ErreichbarkeitHZEType)theEObject;
				T result = caseErreichbarkeitHZEType(erreichbarkeitHZEType);
				if (result == null) result = caseErreichbarkeitType(erreichbarkeitHZEType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE: {
				HilfenZurErziehungAnfrageHJV0702Type hilfenZurErziehungAnfrageHJV0702Type = (HilfenZurErziehungAnfrageHJV0702Type)theEObject;
				T result = caseHilfenZurErziehungAnfrageHJV0702Type(hilfenZurErziehungAnfrageHJV0702Type);
				if (result == null) result = caseAntragsnachrichtType(hilfenZurErziehungAnfrageHJV0702Type);
				if (result == null) result = caseNachrichtType(hilfenZurErziehungAnfrageHJV0702Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE: {
				HilfenZurErziehungAntrag0701Type hilfenZurErziehungAntrag0701Type = (HilfenZurErziehungAntrag0701Type)theEObject;
				T result = caseHilfenZurErziehungAntrag0701Type(hilfenZurErziehungAntrag0701Type);
				if (result == null) result = caseAntragsnachrichtType(hilfenZurErziehungAntrag0701Type);
				if (result == null) result = caseNachrichtType(hilfenZurErziehungAntrag0701Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE: {
				HilfenZurErziehungEingliederungshilfe0703Type hilfenZurErziehungEingliederungshilfe0703Type = (HilfenZurErziehungEingliederungshilfe0703Type)theEObject;
				T result = caseHilfenZurErziehungEingliederungshilfe0703Type(hilfenZurErziehungEingliederungshilfe0703Type);
				if (result == null) result = caseAntragsnachrichtType(hilfenZurErziehungEingliederungshilfe0703Type);
				if (result == null) result = caseNachrichtType(hilfenZurErziehungEingliederungshilfe0703Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE: {
				HilfenZurErziehungNachweisnachricht0711Type hilfenZurErziehungNachweisnachricht0711Type = (HilfenZurErziehungNachweisnachricht0711Type)theEObject;
				T result = caseHilfenZurErziehungNachweisnachricht0711Type(hilfenZurErziehungNachweisnachricht0711Type);
				if (result == null) result = caseNachrichtType(hilfenZurErziehungNachweisnachricht0711Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE: {
				HilfenZurErziehungWiderspruch0704Type hilfenZurErziehungWiderspruch0704Type = (HilfenZurErziehungWiderspruch0704Type)theEObject;
				T result = caseHilfenZurErziehungWiderspruch0704Type(hilfenZurErziehungWiderspruch0704Type);
				if (result == null) result = caseNachrichtType(hilfenZurErziehungWiderspruch0704Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErziehungshilfePackage.NACHWEISE_DATENSCHUTZ_TYPE: {
				NachweiseDatenschutzType nachweiseDatenschutzType = (NachweiseDatenschutzType)theEObject;
				T result = caseNachweiseDatenschutzType(nachweiseDatenschutzType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErziehungshilfePackage.NACHWEISE_HZE_TYPE: {
				NachweiseHZEType nachweiseHZEType = (NachweiseHZEType)theEObject;
				T result = caseNachweiseHZEType(nachweiseHZEType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErziehungshilfePackage.NACHWEIS_TYPE: {
				NachweisType nachweisType = (NachweisType)theEObject;
				T result = caseNachweisType(nachweisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE: {
				PersoenlicheAngabenEingliederungType persoenlicheAngabenEingliederungType = (PersoenlicheAngabenEingliederungType)theEObject;
				T result = casePersoenlicheAngabenEingliederungType(persoenlicheAngabenEingliederungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE: {
				PersoenlicheAngabenHJVType persoenlicheAngabenHJVType = (PersoenlicheAngabenHJVType)theEObject;
				T result = casePersoenlicheAngabenHJVType(persoenlicheAngabenHJVType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HZE_TYPE: {
				PersoenlicheAngabenHZEType persoenlicheAngabenHZEType = (PersoenlicheAngabenHZEType)theEObject;
				T result = casePersoenlicheAngabenHZEType(persoenlicheAngabenHZEType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_KONTAKTFORMULAR_TYPE: {
				PersoenlicheAngabenKontaktformularType persoenlicheAngabenKontaktformularType = (PersoenlicheAngabenKontaktformularType)theEObject;
				T result = casePersoenlicheAngabenKontaktformularType(persoenlicheAngabenKontaktformularType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErziehungshilfePackage.PERSON_IDENTIFIKATION_TYPE: {
				PersonIdentifikationType personIdentifikationType = (PersonIdentifikationType)theEObject;
				T result = casePersonIdentifikationType(personIdentifikationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angaben Elternteil Eingliederung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angaben Elternteil Eingliederung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngabenElternteilEingliederungType(AngabenElternteilEingliederungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angaben Elternteil HJV Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angaben Elternteil HJV Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngabenElternteilHJVType(AngabenElternteilHJVType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angaben ET Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angaben ET Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngabenETType(AngabenETType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angaben Kind Eingliederung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angaben Kind Eingliederung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngabenKindEingliederungType(AngabenKindEingliederungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angaben Kind HJV Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angaben Kind HJV Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngabenKindHJVType(AngabenKindHJVType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angaben Kind HZE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angaben Kind HZE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngabenKindHZEType(AngabenKindHZEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angaben Zu Jugendlich HZE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angaben Zu Jugendlich HZE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngabenZuJugendlichHZEType(AngabenZuJugendlichHZEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angaben Zu Jugendlich Kontaktformular Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angaben Zu Jugendlich Kontaktformular Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngabenZuJugendlichKontaktformularType(AngabenZuJugendlichKontaktformularType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anliegensklaerung Anfrage Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anliegensklaerung Anfrage Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnliegensklaerungAnfrageType(AnliegensklaerungAnfrageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anliegensklaerung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anliegensklaerung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnliegensklaerungType(AnliegensklaerungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Antragstellender ET Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Antragstellender ET Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAntragstellenderETType(AntragstellenderETType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auswahl Bescheidart Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auswahl Bescheidart Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuswahlBescheidartType(AuswahlBescheidartType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Begruendung Des Hilfebedarfs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Begruendung Des Hilfebedarfs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBegruendungDesHilfebedarfsType(BegruendungDesHilfebedarfsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Aufenthalt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Aufenthalt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeAufenthaltType(CodeAufenthaltType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Auswahl Der Hilfe Hz EType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Auswahl Der Hilfe Hz EType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeAuswahlDerHilfeHzEType(CodeAuswahlDerHilfeHzEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code HZE Ich Bin Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code HZE Ich Bin Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeHZEIchBinType(CodeHZEIchBinType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Verhaeltnis Jugendlich HZE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Verhaeltnis Jugendlich HZE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeVerhaeltnisJugendlichHZEType(CodeVerhaeltnisJugendlichHZEType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Erreichbarkeit HZE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erreichbarkeit HZE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErreichbarkeitHZEType(ErreichbarkeitHZEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hilfen Zur Erziehung Anfrage HJV0702 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hilfen Zur Erziehung Anfrage HJV0702 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHilfenZurErziehungAnfrageHJV0702Type(HilfenZurErziehungAnfrageHJV0702Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hilfen Zur Erziehung Antrag0701 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hilfen Zur Erziehung Antrag0701 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHilfenZurErziehungAntrag0701Type(HilfenZurErziehungAntrag0701Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hilfen Zur Erziehung Eingliederungshilfe0703 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hilfen Zur Erziehung Eingliederungshilfe0703 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHilfenZurErziehungEingliederungshilfe0703Type(HilfenZurErziehungEingliederungshilfe0703Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hilfen Zur Erziehung Nachweisnachricht0711 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hilfen Zur Erziehung Nachweisnachricht0711 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHilfenZurErziehungNachweisnachricht0711Type(HilfenZurErziehungNachweisnachricht0711Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hilfen Zur Erziehung Widerspruch0704 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hilfen Zur Erziehung Widerspruch0704 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHilfenZurErziehungWiderspruch0704Type(HilfenZurErziehungWiderspruch0704Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nachweise Datenschutz Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nachweise Datenschutz Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNachweiseDatenschutzType(NachweiseDatenschutzType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nachweise HZE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nachweise HZE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNachweiseHZEType(NachweiseHZEType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Persoenliche Angaben Eingliederung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persoenliche Angaben Eingliederung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersoenlicheAngabenEingliederungType(PersoenlicheAngabenEingliederungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persoenliche Angaben HJV Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persoenliche Angaben HJV Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersoenlicheAngabenHJVType(PersoenlicheAngabenHJVType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persoenliche Angaben HZE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persoenliche Angaben HZE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersoenlicheAngabenHZEType(PersoenlicheAngabenHZEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persoenliche Angaben Kontaktformular Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persoenliche Angaben Kontaktformular Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersoenlicheAngabenKontaktformularType(PersoenlicheAngabenKontaktformularType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Identifikation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Identifikation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonIdentifikationType(PersonIdentifikationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCode(Code object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erreichbarkeit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erreichbarkeit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErreichbarkeitType(ErreichbarkeitType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Antragsnachricht Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Antragsnachricht Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAntragsnachrichtType(AntragsnachrichtType object) {
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

} //ErziehungshilfeSwitch
