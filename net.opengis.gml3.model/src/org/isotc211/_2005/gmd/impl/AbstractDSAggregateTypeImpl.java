/*
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
package org.isotc211._2005.gmd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.AbstractDSAggregateType;
import org.isotc211._2005.gmd.DSAggregatePropertyType;
import org.isotc211._2005.gmd.DSDataSetPropertyType;
import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDMetadataPropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract DS Aggregate Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.AbstractDSAggregateTypeImpl#getComposedOf <em>Composed Of</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.AbstractDSAggregateTypeImpl#getSeriesMetadata <em>Series Metadata</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.AbstractDSAggregateTypeImpl#getSubset <em>Subset</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.AbstractDSAggregateTypeImpl#getSuperset <em>Superset</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractDSAggregateTypeImpl extends AbstractObjectTypeImpl implements AbstractDSAggregateType {
	/**
	 * The cached value of the '{@link #getComposedOf() <em>Composed Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposedOf()
	 * @generated
	 * @ordered
	 */
	protected EList<DSDataSetPropertyType> composedOf;

	/**
	 * The cached value of the '{@link #getSeriesMetadata() <em>Series Metadata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList<MDMetadataPropertyType> seriesMetadata;

	/**
	 * The cached value of the '{@link #getSubset() <em>Subset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubset()
	 * @generated
	 * @ordered
	 */
	protected EList<DSAggregatePropertyType> subset;

	/**
	 * The cached value of the '{@link #getSuperset() <em>Superset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperset()
	 * @generated
	 * @ordered
	 */
	protected EList<DSAggregatePropertyType> superset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractDSAggregateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getAbstractDSAggregateType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DSDataSetPropertyType> getComposedOf() {
		if (composedOf == null) {
			composedOf = new EObjectContainmentEList<DSDataSetPropertyType>(DSDataSetPropertyType.class, this, GMDPackage.ABSTRACT_DS_AGGREGATE_TYPE__COMPOSED_OF);
		}
		return composedOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDMetadataPropertyType> getSeriesMetadata() {
		if (seriesMetadata == null) {
			seriesMetadata = new EObjectContainmentEList<MDMetadataPropertyType>(MDMetadataPropertyType.class, this, GMDPackage.ABSTRACT_DS_AGGREGATE_TYPE__SERIES_METADATA);
		}
		return seriesMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DSAggregatePropertyType> getSubset() {
		if (subset == null) {
			subset = new EObjectContainmentEList<DSAggregatePropertyType>(DSAggregatePropertyType.class, this, GMDPackage.ABSTRACT_DS_AGGREGATE_TYPE__SUBSET);
		}
		return subset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DSAggregatePropertyType> getSuperset() {
		if (superset == null) {
			superset = new EObjectContainmentEList<DSAggregatePropertyType>(DSAggregatePropertyType.class, this, GMDPackage.ABSTRACT_DS_AGGREGATE_TYPE__SUPERSET);
		}
		return superset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.ABSTRACT_DS_AGGREGATE_TYPE__COMPOSED_OF:
				return ((InternalEList<?>)getComposedOf()).basicRemove(otherEnd, msgs);
			case GMDPackage.ABSTRACT_DS_AGGREGATE_TYPE__SERIES_METADATA:
				return ((InternalEList<?>)getSeriesMetadata()).basicRemove(otherEnd, msgs);
			case GMDPackage.ABSTRACT_DS_AGGREGATE_TYPE__SUBSET:
				return ((InternalEList<?>)getSubset()).basicRemove(otherEnd, msgs);
			case GMDPackage.ABSTRACT_DS_AGGREGATE_TYPE__SUPERSET:
				return ((InternalEList<?>)getSuperset()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMDPackage.ABSTRACT_DS_AGGREGATE_TYPE__COMPOSED_OF:
				return getComposedOf();
			case GMDPackage.ABSTRACT_DS_AGGREGATE_TYPE__SERIES_METADATA:
				return getSeriesMetadata();
			case GMDPackage.ABSTRACT_DS_AGGREGATE_TYPE__SUBSET:
				return getSubset();
			case GMDPackage.ABSTRACT_DS_AGGREGATE_TYPE__SUPERSET:
				return getSuperset();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMDPackage.ABSTRACT_DS_AGGREGATE_TYPE__COMPOSED_OF:
				getComposedOf().clear();
				getComposedOf().addAll((Collection<? extends DSDataSetPropertyType>)newValue);
				return;
			case GMDPackage.ABSTRACT_DS_AGGREGATE_TYPE__SERIES_METADATA:
				getSeriesMetadata().clear();
				getSeriesMetadata().addAll((Collection<? extends MDMetadataPropertyType>)newValue);
				return;
			case GMDPackage.ABSTRACT_DS_AGGREGATE_TYPE__SUBSET:
				getSubset().clear();
				getSubset().addAll((Collection<? extends DSAggregatePropertyType>)newValue);
				return;
			case GMDPackage.ABSTRACT_DS_AGGREGATE_TYPE__SUPERSET:
				getSuperset().clear();
				getSuperset().addAll((Collection<? extends DSAggregatePropertyType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GMDPackage.ABSTRACT_DS_AGGREGATE_TYPE__COMPOSED_OF:
				getComposedOf().clear();
				return;
			case GMDPackage.ABSTRACT_DS_AGGREGATE_TYPE__SERIES_METADATA:
				getSeriesMetadata().clear();
				return;
			case GMDPackage.ABSTRACT_DS_AGGREGATE_TYPE__SUBSET:
				getSubset().clear();
				return;
			case GMDPackage.ABSTRACT_DS_AGGREGATE_TYPE__SUPERSET:
				getSuperset().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GMDPackage.ABSTRACT_DS_AGGREGATE_TYPE__COMPOSED_OF:
				return composedOf != null && !composedOf.isEmpty();
			case GMDPackage.ABSTRACT_DS_AGGREGATE_TYPE__SERIES_METADATA:
				return seriesMetadata != null && !seriesMetadata.isEmpty();
			case GMDPackage.ABSTRACT_DS_AGGREGATE_TYPE__SUBSET:
				return subset != null && !subset.isEmpty();
			case GMDPackage.ABSTRACT_DS_AGGREGATE_TYPE__SUPERSET:
				return superset != null && !superset.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractDSAggregateTypeImpl
