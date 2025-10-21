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
package de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.util;

import de.xoev.schemata.code.code.Code;

import de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType;

import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage
 * @generated
 */
public class MutterschaftsgeldAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MutterschaftsgeldPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MutterschaftsgeldAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MutterschaftsgeldPackage.eINSTANCE;
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
	protected MutterschaftsgeldSwitch<Adapter> modelSwitch =
		new MutterschaftsgeldSwitch<Adapter>() {
			@Override
			public Adapter caseAngabenEntbindungType(AngabenEntbindungType object) {
				return createAngabenEntbindungTypeAdapter();
			}
			@Override
			public Adapter caseAngabenMutterschaftsgeldType(AngabenMutterschaftsgeldType object) {
				return createAngabenMutterschaftsgeldTypeAdapter();
			}
			@Override
			public Adapter caseAntragstellenderElternteilMutterschaftsgeldmeldungRueckType(AntragstellenderElternteilMutterschaftsgeldmeldungRueckType object) {
				return createAntragstellenderElternteilMutterschaftsgeldmeldungRueckTypeAdapter();
			}
			@Override
			public Adapter caseAntragstellenderElternteilMutterschaftsgeldmeldungType(AntragstellenderElternteilMutterschaftsgeldmeldungType object) {
				return createAntragstellenderElternteilMutterschaftsgeldmeldungTypeAdapter();
			}
			@Override
			public Adapter caseCodeKennzeichenMutterschaftsgeldType(CodeKennzeichenMutterschaftsgeldType object) {
				return createCodeKennzeichenMutterschaftsgeldTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseMutterschaftsgeldmeldungAnforderung0501Type(MutterschaftsgeldmeldungAnforderung0501Type object) {
				return createMutterschaftsgeldmeldungAnforderung0501TypeAdapter();
			}
			@Override
			public Adapter caseMutterschaftsgeldmeldungRueckmeldung0502Type(MutterschaftsgeldmeldungRueckmeldung0502Type object) {
				return createMutterschaftsgeldmeldungRueckmeldung0502TypeAdapter();
			}
			@Override
			public Adapter caseStornierungType(StornierungType object) {
				return createStornierungTypeAdapter();
			}
			@Override
			public Adapter caseStornierungType1(StornierungType1 object) {
				return createStornierungType1Adapter();
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
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenEntbindungType <em>Angaben Entbindung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenEntbindungType
	 * @generated
	 */
	public Adapter createAngabenEntbindungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenMutterschaftsgeldType <em>Angaben Mutterschaftsgeld Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenMutterschaftsgeldType
	 * @generated
	 */
	public Adapter createAngabenMutterschaftsgeldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungRueckType <em>Antragstellender Elternteil Mutterschaftsgeldmeldung Rueck Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungRueckType
	 * @generated
	 */
	public Adapter createAntragstellenderElternteilMutterschaftsgeldmeldungRueckTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungType <em>Antragstellender Elternteil Mutterschaftsgeldmeldung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungType
	 * @generated
	 */
	public Adapter createAntragstellenderElternteilMutterschaftsgeldmeldungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.CodeKennzeichenMutterschaftsgeldType <em>Code Kennzeichen Mutterschaftsgeld Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.CodeKennzeichenMutterschaftsgeldType
	 * @generated
	 */
	public Adapter createCodeKennzeichenMutterschaftsgeldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungAnforderung0501Type <em>Mutterschaftsgeldmeldung Anforderung0501 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungAnforderung0501Type
	 * @generated
	 */
	public Adapter createMutterschaftsgeldmeldungAnforderung0501TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungRueckmeldung0502Type <em>Mutterschaftsgeldmeldung Rueckmeldung0502 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungRueckmeldung0502Type
	 * @generated
	 */
	public Adapter createMutterschaftsgeldmeldungRueckmeldung0502TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.StornierungType <em>Stornierung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.StornierungType
	 * @generated
	 */
	public Adapter createStornierungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.StornierungType1 <em>Stornierung Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.StornierungType1
	 * @generated
	 */
	public Adapter createStornierungType1Adapter() {
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

} //MutterschaftsgeldAdapterFactory
