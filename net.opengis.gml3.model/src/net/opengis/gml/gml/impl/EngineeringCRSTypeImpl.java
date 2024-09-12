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

import net.opengis.gml.gml.AffineCSPropertyType;
import net.opengis.gml.gml.CartesianCSPropertyType;
import net.opengis.gml.gml.CoordinateSystemPropertyType;
import net.opengis.gml.gml.CylindricalCSPropertyType;
import net.opengis.gml.gml.EngineeringCRSType;
import net.opengis.gml.gml.EngineeringDatumPropertyType;
import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.LinearCSPropertyType;
import net.opengis.gml.gml.PolarCSPropertyType;
import net.opengis.gml.gml.SphericalCSPropertyType;
import net.opengis.gml.gml.UserDefinedCSPropertyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engineering CRS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.EngineeringCRSTypeImpl#getAffineCSGroup <em>Affine CS Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.EngineeringCRSTypeImpl#getAffineCS <em>Affine CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.EngineeringCRSTypeImpl#getCartesianCSGroup <em>Cartesian CS Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.EngineeringCRSTypeImpl#getCartesianCS <em>Cartesian CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.EngineeringCRSTypeImpl#getCylindricalCS <em>Cylindrical CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.EngineeringCRSTypeImpl#getLinearCS <em>Linear CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.EngineeringCRSTypeImpl#getPolarCS <em>Polar CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.EngineeringCRSTypeImpl#getSphericalCSGroup <em>Spherical CS Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.EngineeringCRSTypeImpl#getSphericalCS <em>Spherical CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.EngineeringCRSTypeImpl#getUserDefinedCS <em>User Defined CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.EngineeringCRSTypeImpl#getCoordinateSystemGroup <em>Coordinate System Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.EngineeringCRSTypeImpl#getCoordinateSystem <em>Coordinate System</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.EngineeringCRSTypeImpl#getEngineeringDatumGroup <em>Engineering Datum Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.EngineeringCRSTypeImpl#getEngineeringDatum <em>Engineering Datum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EngineeringCRSTypeImpl extends AbstractCRSTypeImpl implements EngineeringCRSType {
	/**
	 * The cached value of the '{@link #getAffineCSGroup() <em>Affine CS Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffineCSGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap affineCSGroup;

	/**
	 * The cached value of the '{@link #getCartesianCSGroup() <em>Cartesian CS Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCartesianCSGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap cartesianCSGroup;

	/**
	 * The cached value of the '{@link #getCylindricalCS() <em>Cylindrical CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCylindricalCS()
	 * @generated
	 * @ordered
	 */
	protected CylindricalCSPropertyType cylindricalCS;

	/**
	 * The cached value of the '{@link #getLinearCS() <em>Linear CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearCS()
	 * @generated
	 * @ordered
	 */
	protected LinearCSPropertyType linearCS;

	/**
	 * The cached value of the '{@link #getPolarCS() <em>Polar CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolarCS()
	 * @generated
	 * @ordered
	 */
	protected PolarCSPropertyType polarCS;

	/**
	 * The cached value of the '{@link #getSphericalCSGroup() <em>Spherical CS Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSphericalCSGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap sphericalCSGroup;

	/**
	 * The cached value of the '{@link #getUserDefinedCS() <em>User Defined CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedCS()
	 * @generated
	 * @ordered
	 */
	protected UserDefinedCSPropertyType userDefinedCS;

	/**
	 * The cached value of the '{@link #getCoordinateSystemGroup() <em>Coordinate System Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinateSystemGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap coordinateSystemGroup;

	/**
	 * The cached value of the '{@link #getEngineeringDatumGroup() <em>Engineering Datum Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineeringDatumGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap engineeringDatumGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EngineeringCRSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getEngineeringCRSType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAffineCSGroup() {
		if (affineCSGroup == null) {
			affineCSGroup = new BasicFeatureMap(this, GMLPackage.ENGINEERING_CRS_TYPE__AFFINE_CS_GROUP);
		}
		return affineCSGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AffineCSPropertyType getAffineCS() {
		return (AffineCSPropertyType)getAffineCSGroup().get(GMLPackage.eINSTANCE.getEngineeringCRSType_AffineCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAffineCS(AffineCSPropertyType newAffineCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAffineCSGroup()).basicAdd(GMLPackage.eINSTANCE.getEngineeringCRSType_AffineCS(), newAffineCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAffineCS(AffineCSPropertyType newAffineCS) {
		((FeatureMap.Internal)getAffineCSGroup()).set(GMLPackage.eINSTANCE.getEngineeringCRSType_AffineCS(), newAffineCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getCartesianCSGroup() {
		if (cartesianCSGroup == null) {
			cartesianCSGroup = new BasicFeatureMap(this, GMLPackage.ENGINEERING_CRS_TYPE__CARTESIAN_CS_GROUP);
		}
		return cartesianCSGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CartesianCSPropertyType getCartesianCS() {
		return (CartesianCSPropertyType)getCartesianCSGroup().get(GMLPackage.eINSTANCE.getEngineeringCRSType_CartesianCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCartesianCS(CartesianCSPropertyType newCartesianCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getCartesianCSGroup()).basicAdd(GMLPackage.eINSTANCE.getEngineeringCRSType_CartesianCS(), newCartesianCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCartesianCS(CartesianCSPropertyType newCartesianCS) {
		((FeatureMap.Internal)getCartesianCSGroup()).set(GMLPackage.eINSTANCE.getEngineeringCRSType_CartesianCS(), newCartesianCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CylindricalCSPropertyType getCylindricalCS() {
		return cylindricalCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCylindricalCS(CylindricalCSPropertyType newCylindricalCS, NotificationChain msgs) {
		CylindricalCSPropertyType oldCylindricalCS = cylindricalCS;
		cylindricalCS = newCylindricalCS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.ENGINEERING_CRS_TYPE__CYLINDRICAL_CS, oldCylindricalCS, newCylindricalCS);
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
	public void setCylindricalCS(CylindricalCSPropertyType newCylindricalCS) {
		if (newCylindricalCS != cylindricalCS) {
			NotificationChain msgs = null;
			if (cylindricalCS != null)
				msgs = ((InternalEObject)cylindricalCS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ENGINEERING_CRS_TYPE__CYLINDRICAL_CS, null, msgs);
			if (newCylindricalCS != null)
				msgs = ((InternalEObject)newCylindricalCS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ENGINEERING_CRS_TYPE__CYLINDRICAL_CS, null, msgs);
			msgs = basicSetCylindricalCS(newCylindricalCS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ENGINEERING_CRS_TYPE__CYLINDRICAL_CS, newCylindricalCS, newCylindricalCS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinearCSPropertyType getLinearCS() {
		return linearCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinearCS(LinearCSPropertyType newLinearCS, NotificationChain msgs) {
		LinearCSPropertyType oldLinearCS = linearCS;
		linearCS = newLinearCS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.ENGINEERING_CRS_TYPE__LINEAR_CS, oldLinearCS, newLinearCS);
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
	public void setLinearCS(LinearCSPropertyType newLinearCS) {
		if (newLinearCS != linearCS) {
			NotificationChain msgs = null;
			if (linearCS != null)
				msgs = ((InternalEObject)linearCS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ENGINEERING_CRS_TYPE__LINEAR_CS, null, msgs);
			if (newLinearCS != null)
				msgs = ((InternalEObject)newLinearCS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ENGINEERING_CRS_TYPE__LINEAR_CS, null, msgs);
			msgs = basicSetLinearCS(newLinearCS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ENGINEERING_CRS_TYPE__LINEAR_CS, newLinearCS, newLinearCS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolarCSPropertyType getPolarCS() {
		return polarCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolarCS(PolarCSPropertyType newPolarCS, NotificationChain msgs) {
		PolarCSPropertyType oldPolarCS = polarCS;
		polarCS = newPolarCS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.ENGINEERING_CRS_TYPE__POLAR_CS, oldPolarCS, newPolarCS);
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
	public void setPolarCS(PolarCSPropertyType newPolarCS) {
		if (newPolarCS != polarCS) {
			NotificationChain msgs = null;
			if (polarCS != null)
				msgs = ((InternalEObject)polarCS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ENGINEERING_CRS_TYPE__POLAR_CS, null, msgs);
			if (newPolarCS != null)
				msgs = ((InternalEObject)newPolarCS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ENGINEERING_CRS_TYPE__POLAR_CS, null, msgs);
			msgs = basicSetPolarCS(newPolarCS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ENGINEERING_CRS_TYPE__POLAR_CS, newPolarCS, newPolarCS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getSphericalCSGroup() {
		if (sphericalCSGroup == null) {
			sphericalCSGroup = new BasicFeatureMap(this, GMLPackage.ENGINEERING_CRS_TYPE__SPHERICAL_CS_GROUP);
		}
		return sphericalCSGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SphericalCSPropertyType getSphericalCS() {
		return (SphericalCSPropertyType)getSphericalCSGroup().get(GMLPackage.eINSTANCE.getEngineeringCRSType_SphericalCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSphericalCS(SphericalCSPropertyType newSphericalCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getSphericalCSGroup()).basicAdd(GMLPackage.eINSTANCE.getEngineeringCRSType_SphericalCS(), newSphericalCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSphericalCS(SphericalCSPropertyType newSphericalCS) {
		((FeatureMap.Internal)getSphericalCSGroup()).set(GMLPackage.eINSTANCE.getEngineeringCRSType_SphericalCS(), newSphericalCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserDefinedCSPropertyType getUserDefinedCS() {
		return userDefinedCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserDefinedCS(UserDefinedCSPropertyType newUserDefinedCS, NotificationChain msgs) {
		UserDefinedCSPropertyType oldUserDefinedCS = userDefinedCS;
		userDefinedCS = newUserDefinedCS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.ENGINEERING_CRS_TYPE__USER_DEFINED_CS, oldUserDefinedCS, newUserDefinedCS);
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
	public void setUserDefinedCS(UserDefinedCSPropertyType newUserDefinedCS) {
		if (newUserDefinedCS != userDefinedCS) {
			NotificationChain msgs = null;
			if (userDefinedCS != null)
				msgs = ((InternalEObject)userDefinedCS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ENGINEERING_CRS_TYPE__USER_DEFINED_CS, null, msgs);
			if (newUserDefinedCS != null)
				msgs = ((InternalEObject)newUserDefinedCS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ENGINEERING_CRS_TYPE__USER_DEFINED_CS, null, msgs);
			msgs = basicSetUserDefinedCS(newUserDefinedCS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ENGINEERING_CRS_TYPE__USER_DEFINED_CS, newUserDefinedCS, newUserDefinedCS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getCoordinateSystemGroup() {
		if (coordinateSystemGroup == null) {
			coordinateSystemGroup = new BasicFeatureMap(this, GMLPackage.ENGINEERING_CRS_TYPE__COORDINATE_SYSTEM_GROUP);
		}
		return coordinateSystemGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinateSystemPropertyType getCoordinateSystem() {
		return (CoordinateSystemPropertyType)getCoordinateSystemGroup().get(GMLPackage.eINSTANCE.getEngineeringCRSType_CoordinateSystem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinateSystem(CoordinateSystemPropertyType newCoordinateSystem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getCoordinateSystemGroup()).basicAdd(GMLPackage.eINSTANCE.getEngineeringCRSType_CoordinateSystem(), newCoordinateSystem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoordinateSystem(CoordinateSystemPropertyType newCoordinateSystem) {
		((FeatureMap.Internal)getCoordinateSystemGroup()).set(GMLPackage.eINSTANCE.getEngineeringCRSType_CoordinateSystem(), newCoordinateSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getEngineeringDatumGroup() {
		if (engineeringDatumGroup == null) {
			engineeringDatumGroup = new BasicFeatureMap(this, GMLPackage.ENGINEERING_CRS_TYPE__ENGINEERING_DATUM_GROUP);
		}
		return engineeringDatumGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineeringDatumPropertyType getEngineeringDatum() {
		return (EngineeringDatumPropertyType)getEngineeringDatumGroup().get(GMLPackage.eINSTANCE.getEngineeringCRSType_EngineeringDatum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEngineeringDatum(EngineeringDatumPropertyType newEngineeringDatum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getEngineeringDatumGroup()).basicAdd(GMLPackage.eINSTANCE.getEngineeringCRSType_EngineeringDatum(), newEngineeringDatum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEngineeringDatum(EngineeringDatumPropertyType newEngineeringDatum) {
		((FeatureMap.Internal)getEngineeringDatumGroup()).set(GMLPackage.eINSTANCE.getEngineeringCRSType_EngineeringDatum(), newEngineeringDatum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.ENGINEERING_CRS_TYPE__AFFINE_CS_GROUP:
				return ((InternalEList<?>)getAffineCSGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.ENGINEERING_CRS_TYPE__AFFINE_CS:
				return basicSetAffineCS(null, msgs);
			case GMLPackage.ENGINEERING_CRS_TYPE__CARTESIAN_CS_GROUP:
				return ((InternalEList<?>)getCartesianCSGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.ENGINEERING_CRS_TYPE__CARTESIAN_CS:
				return basicSetCartesianCS(null, msgs);
			case GMLPackage.ENGINEERING_CRS_TYPE__CYLINDRICAL_CS:
				return basicSetCylindricalCS(null, msgs);
			case GMLPackage.ENGINEERING_CRS_TYPE__LINEAR_CS:
				return basicSetLinearCS(null, msgs);
			case GMLPackage.ENGINEERING_CRS_TYPE__POLAR_CS:
				return basicSetPolarCS(null, msgs);
			case GMLPackage.ENGINEERING_CRS_TYPE__SPHERICAL_CS_GROUP:
				return ((InternalEList<?>)getSphericalCSGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.ENGINEERING_CRS_TYPE__SPHERICAL_CS:
				return basicSetSphericalCS(null, msgs);
			case GMLPackage.ENGINEERING_CRS_TYPE__USER_DEFINED_CS:
				return basicSetUserDefinedCS(null, msgs);
			case GMLPackage.ENGINEERING_CRS_TYPE__COORDINATE_SYSTEM_GROUP:
				return ((InternalEList<?>)getCoordinateSystemGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.ENGINEERING_CRS_TYPE__COORDINATE_SYSTEM:
				return basicSetCoordinateSystem(null, msgs);
			case GMLPackage.ENGINEERING_CRS_TYPE__ENGINEERING_DATUM_GROUP:
				return ((InternalEList<?>)getEngineeringDatumGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.ENGINEERING_CRS_TYPE__ENGINEERING_DATUM:
				return basicSetEngineeringDatum(null, msgs);
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
			case GMLPackage.ENGINEERING_CRS_TYPE__AFFINE_CS_GROUP:
				if (coreType) return getAffineCSGroup();
				return ((FeatureMap.Internal)getAffineCSGroup()).getWrapper();
			case GMLPackage.ENGINEERING_CRS_TYPE__AFFINE_CS:
				return getAffineCS();
			case GMLPackage.ENGINEERING_CRS_TYPE__CARTESIAN_CS_GROUP:
				if (coreType) return getCartesianCSGroup();
				return ((FeatureMap.Internal)getCartesianCSGroup()).getWrapper();
			case GMLPackage.ENGINEERING_CRS_TYPE__CARTESIAN_CS:
				return getCartesianCS();
			case GMLPackage.ENGINEERING_CRS_TYPE__CYLINDRICAL_CS:
				return getCylindricalCS();
			case GMLPackage.ENGINEERING_CRS_TYPE__LINEAR_CS:
				return getLinearCS();
			case GMLPackage.ENGINEERING_CRS_TYPE__POLAR_CS:
				return getPolarCS();
			case GMLPackage.ENGINEERING_CRS_TYPE__SPHERICAL_CS_GROUP:
				if (coreType) return getSphericalCSGroup();
				return ((FeatureMap.Internal)getSphericalCSGroup()).getWrapper();
			case GMLPackage.ENGINEERING_CRS_TYPE__SPHERICAL_CS:
				return getSphericalCS();
			case GMLPackage.ENGINEERING_CRS_TYPE__USER_DEFINED_CS:
				return getUserDefinedCS();
			case GMLPackage.ENGINEERING_CRS_TYPE__COORDINATE_SYSTEM_GROUP:
				if (coreType) return getCoordinateSystemGroup();
				return ((FeatureMap.Internal)getCoordinateSystemGroup()).getWrapper();
			case GMLPackage.ENGINEERING_CRS_TYPE__COORDINATE_SYSTEM:
				return getCoordinateSystem();
			case GMLPackage.ENGINEERING_CRS_TYPE__ENGINEERING_DATUM_GROUP:
				if (coreType) return getEngineeringDatumGroup();
				return ((FeatureMap.Internal)getEngineeringDatumGroup()).getWrapper();
			case GMLPackage.ENGINEERING_CRS_TYPE__ENGINEERING_DATUM:
				return getEngineeringDatum();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMLPackage.ENGINEERING_CRS_TYPE__AFFINE_CS_GROUP:
				((FeatureMap.Internal)getAffineCSGroup()).set(newValue);
				return;
			case GMLPackage.ENGINEERING_CRS_TYPE__AFFINE_CS:
				setAffineCS((AffineCSPropertyType)newValue);
				return;
			case GMLPackage.ENGINEERING_CRS_TYPE__CARTESIAN_CS_GROUP:
				((FeatureMap.Internal)getCartesianCSGroup()).set(newValue);
				return;
			case GMLPackage.ENGINEERING_CRS_TYPE__CARTESIAN_CS:
				setCartesianCS((CartesianCSPropertyType)newValue);
				return;
			case GMLPackage.ENGINEERING_CRS_TYPE__CYLINDRICAL_CS:
				setCylindricalCS((CylindricalCSPropertyType)newValue);
				return;
			case GMLPackage.ENGINEERING_CRS_TYPE__LINEAR_CS:
				setLinearCS((LinearCSPropertyType)newValue);
				return;
			case GMLPackage.ENGINEERING_CRS_TYPE__POLAR_CS:
				setPolarCS((PolarCSPropertyType)newValue);
				return;
			case GMLPackage.ENGINEERING_CRS_TYPE__SPHERICAL_CS_GROUP:
				((FeatureMap.Internal)getSphericalCSGroup()).set(newValue);
				return;
			case GMLPackage.ENGINEERING_CRS_TYPE__SPHERICAL_CS:
				setSphericalCS((SphericalCSPropertyType)newValue);
				return;
			case GMLPackage.ENGINEERING_CRS_TYPE__USER_DEFINED_CS:
				setUserDefinedCS((UserDefinedCSPropertyType)newValue);
				return;
			case GMLPackage.ENGINEERING_CRS_TYPE__COORDINATE_SYSTEM_GROUP:
				((FeatureMap.Internal)getCoordinateSystemGroup()).set(newValue);
				return;
			case GMLPackage.ENGINEERING_CRS_TYPE__COORDINATE_SYSTEM:
				setCoordinateSystem((CoordinateSystemPropertyType)newValue);
				return;
			case GMLPackage.ENGINEERING_CRS_TYPE__ENGINEERING_DATUM_GROUP:
				((FeatureMap.Internal)getEngineeringDatumGroup()).set(newValue);
				return;
			case GMLPackage.ENGINEERING_CRS_TYPE__ENGINEERING_DATUM:
				setEngineeringDatum((EngineeringDatumPropertyType)newValue);
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
			case GMLPackage.ENGINEERING_CRS_TYPE__AFFINE_CS_GROUP:
				getAffineCSGroup().clear();
				return;
			case GMLPackage.ENGINEERING_CRS_TYPE__AFFINE_CS:
				setAffineCS((AffineCSPropertyType)null);
				return;
			case GMLPackage.ENGINEERING_CRS_TYPE__CARTESIAN_CS_GROUP:
				getCartesianCSGroup().clear();
				return;
			case GMLPackage.ENGINEERING_CRS_TYPE__CARTESIAN_CS:
				setCartesianCS((CartesianCSPropertyType)null);
				return;
			case GMLPackage.ENGINEERING_CRS_TYPE__CYLINDRICAL_CS:
				setCylindricalCS((CylindricalCSPropertyType)null);
				return;
			case GMLPackage.ENGINEERING_CRS_TYPE__LINEAR_CS:
				setLinearCS((LinearCSPropertyType)null);
				return;
			case GMLPackage.ENGINEERING_CRS_TYPE__POLAR_CS:
				setPolarCS((PolarCSPropertyType)null);
				return;
			case GMLPackage.ENGINEERING_CRS_TYPE__SPHERICAL_CS_GROUP:
				getSphericalCSGroup().clear();
				return;
			case GMLPackage.ENGINEERING_CRS_TYPE__SPHERICAL_CS:
				setSphericalCS((SphericalCSPropertyType)null);
				return;
			case GMLPackage.ENGINEERING_CRS_TYPE__USER_DEFINED_CS:
				setUserDefinedCS((UserDefinedCSPropertyType)null);
				return;
			case GMLPackage.ENGINEERING_CRS_TYPE__COORDINATE_SYSTEM_GROUP:
				getCoordinateSystemGroup().clear();
				return;
			case GMLPackage.ENGINEERING_CRS_TYPE__COORDINATE_SYSTEM:
				setCoordinateSystem((CoordinateSystemPropertyType)null);
				return;
			case GMLPackage.ENGINEERING_CRS_TYPE__ENGINEERING_DATUM_GROUP:
				getEngineeringDatumGroup().clear();
				return;
			case GMLPackage.ENGINEERING_CRS_TYPE__ENGINEERING_DATUM:
				setEngineeringDatum((EngineeringDatumPropertyType)null);
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
			case GMLPackage.ENGINEERING_CRS_TYPE__AFFINE_CS_GROUP:
				return affineCSGroup != null && !affineCSGroup.isEmpty();
			case GMLPackage.ENGINEERING_CRS_TYPE__AFFINE_CS:
				return getAffineCS() != null;
			case GMLPackage.ENGINEERING_CRS_TYPE__CARTESIAN_CS_GROUP:
				return cartesianCSGroup != null && !cartesianCSGroup.isEmpty();
			case GMLPackage.ENGINEERING_CRS_TYPE__CARTESIAN_CS:
				return getCartesianCS() != null;
			case GMLPackage.ENGINEERING_CRS_TYPE__CYLINDRICAL_CS:
				return cylindricalCS != null;
			case GMLPackage.ENGINEERING_CRS_TYPE__LINEAR_CS:
				return linearCS != null;
			case GMLPackage.ENGINEERING_CRS_TYPE__POLAR_CS:
				return polarCS != null;
			case GMLPackage.ENGINEERING_CRS_TYPE__SPHERICAL_CS_GROUP:
				return sphericalCSGroup != null && !sphericalCSGroup.isEmpty();
			case GMLPackage.ENGINEERING_CRS_TYPE__SPHERICAL_CS:
				return getSphericalCS() != null;
			case GMLPackage.ENGINEERING_CRS_TYPE__USER_DEFINED_CS:
				return userDefinedCS != null;
			case GMLPackage.ENGINEERING_CRS_TYPE__COORDINATE_SYSTEM_GROUP:
				return coordinateSystemGroup != null && !coordinateSystemGroup.isEmpty();
			case GMLPackage.ENGINEERING_CRS_TYPE__COORDINATE_SYSTEM:
				return getCoordinateSystem() != null;
			case GMLPackage.ENGINEERING_CRS_TYPE__ENGINEERING_DATUM_GROUP:
				return engineeringDatumGroup != null && !engineeringDatumGroup.isEmpty();
			case GMLPackage.ENGINEERING_CRS_TYPE__ENGINEERING_DATUM:
				return getEngineeringDatum() != null;
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
		result.append(" (affineCSGroup: ");
		result.append(affineCSGroup);
		result.append(", cartesianCSGroup: ");
		result.append(cartesianCSGroup);
		result.append(", sphericalCSGroup: ");
		result.append(sphericalCSGroup);
		result.append(", coordinateSystemGroup: ");
		result.append(coordinateSystemGroup);
		result.append(", engineeringDatumGroup: ");
		result.append(engineeringDatumGroup);
		result.append(')');
		return result.toString();
	}

} //EngineeringCRSTypeImpl
