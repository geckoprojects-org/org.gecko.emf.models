/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package org.emau.icmvc.ganimed.ttp.cm2.config.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.emau.icmvc.ganimed.ttp.cm2.config.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage
 * @generated
 */
public class ConfigAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConfigPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ConfigPackage.eINSTANCE;
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
	protected ConfigSwitch<Adapter> modelSwitch =
		new ConfigSwitch<Adapter>() {
			@Override
			public Adapter caseApplicationConfig(ApplicationConfig object) {
				return createApplicationConfigAdapter();
			}
			@Override
			public Adapter caseCheckConsentConfig(CheckConsentConfig object) {
				return createCheckConsentConfigAdapter();
			}
			@Override
			public Adapter caseDomainConfig(DomainConfig object) {
				return createDomainConfigAdapter();
			}
			@Override
			public Adapter caseEntryType(EntryType object) {
				return createEntryTypeAdapter();
			}
			@Override
			public Adapter caseFilterType(FilterType object) {
				return createFilterTypeAdapter();
			}
			@Override
			public Adapter caseNotificationsConfig(NotificationsConfig object) {
				return createNotificationsConfigAdapter();
			}
			@Override
			public Adapter casePaginationConfig(PaginationConfig object) {
				return createPaginationConfigAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter casePoliciesConfig(PoliciesConfig object) {
				return createPoliciesConfigAdapter();
			}
			@Override
			public Adapter caseQualityControlConfig(QualityControlConfig object) {
				return createQualityControlConfigAdapter();
			}
			@Override
			public Adapter caseScansConfig(ScansConfig object) {
				return createScansConfigAdapter();
			}
			@Override
			public Adapter caseStatisticConfig(StatisticConfig object) {
				return createStatisticConfigAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.config.ApplicationConfig <em>Application Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ApplicationConfig
	 * @generated
	 */
	public Adapter createApplicationConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig <em>Check Consent Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig
	 * @generated
	 */
	public Adapter createCheckConsentConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig <em>Domain Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig
	 * @generated
	 */
	public Adapter createDomainConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.config.EntryType <em>Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.EntryType
	 * @generated
	 */
	public Adapter createEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.config.FilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.FilterType
	 * @generated
	 */
	public Adapter createFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.config.NotificationsConfig <em>Notifications Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.NotificationsConfig
	 * @generated
	 */
	public Adapter createNotificationsConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig <em>Pagination Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig
	 * @generated
	 */
	public Adapter createPaginationConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.config.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PoliciesConfig <em>Policies Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.PoliciesConfig
	 * @generated
	 */
	public Adapter createPoliciesConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.config.QualityControlConfig <em>Quality Control Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.QualityControlConfig
	 * @generated
	 */
	public Adapter createQualityControlConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.config.ScansConfig <em>Scans Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ScansConfig
	 * @generated
	 */
	public Adapter createScansConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.config.StatisticConfig <em>Statistic Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.StatisticConfig
	 * @generated
	 */
	public Adapter createStatisticConfigAdapter() {
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

} //ConfigAdapterFactory
