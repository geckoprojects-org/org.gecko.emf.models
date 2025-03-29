/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.omg.spec.dmn.dmn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.spec.dmn.dmn.DMNPackage;
import org.omg.spec.dmn.dmn.TAssociation;
import org.omg.spec.dmn.dmn.TAssociationDirection;
import org.omg.spec.dmn.dmn.TDMNElementReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TAssociation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TAssociationImpl#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TAssociationImpl#getTargetRef <em>Target Ref</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TAssociationImpl#getAssociationDirection <em>Association Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TAssociationImpl extends TArtifactImpl implements TAssociation {
	/**
	 * The cached value of the '{@link #getSourceRef() <em>Source Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRef()
	 * @generated
	 * @ordered
	 */
	protected TDMNElementReference sourceRef;

	/**
	 * The cached value of the '{@link #getTargetRef() <em>Target Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRef()
	 * @generated
	 * @ordered
	 */
	protected TDMNElementReference targetRef;

	/**
	 * The default value of the '{@link #getAssociationDirection() <em>Association Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationDirection()
	 * @generated
	 * @ordered
	 */
	protected static final TAssociationDirection ASSOCIATION_DIRECTION_EDEFAULT = TAssociationDirection.NONE;

	/**
	 * The cached value of the '{@link #getAssociationDirection() <em>Association Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationDirection()
	 * @generated
	 * @ordered
	 */
	protected TAssociationDirection associationDirection = ASSOCIATION_DIRECTION_EDEFAULT;

	/**
	 * This is true if the Association Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean associationDirectionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DMNPackage.Literals.TASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDMNElementReference getSourceRef() {
		return sourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceRef(TDMNElementReference newSourceRef, NotificationChain msgs) {
		TDMNElementReference oldSourceRef = sourceRef;
		sourceRef = newSourceRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DMNPackage.TASSOCIATION__SOURCE_REF, oldSourceRef, newSourceRef);
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
	public void setSourceRef(TDMNElementReference newSourceRef) {
		if (newSourceRef != sourceRef) {
			NotificationChain msgs = null;
			if (sourceRef != null)
				msgs = ((InternalEObject)sourceRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TASSOCIATION__SOURCE_REF, null, msgs);
			if (newSourceRef != null)
				msgs = ((InternalEObject)newSourceRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TASSOCIATION__SOURCE_REF, null, msgs);
			msgs = basicSetSourceRef(newSourceRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TASSOCIATION__SOURCE_REF, newSourceRef, newSourceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDMNElementReference getTargetRef() {
		return targetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetRef(TDMNElementReference newTargetRef, NotificationChain msgs) {
		TDMNElementReference oldTargetRef = targetRef;
		targetRef = newTargetRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DMNPackage.TASSOCIATION__TARGET_REF, oldTargetRef, newTargetRef);
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
	public void setTargetRef(TDMNElementReference newTargetRef) {
		if (newTargetRef != targetRef) {
			NotificationChain msgs = null;
			if (targetRef != null)
				msgs = ((InternalEObject)targetRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TASSOCIATION__TARGET_REF, null, msgs);
			if (newTargetRef != null)
				msgs = ((InternalEObject)newTargetRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TASSOCIATION__TARGET_REF, null, msgs);
			msgs = basicSetTargetRef(newTargetRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TASSOCIATION__TARGET_REF, newTargetRef, newTargetRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAssociationDirection getAssociationDirection() {
		return associationDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssociationDirection(TAssociationDirection newAssociationDirection) {
		TAssociationDirection oldAssociationDirection = associationDirection;
		associationDirection = newAssociationDirection == null ? ASSOCIATION_DIRECTION_EDEFAULT : newAssociationDirection;
		boolean oldAssociationDirectionESet = associationDirectionESet;
		associationDirectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TASSOCIATION__ASSOCIATION_DIRECTION, oldAssociationDirection, associationDirection, !oldAssociationDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAssociationDirection() {
		TAssociationDirection oldAssociationDirection = associationDirection;
		boolean oldAssociationDirectionESet = associationDirectionESet;
		associationDirection = ASSOCIATION_DIRECTION_EDEFAULT;
		associationDirectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DMNPackage.TASSOCIATION__ASSOCIATION_DIRECTION, oldAssociationDirection, ASSOCIATION_DIRECTION_EDEFAULT, oldAssociationDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAssociationDirection() {
		return associationDirectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DMNPackage.TASSOCIATION__SOURCE_REF:
				return basicSetSourceRef(null, msgs);
			case DMNPackage.TASSOCIATION__TARGET_REF:
				return basicSetTargetRef(null, msgs);
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
			case DMNPackage.TASSOCIATION__SOURCE_REF:
				return getSourceRef();
			case DMNPackage.TASSOCIATION__TARGET_REF:
				return getTargetRef();
			case DMNPackage.TASSOCIATION__ASSOCIATION_DIRECTION:
				return getAssociationDirection();
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
			case DMNPackage.TASSOCIATION__SOURCE_REF:
				setSourceRef((TDMNElementReference)newValue);
				return;
			case DMNPackage.TASSOCIATION__TARGET_REF:
				setTargetRef((TDMNElementReference)newValue);
				return;
			case DMNPackage.TASSOCIATION__ASSOCIATION_DIRECTION:
				setAssociationDirection((TAssociationDirection)newValue);
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
			case DMNPackage.TASSOCIATION__SOURCE_REF:
				setSourceRef((TDMNElementReference)null);
				return;
			case DMNPackage.TASSOCIATION__TARGET_REF:
				setTargetRef((TDMNElementReference)null);
				return;
			case DMNPackage.TASSOCIATION__ASSOCIATION_DIRECTION:
				unsetAssociationDirection();
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
			case DMNPackage.TASSOCIATION__SOURCE_REF:
				return sourceRef != null;
			case DMNPackage.TASSOCIATION__TARGET_REF:
				return targetRef != null;
			case DMNPackage.TASSOCIATION__ASSOCIATION_DIRECTION:
				return isSetAssociationDirection();
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
		result.append(" (associationDirection: ");
		if (associationDirectionESet) result.append(associationDirection); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TAssociationImpl
