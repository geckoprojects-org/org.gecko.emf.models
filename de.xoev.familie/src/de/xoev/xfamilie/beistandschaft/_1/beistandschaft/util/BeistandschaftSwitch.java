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
package de.xoev.xfamilie.beistandschaft._1.beistandschaft.util;

import de.xoev.schemata.code.code.Code;

import de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType;

import de.xoev.xfamilie.beistandschaft._1.beistandschaft.*;

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
 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage
 * @generated
 */
public class BeistandschaftSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BeistandschaftPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeistandschaftSwitch() {
		if (modelPackage == null) {
			modelPackage = BeistandschaftPackage.eINSTANCE;
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
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE: {
				AndererElternteilType andererElternteilType = (AndererElternteilType)theEObject;
				T result = caseAndererElternteilType(andererElternteilType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE: {
				AngabenZumKindBeendigungType angabenZumKindBeendigungType = (AngabenZumKindBeendigungType)theEObject;
				T result = caseAngabenZumKindBeendigungType(angabenZumKindBeendigungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE: {
				AngabenZumKindType angabenZumKindType = (AngabenZumKindType)theEObject;
				T result = caseAngabenZumKindType(angabenZumKindType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE: {
				AngabenZumUnterhaltType angabenZumUnterhaltType = (AngabenZumUnterhaltType)theEObject;
				T result = caseAngabenZumUnterhaltType(angabenZumUnterhaltType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeistandschaftPackage.ANLIEGENSKLAERUNG_BSS_TYPE: {
				AnliegensklaerungBSSType anliegensklaerungBSSType = (AnliegensklaerungBSSType)theEObject;
				T result = caseAnliegensklaerungBSSType(anliegensklaerungBSSType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE: {
				AntragstellenderElternteilBeendigungType antragstellenderElternteilBeendigungType = (AntragstellenderElternteilBeendigungType)theEObject;
				T result = caseAntragstellenderElternteilBeendigungType(antragstellenderElternteilBeendigungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_TYPE: {
				AntragstellenderElternteilType antragstellenderElternteilType = (AntragstellenderElternteilType)theEObject;
				T result = caseAntragstellenderElternteilType(antragstellenderElternteilType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeistandschaftPackage.AUSBILDUNG_UND_EINKUENFTE_TYPE: {
				AusbildungUndEinkuenfteType ausbildungUndEinkuenfteType = (AusbildungUndEinkuenfteType)theEObject;
				T result = caseAusbildungUndEinkuenfteType(ausbildungUndEinkuenfteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE: {
				BeistandschaftAntrag0601Type beistandschaftAntrag0601Type = (BeistandschaftAntrag0601Type)theEObject;
				T result = caseBeistandschaftAntrag0601Type(beistandschaftAntrag0601Type);
				if (result == null) result = caseAntragsnachrichtType(beistandschaftAntrag0601Type);
				if (result == null) result = caseNachrichtType(beistandschaftAntrag0601Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE: {
				BeistandschaftBeendigung0604Type beistandschaftBeendigung0604Type = (BeistandschaftBeendigung0604Type)theEObject;
				T result = caseBeistandschaftBeendigung0604Type(beistandschaftBeendigung0604Type);
				if (result == null) result = caseAntragsnachrichtType(beistandschaftBeendigung0604Type);
				if (result == null) result = caseNachrichtType(beistandschaftBeendigung0604Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeistandschaftPackage.CODE_ANLIEGEN_BEISTANDSCHAFT_TYPE: {
				CodeAnliegenBeistandschaftType codeAnliegenBeistandschaftType = (CodeAnliegenBeistandschaftType)theEObject;
				T result = caseCodeAnliegenBeistandschaftType(codeAnliegenBeistandschaftType);
				if (result == null) result = caseCode(codeAnliegenBeistandschaftType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeistandschaftPackage.CODE_BEZUG_OEFFENTLICHER_LEISTUNGEN_TYPE: {
				CodeBezugOeffentlicherLeistungenType codeBezugOeffentlicherLeistungenType = (CodeBezugOeffentlicherLeistungenType)theEObject;
				T result = caseCodeBezugOeffentlicherLeistungenType(codeBezugOeffentlicherLeistungenType);
				if (result == null) result = caseCode(codeBezugOeffentlicherLeistungenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeistandschaftPackage.CODE_EINKOMMEN_ANDERER_ELTERNTEIL_TYPE: {
				CodeEinkommenAndererElternteilType codeEinkommenAndererElternteilType = (CodeEinkommenAndererElternteilType)theEObject;
				T result = caseCodeEinkommenAndererElternteilType(codeEinkommenAndererElternteilType);
				if (result == null) result = caseCode(codeEinkommenAndererElternteilType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeistandschaftPackage.CODE_INHABER_ELTERLICHE_SORGE_TYPE: {
				CodeInhaberElterlicheSorgeType codeInhaberElterlicheSorgeType = (CodeInhaberElterlicheSorgeType)theEObject;
				T result = caseCodeInhaberElterlicheSorgeType(codeInhaberElterlicheSorgeType);
				if (result == null) result = caseCode(codeInhaberElterlicheSorgeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeistandschaftPackage.CODE_UNTERHALTSTITEL_BESTEHT_TYPE: {
				CodeUnterhaltstitelBestehtType codeUnterhaltstitelBestehtType = (CodeUnterhaltstitelBestehtType)theEObject;
				T result = caseCodeUnterhaltstitelBestehtType(codeUnterhaltstitelBestehtType);
				if (result == null) result = caseCode(codeUnterhaltstitelBestehtType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeistandschaftPackage.CODE_ZAHLUNGSART_BSS_TYPE: {
				CodeZahlungsartBSSType codeZahlungsartBSSType = (CodeZahlungsartBSSType)theEObject;
				T result = caseCodeZahlungsartBSSType(codeZahlungsartBSSType);
				if (result == null) result = caseCode(codeZahlungsartBSSType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeistandschaftPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeistandschaftPackage.GEBURT_TYPE: {
				GeburtType geburtType = (GeburtType)theEObject;
				T result = caseGeburtType(geburtType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeistandschaftPackage.NACHWEISE_BSS_TYPE: {
				NachweiseBSSType nachweiseBSSType = (NachweiseBSSType)theEObject;
				T result = caseNachweiseBSSType(nachweiseBSSType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeistandschaftPackage.NACHWEIS_TYPE: {
				NachweisType nachweisType = (NachweisType)theEObject;
				T result = caseNachweisType(nachweisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE: {
				WeitereAngabenZumAnderenElternteilType weitereAngabenZumAnderenElternteilType = (WeitereAngabenZumAnderenElternteilType)theEObject;
				T result = caseWeitereAngabenZumAnderenElternteilType(weitereAngabenZumAnderenElternteilType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BeistandschaftPackage.WEITERE_KINDER_TYPE: {
				WeitereKinderType weitereKinderType = (WeitereKinderType)theEObject;
				T result = caseWeitereKinderType(weitereKinderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anderer Elternteil Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anderer Elternteil Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndererElternteilType(AndererElternteilType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angaben Zum Kind Beendigung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angaben Zum Kind Beendigung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngabenZumKindBeendigungType(AngabenZumKindBeendigungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angaben Zum Kind Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angaben Zum Kind Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngabenZumKindType(AngabenZumKindType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angaben Zum Unterhalt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angaben Zum Unterhalt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngabenZumUnterhaltType(AngabenZumUnterhaltType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anliegensklaerung BSS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anliegensklaerung BSS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnliegensklaerungBSSType(AnliegensklaerungBSSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Antragstellender Elternteil Beendigung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Antragstellender Elternteil Beendigung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAntragstellenderElternteilBeendigungType(AntragstellenderElternteilBeendigungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Antragstellender Elternteil Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Antragstellender Elternteil Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAntragstellenderElternteilType(AntragstellenderElternteilType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ausbildung Und Einkuenfte Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ausbildung Und Einkuenfte Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAusbildungUndEinkuenfteType(AusbildungUndEinkuenfteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Antrag0601 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Antrag0601 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeistandschaftAntrag0601Type(BeistandschaftAntrag0601Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Beendigung0604 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Beendigung0604 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeistandschaftBeendigung0604Type(BeistandschaftBeendigung0604Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Anliegen Beistandschaft Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Anliegen Beistandschaft Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeAnliegenBeistandschaftType(CodeAnliegenBeistandschaftType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Bezug Oeffentlicher Leistungen Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Bezug Oeffentlicher Leistungen Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeBezugOeffentlicherLeistungenType(CodeBezugOeffentlicherLeistungenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Einkommen Anderer Elternteil Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Einkommen Anderer Elternteil Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeEinkommenAndererElternteilType(CodeEinkommenAndererElternteilType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Inhaber Elterliche Sorge Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Inhaber Elterliche Sorge Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeInhaberElterlicheSorgeType(CodeInhaberElterlicheSorgeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Unterhaltstitel Besteht Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Unterhaltstitel Besteht Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeUnterhaltstitelBestehtType(CodeUnterhaltstitelBestehtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Zahlungsart BSS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Zahlungsart BSS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeZahlungsartBSSType(CodeZahlungsartBSSType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Geburt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geburt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeburtType(GeburtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nachweise BSS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nachweise BSS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNachweiseBSSType(NachweiseBSSType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Weitere Angaben Zum Anderen Elternteil Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weitere Angaben Zum Anderen Elternteil Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeitereAngabenZumAnderenElternteilType(WeitereAngabenZumAnderenElternteilType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weitere Kinder Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weitere Kinder Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeitereKinderType(WeitereKinderType object) {
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

} //BeistandschaftSwitch
