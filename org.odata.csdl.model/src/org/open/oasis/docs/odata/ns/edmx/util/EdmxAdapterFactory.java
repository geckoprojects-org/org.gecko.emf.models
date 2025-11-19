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
package org.open.oasis.docs.odata.ns.edmx.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.open.oasis.docs.odata.ns.edmx.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.open.oasis.docs.odata.ns.edmx.EdmxPackage
 * @generated
 */
public class EdmxAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EdmxPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdmxAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EdmxPackage.eINSTANCE;
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
	protected EdmxSwitch<Adapter> modelSwitch =
		new EdmxSwitch<Adapter>() {
			@Override
			public Adapter caseEdmxRoot(EdmxRoot object) {
				return createEdmxRootAdapter();
			}
			@Override
			public Adapter caseTDataServices(TDataServices object) {
				return createTDataServicesAdapter();
			}
			@Override
			public Adapter caseTEdmx(TEdmx object) {
				return createTEdmxAdapter();
			}
			@Override
			public Adapter caseTInclude(TInclude object) {
				return createTIncludeAdapter();
			}
			@Override
			public Adapter caseTIncludeAnnotations(TIncludeAnnotations object) {
				return createTIncludeAnnotationsAdapter();
			}
			@Override
			public Adapter caseTReference(TReference object) {
				return createTReferenceAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edmx.EdmxRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edmx.EdmxRoot
	 * @generated
	 */
	public Adapter createEdmxRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edmx.TDataServices <em>TData Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edmx.TDataServices
	 * @generated
	 */
	public Adapter createTDataServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edmx.TEdmx <em>TEdmx</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edmx.TEdmx
	 * @generated
	 */
	public Adapter createTEdmxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edmx.TInclude <em>TInclude</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edmx.TInclude
	 * @generated
	 */
	public Adapter createTIncludeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edmx.TIncludeAnnotations <em>TInclude Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edmx.TIncludeAnnotations
	 * @generated
	 */
	public Adapter createTIncludeAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edmx.TReference <em>TReference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edmx.TReference
	 * @generated
	 */
	public Adapter createTReferenceAdapter() {
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

} //EdmxAdapterFactory
