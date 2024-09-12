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
import net.opengis.gml.gml.DirectedFacePropertyType;
import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.NodeOrEdgePropertyType;
import net.opengis.gml.gml.SolidPropertyType;
import net.opengis.gml.gml.TopoSolidType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topo Solid Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.TopoSolidTypeImpl#getIsolated <em>Isolated</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.TopoSolidTypeImpl#getDirectedFace <em>Directed Face</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.TopoSolidTypeImpl#getSolidProperty <em>Solid Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.TopoSolidTypeImpl#getAggregationType <em>Aggregation Type</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.TopoSolidTypeImpl#isUniversal <em>Universal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopoSolidTypeImpl extends AbstractTopoPrimitiveTypeImpl implements TopoSolidType {
	/**
	 * The cached value of the '{@link #getIsolated() <em>Isolated</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolated()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeOrEdgePropertyType> isolated;

	/**
	 * The cached value of the '{@link #getDirectedFace() <em>Directed Face</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectedFace()
	 * @generated
	 * @ordered
	 */
	protected EList<DirectedFacePropertyType> directedFace;

	/**
	 * The cached value of the '{@link #getSolidProperty() <em>Solid Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolidProperty()
	 * @generated
	 * @ordered
	 */
	protected SolidPropertyType solidProperty;

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
	 * The default value of the '{@link #isUniversal() <em>Universal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUniversal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIVERSAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUniversal() <em>Universal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUniversal()
	 * @generated
	 * @ordered
	 */
	protected boolean universal = UNIVERSAL_EDEFAULT;

	/**
	 * This is true if the Universal attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean universalESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopoSolidTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getTopoSolidType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NodeOrEdgePropertyType> getIsolated() {
		if (isolated == null) {
			isolated = new EObjectContainmentEList<NodeOrEdgePropertyType>(NodeOrEdgePropertyType.class, this, GMLPackage.TOPO_SOLID_TYPE__ISOLATED);
		}
		return isolated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DirectedFacePropertyType> getDirectedFace() {
		if (directedFace == null) {
			directedFace = new EObjectContainmentEList<DirectedFacePropertyType>(DirectedFacePropertyType.class, this, GMLPackage.TOPO_SOLID_TYPE__DIRECTED_FACE);
		}
		return directedFace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolidPropertyType getSolidProperty() {
		return solidProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolidProperty(SolidPropertyType newSolidProperty, NotificationChain msgs) {
		SolidPropertyType oldSolidProperty = solidProperty;
		solidProperty = newSolidProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.TOPO_SOLID_TYPE__SOLID_PROPERTY, oldSolidProperty, newSolidProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSolidProperty(SolidPropertyType newSolidProperty) {
		if (newSolidProperty != solidProperty) {
			NotificationChain msgs = null;
			if (solidProperty != null)
				msgs = ((InternalEObject)solidProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TOPO_SOLID_TYPE__SOLID_PROPERTY, null, msgs);
			if (newSolidProperty != null)
				msgs = ((InternalEObject)newSolidProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TOPO_SOLID_TYPE__SOLID_PROPERTY, null, msgs);
			msgs = basicSetSolidProperty(newSolidProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TOPO_SOLID_TYPE__SOLID_PROPERTY, newSolidProperty, newSolidProperty));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TOPO_SOLID_TYPE__AGGREGATION_TYPE, oldAggregationType, aggregationType, !oldAggregationTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.TOPO_SOLID_TYPE__AGGREGATION_TYPE, oldAggregationType, AGGREGATION_TYPE_EDEFAULT, oldAggregationTypeESet));
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
	public boolean isUniversal() {
		return universal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUniversal(boolean newUniversal) {
		boolean oldUniversal = universal;
		universal = newUniversal;
		boolean oldUniversalESet = universalESet;
		universalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TOPO_SOLID_TYPE__UNIVERSAL, oldUniversal, universal, !oldUniversalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetUniversal() {
		boolean oldUniversal = universal;
		boolean oldUniversalESet = universalESet;
		universal = UNIVERSAL_EDEFAULT;
		universalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.TOPO_SOLID_TYPE__UNIVERSAL, oldUniversal, UNIVERSAL_EDEFAULT, oldUniversalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetUniversal() {
		return universalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.TOPO_SOLID_TYPE__ISOLATED:
				return ((InternalEList<?>)getIsolated()).basicRemove(otherEnd, msgs);
			case GMLPackage.TOPO_SOLID_TYPE__DIRECTED_FACE:
				return ((InternalEList<?>)getDirectedFace()).basicRemove(otherEnd, msgs);
			case GMLPackage.TOPO_SOLID_TYPE__SOLID_PROPERTY:
				return basicSetSolidProperty(null, msgs);
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
			case GMLPackage.TOPO_SOLID_TYPE__ISOLATED:
				return getIsolated();
			case GMLPackage.TOPO_SOLID_TYPE__DIRECTED_FACE:
				return getDirectedFace();
			case GMLPackage.TOPO_SOLID_TYPE__SOLID_PROPERTY:
				return getSolidProperty();
			case GMLPackage.TOPO_SOLID_TYPE__AGGREGATION_TYPE:
				return getAggregationType();
			case GMLPackage.TOPO_SOLID_TYPE__UNIVERSAL:
				return isUniversal();
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
			case GMLPackage.TOPO_SOLID_TYPE__ISOLATED:
				getIsolated().clear();
				getIsolated().addAll((Collection<? extends NodeOrEdgePropertyType>)newValue);
				return;
			case GMLPackage.TOPO_SOLID_TYPE__DIRECTED_FACE:
				getDirectedFace().clear();
				getDirectedFace().addAll((Collection<? extends DirectedFacePropertyType>)newValue);
				return;
			case GMLPackage.TOPO_SOLID_TYPE__SOLID_PROPERTY:
				setSolidProperty((SolidPropertyType)newValue);
				return;
			case GMLPackage.TOPO_SOLID_TYPE__AGGREGATION_TYPE:
				setAggregationType((AggregationType)newValue);
				return;
			case GMLPackage.TOPO_SOLID_TYPE__UNIVERSAL:
				setUniversal((Boolean)newValue);
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
			case GMLPackage.TOPO_SOLID_TYPE__ISOLATED:
				getIsolated().clear();
				return;
			case GMLPackage.TOPO_SOLID_TYPE__DIRECTED_FACE:
				getDirectedFace().clear();
				return;
			case GMLPackage.TOPO_SOLID_TYPE__SOLID_PROPERTY:
				setSolidProperty((SolidPropertyType)null);
				return;
			case GMLPackage.TOPO_SOLID_TYPE__AGGREGATION_TYPE:
				unsetAggregationType();
				return;
			case GMLPackage.TOPO_SOLID_TYPE__UNIVERSAL:
				unsetUniversal();
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
			case GMLPackage.TOPO_SOLID_TYPE__ISOLATED:
				return isolated != null && !isolated.isEmpty();
			case GMLPackage.TOPO_SOLID_TYPE__DIRECTED_FACE:
				return directedFace != null && !directedFace.isEmpty();
			case GMLPackage.TOPO_SOLID_TYPE__SOLID_PROPERTY:
				return solidProperty != null;
			case GMLPackage.TOPO_SOLID_TYPE__AGGREGATION_TYPE:
				return isSetAggregationType();
			case GMLPackage.TOPO_SOLID_TYPE__UNIVERSAL:
				return isSetUniversal();
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
		result.append(" (aggregationType: ");
		if (aggregationTypeESet) result.append(aggregationType); else result.append("<unset>");
		result.append(", universal: ");
		if (universalESet) result.append(universal); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TopoSolidTypeImpl
