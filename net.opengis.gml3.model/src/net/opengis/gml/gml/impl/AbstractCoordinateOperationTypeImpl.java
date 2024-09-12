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
import net.opengis.gml.gml.CRSPropertyType;
import net.opengis.gml.gml.CoordinateOperationAccuracyType;
import net.opengis.gml.gml.DomainOfValidityType;
import net.opengis.gml.gml.GMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Coordinate Operation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.AbstractCoordinateOperationTypeImpl#getDomainOfValidity <em>Domain Of Validity</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.AbstractCoordinateOperationTypeImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.AbstractCoordinateOperationTypeImpl#getOperationVersion <em>Operation Version</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.AbstractCoordinateOperationTypeImpl#getCoordinateOperationAccuracy <em>Coordinate Operation Accuracy</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.AbstractCoordinateOperationTypeImpl#getSourceCRS <em>Source CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.AbstractCoordinateOperationTypeImpl#getTargetCRS <em>Target CRS</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractCoordinateOperationTypeImpl extends IdentifiedObjectTypeImpl implements AbstractCoordinateOperationType {
	/**
	 * The cached value of the '{@link #getDomainOfValidity() <em>Domain Of Validity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainOfValidity()
	 * @generated
	 * @ordered
	 */
	protected DomainOfValidityType domainOfValidity;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected EList<String> scope;

	/**
	 * The default value of the '{@link #getOperationVersion() <em>Operation Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationVersion() <em>Operation Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationVersion()
	 * @generated
	 * @ordered
	 */
	protected String operationVersion = OPERATION_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCoordinateOperationAccuracy() <em>Coordinate Operation Accuracy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinateOperationAccuracy()
	 * @generated
	 * @ordered
	 */
	protected EList<CoordinateOperationAccuracyType> coordinateOperationAccuracy;

	/**
	 * The cached value of the '{@link #getSourceCRS() <em>Source CRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCRS()
	 * @generated
	 * @ordered
	 */
	protected CRSPropertyType sourceCRS;

	/**
	 * The cached value of the '{@link #getTargetCRS() <em>Target CRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCRS()
	 * @generated
	 * @ordered
	 */
	protected CRSPropertyType targetCRS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractCoordinateOperationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getAbstractCoordinateOperationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainOfValidityType getDomainOfValidity() {
		return domainOfValidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainOfValidity(DomainOfValidityType newDomainOfValidity, NotificationChain msgs) {
		DomainOfValidityType oldDomainOfValidity = domainOfValidity;
		domainOfValidity = newDomainOfValidity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__DOMAIN_OF_VALIDITY, oldDomainOfValidity, newDomainOfValidity);
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
	public void setDomainOfValidity(DomainOfValidityType newDomainOfValidity) {
		if (newDomainOfValidity != domainOfValidity) {
			NotificationChain msgs = null;
			if (domainOfValidity != null)
				msgs = ((InternalEObject)domainOfValidity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__DOMAIN_OF_VALIDITY, null, msgs);
			if (newDomainOfValidity != null)
				msgs = ((InternalEObject)newDomainOfValidity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__DOMAIN_OF_VALIDITY, null, msgs);
			msgs = basicSetDomainOfValidity(newDomainOfValidity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__DOMAIN_OF_VALIDITY, newDomainOfValidity, newDomainOfValidity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getScope() {
		if (scope == null) {
			scope = new EDataTypeEList<String>(String.class, this, GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__SCOPE);
		}
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOperationVersion() {
		return operationVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationVersion(String newOperationVersion) {
		String oldOperationVersion = operationVersion;
		operationVersion = newOperationVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__OPERATION_VERSION, oldOperationVersion, operationVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoordinateOperationAccuracyType> getCoordinateOperationAccuracy() {
		if (coordinateOperationAccuracy == null) {
			coordinateOperationAccuracy = new EObjectContainmentEList<CoordinateOperationAccuracyType>(CoordinateOperationAccuracyType.class, this, GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__COORDINATE_OPERATION_ACCURACY);
		}
		return coordinateOperationAccuracy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CRSPropertyType getSourceCRS() {
		return sourceCRS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceCRS(CRSPropertyType newSourceCRS, NotificationChain msgs) {
		CRSPropertyType oldSourceCRS = sourceCRS;
		sourceCRS = newSourceCRS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__SOURCE_CRS, oldSourceCRS, newSourceCRS);
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
	public void setSourceCRS(CRSPropertyType newSourceCRS) {
		if (newSourceCRS != sourceCRS) {
			NotificationChain msgs = null;
			if (sourceCRS != null)
				msgs = ((InternalEObject)sourceCRS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__SOURCE_CRS, null, msgs);
			if (newSourceCRS != null)
				msgs = ((InternalEObject)newSourceCRS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__SOURCE_CRS, null, msgs);
			msgs = basicSetSourceCRS(newSourceCRS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__SOURCE_CRS, newSourceCRS, newSourceCRS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CRSPropertyType getTargetCRS() {
		return targetCRS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetCRS(CRSPropertyType newTargetCRS, NotificationChain msgs) {
		CRSPropertyType oldTargetCRS = targetCRS;
		targetCRS = newTargetCRS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__TARGET_CRS, oldTargetCRS, newTargetCRS);
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
	public void setTargetCRS(CRSPropertyType newTargetCRS) {
		if (newTargetCRS != targetCRS) {
			NotificationChain msgs = null;
			if (targetCRS != null)
				msgs = ((InternalEObject)targetCRS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__TARGET_CRS, null, msgs);
			if (newTargetCRS != null)
				msgs = ((InternalEObject)newTargetCRS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__TARGET_CRS, null, msgs);
			msgs = basicSetTargetCRS(newTargetCRS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__TARGET_CRS, newTargetCRS, newTargetCRS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__DOMAIN_OF_VALIDITY:
				return basicSetDomainOfValidity(null, msgs);
			case GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__COORDINATE_OPERATION_ACCURACY:
				return ((InternalEList<?>)getCoordinateOperationAccuracy()).basicRemove(otherEnd, msgs);
			case GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__SOURCE_CRS:
				return basicSetSourceCRS(null, msgs);
			case GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__TARGET_CRS:
				return basicSetTargetCRS(null, msgs);
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
			case GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__DOMAIN_OF_VALIDITY:
				return getDomainOfValidity();
			case GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__SCOPE:
				return getScope();
			case GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__OPERATION_VERSION:
				return getOperationVersion();
			case GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__COORDINATE_OPERATION_ACCURACY:
				return getCoordinateOperationAccuracy();
			case GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__SOURCE_CRS:
				return getSourceCRS();
			case GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__TARGET_CRS:
				return getTargetCRS();
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
			case GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__DOMAIN_OF_VALIDITY:
				setDomainOfValidity((DomainOfValidityType)newValue);
				return;
			case GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__SCOPE:
				getScope().clear();
				getScope().addAll((Collection<? extends String>)newValue);
				return;
			case GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__OPERATION_VERSION:
				setOperationVersion((String)newValue);
				return;
			case GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__COORDINATE_OPERATION_ACCURACY:
				getCoordinateOperationAccuracy().clear();
				getCoordinateOperationAccuracy().addAll((Collection<? extends CoordinateOperationAccuracyType>)newValue);
				return;
			case GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__SOURCE_CRS:
				setSourceCRS((CRSPropertyType)newValue);
				return;
			case GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__TARGET_CRS:
				setTargetCRS((CRSPropertyType)newValue);
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
			case GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__DOMAIN_OF_VALIDITY:
				setDomainOfValidity((DomainOfValidityType)null);
				return;
			case GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__SCOPE:
				getScope().clear();
				return;
			case GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__OPERATION_VERSION:
				setOperationVersion(OPERATION_VERSION_EDEFAULT);
				return;
			case GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__COORDINATE_OPERATION_ACCURACY:
				getCoordinateOperationAccuracy().clear();
				return;
			case GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__SOURCE_CRS:
				setSourceCRS((CRSPropertyType)null);
				return;
			case GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__TARGET_CRS:
				setTargetCRS((CRSPropertyType)null);
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
			case GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__DOMAIN_OF_VALIDITY:
				return domainOfValidity != null;
			case GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__SCOPE:
				return scope != null && !scope.isEmpty();
			case GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__OPERATION_VERSION:
				return OPERATION_VERSION_EDEFAULT == null ? operationVersion != null : !OPERATION_VERSION_EDEFAULT.equals(operationVersion);
			case GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__COORDINATE_OPERATION_ACCURACY:
				return coordinateOperationAccuracy != null && !coordinateOperationAccuracy.isEmpty();
			case GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__SOURCE_CRS:
				return sourceCRS != null;
			case GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE__TARGET_CRS:
				return targetCRS != null;
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
		result.append(" (scope: ");
		result.append(scope);
		result.append(", operationVersion: ");
		result.append(operationVersion);
		result.append(')');
		return result.toString();
	}

} //AbstractCoordinateOperationTypeImpl
