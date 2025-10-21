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
package basisnachricht.util;

import basisnachricht.*;

import code.Code;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see basisnachricht.BasisnachrichtPackage
 * @generated
 */
public class BasisnachrichtAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BasisnachrichtPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisnachrichtAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BasisnachrichtPackage.eINSTANCE;
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
	protected BasisnachrichtSwitch<Adapter> modelSwitch =
		new BasisnachrichtSwitch<Adapter>() {
			@Override
			public Adapter caseBehoerdeType(BehoerdeType object) {
				return createBehoerdeTypeAdapter();
			}
			@Override
			public Adapter caseCodeKommunikationKanalType(CodeKommunikationKanalType object) {
				return createCodeKommunikationKanalTypeAdapter();
			}
			@Override
			public Adapter caseCodeVerzeichnisdienstType(CodeVerzeichnisdienstType object) {
				return createCodeVerzeichnisdienstTypeAdapter();
			}
			@Override
			public Adapter caseIdentifikationNachrichtType(IdentifikationNachrichtType object) {
				return createIdentifikationNachrichtTypeAdapter();
			}
			@Override
			public Adapter caseKommunikationType(KommunikationType object) {
				return createKommunikationTypeAdapter();
			}
			@Override
			public Adapter caseNachrichtenkopfG2GType(NachrichtenkopfG2GType object) {
				return createNachrichtenkopfG2GTypeAdapter();
			}
			@Override
			public Adapter caseNachrichtG2GType(NachrichtG2GType object) {
				return createNachrichtG2GTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link basisnachricht.BehoerdeType <em>Behoerde Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see basisnachricht.BehoerdeType
	 * @generated
	 */
	public Adapter createBehoerdeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link basisnachricht.CodeKommunikationKanalType <em>Code Kommunikation Kanal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see basisnachricht.CodeKommunikationKanalType
	 * @generated
	 */
	public Adapter createCodeKommunikationKanalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link basisnachricht.CodeVerzeichnisdienstType <em>Code Verzeichnisdienst Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see basisnachricht.CodeVerzeichnisdienstType
	 * @generated
	 */
	public Adapter createCodeVerzeichnisdienstTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link basisnachricht.IdentifikationNachrichtType <em>Identifikation Nachricht Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see basisnachricht.IdentifikationNachrichtType
	 * @generated
	 */
	public Adapter createIdentifikationNachrichtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link basisnachricht.KommunikationType <em>Kommunikation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see basisnachricht.KommunikationType
	 * @generated
	 */
	public Adapter createKommunikationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link basisnachricht.NachrichtenkopfG2GType <em>Nachrichtenkopf G2G Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see basisnachricht.NachrichtenkopfG2GType
	 * @generated
	 */
	public Adapter createNachrichtenkopfG2GTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link basisnachricht.NachrichtG2GType <em>Nachricht G2G Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see basisnachricht.NachrichtG2GType
	 * @generated
	 */
	public Adapter createNachrichtG2GTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link code.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see code.Code
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

} //BasisnachrichtAdapterFactory
