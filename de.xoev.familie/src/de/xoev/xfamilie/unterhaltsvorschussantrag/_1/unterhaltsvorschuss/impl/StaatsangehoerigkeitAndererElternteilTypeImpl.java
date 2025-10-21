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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitAndererElternteilType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Staatsangehoerigkeit Anderer Elternteil Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.StaatsangehoerigkeitAndererElternteilTypeImpl#isBekannt <em>Bekannt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.StaatsangehoerigkeitAndererElternteilTypeImpl#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaatsangehoerigkeitAndererElternteilTypeImpl extends MinimalEObjectImpl.Container implements StaatsangehoerigkeitAndererElternteilType {
	/**
	 * The default value of the '{@link #isBekannt() <em>Bekannt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBekannt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BEKANNT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBekannt() <em>Bekannt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBekannt()
	 * @generated
	 * @ordered
	 */
	protected boolean bekannt = BEKANNT_EDEFAULT;

	/**
	 * This is true if the Bekannt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bekanntESet;

	/**
	 * The cached value of the '{@link #getStaatsangehoerigkeit() <em>Staatsangehoerigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaatsangehoerigkeit()
	 * @generated
	 * @ordered
	 */
	protected StaatsangehoerigkeitType staatsangehoerigkeit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaatsangehoerigkeitAndererElternteilTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getStaatsangehoerigkeitAndererElternteilType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBekannt() {
		return bekannt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBekannt(boolean newBekannt) {
		boolean oldBekannt = bekannt;
		bekannt = newBekannt;
		boolean oldBekanntESet = bekanntESet;
		bekanntESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_ANDERER_ELTERNTEIL_TYPE__BEKANNT, oldBekannt, bekannt, !oldBekanntESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBekannt() {
		boolean oldBekannt = bekannt;
		boolean oldBekanntESet = bekanntESet;
		bekannt = BEKANNT_EDEFAULT;
		bekanntESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_ANDERER_ELTERNTEIL_TYPE__BEKANNT, oldBekannt, BEKANNT_EDEFAULT, oldBekanntESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBekannt() {
		return bekanntESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StaatsangehoerigkeitType getStaatsangehoerigkeit() {
		return staatsangehoerigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaatsangehoerigkeit(StaatsangehoerigkeitType newStaatsangehoerigkeit, NotificationChain msgs) {
		StaatsangehoerigkeitType oldStaatsangehoerigkeit = staatsangehoerigkeit;
		staatsangehoerigkeit = newStaatsangehoerigkeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_ANDERER_ELTERNTEIL_TYPE__STAATSANGEHOERIGKEIT, oldStaatsangehoerigkeit, newStaatsangehoerigkeit);
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
	public void setStaatsangehoerigkeit(StaatsangehoerigkeitType newStaatsangehoerigkeit) {
		if (newStaatsangehoerigkeit != staatsangehoerigkeit) {
			NotificationChain msgs = null;
			if (staatsangehoerigkeit != null)
				msgs = ((InternalEObject)staatsangehoerigkeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_ANDERER_ELTERNTEIL_TYPE__STAATSANGEHOERIGKEIT, null, msgs);
			if (newStaatsangehoerigkeit != null)
				msgs = ((InternalEObject)newStaatsangehoerigkeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_ANDERER_ELTERNTEIL_TYPE__STAATSANGEHOERIGKEIT, null, msgs);
			msgs = basicSetStaatsangehoerigkeit(newStaatsangehoerigkeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_ANDERER_ELTERNTEIL_TYPE__STAATSANGEHOERIGKEIT, newStaatsangehoerigkeit, newStaatsangehoerigkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_ANDERER_ELTERNTEIL_TYPE__STAATSANGEHOERIGKEIT:
				return basicSetStaatsangehoerigkeit(null, msgs);
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
			case UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_ANDERER_ELTERNTEIL_TYPE__BEKANNT:
				return isBekannt();
			case UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_ANDERER_ELTERNTEIL_TYPE__STAATSANGEHOERIGKEIT:
				return getStaatsangehoerigkeit();
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
			case UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_ANDERER_ELTERNTEIL_TYPE__BEKANNT:
				setBekannt((Boolean)newValue);
				return;
			case UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_ANDERER_ELTERNTEIL_TYPE__STAATSANGEHOERIGKEIT:
				setStaatsangehoerigkeit((StaatsangehoerigkeitType)newValue);
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
			case UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_ANDERER_ELTERNTEIL_TYPE__BEKANNT:
				unsetBekannt();
				return;
			case UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_ANDERER_ELTERNTEIL_TYPE__STAATSANGEHOERIGKEIT:
				setStaatsangehoerigkeit((StaatsangehoerigkeitType)null);
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
			case UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_ANDERER_ELTERNTEIL_TYPE__BEKANNT:
				return isSetBekannt();
			case UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_ANDERER_ELTERNTEIL_TYPE__STAATSANGEHOERIGKEIT:
				return staatsangehoerigkeit != null;
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
		result.append(" (bekannt: ");
		if (bekanntESet) result.append(bekannt); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //StaatsangehoerigkeitAndererElternteilTypeImpl
