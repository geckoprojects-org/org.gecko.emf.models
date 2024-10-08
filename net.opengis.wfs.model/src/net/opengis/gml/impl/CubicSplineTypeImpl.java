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
package net.opengis.gml.impl;

import java.math.BigInteger;

import java.util.Collection;

import net.opengis.gml.CoordinatesType;
import net.opengis.gml.CubicSplineType;
import net.opengis.gml.CurveInterpolationType;
import net.opengis.gml.DirectPositionListType;
import net.opengis.gml.DirectPositionType;
import net.opengis.gml.GMLPackage;
import net.opengis.gml.PointPropertyType;
import net.opengis.gml.VectorType;

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
 * An implementation of the model object '<em><b>Cubic Spline Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.CubicSplineTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.gml.impl.CubicSplineTypeImpl#getPos <em>Pos</em>}</li>
 *   <li>{@link net.opengis.gml.impl.CubicSplineTypeImpl#getPointProperty <em>Point Property</em>}</li>
 *   <li>{@link net.opengis.gml.impl.CubicSplineTypeImpl#getPointRep <em>Point Rep</em>}</li>
 *   <li>{@link net.opengis.gml.impl.CubicSplineTypeImpl#getPosList <em>Pos List</em>}</li>
 *   <li>{@link net.opengis.gml.impl.CubicSplineTypeImpl#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link net.opengis.gml.impl.CubicSplineTypeImpl#getVectorAtStart <em>Vector At Start</em>}</li>
 *   <li>{@link net.opengis.gml.impl.CubicSplineTypeImpl#getVectorAtEnd <em>Vector At End</em>}</li>
 *   <li>{@link net.opengis.gml.impl.CubicSplineTypeImpl#getDegree <em>Degree</em>}</li>
 *   <li>{@link net.opengis.gml.impl.CubicSplineTypeImpl#getInterpolation <em>Interpolation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CubicSplineTypeImpl extends AbstractCurveSegmentTypeImpl implements CubicSplineType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getPosList() <em>Pos List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosList()
	 * @generated
	 * @ordered
	 */
	protected DirectPositionListType posList;

	/**
	 * The cached value of the '{@link #getCoordinates() <em>Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinates()
	 * @generated
	 * @ordered
	 */
	protected CoordinatesType coordinates;

	/**
	 * The cached value of the '{@link #getVectorAtStart() <em>Vector At Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorAtStart()
	 * @generated
	 * @ordered
	 */
	protected VectorType vectorAtStart;

	/**
	 * The cached value of the '{@link #getVectorAtEnd() <em>Vector At End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorAtEnd()
	 * @generated
	 * @ordered
	 */
	protected VectorType vectorAtEnd;

	/**
	 * The default value of the '{@link #getDegree() <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegree()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DEGREE_EDEFAULT = new BigInteger("3");

	/**
	 * The cached value of the '{@link #getDegree() <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegree()
	 * @generated
	 * @ordered
	 */
	protected BigInteger degree = DEGREE_EDEFAULT;

	/**
	 * This is true if the Degree attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean degreeESet;

	/**
	 * The default value of the '{@link #getInterpolation() <em>Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpolation()
	 * @generated
	 * @ordered
	 */
	protected static final CurveInterpolationType INTERPOLATION_EDEFAULT = CurveInterpolationType.CUBIC_SPLINE;

	/**
	 * The cached value of the '{@link #getInterpolation() <em>Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpolation()
	 * @generated
	 * @ordered
	 */
	protected CurveInterpolationType interpolation = INTERPOLATION_EDEFAULT;

	/**
	 * This is true if the Interpolation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean interpolationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CubicSplineTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getCubicSplineType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, GMLPackage.CUBIC_SPLINE_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DirectPositionType> getPos() {
		return getGroup().list(GMLPackage.eINSTANCE.getCubicSplineType_Pos());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PointPropertyType> getPointProperty() {
		return getGroup().list(GMLPackage.eINSTANCE.getCubicSplineType_PointProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PointPropertyType> getPointRep() {
		return getGroup().list(GMLPackage.eINSTANCE.getCubicSplineType_PointRep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectPositionListType getPosList() {
		return posList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosList(DirectPositionListType newPosList, NotificationChain msgs) {
		DirectPositionListType oldPosList = posList;
		posList = newPosList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.CUBIC_SPLINE_TYPE__POS_LIST, oldPosList, newPosList);
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
	public void setPosList(DirectPositionListType newPosList) {
		if (newPosList != posList) {
			NotificationChain msgs = null;
			if (posList != null)
				msgs = ((InternalEObject)posList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.CUBIC_SPLINE_TYPE__POS_LIST, null, msgs);
			if (newPosList != null)
				msgs = ((InternalEObject)newPosList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.CUBIC_SPLINE_TYPE__POS_LIST, null, msgs);
			msgs = basicSetPosList(newPosList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.CUBIC_SPLINE_TYPE__POS_LIST, newPosList, newPosList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinatesType getCoordinates() {
		return coordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinates(CoordinatesType newCoordinates, NotificationChain msgs) {
		CoordinatesType oldCoordinates = coordinates;
		coordinates = newCoordinates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.CUBIC_SPLINE_TYPE__COORDINATES, oldCoordinates, newCoordinates);
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
	public void setCoordinates(CoordinatesType newCoordinates) {
		if (newCoordinates != coordinates) {
			NotificationChain msgs = null;
			if (coordinates != null)
				msgs = ((InternalEObject)coordinates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.CUBIC_SPLINE_TYPE__COORDINATES, null, msgs);
			if (newCoordinates != null)
				msgs = ((InternalEObject)newCoordinates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.CUBIC_SPLINE_TYPE__COORDINATES, null, msgs);
			msgs = basicSetCoordinates(newCoordinates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.CUBIC_SPLINE_TYPE__COORDINATES, newCoordinates, newCoordinates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VectorType getVectorAtStart() {
		return vectorAtStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVectorAtStart(VectorType newVectorAtStart, NotificationChain msgs) {
		VectorType oldVectorAtStart = vectorAtStart;
		vectorAtStart = newVectorAtStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.CUBIC_SPLINE_TYPE__VECTOR_AT_START, oldVectorAtStart, newVectorAtStart);
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
	public void setVectorAtStart(VectorType newVectorAtStart) {
		if (newVectorAtStart != vectorAtStart) {
			NotificationChain msgs = null;
			if (vectorAtStart != null)
				msgs = ((InternalEObject)vectorAtStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.CUBIC_SPLINE_TYPE__VECTOR_AT_START, null, msgs);
			if (newVectorAtStart != null)
				msgs = ((InternalEObject)newVectorAtStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.CUBIC_SPLINE_TYPE__VECTOR_AT_START, null, msgs);
			msgs = basicSetVectorAtStart(newVectorAtStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.CUBIC_SPLINE_TYPE__VECTOR_AT_START, newVectorAtStart, newVectorAtStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VectorType getVectorAtEnd() {
		return vectorAtEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVectorAtEnd(VectorType newVectorAtEnd, NotificationChain msgs) {
		VectorType oldVectorAtEnd = vectorAtEnd;
		vectorAtEnd = newVectorAtEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.CUBIC_SPLINE_TYPE__VECTOR_AT_END, oldVectorAtEnd, newVectorAtEnd);
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
	public void setVectorAtEnd(VectorType newVectorAtEnd) {
		if (newVectorAtEnd != vectorAtEnd) {
			NotificationChain msgs = null;
			if (vectorAtEnd != null)
				msgs = ((InternalEObject)vectorAtEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.CUBIC_SPLINE_TYPE__VECTOR_AT_END, null, msgs);
			if (newVectorAtEnd != null)
				msgs = ((InternalEObject)newVectorAtEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.CUBIC_SPLINE_TYPE__VECTOR_AT_END, null, msgs);
			msgs = basicSetVectorAtEnd(newVectorAtEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.CUBIC_SPLINE_TYPE__VECTOR_AT_END, newVectorAtEnd, newVectorAtEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getDegree() {
		return degree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDegree(BigInteger newDegree) {
		BigInteger oldDegree = degree;
		degree = newDegree;
		boolean oldDegreeESet = degreeESet;
		degreeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.CUBIC_SPLINE_TYPE__DEGREE, oldDegree, degree, !oldDegreeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDegree() {
		BigInteger oldDegree = degree;
		boolean oldDegreeESet = degreeESet;
		degree = DEGREE_EDEFAULT;
		degreeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.CUBIC_SPLINE_TYPE__DEGREE, oldDegree, DEGREE_EDEFAULT, oldDegreeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDegree() {
		return degreeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurveInterpolationType getInterpolation() {
		return interpolation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterpolation(CurveInterpolationType newInterpolation) {
		CurveInterpolationType oldInterpolation = interpolation;
		interpolation = newInterpolation == null ? INTERPOLATION_EDEFAULT : newInterpolation;
		boolean oldInterpolationESet = interpolationESet;
		interpolationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.CUBIC_SPLINE_TYPE__INTERPOLATION, oldInterpolation, interpolation, !oldInterpolationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetInterpolation() {
		CurveInterpolationType oldInterpolation = interpolation;
		boolean oldInterpolationESet = interpolationESet;
		interpolation = INTERPOLATION_EDEFAULT;
		interpolationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.CUBIC_SPLINE_TYPE__INTERPOLATION, oldInterpolation, INTERPOLATION_EDEFAULT, oldInterpolationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetInterpolation() {
		return interpolationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.CUBIC_SPLINE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.CUBIC_SPLINE_TYPE__POS:
				return ((InternalEList<?>)getPos()).basicRemove(otherEnd, msgs);
			case GMLPackage.CUBIC_SPLINE_TYPE__POINT_PROPERTY:
				return ((InternalEList<?>)getPointProperty()).basicRemove(otherEnd, msgs);
			case GMLPackage.CUBIC_SPLINE_TYPE__POINT_REP:
				return ((InternalEList<?>)getPointRep()).basicRemove(otherEnd, msgs);
			case GMLPackage.CUBIC_SPLINE_TYPE__POS_LIST:
				return basicSetPosList(null, msgs);
			case GMLPackage.CUBIC_SPLINE_TYPE__COORDINATES:
				return basicSetCoordinates(null, msgs);
			case GMLPackage.CUBIC_SPLINE_TYPE__VECTOR_AT_START:
				return basicSetVectorAtStart(null, msgs);
			case GMLPackage.CUBIC_SPLINE_TYPE__VECTOR_AT_END:
				return basicSetVectorAtEnd(null, msgs);
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
			case GMLPackage.CUBIC_SPLINE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case GMLPackage.CUBIC_SPLINE_TYPE__POS:
				return getPos();
			case GMLPackage.CUBIC_SPLINE_TYPE__POINT_PROPERTY:
				return getPointProperty();
			case GMLPackage.CUBIC_SPLINE_TYPE__POINT_REP:
				return getPointRep();
			case GMLPackage.CUBIC_SPLINE_TYPE__POS_LIST:
				return getPosList();
			case GMLPackage.CUBIC_SPLINE_TYPE__COORDINATES:
				return getCoordinates();
			case GMLPackage.CUBIC_SPLINE_TYPE__VECTOR_AT_START:
				return getVectorAtStart();
			case GMLPackage.CUBIC_SPLINE_TYPE__VECTOR_AT_END:
				return getVectorAtEnd();
			case GMLPackage.CUBIC_SPLINE_TYPE__DEGREE:
				return getDegree();
			case GMLPackage.CUBIC_SPLINE_TYPE__INTERPOLATION:
				return getInterpolation();
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
			case GMLPackage.CUBIC_SPLINE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case GMLPackage.CUBIC_SPLINE_TYPE__POS:
				getPos().clear();
				getPos().addAll((Collection<? extends DirectPositionType>)newValue);
				return;
			case GMLPackage.CUBIC_SPLINE_TYPE__POINT_PROPERTY:
				getPointProperty().clear();
				getPointProperty().addAll((Collection<? extends PointPropertyType>)newValue);
				return;
			case GMLPackage.CUBIC_SPLINE_TYPE__POINT_REP:
				getPointRep().clear();
				getPointRep().addAll((Collection<? extends PointPropertyType>)newValue);
				return;
			case GMLPackage.CUBIC_SPLINE_TYPE__POS_LIST:
				setPosList((DirectPositionListType)newValue);
				return;
			case GMLPackage.CUBIC_SPLINE_TYPE__COORDINATES:
				setCoordinates((CoordinatesType)newValue);
				return;
			case GMLPackage.CUBIC_SPLINE_TYPE__VECTOR_AT_START:
				setVectorAtStart((VectorType)newValue);
				return;
			case GMLPackage.CUBIC_SPLINE_TYPE__VECTOR_AT_END:
				setVectorAtEnd((VectorType)newValue);
				return;
			case GMLPackage.CUBIC_SPLINE_TYPE__DEGREE:
				setDegree((BigInteger)newValue);
				return;
			case GMLPackage.CUBIC_SPLINE_TYPE__INTERPOLATION:
				setInterpolation((CurveInterpolationType)newValue);
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
			case GMLPackage.CUBIC_SPLINE_TYPE__GROUP:
				getGroup().clear();
				return;
			case GMLPackage.CUBIC_SPLINE_TYPE__POS:
				getPos().clear();
				return;
			case GMLPackage.CUBIC_SPLINE_TYPE__POINT_PROPERTY:
				getPointProperty().clear();
				return;
			case GMLPackage.CUBIC_SPLINE_TYPE__POINT_REP:
				getPointRep().clear();
				return;
			case GMLPackage.CUBIC_SPLINE_TYPE__POS_LIST:
				setPosList((DirectPositionListType)null);
				return;
			case GMLPackage.CUBIC_SPLINE_TYPE__COORDINATES:
				setCoordinates((CoordinatesType)null);
				return;
			case GMLPackage.CUBIC_SPLINE_TYPE__VECTOR_AT_START:
				setVectorAtStart((VectorType)null);
				return;
			case GMLPackage.CUBIC_SPLINE_TYPE__VECTOR_AT_END:
				setVectorAtEnd((VectorType)null);
				return;
			case GMLPackage.CUBIC_SPLINE_TYPE__DEGREE:
				unsetDegree();
				return;
			case GMLPackage.CUBIC_SPLINE_TYPE__INTERPOLATION:
				unsetInterpolation();
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
			case GMLPackage.CUBIC_SPLINE_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case GMLPackage.CUBIC_SPLINE_TYPE__POS:
				return !getPos().isEmpty();
			case GMLPackage.CUBIC_SPLINE_TYPE__POINT_PROPERTY:
				return !getPointProperty().isEmpty();
			case GMLPackage.CUBIC_SPLINE_TYPE__POINT_REP:
				return !getPointRep().isEmpty();
			case GMLPackage.CUBIC_SPLINE_TYPE__POS_LIST:
				return posList != null;
			case GMLPackage.CUBIC_SPLINE_TYPE__COORDINATES:
				return coordinates != null;
			case GMLPackage.CUBIC_SPLINE_TYPE__VECTOR_AT_START:
				return vectorAtStart != null;
			case GMLPackage.CUBIC_SPLINE_TYPE__VECTOR_AT_END:
				return vectorAtEnd != null;
			case GMLPackage.CUBIC_SPLINE_TYPE__DEGREE:
				return isSetDegree();
			case GMLPackage.CUBIC_SPLINE_TYPE__INTERPOLATION:
				return isSetInterpolation();
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
		result.append(" (group: ");
		result.append(group);
		result.append(", degree: ");
		if (degreeESet) result.append(degree); else result.append("<unset>");
		result.append(", interpolation: ");
		if (interpolationESet) result.append(interpolation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CubicSplineTypeImpl
