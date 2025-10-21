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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage
 * @generated
 */
public class BeistandschaftAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BeistandschaftPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeistandschaftAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BeistandschaftPackage.eINSTANCE;
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
	protected BeistandschaftSwitch<Adapter> modelSwitch =
		new BeistandschaftSwitch<Adapter>() {
			@Override
			public Adapter caseAndererElternteilType(AndererElternteilType object) {
				return createAndererElternteilTypeAdapter();
			}
			@Override
			public Adapter caseAngabenZumKindBeendigungType(AngabenZumKindBeendigungType object) {
				return createAngabenZumKindBeendigungTypeAdapter();
			}
			@Override
			public Adapter caseAngabenZumKindType(AngabenZumKindType object) {
				return createAngabenZumKindTypeAdapter();
			}
			@Override
			public Adapter caseAngabenZumUnterhaltType(AngabenZumUnterhaltType object) {
				return createAngabenZumUnterhaltTypeAdapter();
			}
			@Override
			public Adapter caseAnliegensklaerungBSSType(AnliegensklaerungBSSType object) {
				return createAnliegensklaerungBSSTypeAdapter();
			}
			@Override
			public Adapter caseAntragstellenderElternteilBeendigungType(AntragstellenderElternteilBeendigungType object) {
				return createAntragstellenderElternteilBeendigungTypeAdapter();
			}
			@Override
			public Adapter caseAntragstellenderElternteilType(AntragstellenderElternteilType object) {
				return createAntragstellenderElternteilTypeAdapter();
			}
			@Override
			public Adapter caseAusbildungUndEinkuenfteType(AusbildungUndEinkuenfteType object) {
				return createAusbildungUndEinkuenfteTypeAdapter();
			}
			@Override
			public Adapter caseBeistandschaftAntrag0601Type(BeistandschaftAntrag0601Type object) {
				return createBeistandschaftAntrag0601TypeAdapter();
			}
			@Override
			public Adapter caseBeistandschaftBeendigung0604Type(BeistandschaftBeendigung0604Type object) {
				return createBeistandschaftBeendigung0604TypeAdapter();
			}
			@Override
			public Adapter caseCodeAnliegenBeistandschaftType(CodeAnliegenBeistandschaftType object) {
				return createCodeAnliegenBeistandschaftTypeAdapter();
			}
			@Override
			public Adapter caseCodeBezugOeffentlicherLeistungenType(CodeBezugOeffentlicherLeistungenType object) {
				return createCodeBezugOeffentlicherLeistungenTypeAdapter();
			}
			@Override
			public Adapter caseCodeEinkommenAndererElternteilType(CodeEinkommenAndererElternteilType object) {
				return createCodeEinkommenAndererElternteilTypeAdapter();
			}
			@Override
			public Adapter caseCodeInhaberElterlicheSorgeType(CodeInhaberElterlicheSorgeType object) {
				return createCodeInhaberElterlicheSorgeTypeAdapter();
			}
			@Override
			public Adapter caseCodeUnterhaltstitelBestehtType(CodeUnterhaltstitelBestehtType object) {
				return createCodeUnterhaltstitelBestehtTypeAdapter();
			}
			@Override
			public Adapter caseCodeZahlungsartBSSType(CodeZahlungsartBSSType object) {
				return createCodeZahlungsartBSSTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseGeburtType(GeburtType object) {
				return createGeburtTypeAdapter();
			}
			@Override
			public Adapter caseNachweiseBSSType(NachweiseBSSType object) {
				return createNachweiseBSSTypeAdapter();
			}
			@Override
			public Adapter caseNachweisType(NachweisType object) {
				return createNachweisTypeAdapter();
			}
			@Override
			public Adapter caseWeitereAngabenZumAnderenElternteilType(WeitereAngabenZumAnderenElternteilType object) {
				return createWeitereAngabenZumAnderenElternteilTypeAdapter();
			}
			@Override
			public Adapter caseWeitereKinderType(WeitereKinderType object) {
				return createWeitereKinderTypeAdapter();
			}
			@Override
			public Adapter caseNachrichtType(NachrichtType object) {
				return createNachrichtTypeAdapter();
			}
			@Override
			public Adapter caseAntragsnachrichtType(AntragsnachrichtType object) {
				return createAntragsnachrichtTypeAdapter();
			}
			@Override
			public Adapter caseCode(Code object) {
				return createCodeAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType <em>Anderer Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType
	 * @generated
	 */
	public Adapter createAndererElternteilTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindBeendigungType <em>Angaben Zum Kind Beendigung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindBeendigungType
	 * @generated
	 */
	public Adapter createAngabenZumKindBeendigungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType <em>Angaben Zum Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType
	 * @generated
	 */
	public Adapter createAngabenZumKindTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType <em>Angaben Zum Unterhalt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType
	 * @generated
	 */
	public Adapter createAngabenZumUnterhaltTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AnliegensklaerungBSSType <em>Anliegensklaerung BSS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AnliegensklaerungBSSType
	 * @generated
	 */
	public Adapter createAnliegensklaerungBSSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilBeendigungType <em>Antragstellender Elternteil Beendigung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilBeendigungType
	 * @generated
	 */
	public Adapter createAntragstellenderElternteilBeendigungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType <em>Antragstellender Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType
	 * @generated
	 */
	public Adapter createAntragstellenderElternteilTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType <em>Ausbildung Und Einkuenfte Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType
	 * @generated
	 */
	public Adapter createAusbildungUndEinkuenfteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type <em>Antrag0601 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type
	 * @generated
	 */
	public Adapter createBeistandschaftAntrag0601TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type <em>Beendigung0604 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type
	 * @generated
	 */
	public Adapter createBeistandschaftBeendigung0604TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeAnliegenBeistandschaftType <em>Code Anliegen Beistandschaft Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeAnliegenBeistandschaftType
	 * @generated
	 */
	public Adapter createCodeAnliegenBeistandschaftTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeBezugOeffentlicherLeistungenType <em>Code Bezug Oeffentlicher Leistungen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeBezugOeffentlicherLeistungenType
	 * @generated
	 */
	public Adapter createCodeBezugOeffentlicherLeistungenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeEinkommenAndererElternteilType <em>Code Einkommen Anderer Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeEinkommenAndererElternteilType
	 * @generated
	 */
	public Adapter createCodeEinkommenAndererElternteilTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeInhaberElterlicheSorgeType <em>Code Inhaber Elterliche Sorge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeInhaberElterlicheSorgeType
	 * @generated
	 */
	public Adapter createCodeInhaberElterlicheSorgeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeUnterhaltstitelBestehtType <em>Code Unterhaltstitel Besteht Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeUnterhaltstitelBestehtType
	 * @generated
	 */
	public Adapter createCodeUnterhaltstitelBestehtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeZahlungsartBSSType <em>Code Zahlungsart BSS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeZahlungsartBSSType
	 * @generated
	 */
	public Adapter createCodeZahlungsartBSSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.GeburtType <em>Geburt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.GeburtType
	 * @generated
	 */
	public Adapter createGeburtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.NachweiseBSSType <em>Nachweise BSS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.NachweiseBSSType
	 * @generated
	 */
	public Adapter createNachweiseBSSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.NachweisType <em>Nachweis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.NachweisType
	 * @generated
	 */
	public Adapter createNachweisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType <em>Weitere Angaben Zum Anderen Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType
	 * @generated
	 */
	public Adapter createWeitereAngabenZumAnderenElternteilTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereKinderType <em>Weitere Kinder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereKinderType
	 * @generated
	 */
	public Adapter createWeitereKinderTypeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType <em>Antragsnachricht Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType
	 * @generated
	 */
	public Adapter createAntragsnachrichtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.schemata.code.code.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.schemata.code.code.Code
	 * @generated
	 */
	public Adapter createCodeAdapter() {
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

} //BeistandschaftAdapterFactory
