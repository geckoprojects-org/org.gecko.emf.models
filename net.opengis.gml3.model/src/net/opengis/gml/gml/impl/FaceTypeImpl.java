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
import net.opengis.gml.gml.DirectedEdgePropertyType;
import net.opengis.gml.gml.DirectedTopoSolidPropertyType;
import net.opengis.gml.gml.FaceType;
import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.NodePropertyType;
import net.opengis.gml.gml.SurfacePropertyType;

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
 * An implementation of the model object '<em><b>Face Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.FaceTypeImpl#getIsolated <em>Isolated</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.FaceTypeImpl#getDirectedEdge <em>Directed Edge</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.FaceTypeImpl#getDirectedTopoSolid <em>Directed Topo Solid</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.FaceTypeImpl#getSurfaceProperty <em>Surface Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.FaceTypeImpl#getAggregationType <em>Aggregation Type</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.FaceTypeImpl#isUniversal <em>Universal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FaceTypeImpl extends AbstractTopoPrimitiveTypeImpl implements FaceType {
	/**
	 * The cached value of the '{@link #getIsolated() <em>Isolated</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolated()
	 * @generated
	 * @ordered
	 */
	protected EList<NodePropertyType> isolated;

	/**
	 * The cached value of the '{@link #getDirectedEdge() <em>Directed Edge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectedEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<DirectedEdgePropertyType> directedEdge;

	/**
	 * The cached value of the '{@link #getDirectedTopoSolid() <em>Directed Topo Solid</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectedTopoSolid()
	 * @generated
	 * @ordered
	 */
	protected EList<DirectedTopoSolidPropertyType> directedTopoSolid;

	/**
	 * The cached value of the '{@link #getSurfaceProperty() <em>Surface Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurfaceProperty()
	 * @generated
	 * @ordered
	 */
	protected SurfacePropertyType surfaceProperty;

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
	protected FaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getFaceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NodePropertyType> getIsolated() {
		if (isolated == null) {
			isolated = new EObjectContainmentEList<NodePropertyType>(NodePropertyType.class, this, GMLPackage.FACE_TYPE__ISOLATED);
		}
		return isolated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DirectedEdgePropertyType> getDirectedEdge() {
		if (directedEdge == null) {
			directedEdge = new EObjectContainmentEList<DirectedEdgePropertyType>(DirectedEdgePropertyType.class, this, GMLPackage.FACE_TYPE__DIRECTED_EDGE);
		}
		return directedEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DirectedTopoSolidPropertyType> getDirectedTopoSolid() {
		if (directedTopoSolid == null) {
			directedTopoSolid = new EObjectContainmentEList<DirectedTopoSolidPropertyType>(DirectedTopoSolidPropertyType.class, this, GMLPackage.FACE_TYPE__DIRECTED_TOPO_SOLID);
		}
		return directedTopoSolid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurfacePropertyType getSurfaceProperty() {
		return surfaceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSurfaceProperty(SurfacePropertyType newSurfaceProperty, NotificationChain msgs) {
		SurfacePropertyType oldSurfaceProperty = surfaceProperty;
		surfaceProperty = newSurfaceProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.FACE_TYPE__SURFACE_PROPERTY, oldSurfaceProperty, newSurfaceProperty);
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
	public void setSurfaceProperty(SurfacePropertyType newSurfaceProperty) {
		if (newSurfaceProperty != surfaceProperty) {
			NotificationChain msgs = null;
			if (surfaceProperty != null)
				msgs = ((InternalEObject)surfaceProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.FACE_TYPE__SURFACE_PROPERTY, null, msgs);
			if (newSurfaceProperty != null)
				msgs = ((InternalEObject)newSurfaceProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.FACE_TYPE__SURFACE_PROPERTY, null, msgs);
			msgs = basicSetSurfaceProperty(newSurfaceProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.FACE_TYPE__SURFACE_PROPERTY, newSurfaceProperty, newSurfaceProperty));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.FACE_TYPE__AGGREGATION_TYPE, oldAggregationType, aggregationType, !oldAggregationTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.FACE_TYPE__AGGREGATION_TYPE, oldAggregationType, AGGREGATION_TYPE_EDEFAULT, oldAggregationTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.FACE_TYPE__UNIVERSAL, oldUniversal, universal, !oldUniversalESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.FACE_TYPE__UNIVERSAL, oldUniversal, UNIVERSAL_EDEFAULT, oldUniversalESet));
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
			case GMLPackage.FACE_TYPE__ISOLATED:
				return ((InternalEList<?>)getIsolated()).basicRemove(otherEnd, msgs);
			case GMLPackage.FACE_TYPE__DIRECTED_EDGE:
				return ((InternalEList<?>)getDirectedEdge()).basicRemove(otherEnd, msgs);
			case GMLPackage.FACE_TYPE__DIRECTED_TOPO_SOLID:
				return ((InternalEList<?>)getDirectedTopoSolid()).basicRemove(otherEnd, msgs);
			case GMLPackage.FACE_TYPE__SURFACE_PROPERTY:
				return basicSetSurfaceProperty(null, msgs);
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
			case GMLPackage.FACE_TYPE__ISOLATED:
				return getIsolated();
			case GMLPackage.FACE_TYPE__DIRECTED_EDGE:
				return getDirectedEdge();
			case GMLPackage.FACE_TYPE__DIRECTED_TOPO_SOLID:
				return getDirectedTopoSolid();
			case GMLPackage.FACE_TYPE__SURFACE_PROPERTY:
				return getSurfaceProperty();
			case GMLPackage.FACE_TYPE__AGGREGATION_TYPE:
				return getAggregationType();
			case GMLPackage.FACE_TYPE__UNIVERSAL:
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
			case GMLPackage.FACE_TYPE__ISOLATED:
				getIsolated().clear();
				getIsolated().addAll((Collection<? extends NodePropertyType>)newValue);
				return;
			case GMLPackage.FACE_TYPE__DIRECTED_EDGE:
				getDirectedEdge().clear();
				getDirectedEdge().addAll((Collection<? extends DirectedEdgePropertyType>)newValue);
				return;
			case GMLPackage.FACE_TYPE__DIRECTED_TOPO_SOLID:
				getDirectedTopoSolid().clear();
				getDirectedTopoSolid().addAll((Collection<? extends DirectedTopoSolidPropertyType>)newValue);
				return;
			case GMLPackage.FACE_TYPE__SURFACE_PROPERTY:
				setSurfaceProperty((SurfacePropertyType)newValue);
				return;
			case GMLPackage.FACE_TYPE__AGGREGATION_TYPE:
				setAggregationType((AggregationType)newValue);
				return;
			case GMLPackage.FACE_TYPE__UNIVERSAL:
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
			case GMLPackage.FACE_TYPE__ISOLATED:
				getIsolated().clear();
				return;
			case GMLPackage.FACE_TYPE__DIRECTED_EDGE:
				getDirectedEdge().clear();
				return;
			case GMLPackage.FACE_TYPE__DIRECTED_TOPO_SOLID:
				getDirectedTopoSolid().clear();
				return;
			case GMLPackage.FACE_TYPE__SURFACE_PROPERTY:
				setSurfaceProperty((SurfacePropertyType)null);
				return;
			case GMLPackage.FACE_TYPE__AGGREGATION_TYPE:
				unsetAggregationType();
				return;
			case GMLPackage.FACE_TYPE__UNIVERSAL:
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
			case GMLPackage.FACE_TYPE__ISOLATED:
				return isolated != null && !isolated.isEmpty();
			case GMLPackage.FACE_TYPE__DIRECTED_EDGE:
				return directedEdge != null && !directedEdge.isEmpty();
			case GMLPackage.FACE_TYPE__DIRECTED_TOPO_SOLID:
				return directedTopoSolid != null && !directedTopoSolid.isEmpty();
			case GMLPackage.FACE_TYPE__SURFACE_PROPERTY:
				return surfaceProperty != null;
			case GMLPackage.FACE_TYPE__AGGREGATION_TYPE:
				return isSetAggregationType();
			case GMLPackage.FACE_TYPE__UNIVERSAL:
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

} //FaceTypeImpl
