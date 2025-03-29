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
package org.omg.spec.cmmn.casemodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.spec.cmmn.casemodel.CaseModelPackage;
import org.omg.spec.cmmn.casemodel.TAssociation;
import org.omg.spec.cmmn.casemodel.TAssociationDirection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TAssociation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TAssociationImpl#getAssociationDirection <em>Association Direction</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TAssociationImpl#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TAssociationImpl#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TAssociationImpl extends TArtifactImpl implements TAssociation {
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
	 * The default value of the '{@link #getSourceRef() <em>Source Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRef()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceRef() <em>Source Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRef()
	 * @generated
	 * @ordered
	 */
	protected String sourceRef = SOURCE_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetRef() <em>Target Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRef()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetRef() <em>Target Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRef()
	 * @generated
	 * @ordered
	 */
	protected String targetRef = TARGET_REF_EDEFAULT;

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
		return CaseModelPackage.Literals.TASSOCIATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TASSOCIATION__ASSOCIATION_DIRECTION, oldAssociationDirection, associationDirection, !oldAssociationDirectionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CaseModelPackage.TASSOCIATION__ASSOCIATION_DIRECTION, oldAssociationDirection, ASSOCIATION_DIRECTION_EDEFAULT, oldAssociationDirectionESet));
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
	public String getSourceRef() {
		return sourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceRef(String newSourceRef) {
		String oldSourceRef = sourceRef;
		sourceRef = newSourceRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TASSOCIATION__SOURCE_REF, oldSourceRef, sourceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetRef() {
		return targetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetRef(String newTargetRef) {
		String oldTargetRef = targetRef;
		targetRef = newTargetRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TASSOCIATION__TARGET_REF, oldTargetRef, targetRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CaseModelPackage.TASSOCIATION__ASSOCIATION_DIRECTION:
				return getAssociationDirection();
			case CaseModelPackage.TASSOCIATION__SOURCE_REF:
				return getSourceRef();
			case CaseModelPackage.TASSOCIATION__TARGET_REF:
				return getTargetRef();
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
			case CaseModelPackage.TASSOCIATION__ASSOCIATION_DIRECTION:
				setAssociationDirection((TAssociationDirection)newValue);
				return;
			case CaseModelPackage.TASSOCIATION__SOURCE_REF:
				setSourceRef((String)newValue);
				return;
			case CaseModelPackage.TASSOCIATION__TARGET_REF:
				setTargetRef((String)newValue);
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
			case CaseModelPackage.TASSOCIATION__ASSOCIATION_DIRECTION:
				unsetAssociationDirection();
				return;
			case CaseModelPackage.TASSOCIATION__SOURCE_REF:
				setSourceRef(SOURCE_REF_EDEFAULT);
				return;
			case CaseModelPackage.TASSOCIATION__TARGET_REF:
				setTargetRef(TARGET_REF_EDEFAULT);
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
			case CaseModelPackage.TASSOCIATION__ASSOCIATION_DIRECTION:
				return isSetAssociationDirection();
			case CaseModelPackage.TASSOCIATION__SOURCE_REF:
				return SOURCE_REF_EDEFAULT == null ? sourceRef != null : !SOURCE_REF_EDEFAULT.equals(sourceRef);
			case CaseModelPackage.TASSOCIATION__TARGET_REF:
				return TARGET_REF_EDEFAULT == null ? targetRef != null : !TARGET_REF_EDEFAULT.equals(targetRef);
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
		result.append(", sourceRef: ");
		result.append(sourceRef);
		result.append(", targetRef: ");
		result.append(targetRef);
		result.append(')');
		return result.toString();
	}

} //TAssociationImpl
