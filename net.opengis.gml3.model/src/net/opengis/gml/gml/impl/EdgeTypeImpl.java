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
import net.opengis.gml.gml.CurvePropertyType;
import net.opengis.gml.gml.DirectedFacePropertyType;
import net.opengis.gml.gml.DirectedNodePropertyType;
import net.opengis.gml.gml.EdgeType;
import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.TopoSolidPropertyType;

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
 * An implementation of the model object '<em><b>Edge Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.EdgeTypeImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.EdgeTypeImpl#getDirectedNode <em>Directed Node</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.EdgeTypeImpl#getDirectedFace <em>Directed Face</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.EdgeTypeImpl#getCurveProperty <em>Curve Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.EdgeTypeImpl#getAggregationType <em>Aggregation Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeTypeImpl extends AbstractTopoPrimitiveTypeImpl implements EdgeType {
	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected TopoSolidPropertyType container;

	/**
	 * The cached value of the '{@link #getDirectedNode() <em>Directed Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectedNode()
	 * @generated
	 * @ordered
	 */
	protected EList<DirectedNodePropertyType> directedNode;

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
	 * The cached value of the '{@link #getCurveProperty() <em>Curve Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveProperty()
	 * @generated
	 * @ordered
	 */
	protected CurvePropertyType curveProperty;

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
	protected EdgeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getEdgeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoSolidPropertyType getContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(TopoSolidPropertyType newContainer, NotificationChain msgs) {
		TopoSolidPropertyType oldContainer = container;
		container = newContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.EDGE_TYPE__CONTAINER, oldContainer, newContainer);
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
	public void setContainer(TopoSolidPropertyType newContainer) {
		if (newContainer != container) {
			NotificationChain msgs = null;
			if (container != null)
				msgs = ((InternalEObject)container).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.EDGE_TYPE__CONTAINER, null, msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.EDGE_TYPE__CONTAINER, null, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.EDGE_TYPE__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DirectedNodePropertyType> getDirectedNode() {
		if (directedNode == null) {
			directedNode = new EObjectContainmentEList<DirectedNodePropertyType>(DirectedNodePropertyType.class, this, GMLPackage.EDGE_TYPE__DIRECTED_NODE);
		}
		return directedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DirectedFacePropertyType> getDirectedFace() {
		if (directedFace == null) {
			directedFace = new EObjectContainmentEList<DirectedFacePropertyType>(DirectedFacePropertyType.class, this, GMLPackage.EDGE_TYPE__DIRECTED_FACE);
		}
		return directedFace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurvePropertyType getCurveProperty() {
		return curveProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurveProperty(CurvePropertyType newCurveProperty, NotificationChain msgs) {
		CurvePropertyType oldCurveProperty = curveProperty;
		curveProperty = newCurveProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.EDGE_TYPE__CURVE_PROPERTY, oldCurveProperty, newCurveProperty);
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
	public void setCurveProperty(CurvePropertyType newCurveProperty) {
		if (newCurveProperty != curveProperty) {
			NotificationChain msgs = null;
			if (curveProperty != null)
				msgs = ((InternalEObject)curveProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.EDGE_TYPE__CURVE_PROPERTY, null, msgs);
			if (newCurveProperty != null)
				msgs = ((InternalEObject)newCurveProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.EDGE_TYPE__CURVE_PROPERTY, null, msgs);
			msgs = basicSetCurveProperty(newCurveProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.EDGE_TYPE__CURVE_PROPERTY, newCurveProperty, newCurveProperty));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.EDGE_TYPE__AGGREGATION_TYPE, oldAggregationType, aggregationType, !oldAggregationTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.EDGE_TYPE__AGGREGATION_TYPE, oldAggregationType, AGGREGATION_TYPE_EDEFAULT, oldAggregationTypeESet));
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
			case GMLPackage.EDGE_TYPE__CONTAINER:
				return basicSetContainer(null, msgs);
			case GMLPackage.EDGE_TYPE__DIRECTED_NODE:
				return ((InternalEList<?>)getDirectedNode()).basicRemove(otherEnd, msgs);
			case GMLPackage.EDGE_TYPE__DIRECTED_FACE:
				return ((InternalEList<?>)getDirectedFace()).basicRemove(otherEnd, msgs);
			case GMLPackage.EDGE_TYPE__CURVE_PROPERTY:
				return basicSetCurveProperty(null, msgs);
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
			case GMLPackage.EDGE_TYPE__CONTAINER:
				return getContainer();
			case GMLPackage.EDGE_TYPE__DIRECTED_NODE:
				return getDirectedNode();
			case GMLPackage.EDGE_TYPE__DIRECTED_FACE:
				return getDirectedFace();
			case GMLPackage.EDGE_TYPE__CURVE_PROPERTY:
				return getCurveProperty();
			case GMLPackage.EDGE_TYPE__AGGREGATION_TYPE:
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
			case GMLPackage.EDGE_TYPE__CONTAINER:
				setContainer((TopoSolidPropertyType)newValue);
				return;
			case GMLPackage.EDGE_TYPE__DIRECTED_NODE:
				getDirectedNode().clear();
				getDirectedNode().addAll((Collection<? extends DirectedNodePropertyType>)newValue);
				return;
			case GMLPackage.EDGE_TYPE__DIRECTED_FACE:
				getDirectedFace().clear();
				getDirectedFace().addAll((Collection<? extends DirectedFacePropertyType>)newValue);
				return;
			case GMLPackage.EDGE_TYPE__CURVE_PROPERTY:
				setCurveProperty((CurvePropertyType)newValue);
				return;
			case GMLPackage.EDGE_TYPE__AGGREGATION_TYPE:
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
			case GMLPackage.EDGE_TYPE__CONTAINER:
				setContainer((TopoSolidPropertyType)null);
				return;
			case GMLPackage.EDGE_TYPE__DIRECTED_NODE:
				getDirectedNode().clear();
				return;
			case GMLPackage.EDGE_TYPE__DIRECTED_FACE:
				getDirectedFace().clear();
				return;
			case GMLPackage.EDGE_TYPE__CURVE_PROPERTY:
				setCurveProperty((CurvePropertyType)null);
				return;
			case GMLPackage.EDGE_TYPE__AGGREGATION_TYPE:
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
			case GMLPackage.EDGE_TYPE__CONTAINER:
				return container != null;
			case GMLPackage.EDGE_TYPE__DIRECTED_NODE:
				return directedNode != null && !directedNode.isEmpty();
			case GMLPackage.EDGE_TYPE__DIRECTED_FACE:
				return directedFace != null && !directedFace.isEmpty();
			case GMLPackage.EDGE_TYPE__CURVE_PROPERTY:
				return curveProperty != null;
			case GMLPackage.EDGE_TYPE__AGGREGATION_TYPE:
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
		result.append(" (aggregationType: ");
		if (aggregationTypeESet) result.append(aggregationType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EdgeTypeImpl
