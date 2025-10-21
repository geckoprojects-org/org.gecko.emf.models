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
package de.xoev.xfamilie.dsrv._1.dsrv.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.impl.NachrichtTypeImpl;

import de.xoev.xfamilie.dsrv._1.dsrv.AnyTypeFamilieDSRVType;
import de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage;
import de.xoev.xfamilie.dsrv._1.dsrv.DsrvEinkommensdatenrvbea0402Type;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsrv Einkommensdatenrvbea0402 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.impl.DsrvEinkommensdatenrvbea0402TypeImpl#getDxeb <em>Dxeb</em>}</li>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.impl.DsrvEinkommensdatenrvbea0402TypeImpl#getIfdNrArbeitgeber <em>Ifd Nr Arbeitgeber</em>}</li>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.impl.DsrvEinkommensdatenrvbea0402TypeImpl#getAbfrageID <em>Abfrage ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DsrvEinkommensdatenrvbea0402TypeImpl extends NachrichtTypeImpl implements DsrvEinkommensdatenrvbea0402Type {
	/**
	 * The cached value of the '{@link #getDxeb() <em>Dxeb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDxeb()
	 * @generated
	 * @ordered
	 */
	protected AnyTypeFamilieDSRVType dxeb;

	/**
	 * The default value of the '{@link #getIfdNrArbeitgeber() <em>Ifd Nr Arbeitgeber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfdNrArbeitgeber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger IFD_NR_ARBEITGEBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIfdNrArbeitgeber() <em>Ifd Nr Arbeitgeber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfdNrArbeitgeber()
	 * @generated
	 * @ordered
	 */
	protected BigInteger ifdNrArbeitgeber = IFD_NR_ARBEITGEBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbfrageID() <em>Abfrage ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbfrageID()
	 * @generated
	 * @ordered
	 */
	protected static final String ABFRAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbfrageID() <em>Abfrage ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbfrageID()
	 * @generated
	 * @ordered
	 */
	protected String abfrageID = ABFRAGE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DsrvEinkommensdatenrvbea0402TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DSRVPackage.Literals.DSRV_EINKOMMENSDATENRVBEA0402_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnyTypeFamilieDSRVType getDxeb() {
		return dxeb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDxeb(AnyTypeFamilieDSRVType newDxeb, NotificationChain msgs) {
		AnyTypeFamilieDSRVType oldDxeb = dxeb;
		dxeb = newDxeb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DSRVPackage.DSRV_EINKOMMENSDATENRVBEA0402_TYPE__DXEB, oldDxeb, newDxeb);
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
	public void setDxeb(AnyTypeFamilieDSRVType newDxeb) {
		if (newDxeb != dxeb) {
			NotificationChain msgs = null;
			if (dxeb != null)
				msgs = ((InternalEObject)dxeb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DSRVPackage.DSRV_EINKOMMENSDATENRVBEA0402_TYPE__DXEB, null, msgs);
			if (newDxeb != null)
				msgs = ((InternalEObject)newDxeb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DSRVPackage.DSRV_EINKOMMENSDATENRVBEA0402_TYPE__DXEB, null, msgs);
			msgs = basicSetDxeb(newDxeb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSRVPackage.DSRV_EINKOMMENSDATENRVBEA0402_TYPE__DXEB, newDxeb, newDxeb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getIfdNrArbeitgeber() {
		return ifdNrArbeitgeber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIfdNrArbeitgeber(BigInteger newIfdNrArbeitgeber) {
		BigInteger oldIfdNrArbeitgeber = ifdNrArbeitgeber;
		ifdNrArbeitgeber = newIfdNrArbeitgeber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSRVPackage.DSRV_EINKOMMENSDATENRVBEA0402_TYPE__IFD_NR_ARBEITGEBER, oldIfdNrArbeitgeber, ifdNrArbeitgeber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAbfrageID() {
		return abfrageID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbfrageID(String newAbfrageID) {
		String oldAbfrageID = abfrageID;
		abfrageID = newAbfrageID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSRVPackage.DSRV_EINKOMMENSDATENRVBEA0402_TYPE__ABFRAGE_ID, oldAbfrageID, abfrageID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DSRVPackage.DSRV_EINKOMMENSDATENRVBEA0402_TYPE__DXEB:
				return basicSetDxeb(null, msgs);
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
			case DSRVPackage.DSRV_EINKOMMENSDATENRVBEA0402_TYPE__DXEB:
				return getDxeb();
			case DSRVPackage.DSRV_EINKOMMENSDATENRVBEA0402_TYPE__IFD_NR_ARBEITGEBER:
				return getIfdNrArbeitgeber();
			case DSRVPackage.DSRV_EINKOMMENSDATENRVBEA0402_TYPE__ABFRAGE_ID:
				return getAbfrageID();
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
			case DSRVPackage.DSRV_EINKOMMENSDATENRVBEA0402_TYPE__DXEB:
				setDxeb((AnyTypeFamilieDSRVType)newValue);
				return;
			case DSRVPackage.DSRV_EINKOMMENSDATENRVBEA0402_TYPE__IFD_NR_ARBEITGEBER:
				setIfdNrArbeitgeber((BigInteger)newValue);
				return;
			case DSRVPackage.DSRV_EINKOMMENSDATENRVBEA0402_TYPE__ABFRAGE_ID:
				setAbfrageID((String)newValue);
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
			case DSRVPackage.DSRV_EINKOMMENSDATENRVBEA0402_TYPE__DXEB:
				setDxeb((AnyTypeFamilieDSRVType)null);
				return;
			case DSRVPackage.DSRV_EINKOMMENSDATENRVBEA0402_TYPE__IFD_NR_ARBEITGEBER:
				setIfdNrArbeitgeber(IFD_NR_ARBEITGEBER_EDEFAULT);
				return;
			case DSRVPackage.DSRV_EINKOMMENSDATENRVBEA0402_TYPE__ABFRAGE_ID:
				setAbfrageID(ABFRAGE_ID_EDEFAULT);
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
			case DSRVPackage.DSRV_EINKOMMENSDATENRVBEA0402_TYPE__DXEB:
				return dxeb != null;
			case DSRVPackage.DSRV_EINKOMMENSDATENRVBEA0402_TYPE__IFD_NR_ARBEITGEBER:
				return IFD_NR_ARBEITGEBER_EDEFAULT == null ? ifdNrArbeitgeber != null : !IFD_NR_ARBEITGEBER_EDEFAULT.equals(ifdNrArbeitgeber);
			case DSRVPackage.DSRV_EINKOMMENSDATENRVBEA0402_TYPE__ABFRAGE_ID:
				return ABFRAGE_ID_EDEFAULT == null ? abfrageID != null : !ABFRAGE_ID_EDEFAULT.equals(abfrageID);
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
		result.append(" (ifdNrArbeitgeber: ");
		result.append(ifdNrArbeitgeber);
		result.append(", abfrageID: ");
		result.append(abfrageID);
		result.append(')');
		return result.toString();
	}

} //DsrvEinkommensdatenrvbea0402TypeImpl
