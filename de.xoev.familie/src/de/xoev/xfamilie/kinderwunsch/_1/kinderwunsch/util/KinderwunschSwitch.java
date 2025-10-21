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
package de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.util;

import de.xoev.schemata.code.code.Code;

import de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType;

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.*;

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
 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage
 * @generated
 */
public class KinderwunschSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KinderwunschPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KinderwunschSwitch() {
		if (modelPackage == null) {
			modelPackage = KinderwunschPackage.eINSTANCE;
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
			case KinderwunschPackage.ALTERSGRENZE_TYPE: {
				AltersgrenzeType altersgrenzeType = (AltersgrenzeType)theEObject;
				T result = caseAltersgrenzeType(altersgrenzeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KinderwunschPackage.ANGABEN_ZUR_BEHANDLUNG_TYPE: {
				AngabenZurBehandlungType angabenZurBehandlungType = (AngabenZurBehandlungType)theEObject;
				T result = caseAngabenZurBehandlungType(angabenZurBehandlungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE: {
				ArtDerBehandlungType artDerBehandlungType = (ArtDerBehandlungType)theEObject;
				T result = caseArtDerBehandlungType(artDerBehandlungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KinderwunschPackage.ART_NACHREICHUNG_TYPE: {
				ArtNachreichungType artNachreichungType = (ArtNachreichungType)theEObject;
				T result = caseArtNachreichungType(artNachreichungType);
				if (result == null) result = caseCode(artNachreichungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE: {
				AuszahlungsantragType auszahlungsantragType = (AuszahlungsantragType)theEObject;
				T result = caseAuszahlungsantragType(auszahlungsantragType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KinderwunschPackage.BEFRUCHTUNGSBEHANDLUNGEN_TYPE: {
				BefruchtungsbehandlungenType befruchtungsbehandlungenType = (BefruchtungsbehandlungenType)theEObject;
				T result = caseBefruchtungsbehandlungenType(befruchtungsbehandlungenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE: {
				BewilligungsantragType bewilligungsantragType = (BewilligungsantragType)theEObject;
				T result = caseBewilligungsantragType(bewilligungsantragType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KinderwunschPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KinderwunschPackage.EINWILLIGUNGEN_AUSZAHLUNGSANTRAG_TYPE: {
				EinwilligungenAuszahlungsantragType einwilligungenAuszahlungsantragType = (EinwilligungenAuszahlungsantragType)theEObject;
				T result = caseEinwilligungenAuszahlungsantragType(einwilligungenAuszahlungsantragType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KinderwunschPackage.EINWILLIGUNGEN_TYPE: {
				EinwilligungenType einwilligungenType = (EinwilligungenType)theEObject;
				T result = caseEinwilligungenType(einwilligungenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KinderwunschPackage.FINANZIERUNGSPLAN_TYPE: {
				FinanzierungsplanType finanzierungsplanType = (FinanzierungsplanType)theEObject;
				T result = caseFinanzierungsplanType(finanzierungsplanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KinderwunschPackage.KINDERWUNSCH_BEWILLIGUNGSANTRAG1001_TYPE: {
				KinderwunschBewilligungsantrag1001Type kinderwunschBewilligungsantrag1001Type = (KinderwunschBewilligungsantrag1001Type)theEObject;
				T result = caseKinderwunschBewilligungsantrag1001Type(kinderwunschBewilligungsantrag1001Type);
				if (result == null) result = caseAntragsnachrichtType(kinderwunschBewilligungsantrag1001Type);
				if (result == null) result = caseNachrichtType(kinderwunschBewilligungsantrag1001Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE: {
				KinderwunschNachreichung1003Type kinderwunschNachreichung1003Type = (KinderwunschNachreichung1003Type)theEObject;
				T result = caseKinderwunschNachreichung1003Type(kinderwunschNachreichung1003Type);
				if (result == null) result = caseAntragsnachrichtType(kinderwunschNachreichung1003Type);
				if (result == null) result = caseNachrichtType(kinderwunschNachreichung1003Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KinderwunschPackage.KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002_TYPE: {
				KinderwunschVerwendungsnachweispruefung1002Type kinderwunschVerwendungsnachweispruefung1002Type = (KinderwunschVerwendungsnachweispruefung1002Type)theEObject;
				T result = caseKinderwunschVerwendungsnachweispruefung1002Type(kinderwunschVerwendungsnachweispruefung1002Type);
				if (result == null) result = caseAntragsnachrichtType(kinderwunschVerwendungsnachweispruefung1002Type);
				if (result == null) result = caseNachrichtType(kinderwunschVerwendungsnachweispruefung1002Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KinderwunschPackage.KONFIGURATIONSFRAGEN_BEWILLIGUNG_TYPE: {
				KonfigurationsfragenBewilligungType konfigurationsfragenBewilligungType = (KonfigurationsfragenBewilligungType)theEObject;
				T result = caseKonfigurationsfragenBewilligungType(konfigurationsfragenBewilligungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KinderwunschPackage.KONFIGURATIONSFRAGEN_TYPE: {
				KonfigurationsfragenType konfigurationsfragenType = (KonfigurationsfragenType)theEObject;
				T result = caseKonfigurationsfragenType(konfigurationsfragenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KinderwunschPackage.KRANKENKASSE_TYPE: {
				KrankenkasseType krankenkasseType = (KrankenkasseType)theEObject;
				T result = caseKrankenkasseType(krankenkasseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KinderwunschPackage.NACHREICHUNG_TYPE: {
				NachreichungType nachreichungType = (NachreichungType)theEObject;
				T result = caseNachreichungType(nachreichungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KinderwunschPackage.NACHWEISE_BERECHNUNG_ZUWENDUNG_TYPE: {
				NachweiseBerechnungZuwendungType nachweiseBerechnungZuwendungType = (NachweiseBerechnungZuwendungType)theEObject;
				T result = caseNachweiseBerechnungZuwendungType(nachweiseBerechnungZuwendungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE: {
				NachweiseKinderwunschType nachweiseKinderwunschType = (NachweiseKinderwunschType)theEObject;
				T result = caseNachweiseKinderwunschType(nachweiseKinderwunschType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KinderwunschPackage.NACHWEISE_RECHNUNGEN_TYPE: {
				NachweiseRechnungenType nachweiseRechnungenType = (NachweiseRechnungenType)theEObject;
				T result = caseNachweiseRechnungenType(nachweiseRechnungenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KinderwunschPackage.NACHWEIS_TYPE: {
				NachweisType nachweisType = (NachweisType)theEObject;
				T result = caseNachweisType(nachweisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KinderwunschPackage.PERSONENDATEN_TYPE: {
				PersonendatenType personendatenType = (PersonendatenType)theEObject;
				T result = casePersonendatenType(personendatenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KinderwunschPackage.VERSUCH_TYPE: {
				VersuchType versuchType = (VersuchType)theEObject;
				T result = caseVersuchType(versuchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE: {
				VorherigeBehandlungenType vorherigeBehandlungenType = (VorherigeBehandlungenType)theEObject;
				T result = caseVorherigeBehandlungenType(vorherigeBehandlungenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KinderwunschPackage.WOHNSITZ_TYPE: {
				WohnsitzType wohnsitzType = (WohnsitzType)theEObject;
				T result = caseWohnsitzType(wohnsitzType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KinderwunschPackage.ZUSAETZLICHE_BETEILIGUNG_TYPE: {
				ZusaetzlicheBeteiligungType zusaetzlicheBeteiligungType = (ZusaetzlicheBeteiligungType)theEObject;
				T result = caseZusaetzlicheBeteiligungType(zusaetzlicheBeteiligungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE: {
				ZuschuesseKrankenversicherungType zuschuesseKrankenversicherungType = (ZuschuesseKrankenversicherungType)theEObject;
				T result = caseZuschuesseKrankenversicherungType(zuschuesseKrankenversicherungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Altersgrenze Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Altersgrenze Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAltersgrenzeType(AltersgrenzeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angaben Zur Behandlung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angaben Zur Behandlung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngabenZurBehandlungType(AngabenZurBehandlungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Art Der Behandlung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Art Der Behandlung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtDerBehandlungType(ArtDerBehandlungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Art Nachreichung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Art Nachreichung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtNachreichungType(ArtNachreichungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auszahlungsantrag Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auszahlungsantrag Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuszahlungsantragType(AuszahlungsantragType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Befruchtungsbehandlungen Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Befruchtungsbehandlungen Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBefruchtungsbehandlungenType(BefruchtungsbehandlungenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bewilligungsantrag Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bewilligungsantrag Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBewilligungsantragType(BewilligungsantragType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Einwilligungen Auszahlungsantrag Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Einwilligungen Auszahlungsantrag Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEinwilligungenAuszahlungsantragType(EinwilligungenAuszahlungsantragType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Einwilligungen Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Einwilligungen Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEinwilligungenType(EinwilligungenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finanzierungsplan Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finanzierungsplan Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinanzierungsplanType(FinanzierungsplanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bewilligungsantrag1001 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bewilligungsantrag1001 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKinderwunschBewilligungsantrag1001Type(KinderwunschBewilligungsantrag1001Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nachreichung1003 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nachreichung1003 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKinderwunschNachreichung1003Type(KinderwunschNachreichung1003Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verwendungsnachweispruefung1002 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verwendungsnachweispruefung1002 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKinderwunschVerwendungsnachweispruefung1002Type(KinderwunschVerwendungsnachweispruefung1002Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Konfigurationsfragen Bewilligung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Konfigurationsfragen Bewilligung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKonfigurationsfragenBewilligungType(KonfigurationsfragenBewilligungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Konfigurationsfragen Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Konfigurationsfragen Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKonfigurationsfragenType(KonfigurationsfragenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Krankenkasse Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Krankenkasse Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKrankenkasseType(KrankenkasseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nachreichung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nachreichung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNachreichungType(NachreichungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nachweise Berechnung Zuwendung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nachweise Berechnung Zuwendung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNachweiseBerechnungZuwendungType(NachweiseBerechnungZuwendungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nachweise Kinderwunsch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nachweise Kinderwunsch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNachweiseKinderwunschType(NachweiseKinderwunschType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nachweise Rechnungen Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nachweise Rechnungen Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNachweiseRechnungenType(NachweiseRechnungenType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Versuch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Versuch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersuchType(VersuchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vorherige Behandlungen Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vorherige Behandlungen Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVorherigeBehandlungenType(VorherigeBehandlungenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wohnsitz Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wohnsitz Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWohnsitzType(WohnsitzType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zusaetzliche Beteiligung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zusaetzliche Beteiligung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZusaetzlicheBeteiligungType(ZusaetzlicheBeteiligungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zuschuesse Krankenversicherung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zuschuesse Krankenversicherung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZuschuesseKrankenversicherungType(ZuschuesseKrankenversicherungType object) {
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

} //KinderwunschSwitch
