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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage
 * @generated
 */
public class KinderwunschAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KinderwunschPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KinderwunschAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = KinderwunschPackage.eINSTANCE;
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
	protected KinderwunschSwitch<Adapter> modelSwitch =
		new KinderwunschSwitch<Adapter>() {
			@Override
			public Adapter caseAltersgrenzeType(AltersgrenzeType object) {
				return createAltersgrenzeTypeAdapter();
			}
			@Override
			public Adapter caseAngabenZurBehandlungType(AngabenZurBehandlungType object) {
				return createAngabenZurBehandlungTypeAdapter();
			}
			@Override
			public Adapter caseArtDerBehandlungType(ArtDerBehandlungType object) {
				return createArtDerBehandlungTypeAdapter();
			}
			@Override
			public Adapter caseArtNachreichungType(ArtNachreichungType object) {
				return createArtNachreichungTypeAdapter();
			}
			@Override
			public Adapter caseAuszahlungsantragType(AuszahlungsantragType object) {
				return createAuszahlungsantragTypeAdapter();
			}
			@Override
			public Adapter caseBefruchtungsbehandlungenType(BefruchtungsbehandlungenType object) {
				return createBefruchtungsbehandlungenTypeAdapter();
			}
			@Override
			public Adapter caseBewilligungsantragType(BewilligungsantragType object) {
				return createBewilligungsantragTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEinwilligungenAuszahlungsantragType(EinwilligungenAuszahlungsantragType object) {
				return createEinwilligungenAuszahlungsantragTypeAdapter();
			}
			@Override
			public Adapter caseEinwilligungenType(EinwilligungenType object) {
				return createEinwilligungenTypeAdapter();
			}
			@Override
			public Adapter caseFinanzierungsplanType(FinanzierungsplanType object) {
				return createFinanzierungsplanTypeAdapter();
			}
			@Override
			public Adapter caseKinderwunschBewilligungsantrag1001Type(KinderwunschBewilligungsantrag1001Type object) {
				return createKinderwunschBewilligungsantrag1001TypeAdapter();
			}
			@Override
			public Adapter caseKinderwunschNachreichung1003Type(KinderwunschNachreichung1003Type object) {
				return createKinderwunschNachreichung1003TypeAdapter();
			}
			@Override
			public Adapter caseKinderwunschVerwendungsnachweispruefung1002Type(KinderwunschVerwendungsnachweispruefung1002Type object) {
				return createKinderwunschVerwendungsnachweispruefung1002TypeAdapter();
			}
			@Override
			public Adapter caseKonfigurationsfragenBewilligungType(KonfigurationsfragenBewilligungType object) {
				return createKonfigurationsfragenBewilligungTypeAdapter();
			}
			@Override
			public Adapter caseKonfigurationsfragenType(KonfigurationsfragenType object) {
				return createKonfigurationsfragenTypeAdapter();
			}
			@Override
			public Adapter caseKrankenkasseType(KrankenkasseType object) {
				return createKrankenkasseTypeAdapter();
			}
			@Override
			public Adapter caseNachreichungType(NachreichungType object) {
				return createNachreichungTypeAdapter();
			}
			@Override
			public Adapter caseNachweiseBerechnungZuwendungType(NachweiseBerechnungZuwendungType object) {
				return createNachweiseBerechnungZuwendungTypeAdapter();
			}
			@Override
			public Adapter caseNachweiseKinderwunschType(NachweiseKinderwunschType object) {
				return createNachweiseKinderwunschTypeAdapter();
			}
			@Override
			public Adapter caseNachweiseRechnungenType(NachweiseRechnungenType object) {
				return createNachweiseRechnungenTypeAdapter();
			}
			@Override
			public Adapter caseNachweisType(NachweisType object) {
				return createNachweisTypeAdapter();
			}
			@Override
			public Adapter casePersonendatenType(PersonendatenType object) {
				return createPersonendatenTypeAdapter();
			}
			@Override
			public Adapter caseVersuchType(VersuchType object) {
				return createVersuchTypeAdapter();
			}
			@Override
			public Adapter caseVorherigeBehandlungenType(VorherigeBehandlungenType object) {
				return createVorherigeBehandlungenTypeAdapter();
			}
			@Override
			public Adapter caseWohnsitzType(WohnsitzType object) {
				return createWohnsitzTypeAdapter();
			}
			@Override
			public Adapter caseZusaetzlicheBeteiligungType(ZusaetzlicheBeteiligungType object) {
				return createZusaetzlicheBeteiligungTypeAdapter();
			}
			@Override
			public Adapter caseZuschuesseKrankenversicherungType(ZuschuesseKrankenversicherungType object) {
				return createZuschuesseKrankenversicherungTypeAdapter();
			}
			@Override
			public Adapter caseCode(Code object) {
				return createCodeAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AltersgrenzeType <em>Altersgrenze Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AltersgrenzeType
	 * @generated
	 */
	public Adapter createAltersgrenzeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AngabenZurBehandlungType <em>Angaben Zur Behandlung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AngabenZurBehandlungType
	 * @generated
	 */
	public Adapter createAngabenZurBehandlungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType <em>Art Der Behandlung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType
	 * @generated
	 */
	public Adapter createArtDerBehandlungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtNachreichungType <em>Art Nachreichung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtNachreichungType
	 * @generated
	 */
	public Adapter createArtNachreichungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType <em>Auszahlungsantrag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType
	 * @generated
	 */
	public Adapter createAuszahlungsantragTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BefruchtungsbehandlungenType <em>Befruchtungsbehandlungen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BefruchtungsbehandlungenType
	 * @generated
	 */
	public Adapter createBefruchtungsbehandlungenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType <em>Bewilligungsantrag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType
	 * @generated
	 */
	public Adapter createBewilligungsantragTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenAuszahlungsantragType <em>Einwilligungen Auszahlungsantrag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenAuszahlungsantragType
	 * @generated
	 */
	public Adapter createEinwilligungenAuszahlungsantragTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType <em>Einwilligungen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType
	 * @generated
	 */
	public Adapter createEinwilligungenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType <em>Finanzierungsplan Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType
	 * @generated
	 */
	public Adapter createFinanzierungsplanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschBewilligungsantrag1001Type <em>Bewilligungsantrag1001 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschBewilligungsantrag1001Type
	 * @generated
	 */
	public Adapter createKinderwunschBewilligungsantrag1001TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type <em>Nachreichung1003 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type
	 * @generated
	 */
	public Adapter createKinderwunschNachreichung1003TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschVerwendungsnachweispruefung1002Type <em>Verwendungsnachweispruefung1002 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschVerwendungsnachweispruefung1002Type
	 * @generated
	 */
	public Adapter createKinderwunschVerwendungsnachweispruefung1002TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KonfigurationsfragenBewilligungType <em>Konfigurationsfragen Bewilligung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KonfigurationsfragenBewilligungType
	 * @generated
	 */
	public Adapter createKonfigurationsfragenBewilligungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KonfigurationsfragenType <em>Konfigurationsfragen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KonfigurationsfragenType
	 * @generated
	 */
	public Adapter createKonfigurationsfragenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KrankenkasseType <em>Krankenkasse Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KrankenkasseType
	 * @generated
	 */
	public Adapter createKrankenkasseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachreichungType <em>Nachreichung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachreichungType
	 * @generated
	 */
	public Adapter createNachreichungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseBerechnungZuwendungType <em>Nachweise Berechnung Zuwendung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseBerechnungZuwendungType
	 * @generated
	 */
	public Adapter createNachweiseBerechnungZuwendungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType <em>Nachweise Kinderwunsch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType
	 * @generated
	 */
	public Adapter createNachweiseKinderwunschTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseRechnungenType <em>Nachweise Rechnungen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseRechnungenType
	 * @generated
	 */
	public Adapter createNachweiseRechnungenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweisType <em>Nachweis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweisType
	 * @generated
	 */
	public Adapter createNachweisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.PersonendatenType <em>Personendaten Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.PersonendatenType
	 * @generated
	 */
	public Adapter createPersonendatenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VersuchType <em>Versuch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VersuchType
	 * @generated
	 */
	public Adapter createVersuchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType <em>Vorherige Behandlungen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType
	 * @generated
	 */
	public Adapter createVorherigeBehandlungenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.WohnsitzType <em>Wohnsitz Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.WohnsitzType
	 * @generated
	 */
	public Adapter createWohnsitzTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZusaetzlicheBeteiligungType <em>Zusaetzliche Beteiligung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZusaetzlicheBeteiligungType
	 * @generated
	 */
	public Adapter createZusaetzlicheBeteiligungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZuschuesseKrankenversicherungType <em>Zuschuesse Krankenversicherung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZuschuesseKrankenversicherungType
	 * @generated
	 */
	public Adapter createZuschuesseKrankenversicherungTypeAdapter() {
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

} //KinderwunschAdapterFactory
