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

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeStaatsangehoerigkeitUVType;
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
 * An implementation of the model object '<em><b>Staatsangehoerigkeit Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.StaatsangehoerigkeitTypeImpl#getArt <em>Art</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.StaatsangehoerigkeitTypeImpl#isVerlustRechtAufEinreise <em>Verlust Recht Auf Einreise</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaatsangehoerigkeitTypeImpl extends MinimalEObjectImpl.Container implements StaatsangehoerigkeitType {
	/**
	 * The cached value of the '{@link #getArt() <em>Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArt()
	 * @generated
	 * @ordered
	 */
	protected CodeStaatsangehoerigkeitUVType art;

	/**
	 * The default value of the '{@link #isVerlustRechtAufEinreise() <em>Verlust Recht Auf Einreise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerlustRechtAufEinreise()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERLUST_RECHT_AUF_EINREISE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVerlustRechtAufEinreise() <em>Verlust Recht Auf Einreise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerlustRechtAufEinreise()
	 * @generated
	 * @ordered
	 */
	protected boolean verlustRechtAufEinreise = VERLUST_RECHT_AUF_EINREISE_EDEFAULT;

	/**
	 * This is true if the Verlust Recht Auf Einreise attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean verlustRechtAufEinreiseESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaatsangehoerigkeitTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getStaatsangehoerigkeitType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeStaatsangehoerigkeitUVType getArt() {
		return art;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArt(CodeStaatsangehoerigkeitUVType newArt, NotificationChain msgs) {
		CodeStaatsangehoerigkeitUVType oldArt = art;
		art = newArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_TYPE__ART, oldArt, newArt);
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
	public void setArt(CodeStaatsangehoerigkeitUVType newArt) {
		if (newArt != art) {
			NotificationChain msgs = null;
			if (art != null)
				msgs = ((InternalEObject)art).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_TYPE__ART, null, msgs);
			if (newArt != null)
				msgs = ((InternalEObject)newArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_TYPE__ART, null, msgs);
			msgs = basicSetArt(newArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_TYPE__ART, newArt, newArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVerlustRechtAufEinreise() {
		return verlustRechtAufEinreise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerlustRechtAufEinreise(boolean newVerlustRechtAufEinreise) {
		boolean oldVerlustRechtAufEinreise = verlustRechtAufEinreise;
		verlustRechtAufEinreise = newVerlustRechtAufEinreise;
		boolean oldVerlustRechtAufEinreiseESet = verlustRechtAufEinreiseESet;
		verlustRechtAufEinreiseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_TYPE__VERLUST_RECHT_AUF_EINREISE, oldVerlustRechtAufEinreise, verlustRechtAufEinreise, !oldVerlustRechtAufEinreiseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVerlustRechtAufEinreise() {
		boolean oldVerlustRechtAufEinreise = verlustRechtAufEinreise;
		boolean oldVerlustRechtAufEinreiseESet = verlustRechtAufEinreiseESet;
		verlustRechtAufEinreise = VERLUST_RECHT_AUF_EINREISE_EDEFAULT;
		verlustRechtAufEinreiseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_TYPE__VERLUST_RECHT_AUF_EINREISE, oldVerlustRechtAufEinreise, VERLUST_RECHT_AUF_EINREISE_EDEFAULT, oldVerlustRechtAufEinreiseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVerlustRechtAufEinreise() {
		return verlustRechtAufEinreiseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_TYPE__ART:
				return basicSetArt(null, msgs);
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
			case UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_TYPE__ART:
				return getArt();
			case UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_TYPE__VERLUST_RECHT_AUF_EINREISE:
				return isVerlustRechtAufEinreise();
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
			case UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_TYPE__ART:
				setArt((CodeStaatsangehoerigkeitUVType)newValue);
				return;
			case UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_TYPE__VERLUST_RECHT_AUF_EINREISE:
				setVerlustRechtAufEinreise((Boolean)newValue);
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
			case UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_TYPE__ART:
				setArt((CodeStaatsangehoerigkeitUVType)null);
				return;
			case UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_TYPE__VERLUST_RECHT_AUF_EINREISE:
				unsetVerlustRechtAufEinreise();
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
			case UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_TYPE__ART:
				return art != null;
			case UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_TYPE__VERLUST_RECHT_AUF_EINREISE:
				return isSetVerlustRechtAufEinreise();
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
		result.append(" (verlustRechtAufEinreise: ");
		if (verlustRechtAufEinreiseESet) result.append(verlustRechtAufEinreise); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //StaatsangehoerigkeitTypeImpl
