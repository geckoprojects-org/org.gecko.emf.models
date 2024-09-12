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
package net.opengis.gml.gml.impl;

import java.util.Collection;

import net.opengis.gml.gml.AggregationType;
import net.opengis.gml.gml.CompoundCRSType;
import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.SingleCRSPropertyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compound CRS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.CompoundCRSTypeImpl#getComponentReferenceSystemGroup <em>Component Reference System Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.CompoundCRSTypeImpl#getComponentReferenceSystem <em>Component Reference System</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.CompoundCRSTypeImpl#getAggregationType <em>Aggregation Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompoundCRSTypeImpl extends AbstractCRSTypeImpl implements CompoundCRSType {
	/**
	 * The cached value of the '{@link #getComponentReferenceSystemGroup() <em>Component Reference System Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentReferenceSystemGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap componentReferenceSystemGroup;

	/**
	 * The default value of the '{@link #getAggregationType() <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationType()
	 * @generated
	 * @ordered
	 */
	protected static final AggregationType AGGREGATION_TYPE_EDEFAULT = AggregationType.SET;

	/**
	 * The cached value of the '{@link #getAggregationType() <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationType()
	 * @generated
	 * @ordered
	 */
	protected AggregationType aggregationType = AGGREGATION_TYPE_EDEFAULT;

	/**
	 * This is true if the Aggregation Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aggregationTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompoundCRSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getCompoundCRSType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getComponentReferenceSystemGroup() {
		if (componentReferenceSystemGroup == null) {
			componentReferenceSystemGroup = new BasicFeatureMap(this, GMLPackage.COMPOUND_CRS_TYPE__COMPONENT_REFERENCE_SYSTEM_GROUP);
		}
		return componentReferenceSystemGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SingleCRSPropertyType> getComponentReferenceSystem() {
		return getComponentReferenceSystemGroup().list(GMLPackage.eINSTANCE.getCompoundCRSType_ComponentReferenceSystem());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AggregationType getAggregationType() {
		return aggregationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregationType(AggregationType newAggregationType) {
		AggregationType oldAggregationType = aggregationType;
		aggregationType = newAggregationType == null ? AGGREGATION_TYPE_EDEFAULT : newAggregationType;
		boolean oldAggregationTypeESet = aggregationTypeESet;
		aggregationTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.COMPOUND_CRS_TYPE__AGGREGATION_TYPE, oldAggregationType, aggregationType, !oldAggregationTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAggregationType() {
		AggregationType oldAggregationType = aggregationType;
		boolean oldAggregationTypeESet = aggregationTypeESet;
		aggregationType = AGGREGATION_TYPE_EDEFAULT;
		aggregationTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.COMPOUND_CRS_TYPE__AGGREGATION_TYPE, oldAggregationType, AGGREGATION_TYPE_EDEFAULT, oldAggregationTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAggregationType() {
		return aggregationTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.COMPOUND_CRS_TYPE__COMPONENT_REFERENCE_SYSTEM_GROUP:
				return ((InternalEList<?>)getComponentReferenceSystemGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.COMPOUND_CRS_TYPE__COMPONENT_REFERENCE_SYSTEM:
				return ((InternalEList<?>)getComponentReferenceSystem()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.COMPOUND_CRS_TYPE__COMPONENT_REFERENCE_SYSTEM_GROUP:
				if (coreType) return getComponentReferenceSystemGroup();
				return ((FeatureMap.Internal)getComponentReferenceSystemGroup()).getWrapper();
			case GMLPackage.COMPOUND_CRS_TYPE__COMPONENT_REFERENCE_SYSTEM:
				return getComponentReferenceSystem();
			case GMLPackage.COMPOUND_CRS_TYPE__AGGREGATION_TYPE:
				return getAggregationType();
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
			case GMLPackage.COMPOUND_CRS_TYPE__COMPONENT_REFERENCE_SYSTEM_GROUP:
				((FeatureMap.Internal)getComponentReferenceSystemGroup()).set(newValue);
				return;
			case GMLPackage.COMPOUND_CRS_TYPE__COMPONENT_REFERENCE_SYSTEM:
				getComponentReferenceSystem().clear();
				getComponentReferenceSystem().addAll((Collection<? extends SingleCRSPropertyType>)newValue);
				return;
			case GMLPackage.COMPOUND_CRS_TYPE__AGGREGATION_TYPE:
				setAggregationType((AggregationType)newValue);
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
			case GMLPackage.COMPOUND_CRS_TYPE__COMPONENT_REFERENCE_SYSTEM_GROUP:
				getComponentReferenceSystemGroup().clear();
				return;
			case GMLPackage.COMPOUND_CRS_TYPE__COMPONENT_REFERENCE_SYSTEM:
				getComponentReferenceSystem().clear();
				return;
			case GMLPackage.COMPOUND_CRS_TYPE__AGGREGATION_TYPE:
				unsetAggregationType();
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
			case GMLPackage.COMPOUND_CRS_TYPE__COMPONENT_REFERENCE_SYSTEM_GROUP:
				return componentReferenceSystemGroup != null && !componentReferenceSystemGroup.isEmpty();
			case GMLPackage.COMPOUND_CRS_TYPE__COMPONENT_REFERENCE_SYSTEM:
				return !getComponentReferenceSystem().isEmpty();
			case GMLPackage.COMPOUND_CRS_TYPE__AGGREGATION_TYPE:
				return isSetAggregationType();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (componentReferenceSystemGroup: ");
		result.append(componentReferenceSystemGroup);
		result.append(", aggregationType: ");
		if (aggregationTypeESet) result.append(aggregationType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CompoundCRSTypeImpl
