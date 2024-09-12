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

import net.opengis.gml.gml.AbstractCoordinateOperationType;
import net.opengis.gml.gml.AggregationType;
import net.opengis.gml.gml.ConcatenatedOperationType;
import net.opengis.gml.gml.GMLPackage;

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
 * An implementation of the model object '<em><b>Concatenated Operation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.ConcatenatedOperationTypeImpl#getCoordOperationGroup <em>Coord Operation Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ConcatenatedOperationTypeImpl#getCoordOperation <em>Coord Operation</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ConcatenatedOperationTypeImpl#getAggregationType <em>Aggregation Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcatenatedOperationTypeImpl extends AbstractCoordinateOperationTypeImpl implements ConcatenatedOperationType {
	/**
	 * The cached value of the '{@link #getCoordOperationGroup() <em>Coord Operation Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordOperationGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap coordOperationGroup;

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
	protected ConcatenatedOperationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getConcatenatedOperationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getCoordOperationGroup() {
		if (coordOperationGroup == null) {
			coordOperationGroup = new BasicFeatureMap(this, GMLPackage.CONCATENATED_OPERATION_TYPE__COORD_OPERATION_GROUP);
		}
		return coordOperationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractCoordinateOperationType> getCoordOperation() {
		return getCoordOperationGroup().list(GMLPackage.eINSTANCE.getConcatenatedOperationType_CoordOperation());
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.CONCATENATED_OPERATION_TYPE__AGGREGATION_TYPE, oldAggregationType, aggregationType, !oldAggregationTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.CONCATENATED_OPERATION_TYPE__AGGREGATION_TYPE, oldAggregationType, AGGREGATION_TYPE_EDEFAULT, oldAggregationTypeESet));
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
			case GMLPackage.CONCATENATED_OPERATION_TYPE__COORD_OPERATION_GROUP:
				return ((InternalEList<?>)getCoordOperationGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.CONCATENATED_OPERATION_TYPE__COORD_OPERATION:
				return ((InternalEList<?>)getCoordOperation()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.CONCATENATED_OPERATION_TYPE__COORD_OPERATION_GROUP:
				if (coreType) return getCoordOperationGroup();
				return ((FeatureMap.Internal)getCoordOperationGroup()).getWrapper();
			case GMLPackage.CONCATENATED_OPERATION_TYPE__COORD_OPERATION:
				return getCoordOperation();
			case GMLPackage.CONCATENATED_OPERATION_TYPE__AGGREGATION_TYPE:
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
			case GMLPackage.CONCATENATED_OPERATION_TYPE__COORD_OPERATION_GROUP:
				((FeatureMap.Internal)getCoordOperationGroup()).set(newValue);
				return;
			case GMLPackage.CONCATENATED_OPERATION_TYPE__COORD_OPERATION:
				getCoordOperation().clear();
				getCoordOperation().addAll((Collection<? extends AbstractCoordinateOperationType>)newValue);
				return;
			case GMLPackage.CONCATENATED_OPERATION_TYPE__AGGREGATION_TYPE:
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
			case GMLPackage.CONCATENATED_OPERATION_TYPE__COORD_OPERATION_GROUP:
				getCoordOperationGroup().clear();
				return;
			case GMLPackage.CONCATENATED_OPERATION_TYPE__COORD_OPERATION:
				getCoordOperation().clear();
				return;
			case GMLPackage.CONCATENATED_OPERATION_TYPE__AGGREGATION_TYPE:
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
			case GMLPackage.CONCATENATED_OPERATION_TYPE__COORD_OPERATION_GROUP:
				return coordOperationGroup != null && !coordOperationGroup.isEmpty();
			case GMLPackage.CONCATENATED_OPERATION_TYPE__COORD_OPERATION:
				return !getCoordOperation().isEmpty();
			case GMLPackage.CONCATENATED_OPERATION_TYPE__AGGREGATION_TYPE:
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
		result.append(" (coordOperationGroup: ");
		result.append(coordOperationGroup);
		result.append(", aggregationType: ");
		if (aggregationTypeESet) result.append(aggregationType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ConcatenatedOperationTypeImpl
