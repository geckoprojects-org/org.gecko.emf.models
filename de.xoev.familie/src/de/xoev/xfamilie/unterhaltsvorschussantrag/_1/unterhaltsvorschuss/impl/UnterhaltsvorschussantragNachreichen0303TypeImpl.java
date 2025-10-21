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

import de.xoev.xfamilie.baukasten._1.baukasten.DatenschutzerklaerungenType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import de.xoev.xfamilie.baukasten._1.baukasten.impl.AntragsnachrichtTypeImpl;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AngabenKindNachreichenType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BestaetigungAngabenType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Unterhaltsvorschussantrag Nachreichen0303 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragNachreichen0303TypeImpl#getFallnummerUVO <em>Fallnummer UVO</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragNachreichen0303TypeImpl#getAngabenKindNachreichen <em>Angaben Kind Nachreichen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragNachreichen0303TypeImpl#getAenderungsmitteilung <em>Aenderungsmitteilung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragNachreichen0303TypeImpl#getNachzureichendesDokument <em>Nachzureichendes Dokument</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragNachreichen0303TypeImpl#getDsgvo <em>Dsgvo</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragNachreichen0303TypeImpl#isArtSignaturDigital <em>Art Signatur Digital</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragNachreichen0303TypeImpl#getBestaetigungAngaben <em>Bestaetigung Angaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragNachreichen0303TypeImpl#isMerkblattUVG <em>Merkblatt UVG</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnterhaltsvorschussantragNachreichen0303TypeImpl extends AntragsnachrichtTypeImpl implements UnterhaltsvorschussantragNachreichen0303Type {
	/**
	 * The default value of the '{@link #getFallnummerUVO() <em>Fallnummer UVO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFallnummerUVO()
	 * @generated
	 * @ordered
	 */
	protected static final String FALLNUMMER_UVO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFallnummerUVO() <em>Fallnummer UVO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFallnummerUVO()
	 * @generated
	 * @ordered
	 */
	protected String fallnummerUVO = FALLNUMMER_UVO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAngabenKindNachreichen() <em>Angaben Kind Nachreichen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenKindNachreichen()
	 * @generated
	 * @ordered
	 */
	protected AngabenKindNachreichenType angabenKindNachreichen;

	/**
	 * The default value of the '{@link #getAenderungsmitteilung() <em>Aenderungsmitteilung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAenderungsmitteilung()
	 * @generated
	 * @ordered
	 */
	protected static final String AENDERUNGSMITTEILUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAenderungsmitteilung() <em>Aenderungsmitteilung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAenderungsmitteilung()
	 * @generated
	 * @ordered
	 */
	protected String aenderungsmitteilung = AENDERUNGSMITTEILUNG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNachzureichendesDokument() <em>Nachzureichendes Dokument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachzureichendesDokument()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachzureichendesDokument;

	/**
	 * The cached value of the '{@link #getDsgvo() <em>Dsgvo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDsgvo()
	 * @generated
	 * @ordered
	 */
	protected DatenschutzerklaerungenType dsgvo;

	/**
	 * The default value of the '{@link #isArtSignaturDigital() <em>Art Signatur Digital</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArtSignaturDigital()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ART_SIGNATUR_DIGITAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isArtSignaturDigital() <em>Art Signatur Digital</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArtSignaturDigital()
	 * @generated
	 * @ordered
	 */
	protected boolean artSignaturDigital = ART_SIGNATUR_DIGITAL_EDEFAULT;

	/**
	 * This is true if the Art Signatur Digital attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean artSignaturDigitalESet;

	/**
	 * The cached value of the '{@link #getBestaetigungAngaben() <em>Bestaetigung Angaben</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBestaetigungAngaben()
	 * @generated
	 * @ordered
	 */
	protected BestaetigungAngabenType bestaetigungAngaben;

	/**
	 * The default value of the '{@link #isMerkblattUVG() <em>Merkblatt UVG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMerkblattUVG()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MERKBLATT_UVG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMerkblattUVG() <em>Merkblatt UVG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMerkblattUVG()
	 * @generated
	 * @ordered
	 */
	protected boolean merkblattUVG = MERKBLATT_UVG_EDEFAULT;

	/**
	 * This is true if the Merkblatt UVG attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean merkblattUVGESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnterhaltsvorschussantragNachreichen0303TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getUnterhaltsvorschussantragNachreichen0303Type();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFallnummerUVO() {
		return fallnummerUVO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFallnummerUVO(String newFallnummerUVO) {
		String oldFallnummerUVO = fallnummerUVO;
		fallnummerUVO = newFallnummerUVO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__FALLNUMMER_UVO, oldFallnummerUVO, fallnummerUVO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenKindNachreichenType getAngabenKindNachreichen() {
		return angabenKindNachreichen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngabenKindNachreichen(AngabenKindNachreichenType newAngabenKindNachreichen, NotificationChain msgs) {
		AngabenKindNachreichenType oldAngabenKindNachreichen = angabenKindNachreichen;
		angabenKindNachreichen = newAngabenKindNachreichen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__ANGABEN_KIND_NACHREICHEN, oldAngabenKindNachreichen, newAngabenKindNachreichen);
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
	public void setAngabenKindNachreichen(AngabenKindNachreichenType newAngabenKindNachreichen) {
		if (newAngabenKindNachreichen != angabenKindNachreichen) {
			NotificationChain msgs = null;
			if (angabenKindNachreichen != null)
				msgs = ((InternalEObject)angabenKindNachreichen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__ANGABEN_KIND_NACHREICHEN, null, msgs);
			if (newAngabenKindNachreichen != null)
				msgs = ((InternalEObject)newAngabenKindNachreichen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__ANGABEN_KIND_NACHREICHEN, null, msgs);
			msgs = basicSetAngabenKindNachreichen(newAngabenKindNachreichen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__ANGABEN_KIND_NACHREICHEN, newAngabenKindNachreichen, newAngabenKindNachreichen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAenderungsmitteilung() {
		return aenderungsmitteilung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAenderungsmitteilung(String newAenderungsmitteilung) {
		String oldAenderungsmitteilung = aenderungsmitteilung;
		aenderungsmitteilung = newAenderungsmitteilung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__AENDERUNGSMITTEILUNG, oldAenderungsmitteilung, aenderungsmitteilung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachzureichendesDokument() {
		if (nachzureichendesDokument == null) {
			nachzureichendesDokument = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__NACHZUREICHENDES_DOKUMENT);
		}
		return nachzureichendesDokument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatenschutzerklaerungenType getDsgvo() {
		return dsgvo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDsgvo(DatenschutzerklaerungenType newDsgvo, NotificationChain msgs) {
		DatenschutzerklaerungenType oldDsgvo = dsgvo;
		dsgvo = newDsgvo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__DSGVO, oldDsgvo, newDsgvo);
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
	public void setDsgvo(DatenschutzerklaerungenType newDsgvo) {
		if (newDsgvo != dsgvo) {
			NotificationChain msgs = null;
			if (dsgvo != null)
				msgs = ((InternalEObject)dsgvo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__DSGVO, null, msgs);
			if (newDsgvo != null)
				msgs = ((InternalEObject)newDsgvo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__DSGVO, null, msgs);
			msgs = basicSetDsgvo(newDsgvo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__DSGVO, newDsgvo, newDsgvo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isArtSignaturDigital() {
		return artSignaturDigital;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtSignaturDigital(boolean newArtSignaturDigital) {
		boolean oldArtSignaturDigital = artSignaturDigital;
		artSignaturDigital = newArtSignaturDigital;
		boolean oldArtSignaturDigitalESet = artSignaturDigitalESet;
		artSignaturDigitalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__ART_SIGNATUR_DIGITAL, oldArtSignaturDigital, artSignaturDigital, !oldArtSignaturDigitalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetArtSignaturDigital() {
		boolean oldArtSignaturDigital = artSignaturDigital;
		boolean oldArtSignaturDigitalESet = artSignaturDigitalESet;
		artSignaturDigital = ART_SIGNATUR_DIGITAL_EDEFAULT;
		artSignaturDigitalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__ART_SIGNATUR_DIGITAL, oldArtSignaturDigital, ART_SIGNATUR_DIGITAL_EDEFAULT, oldArtSignaturDigitalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetArtSignaturDigital() {
		return artSignaturDigitalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BestaetigungAngabenType getBestaetigungAngaben() {
		return bestaetigungAngaben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBestaetigungAngaben(BestaetigungAngabenType newBestaetigungAngaben, NotificationChain msgs) {
		BestaetigungAngabenType oldBestaetigungAngaben = bestaetigungAngaben;
		bestaetigungAngaben = newBestaetigungAngaben;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__BESTAETIGUNG_ANGABEN, oldBestaetigungAngaben, newBestaetigungAngaben);
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
	public void setBestaetigungAngaben(BestaetigungAngabenType newBestaetigungAngaben) {
		if (newBestaetigungAngaben != bestaetigungAngaben) {
			NotificationChain msgs = null;
			if (bestaetigungAngaben != null)
				msgs = ((InternalEObject)bestaetigungAngaben).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__BESTAETIGUNG_ANGABEN, null, msgs);
			if (newBestaetigungAngaben != null)
				msgs = ((InternalEObject)newBestaetigungAngaben).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__BESTAETIGUNG_ANGABEN, null, msgs);
			msgs = basicSetBestaetigungAngaben(newBestaetigungAngaben, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__BESTAETIGUNG_ANGABEN, newBestaetigungAngaben, newBestaetigungAngaben));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMerkblattUVG() {
		return merkblattUVG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMerkblattUVG(boolean newMerkblattUVG) {
		boolean oldMerkblattUVG = merkblattUVG;
		merkblattUVG = newMerkblattUVG;
		boolean oldMerkblattUVGESet = merkblattUVGESet;
		merkblattUVGESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__MERKBLATT_UVG, oldMerkblattUVG, merkblattUVG, !oldMerkblattUVGESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMerkblattUVG() {
		boolean oldMerkblattUVG = merkblattUVG;
		boolean oldMerkblattUVGESet = merkblattUVGESet;
		merkblattUVG = MERKBLATT_UVG_EDEFAULT;
		merkblattUVGESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__MERKBLATT_UVG, oldMerkblattUVG, MERKBLATT_UVG_EDEFAULT, oldMerkblattUVGESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMerkblattUVG() {
		return merkblattUVGESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__ANGABEN_KIND_NACHREICHEN:
				return basicSetAngabenKindNachreichen(null, msgs);
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__NACHZUREICHENDES_DOKUMENT:
				return ((InternalEList<?>)getNachzureichendesDokument()).basicRemove(otherEnd, msgs);
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__DSGVO:
				return basicSetDsgvo(null, msgs);
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__BESTAETIGUNG_ANGABEN:
				return basicSetBestaetigungAngaben(null, msgs);
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
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__FALLNUMMER_UVO:
				return getFallnummerUVO();
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__ANGABEN_KIND_NACHREICHEN:
				return getAngabenKindNachreichen();
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__AENDERUNGSMITTEILUNG:
				return getAenderungsmitteilung();
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__NACHZUREICHENDES_DOKUMENT:
				return getNachzureichendesDokument();
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__DSGVO:
				return getDsgvo();
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__ART_SIGNATUR_DIGITAL:
				return isArtSignaturDigital();
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__BESTAETIGUNG_ANGABEN:
				return getBestaetigungAngaben();
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__MERKBLATT_UVG:
				return isMerkblattUVG();
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
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__FALLNUMMER_UVO:
				setFallnummerUVO((String)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__ANGABEN_KIND_NACHREICHEN:
				setAngabenKindNachreichen((AngabenKindNachreichenType)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__AENDERUNGSMITTEILUNG:
				setAenderungsmitteilung((String)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__NACHZUREICHENDES_DOKUMENT:
				getNachzureichendesDokument().clear();
				getNachzureichendesDokument().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__DSGVO:
				setDsgvo((DatenschutzerklaerungenType)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__ART_SIGNATUR_DIGITAL:
				setArtSignaturDigital((Boolean)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__BESTAETIGUNG_ANGABEN:
				setBestaetigungAngaben((BestaetigungAngabenType)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__MERKBLATT_UVG:
				setMerkblattUVG((Boolean)newValue);
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
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__FALLNUMMER_UVO:
				setFallnummerUVO(FALLNUMMER_UVO_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__ANGABEN_KIND_NACHREICHEN:
				setAngabenKindNachreichen((AngabenKindNachreichenType)null);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__AENDERUNGSMITTEILUNG:
				setAenderungsmitteilung(AENDERUNGSMITTEILUNG_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__NACHZUREICHENDES_DOKUMENT:
				getNachzureichendesDokument().clear();
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__DSGVO:
				setDsgvo((DatenschutzerklaerungenType)null);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__ART_SIGNATUR_DIGITAL:
				unsetArtSignaturDigital();
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__BESTAETIGUNG_ANGABEN:
				setBestaetigungAngaben((BestaetigungAngabenType)null);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__MERKBLATT_UVG:
				unsetMerkblattUVG();
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
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__FALLNUMMER_UVO:
				return FALLNUMMER_UVO_EDEFAULT == null ? fallnummerUVO != null : !FALLNUMMER_UVO_EDEFAULT.equals(fallnummerUVO);
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__ANGABEN_KIND_NACHREICHEN:
				return angabenKindNachreichen != null;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__AENDERUNGSMITTEILUNG:
				return AENDERUNGSMITTEILUNG_EDEFAULT == null ? aenderungsmitteilung != null : !AENDERUNGSMITTEILUNG_EDEFAULT.equals(aenderungsmitteilung);
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__NACHZUREICHENDES_DOKUMENT:
				return nachzureichendesDokument != null && !nachzureichendesDokument.isEmpty();
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__DSGVO:
				return dsgvo != null;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__ART_SIGNATUR_DIGITAL:
				return isSetArtSignaturDigital();
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__BESTAETIGUNG_ANGABEN:
				return bestaetigungAngaben != null;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__MERKBLATT_UVG:
				return isSetMerkblattUVG();
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
		result.append(" (fallnummerUVO: ");
		result.append(fallnummerUVO);
		result.append(", aenderungsmitteilung: ");
		result.append(aenderungsmitteilung);
		result.append(", artSignaturDigital: ");
		if (artSignaturDigitalESet) result.append(artSignaturDigital); else result.append("<unset>");
		result.append(", merkblattUVG: ");
		if (merkblattUVGESet) result.append(merkblattUVG); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UnterhaltsvorschussantragNachreichen0303TypeImpl
