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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage
 * @generated
 */
public class ErziehungshilfeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ErziehungshilfePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErziehungshilfeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ErziehungshilfePackage.eINSTANCE;
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
	protected ErziehungshilfeSwitch<Adapter> modelSwitch =
		new ErziehungshilfeSwitch<Adapter>() {
			@Override
			public Adapter caseAngabenElternteilEingliederungType(AngabenElternteilEingliederungType object) {
				return createAngabenElternteilEingliederungTypeAdapter();
			}
			@Override
			public Adapter caseAngabenElternteilHJVType(AngabenElternteilHJVType object) {
				return createAngabenElternteilHJVTypeAdapter();
			}
			@Override
			public Adapter caseAngabenETType(AngabenETType object) {
				return createAngabenETTypeAdapter();
			}
			@Override
			public Adapter caseAngabenKindEingliederungType(AngabenKindEingliederungType object) {
				return createAngabenKindEingliederungTypeAdapter();
			}
			@Override
			public Adapter caseAngabenKindHJVType(AngabenKindHJVType object) {
				return createAngabenKindHJVTypeAdapter();
			}
			@Override
			public Adapter caseAngabenKindHZEType(AngabenKindHZEType object) {
				return createAngabenKindHZETypeAdapter();
			}
			@Override
			public Adapter caseAngabenZuJugendlichHZEType(AngabenZuJugendlichHZEType object) {
				return createAngabenZuJugendlichHZETypeAdapter();
			}
			@Override
			public Adapter caseAngabenZuJugendlichKontaktformularType(AngabenZuJugendlichKontaktformularType object) {
				return createAngabenZuJugendlichKontaktformularTypeAdapter();
			}
			@Override
			public Adapter caseAnliegensklaerungAnfrageType(AnliegensklaerungAnfrageType object) {
				return createAnliegensklaerungAnfrageTypeAdapter();
			}
			@Override
			public Adapter caseAnliegensklaerungType(AnliegensklaerungType object) {
				return createAnliegensklaerungTypeAdapter();
			}
			@Override
			public Adapter caseAntragstellenderETType(AntragstellenderETType object) {
				return createAntragstellenderETTypeAdapter();
			}
			@Override
			public Adapter caseAuswahlBescheidartType(AuswahlBescheidartType object) {
				return createAuswahlBescheidartTypeAdapter();
			}
			@Override
			public Adapter caseBegruendungDesHilfebedarfsType(BegruendungDesHilfebedarfsType object) {
				return createBegruendungDesHilfebedarfsTypeAdapter();
			}
			@Override
			public Adapter caseCodeAufenthaltType(CodeAufenthaltType object) {
				return createCodeAufenthaltTypeAdapter();
			}
			@Override
			public Adapter caseCodeAuswahlDerHilfeHzEType(CodeAuswahlDerHilfeHzEType object) {
				return createCodeAuswahlDerHilfeHzETypeAdapter();
			}
			@Override
			public Adapter caseCodeHZEIchBinType(CodeHZEIchBinType object) {
				return createCodeHZEIchBinTypeAdapter();
			}
			@Override
			public Adapter caseCodeVerhaeltnisJugendlichHZEType(CodeVerhaeltnisJugendlichHZEType object) {
				return createCodeVerhaeltnisJugendlichHZETypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseErreichbarkeitHZEType(ErreichbarkeitHZEType object) {
				return createErreichbarkeitHZETypeAdapter();
			}
			@Override
			public Adapter caseHilfenZurErziehungAnfrageHJV0702Type(HilfenZurErziehungAnfrageHJV0702Type object) {
				return createHilfenZurErziehungAnfrageHJV0702TypeAdapter();
			}
			@Override
			public Adapter caseHilfenZurErziehungAntrag0701Type(HilfenZurErziehungAntrag0701Type object) {
				return createHilfenZurErziehungAntrag0701TypeAdapter();
			}
			@Override
			public Adapter caseHilfenZurErziehungEingliederungshilfe0703Type(HilfenZurErziehungEingliederungshilfe0703Type object) {
				return createHilfenZurErziehungEingliederungshilfe0703TypeAdapter();
			}
			@Override
			public Adapter caseHilfenZurErziehungNachweisnachricht0711Type(HilfenZurErziehungNachweisnachricht0711Type object) {
				return createHilfenZurErziehungNachweisnachricht0711TypeAdapter();
			}
			@Override
			public Adapter caseHilfenZurErziehungWiderspruch0704Type(HilfenZurErziehungWiderspruch0704Type object) {
				return createHilfenZurErziehungWiderspruch0704TypeAdapter();
			}
			@Override
			public Adapter caseNachweiseDatenschutzType(NachweiseDatenschutzType object) {
				return createNachweiseDatenschutzTypeAdapter();
			}
			@Override
			public Adapter caseNachweiseHZEType(NachweiseHZEType object) {
				return createNachweiseHZETypeAdapter();
			}
			@Override
			public Adapter caseNachweisType(NachweisType object) {
				return createNachweisTypeAdapter();
			}
			@Override
			public Adapter casePersoenlicheAngabenEingliederungType(PersoenlicheAngabenEingliederungType object) {
				return createPersoenlicheAngabenEingliederungTypeAdapter();
			}
			@Override
			public Adapter casePersoenlicheAngabenHJVType(PersoenlicheAngabenHJVType object) {
				return createPersoenlicheAngabenHJVTypeAdapter();
			}
			@Override
			public Adapter casePersoenlicheAngabenHZEType(PersoenlicheAngabenHZEType object) {
				return createPersoenlicheAngabenHZETypeAdapter();
			}
			@Override
			public Adapter casePersoenlicheAngabenKontaktformularType(PersoenlicheAngabenKontaktformularType object) {
				return createPersoenlicheAngabenKontaktformularTypeAdapter();
			}
			@Override
			public Adapter casePersonIdentifikationType(PersonIdentifikationType object) {
				return createPersonIdentifikationTypeAdapter();
			}
			@Override
			public Adapter caseCode(Code object) {
				return createCodeAdapter();
			}
			@Override
			public Adapter caseErreichbarkeitType(ErreichbarkeitType object) {
				return createErreichbarkeitTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilEingliederungType <em>Angaben Elternteil Eingliederung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilEingliederungType
	 * @generated
	 */
	public Adapter createAngabenElternteilEingliederungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilHJVType <em>Angaben Elternteil HJV Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilHJVType
	 * @generated
	 */
	public Adapter createAngabenElternteilHJVTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenETType <em>Angaben ET Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenETType
	 * @generated
	 */
	public Adapter createAngabenETTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindEingliederungType <em>Angaben Kind Eingliederung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindEingliederungType
	 * @generated
	 */
	public Adapter createAngabenKindEingliederungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType <em>Angaben Kind HJV Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType
	 * @generated
	 */
	public Adapter createAngabenKindHJVTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHZEType <em>Angaben Kind HZE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHZEType
	 * @generated
	 */
	public Adapter createAngabenKindHZETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichHZEType <em>Angaben Zu Jugendlich HZE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichHZEType
	 * @generated
	 */
	public Adapter createAngabenZuJugendlichHZETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichKontaktformularType <em>Angaben Zu Jugendlich Kontaktformular Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichKontaktformularType
	 * @generated
	 */
	public Adapter createAngabenZuJugendlichKontaktformularTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AnliegensklaerungAnfrageType <em>Anliegensklaerung Anfrage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AnliegensklaerungAnfrageType
	 * @generated
	 */
	public Adapter createAnliegensklaerungAnfrageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AnliegensklaerungType <em>Anliegensklaerung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AnliegensklaerungType
	 * @generated
	 */
	public Adapter createAnliegensklaerungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType <em>Antragstellender ET Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType
	 * @generated
	 */
	public Adapter createAntragstellenderETTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AuswahlBescheidartType <em>Auswahl Bescheidart Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AuswahlBescheidartType
	 * @generated
	 */
	public Adapter createAuswahlBescheidartTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.BegruendungDesHilfebedarfsType <em>Begruendung Des Hilfebedarfs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.BegruendungDesHilfebedarfsType
	 * @generated
	 */
	public Adapter createBegruendungDesHilfebedarfsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.CodeAufenthaltType <em>Code Aufenthalt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.CodeAufenthaltType
	 * @generated
	 */
	public Adapter createCodeAufenthaltTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.CodeAuswahlDerHilfeHzEType <em>Code Auswahl Der Hilfe Hz EType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.CodeAuswahlDerHilfeHzEType
	 * @generated
	 */
	public Adapter createCodeAuswahlDerHilfeHzETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.CodeHZEIchBinType <em>Code HZE Ich Bin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.CodeHZEIchBinType
	 * @generated
	 */
	public Adapter createCodeHZEIchBinTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.CodeVerhaeltnisJugendlichHZEType <em>Code Verhaeltnis Jugendlich HZE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.CodeVerhaeltnisJugendlichHZEType
	 * @generated
	 */
	public Adapter createCodeVerhaeltnisJugendlichHZETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErreichbarkeitHZEType <em>Erreichbarkeit HZE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErreichbarkeitHZEType
	 * @generated
	 */
	public Adapter createErreichbarkeitHZETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type <em>Hilfen Zur Erziehung Anfrage HJV0702 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type
	 * @generated
	 */
	public Adapter createHilfenZurErziehungAnfrageHJV0702TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type <em>Hilfen Zur Erziehung Antrag0701 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type
	 * @generated
	 */
	public Adapter createHilfenZurErziehungAntrag0701TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type <em>Hilfen Zur Erziehung Eingliederungshilfe0703 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type
	 * @generated
	 */
	public Adapter createHilfenZurErziehungEingliederungshilfe0703TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type <em>Hilfen Zur Erziehung Nachweisnachricht0711 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type
	 * @generated
	 */
	public Adapter createHilfenZurErziehungNachweisnachricht0711TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type <em>Hilfen Zur Erziehung Widerspruch0704 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type
	 * @generated
	 */
	public Adapter createHilfenZurErziehungWiderspruch0704TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseDatenschutzType <em>Nachweise Datenschutz Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseDatenschutzType
	 * @generated
	 */
	public Adapter createNachweiseDatenschutzTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType <em>Nachweise HZE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType
	 * @generated
	 */
	public Adapter createNachweiseHZETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweisType <em>Nachweis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweisType
	 * @generated
	 */
	public Adapter createNachweisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType <em>Persoenliche Angaben Eingliederung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType
	 * @generated
	 */
	public Adapter createPersoenlicheAngabenEingliederungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHJVType <em>Persoenliche Angaben HJV Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHJVType
	 * @generated
	 */
	public Adapter createPersoenlicheAngabenHJVTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHZEType <em>Persoenliche Angaben HZE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHZEType
	 * @generated
	 */
	public Adapter createPersoenlicheAngabenHZETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenKontaktformularType <em>Persoenliche Angaben Kontaktformular Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenKontaktformularType
	 * @generated
	 */
	public Adapter createPersoenlicheAngabenKontaktformularTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersonIdentifikationType <em>Person Identifikation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersonIdentifikationType
	 * @generated
	 */
	public Adapter createPersonIdentifikationTypeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType <em>Erreichbarkeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType
	 * @generated
	 */
	public Adapter createErreichbarkeitTypeAdapter() {
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

} //ErziehungshilfeAdapterFactory
