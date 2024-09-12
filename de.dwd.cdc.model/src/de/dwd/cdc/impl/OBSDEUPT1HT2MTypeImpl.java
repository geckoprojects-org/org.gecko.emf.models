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
package de.dwd.cdc.impl;

import de.dwd.cdc.CDCPackage;
import de.dwd.cdc.OBSDEUPT1HT2MType;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

import net.opengis.gml.GeometryPropertyType;

import net.opengis.gml.impl.AbstractFeatureTypeImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OBSDEUPT1HT2M Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dwd.cdc.impl.OBSDEUPT1HT2MTypeImpl#getSDOGEOM <em>SDOGEOM</em>}</li>
 *   <li>{@link de.dwd.cdc.impl.OBSDEUPT1HT2MTypeImpl#getSDOTYPE <em>SDOTYPE</em>}</li>
 *   <li>{@link de.dwd.cdc.impl.OBSDEUPT1HT2MTypeImpl#getSDOGUID <em>SDOGUID</em>}</li>
 *   <li>{@link de.dwd.cdc.impl.OBSDEUPT1HT2MTypeImpl#getSDOCODE <em>SDOCODE</em>}</li>
 *   <li>{@link de.dwd.cdc.impl.OBSDEUPT1HT2MTypeImpl#getSDONAME <em>SDONAME</em>}</li>
 *   <li>{@link de.dwd.cdc.impl.OBSDEUPT1HT2MTypeImpl#getZEITSTEMPEL <em>ZEITSTEMPEL</em>}</li>
 *   <li>{@link de.dwd.cdc.impl.OBSDEUPT1HT2MTypeImpl#getZEITINTERVALL <em>ZEITINTERVALL</em>}</li>
 *   <li>{@link de.dwd.cdc.impl.OBSDEUPT1HT2MTypeImpl#getWERT <em>WERT</em>}</li>
 *   <li>{@link de.dwd.cdc.impl.OBSDEUPT1HT2MTypeImpl#getEINHEIT <em>EINHEIT</em>}</li>
 *   <li>{@link de.dwd.cdc.impl.OBSDEUPT1HT2MTypeImpl#getQUALITAETBYTE <em>QUALITAETBYTE</em>}</li>
 *   <li>{@link de.dwd.cdc.impl.OBSDEUPT1HT2MTypeImpl#getQUALITAETNIVEAU <em>QUALITAETNIVEAU</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OBSDEUPT1HT2MTypeImpl extends AbstractFeatureTypeImpl implements OBSDEUPT1HT2MType {
	/**
	 * The cached value of the '{@link #getSDOGEOM() <em>SDOGEOM</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDOGEOM()
	 * @generated
	 * @ordered
	 */
	protected GeometryPropertyType sDOGEOM;

	/**
	 * This is true if the SDOGEOM containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sDOGEOMESet;

	/**
	 * The default value of the '{@link #getSDOTYPE() <em>SDOTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDOTYPE()
	 * @generated
	 * @ordered
	 */
	protected static final String SDOTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSDOTYPE() <em>SDOTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDOTYPE()
	 * @generated
	 * @ordered
	 */
	protected String sDOTYPE = SDOTYPE_EDEFAULT;

	/**
	 * This is true if the SDOTYPE attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sDOTYPEESet;

	/**
	 * The default value of the '{@link #getSDOGUID() <em>SDOGUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDOGUID()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SDOGUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSDOGUID() <em>SDOGUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDOGUID()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal sDOGUID = SDOGUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSDOCODE() <em>SDOCODE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDOCODE()
	 * @generated
	 * @ordered
	 */
	protected static final String SDOCODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSDOCODE() <em>SDOCODE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDOCODE()
	 * @generated
	 * @ordered
	 */
	protected String sDOCODE = SDOCODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSDONAME() <em>SDONAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDONAME()
	 * @generated
	 * @ordered
	 */
	protected static final String SDONAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSDONAME() <em>SDONAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDONAME()
	 * @generated
	 * @ordered
	 */
	protected String sDONAME = SDONAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getZEITSTEMPEL() <em>ZEITSTEMPEL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZEITSTEMPEL()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ZEITSTEMPEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZEITSTEMPEL() <em>ZEITSTEMPEL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZEITSTEMPEL()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar zEITSTEMPEL = ZEITSTEMPEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getZEITINTERVALL() <em>ZEITINTERVALL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZEITINTERVALL()
	 * @generated
	 * @ordered
	 */
	protected static final String ZEITINTERVALL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZEITINTERVALL() <em>ZEITINTERVALL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZEITINTERVALL()
	 * @generated
	 * @ordered
	 */
	protected String zEITINTERVALL = ZEITINTERVALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getWERT() <em>WERT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWERT()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal WERT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWERT() <em>WERT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWERT()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal wERT = WERT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEINHEIT() <em>EINHEIT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEINHEIT()
	 * @generated
	 * @ordered
	 */
	protected static final String EINHEIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEINHEIT() <em>EINHEIT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEINHEIT()
	 * @generated
	 * @ordered
	 */
	protected String eINHEIT = EINHEIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getQUALITAETBYTE() <em>QUALITAETBYTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQUALITAETBYTE()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUALITAETBYTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQUALITAETBYTE() <em>QUALITAETBYTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQUALITAETBYTE()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal qUALITAETBYTE = QUALITAETBYTE_EDEFAULT;

	/**
	 * This is true if the QUALITAETBYTE attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qUALITAETBYTEESet;

	/**
	 * The default value of the '{@link #getQUALITAETNIVEAU() <em>QUALITAETNIVEAU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQUALITAETNIVEAU()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUALITAETNIVEAU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQUALITAETNIVEAU() <em>QUALITAETNIVEAU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQUALITAETNIVEAU()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal qUALITAETNIVEAU = QUALITAETNIVEAU_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OBSDEUPT1HT2MTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDCPackage.Literals.OBSDEUPT1HT2M_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeometryPropertyType getSDOGEOM() {
		return sDOGEOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSDOGEOM(GeometryPropertyType newSDOGEOM, NotificationChain msgs) {
		GeometryPropertyType oldSDOGEOM = sDOGEOM;
		sDOGEOM = newSDOGEOM;
		boolean oldSDOGEOMESet = sDOGEOMESet;
		sDOGEOMESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDCPackage.OBSDEUPT1HT2M_TYPE__SDOGEOM, oldSDOGEOM, newSDOGEOM, !oldSDOGEOMESet);
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
	public void setSDOGEOM(GeometryPropertyType newSDOGEOM) {
		if (newSDOGEOM != sDOGEOM) {
			NotificationChain msgs = null;
			if (sDOGEOM != null)
				msgs = ((InternalEObject)sDOGEOM).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDCPackage.OBSDEUPT1HT2M_TYPE__SDOGEOM, null, msgs);
			if (newSDOGEOM != null)
				msgs = ((InternalEObject)newSDOGEOM).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDCPackage.OBSDEUPT1HT2M_TYPE__SDOGEOM, null, msgs);
			msgs = basicSetSDOGEOM(newSDOGEOM, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSDOGEOMESet = sDOGEOMESet;
			sDOGEOMESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, CDCPackage.OBSDEUPT1HT2M_TYPE__SDOGEOM, newSDOGEOM, newSDOGEOM, !oldSDOGEOMESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetSDOGEOM(NotificationChain msgs) {
		GeometryPropertyType oldSDOGEOM = sDOGEOM;
		sDOGEOM = null;
		boolean oldSDOGEOMESet = sDOGEOMESet;
		sDOGEOMESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, CDCPackage.OBSDEUPT1HT2M_TYPE__SDOGEOM, oldSDOGEOM, null, oldSDOGEOMESet);
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
	public void unsetSDOGEOM() {
		if (sDOGEOM != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)sDOGEOM).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDCPackage.OBSDEUPT1HT2M_TYPE__SDOGEOM, null, msgs);
			msgs = basicUnsetSDOGEOM(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSDOGEOMESet = sDOGEOMESet;
			sDOGEOMESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, CDCPackage.OBSDEUPT1HT2M_TYPE__SDOGEOM, null, null, oldSDOGEOMESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSDOGEOM() {
		return sDOGEOMESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSDOTYPE() {
		return sDOTYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSDOTYPE(String newSDOTYPE) {
		String oldSDOTYPE = sDOTYPE;
		sDOTYPE = newSDOTYPE;
		boolean oldSDOTYPEESet = sDOTYPEESet;
		sDOTYPEESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDCPackage.OBSDEUPT1HT2M_TYPE__SDOTYPE, oldSDOTYPE, sDOTYPE, !oldSDOTYPEESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSDOTYPE() {
		String oldSDOTYPE = sDOTYPE;
		boolean oldSDOTYPEESet = sDOTYPEESet;
		sDOTYPE = SDOTYPE_EDEFAULT;
		sDOTYPEESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDCPackage.OBSDEUPT1HT2M_TYPE__SDOTYPE, oldSDOTYPE, SDOTYPE_EDEFAULT, oldSDOTYPEESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSDOTYPE() {
		return sDOTYPEESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getSDOGUID() {
		return sDOGUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSDOGUID(BigDecimal newSDOGUID) {
		BigDecimal oldSDOGUID = sDOGUID;
		sDOGUID = newSDOGUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDCPackage.OBSDEUPT1HT2M_TYPE__SDOGUID, oldSDOGUID, sDOGUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSDOCODE() {
		return sDOCODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSDOCODE(String newSDOCODE) {
		String oldSDOCODE = sDOCODE;
		sDOCODE = newSDOCODE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDCPackage.OBSDEUPT1HT2M_TYPE__SDOCODE, oldSDOCODE, sDOCODE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSDONAME() {
		return sDONAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSDONAME(String newSDONAME) {
		String oldSDONAME = sDONAME;
		sDONAME = newSDONAME;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDCPackage.OBSDEUPT1HT2M_TYPE__SDONAME, oldSDONAME, sDONAME));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getZEITSTEMPEL() {
		return zEITSTEMPEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZEITSTEMPEL(XMLGregorianCalendar newZEITSTEMPEL) {
		XMLGregorianCalendar oldZEITSTEMPEL = zEITSTEMPEL;
		zEITSTEMPEL = newZEITSTEMPEL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDCPackage.OBSDEUPT1HT2M_TYPE__ZEITSTEMPEL, oldZEITSTEMPEL, zEITSTEMPEL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZEITINTERVALL() {
		return zEITINTERVALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZEITINTERVALL(String newZEITINTERVALL) {
		String oldZEITINTERVALL = zEITINTERVALL;
		zEITINTERVALL = newZEITINTERVALL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDCPackage.OBSDEUPT1HT2M_TYPE__ZEITINTERVALL, oldZEITINTERVALL, zEITINTERVALL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getWERT() {
		return wERT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWERT(BigDecimal newWERT) {
		BigDecimal oldWERT = wERT;
		wERT = newWERT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDCPackage.OBSDEUPT1HT2M_TYPE__WERT, oldWERT, wERT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEINHEIT() {
		return eINHEIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEINHEIT(String newEINHEIT) {
		String oldEINHEIT = eINHEIT;
		eINHEIT = newEINHEIT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDCPackage.OBSDEUPT1HT2M_TYPE__EINHEIT, oldEINHEIT, eINHEIT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQUALITAETBYTE() {
		return qUALITAETBYTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQUALITAETBYTE(BigDecimal newQUALITAETBYTE) {
		BigDecimal oldQUALITAETBYTE = qUALITAETBYTE;
		qUALITAETBYTE = newQUALITAETBYTE;
		boolean oldQUALITAETBYTEESet = qUALITAETBYTEESet;
		qUALITAETBYTEESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDCPackage.OBSDEUPT1HT2M_TYPE__QUALITAETBYTE, oldQUALITAETBYTE, qUALITAETBYTE, !oldQUALITAETBYTEESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetQUALITAETBYTE() {
		BigDecimal oldQUALITAETBYTE = qUALITAETBYTE;
		boolean oldQUALITAETBYTEESet = qUALITAETBYTEESet;
		qUALITAETBYTE = QUALITAETBYTE_EDEFAULT;
		qUALITAETBYTEESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDCPackage.OBSDEUPT1HT2M_TYPE__QUALITAETBYTE, oldQUALITAETBYTE, QUALITAETBYTE_EDEFAULT, oldQUALITAETBYTEESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetQUALITAETBYTE() {
		return qUALITAETBYTEESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQUALITAETNIVEAU() {
		return qUALITAETNIVEAU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQUALITAETNIVEAU(BigDecimal newQUALITAETNIVEAU) {
		BigDecimal oldQUALITAETNIVEAU = qUALITAETNIVEAU;
		qUALITAETNIVEAU = newQUALITAETNIVEAU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDCPackage.OBSDEUPT1HT2M_TYPE__QUALITAETNIVEAU, oldQUALITAETNIVEAU, qUALITAETNIVEAU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDCPackage.OBSDEUPT1HT2M_TYPE__SDOGEOM:
				return basicUnsetSDOGEOM(msgs);
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
			case CDCPackage.OBSDEUPT1HT2M_TYPE__SDOGEOM:
				return getSDOGEOM();
			case CDCPackage.OBSDEUPT1HT2M_TYPE__SDOTYPE:
				return getSDOTYPE();
			case CDCPackage.OBSDEUPT1HT2M_TYPE__SDOGUID:
				return getSDOGUID();
			case CDCPackage.OBSDEUPT1HT2M_TYPE__SDOCODE:
				return getSDOCODE();
			case CDCPackage.OBSDEUPT1HT2M_TYPE__SDONAME:
				return getSDONAME();
			case CDCPackage.OBSDEUPT1HT2M_TYPE__ZEITSTEMPEL:
				return getZEITSTEMPEL();
			case CDCPackage.OBSDEUPT1HT2M_TYPE__ZEITINTERVALL:
				return getZEITINTERVALL();
			case CDCPackage.OBSDEUPT1HT2M_TYPE__WERT:
				return getWERT();
			case CDCPackage.OBSDEUPT1HT2M_TYPE__EINHEIT:
				return getEINHEIT();
			case CDCPackage.OBSDEUPT1HT2M_TYPE__QUALITAETBYTE:
				return getQUALITAETBYTE();
			case CDCPackage.OBSDEUPT1HT2M_TYPE__QUALITAETNIVEAU:
				return getQUALITAETNIVEAU();
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
			case CDCPackage.OBSDEUPT1HT2M_TYPE__SDOGEOM:
				setSDOGEOM((GeometryPropertyType)newValue);
				return;
			case CDCPackage.OBSDEUPT1HT2M_TYPE__SDOTYPE:
				setSDOTYPE((String)newValue);
				return;
			case CDCPackage.OBSDEUPT1HT2M_TYPE__SDOGUID:
				setSDOGUID((BigDecimal)newValue);
				return;
			case CDCPackage.OBSDEUPT1HT2M_TYPE__SDOCODE:
				setSDOCODE((String)newValue);
				return;
			case CDCPackage.OBSDEUPT1HT2M_TYPE__SDONAME:
				setSDONAME((String)newValue);
				return;
			case CDCPackage.OBSDEUPT1HT2M_TYPE__ZEITSTEMPEL:
				setZEITSTEMPEL((XMLGregorianCalendar)newValue);
				return;
			case CDCPackage.OBSDEUPT1HT2M_TYPE__ZEITINTERVALL:
				setZEITINTERVALL((String)newValue);
				return;
			case CDCPackage.OBSDEUPT1HT2M_TYPE__WERT:
				setWERT((BigDecimal)newValue);
				return;
			case CDCPackage.OBSDEUPT1HT2M_TYPE__EINHEIT:
				setEINHEIT((String)newValue);
				return;
			case CDCPackage.OBSDEUPT1HT2M_TYPE__QUALITAETBYTE:
				setQUALITAETBYTE((BigDecimal)newValue);
				return;
			case CDCPackage.OBSDEUPT1HT2M_TYPE__QUALITAETNIVEAU:
				setQUALITAETNIVEAU((BigDecimal)newValue);
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
			case CDCPackage.OBSDEUPT1HT2M_TYPE__SDOGEOM:
				unsetSDOGEOM();
				return;
			case CDCPackage.OBSDEUPT1HT2M_TYPE__SDOTYPE:
				unsetSDOTYPE();
				return;
			case CDCPackage.OBSDEUPT1HT2M_TYPE__SDOGUID:
				setSDOGUID(SDOGUID_EDEFAULT);
				return;
			case CDCPackage.OBSDEUPT1HT2M_TYPE__SDOCODE:
				setSDOCODE(SDOCODE_EDEFAULT);
				return;
			case CDCPackage.OBSDEUPT1HT2M_TYPE__SDONAME:
				setSDONAME(SDONAME_EDEFAULT);
				return;
			case CDCPackage.OBSDEUPT1HT2M_TYPE__ZEITSTEMPEL:
				setZEITSTEMPEL(ZEITSTEMPEL_EDEFAULT);
				return;
			case CDCPackage.OBSDEUPT1HT2M_TYPE__ZEITINTERVALL:
				setZEITINTERVALL(ZEITINTERVALL_EDEFAULT);
				return;
			case CDCPackage.OBSDEUPT1HT2M_TYPE__WERT:
				setWERT(WERT_EDEFAULT);
				return;
			case CDCPackage.OBSDEUPT1HT2M_TYPE__EINHEIT:
				setEINHEIT(EINHEIT_EDEFAULT);
				return;
			case CDCPackage.OBSDEUPT1HT2M_TYPE__QUALITAETBYTE:
				unsetQUALITAETBYTE();
				return;
			case CDCPackage.OBSDEUPT1HT2M_TYPE__QUALITAETNIVEAU:
				setQUALITAETNIVEAU(QUALITAETNIVEAU_EDEFAULT);
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
			case CDCPackage.OBSDEUPT1HT2M_TYPE__SDOGEOM:
				return isSetSDOGEOM();
			case CDCPackage.OBSDEUPT1HT2M_TYPE__SDOTYPE:
				return isSetSDOTYPE();
			case CDCPackage.OBSDEUPT1HT2M_TYPE__SDOGUID:
				return SDOGUID_EDEFAULT == null ? sDOGUID != null : !SDOGUID_EDEFAULT.equals(sDOGUID);
			case CDCPackage.OBSDEUPT1HT2M_TYPE__SDOCODE:
				return SDOCODE_EDEFAULT == null ? sDOCODE != null : !SDOCODE_EDEFAULT.equals(sDOCODE);
			case CDCPackage.OBSDEUPT1HT2M_TYPE__SDONAME:
				return SDONAME_EDEFAULT == null ? sDONAME != null : !SDONAME_EDEFAULT.equals(sDONAME);
			case CDCPackage.OBSDEUPT1HT2M_TYPE__ZEITSTEMPEL:
				return ZEITSTEMPEL_EDEFAULT == null ? zEITSTEMPEL != null : !ZEITSTEMPEL_EDEFAULT.equals(zEITSTEMPEL);
			case CDCPackage.OBSDEUPT1HT2M_TYPE__ZEITINTERVALL:
				return ZEITINTERVALL_EDEFAULT == null ? zEITINTERVALL != null : !ZEITINTERVALL_EDEFAULT.equals(zEITINTERVALL);
			case CDCPackage.OBSDEUPT1HT2M_TYPE__WERT:
				return WERT_EDEFAULT == null ? wERT != null : !WERT_EDEFAULT.equals(wERT);
			case CDCPackage.OBSDEUPT1HT2M_TYPE__EINHEIT:
				return EINHEIT_EDEFAULT == null ? eINHEIT != null : !EINHEIT_EDEFAULT.equals(eINHEIT);
			case CDCPackage.OBSDEUPT1HT2M_TYPE__QUALITAETBYTE:
				return isSetQUALITAETBYTE();
			case CDCPackage.OBSDEUPT1HT2M_TYPE__QUALITAETNIVEAU:
				return QUALITAETNIVEAU_EDEFAULT == null ? qUALITAETNIVEAU != null : !QUALITAETNIVEAU_EDEFAULT.equals(qUALITAETNIVEAU);
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
		result.append(" (sDOTYPE: ");
		if (sDOTYPEESet) result.append(sDOTYPE); else result.append("<unset>");
		result.append(", sDOGUID: ");
		result.append(sDOGUID);
		result.append(", sDOCODE: ");
		result.append(sDOCODE);
		result.append(", sDONAME: ");
		result.append(sDONAME);
		result.append(", zEITSTEMPEL: ");
		result.append(zEITSTEMPEL);
		result.append(", zEITINTERVALL: ");
		result.append(zEITINTERVALL);
		result.append(", wERT: ");
		result.append(wERT);
		result.append(", eINHEIT: ");
		result.append(eINHEIT);
		result.append(", qUALITAETBYTE: ");
		if (qUALITAETBYTEESet) result.append(qUALITAETBYTE); else result.append("<unset>");
		result.append(", qUALITAETNIVEAU: ");
		result.append(qUALITAETNIVEAU);
		result.append(')');
		return result.toString();
	}

} //OBSDEUPT1HT2MTypeImpl
