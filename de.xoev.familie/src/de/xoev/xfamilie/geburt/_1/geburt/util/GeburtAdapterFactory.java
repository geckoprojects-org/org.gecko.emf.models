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
package de.xoev.xfamilie.geburt._1.geburt.util;

import de.xoev.schemata.code.code.Code;

import de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType;

import de.xoev.xfamilie.geburt._1.geburt.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage
 * @generated
 */
public class GeburtAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GeburtPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeburtAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GeburtPackage.eINSTANCE;
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
	protected GeburtSwitch<Adapter> modelSwitch =
		new GeburtSwitch<Adapter>() {
			@Override
			public Adapter caseAngabenGesetzlicherVertreterElternteilType(AngabenGesetzlicherVertreterElternteilType object) {
				return createAngabenGesetzlicherVertreterElternteilTypeAdapter();
			}
			@Override
			public Adapter caseAngabenZumElternteil1Type(AngabenZumElternteil1Type object) {
				return createAngabenZumElternteil1TypeAdapter();
			}
			@Override
			public Adapter caseAngabenZumElternteil2Type(AngabenZumElternteil2Type object) {
				return createAngabenZumElternteil2TypeAdapter();
			}
			@Override
			public Adapter caseAngabenZumKindType(AngabenZumKindType object) {
				return createAngabenZumKindTypeAdapter();
			}
			@Override
			public Adapter caseCodeAlleinsorgeEintragungType(CodeAlleinsorgeEintragungType object) {
				return createCodeAlleinsorgeEintragungTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEintragungNachweisregisterType(EintragungNachweisregisterType object) {
				return createEintragungNachweisregisterTypeAdapter();
			}
			@Override
			public Adapter caseNachgeburtlicheAngabenZumKindType(NachgeburtlicheAngabenZumKindType object) {
				return createNachgeburtlicheAngabenZumKindTypeAdapter();
			}
			@Override
			public Adapter caseSorgeAlleinsorgeAntrag0801Type(SorgeAlleinsorgeAntrag0801Type object) {
				return createSorgeAlleinsorgeAntrag0801TypeAdapter();
			}
			@Override
			public Adapter caseSorgeAlleinsorgeAuskunft0803Type(SorgeAlleinsorgeAuskunft0803Type object) {
				return createSorgeAlleinsorgeAuskunft0803TypeAdapter();
			}
			@Override
			public Adapter caseSorgeErklaerungVorbeitung0802Type(SorgeErklaerungVorbeitung0802Type object) {
				return createSorgeErklaerungVorbeitung0802TypeAdapter();
			}
			@Override
			public Adapter caseSorgeNachweisregisterEintragung0804Type(SorgeNachweisregisterEintragung0804Type object) {
				return createSorgeNachweisregisterEintragung0804TypeAdapter();
			}
			@Override
			public Adapter caseSorgeNachweisregisterKorrektur0805Type(SorgeNachweisregisterKorrektur0805Type object) {
				return createSorgeNachweisregisterKorrektur0805TypeAdapter();
			}
			@Override
			public Adapter caseSorgeNachweisregisterLoeschung0806Type(SorgeNachweisregisterLoeschung0806Type object) {
				return createSorgeNachweisregisterLoeschung0806TypeAdapter();
			}
			@Override
			public Adapter caseZusatzangabenType(ZusatzangabenType object) {
				return createZusatzangabenTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenGesetzlicherVertreterElternteilType <em>Angaben Gesetzlicher Vertreter Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenGesetzlicherVertreterElternteilType
	 * @generated
	 */
	public Adapter createAngabenGesetzlicherVertreterElternteilTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type <em>Angaben Zum Elternteil1 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type
	 * @generated
	 */
	public Adapter createAngabenZumElternteil1TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil2Type <em>Angaben Zum Elternteil2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil2Type
	 * @generated
	 */
	public Adapter createAngabenZumElternteil2TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumKindType <em>Angaben Zum Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenZumKindType
	 * @generated
	 */
	public Adapter createAngabenZumKindTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.geburt._1.geburt.CodeAlleinsorgeEintragungType <em>Code Alleinsorge Eintragung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.geburt._1.geburt.CodeAlleinsorgeEintragungType
	 * @generated
	 */
	public Adapter createCodeAlleinsorgeEintragungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.geburt._1.geburt.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.geburt._1.geburt.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.geburt._1.geburt.EintragungNachweisregisterType <em>Eintragung Nachweisregister Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.geburt._1.geburt.EintragungNachweisregisterType
	 * @generated
	 */
	public Adapter createEintragungNachweisregisterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType <em>Nachgeburtliche Angaben Zum Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType
	 * @generated
	 */
	public Adapter createNachgeburtlicheAngabenZumKindTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAntrag0801Type <em>Sorge Alleinsorge Antrag0801 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAntrag0801Type
	 * @generated
	 */
	public Adapter createSorgeAlleinsorgeAntrag0801TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAuskunft0803Type <em>Sorge Alleinsorge Auskunft0803 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAuskunft0803Type
	 * @generated
	 */
	public Adapter createSorgeAlleinsorgeAuskunft0803TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeErklaerungVorbeitung0802Type <em>Sorge Erklaerung Vorbeitung0802 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeErklaerungVorbeitung0802Type
	 * @generated
	 */
	public Adapter createSorgeErklaerungVorbeitung0802TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterEintragung0804Type <em>Sorge Nachweisregister Eintragung0804 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterEintragung0804Type
	 * @generated
	 */
	public Adapter createSorgeNachweisregisterEintragung0804TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterKorrektur0805Type <em>Sorge Nachweisregister Korrektur0805 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterKorrektur0805Type
	 * @generated
	 */
	public Adapter createSorgeNachweisregisterKorrektur0805TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterLoeschung0806Type <em>Sorge Nachweisregister Loeschung0806 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterLoeschung0806Type
	 * @generated
	 */
	public Adapter createSorgeNachweisregisterLoeschung0806TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType <em>Zusatzangaben Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType
	 * @generated
	 */
	public Adapter createZusatzangabenTypeAdapter() {
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

} //GeburtAdapterFactory
