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
package org.xmlsoap.schemas.envelope.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xmlsoap.schemas.envelope.Body;
import org.xmlsoap.schemas.envelope.DocumentRoot;
import org.xmlsoap.schemas.envelope.Envelope;
import org.xmlsoap.schemas.envelope.EnvelopePackage;
import org.xmlsoap.schemas.envelope.Fault;
import org.xmlsoap.schemas.envelope.Header;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.envelope.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.envelope.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.envelope.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.envelope.impl.DocumentRootImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.envelope.impl.DocumentRootImpl#getEnvelope <em>Envelope</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.envelope.impl.DocumentRootImpl#getFault <em>Fault</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.envelope.impl.DocumentRootImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.envelope.impl.DocumentRootImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.envelope.impl.DocumentRootImpl#getEncodingStyle <em>Encoding Style</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.envelope.impl.DocumentRootImpl#isMustUnderstand <em>Must Understand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getActor() <em>Actor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected String actor = ACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncodingStyle() <em>Encoding Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncodingStyle()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> ENCODING_STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncodingStyle() <em>Encoding Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncodingStyle()
	 * @generated
	 * @ordered
	 */
	protected List<String> encodingStyle = ENCODING_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMustUnderstand() <em>Must Understand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustUnderstand()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUST_UNDERSTAND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMustUnderstand() <em>Must Understand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustUnderstand()
	 * @generated
	 * @ordered
	 */
	protected boolean mustUnderstand = MUST_UNDERSTAND_EDEFAULT;

	/**
	 * This is true if the Must Understand attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mustUnderstandESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnvelopePackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, EnvelopePackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, EnvelopePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, EnvelopePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Body getBody() {
		return (Body)getMixed().get(EnvelopePackage.Literals.DOCUMENT_ROOT__BODY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Body newBody, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EnvelopePackage.Literals.DOCUMENT_ROOT__BODY, newBody, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBody(Body newBody) {
		((FeatureMap.Internal)getMixed()).set(EnvelopePackage.Literals.DOCUMENT_ROOT__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Envelope getEnvelope() {
		return (Envelope)getMixed().get(EnvelopePackage.Literals.DOCUMENT_ROOT__ENVELOPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvelope(Envelope newEnvelope, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EnvelopePackage.Literals.DOCUMENT_ROOT__ENVELOPE, newEnvelope, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnvelope(Envelope newEnvelope) {
		((FeatureMap.Internal)getMixed()).set(EnvelopePackage.Literals.DOCUMENT_ROOT__ENVELOPE, newEnvelope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fault getFault() {
		return (Fault)getMixed().get(EnvelopePackage.Literals.DOCUMENT_ROOT__FAULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFault(Fault newFault, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EnvelopePackage.Literals.DOCUMENT_ROOT__FAULT, newFault, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFault(Fault newFault) {
		((FeatureMap.Internal)getMixed()).set(EnvelopePackage.Literals.DOCUMENT_ROOT__FAULT, newFault);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Header getHeader() {
		return (Header)getMixed().get(EnvelopePackage.Literals.DOCUMENT_ROOT__HEADER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(Header newHeader, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EnvelopePackage.Literals.DOCUMENT_ROOT__HEADER, newHeader, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeader(Header newHeader) {
		((FeatureMap.Internal)getMixed()).set(EnvelopePackage.Literals.DOCUMENT_ROOT__HEADER, newHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActor() {
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActor(String newActor) {
		String oldActor = actor;
		actor = newActor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvelopePackage.DOCUMENT_ROOT__ACTOR, oldActor, actor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getEncodingStyle() {
		return encodingStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncodingStyle(List<String> newEncodingStyle) {
		List<String> oldEncodingStyle = encodingStyle;
		encodingStyle = newEncodingStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvelopePackage.DOCUMENT_ROOT__ENCODING_STYLE, oldEncodingStyle, encodingStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMustUnderstand() {
		return mustUnderstand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMustUnderstand(boolean newMustUnderstand) {
		boolean oldMustUnderstand = mustUnderstand;
		mustUnderstand = newMustUnderstand;
		boolean oldMustUnderstandESet = mustUnderstandESet;
		mustUnderstandESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvelopePackage.DOCUMENT_ROOT__MUST_UNDERSTAND, oldMustUnderstand, mustUnderstand, !oldMustUnderstandESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMustUnderstand() {
		boolean oldMustUnderstand = mustUnderstand;
		boolean oldMustUnderstandESet = mustUnderstandESet;
		mustUnderstand = MUST_UNDERSTAND_EDEFAULT;
		mustUnderstandESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EnvelopePackage.DOCUMENT_ROOT__MUST_UNDERSTAND, oldMustUnderstand, MUST_UNDERSTAND_EDEFAULT, oldMustUnderstandESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMustUnderstand() {
		return mustUnderstandESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EnvelopePackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case EnvelopePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case EnvelopePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case EnvelopePackage.DOCUMENT_ROOT__BODY:
				return basicSetBody(null, msgs);
			case EnvelopePackage.DOCUMENT_ROOT__ENVELOPE:
				return basicSetEnvelope(null, msgs);
			case EnvelopePackage.DOCUMENT_ROOT__FAULT:
				return basicSetFault(null, msgs);
			case EnvelopePackage.DOCUMENT_ROOT__HEADER:
				return basicSetHeader(null, msgs);
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
			case EnvelopePackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case EnvelopePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case EnvelopePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case EnvelopePackage.DOCUMENT_ROOT__BODY:
				return getBody();
			case EnvelopePackage.DOCUMENT_ROOT__ENVELOPE:
				return getEnvelope();
			case EnvelopePackage.DOCUMENT_ROOT__FAULT:
				return getFault();
			case EnvelopePackage.DOCUMENT_ROOT__HEADER:
				return getHeader();
			case EnvelopePackage.DOCUMENT_ROOT__ACTOR:
				return getActor();
			case EnvelopePackage.DOCUMENT_ROOT__ENCODING_STYLE:
				return getEncodingStyle();
			case EnvelopePackage.DOCUMENT_ROOT__MUST_UNDERSTAND:
				return isMustUnderstand();
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
			case EnvelopePackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case EnvelopePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case EnvelopePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case EnvelopePackage.DOCUMENT_ROOT__BODY:
				setBody((Body)newValue);
				return;
			case EnvelopePackage.DOCUMENT_ROOT__ENVELOPE:
				setEnvelope((Envelope)newValue);
				return;
			case EnvelopePackage.DOCUMENT_ROOT__FAULT:
				setFault((Fault)newValue);
				return;
			case EnvelopePackage.DOCUMENT_ROOT__HEADER:
				setHeader((Header)newValue);
				return;
			case EnvelopePackage.DOCUMENT_ROOT__ACTOR:
				setActor((String)newValue);
				return;
			case EnvelopePackage.DOCUMENT_ROOT__ENCODING_STYLE:
				setEncodingStyle((List<String>)newValue);
				return;
			case EnvelopePackage.DOCUMENT_ROOT__MUST_UNDERSTAND:
				setMustUnderstand((Boolean)newValue);
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
			case EnvelopePackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case EnvelopePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case EnvelopePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case EnvelopePackage.DOCUMENT_ROOT__BODY:
				setBody((Body)null);
				return;
			case EnvelopePackage.DOCUMENT_ROOT__ENVELOPE:
				setEnvelope((Envelope)null);
				return;
			case EnvelopePackage.DOCUMENT_ROOT__FAULT:
				setFault((Fault)null);
				return;
			case EnvelopePackage.DOCUMENT_ROOT__HEADER:
				setHeader((Header)null);
				return;
			case EnvelopePackage.DOCUMENT_ROOT__ACTOR:
				setActor(ACTOR_EDEFAULT);
				return;
			case EnvelopePackage.DOCUMENT_ROOT__ENCODING_STYLE:
				setEncodingStyle(ENCODING_STYLE_EDEFAULT);
				return;
			case EnvelopePackage.DOCUMENT_ROOT__MUST_UNDERSTAND:
				unsetMustUnderstand();
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
			case EnvelopePackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case EnvelopePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case EnvelopePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case EnvelopePackage.DOCUMENT_ROOT__BODY:
				return getBody() != null;
			case EnvelopePackage.DOCUMENT_ROOT__ENVELOPE:
				return getEnvelope() != null;
			case EnvelopePackage.DOCUMENT_ROOT__FAULT:
				return getFault() != null;
			case EnvelopePackage.DOCUMENT_ROOT__HEADER:
				return getHeader() != null;
			case EnvelopePackage.DOCUMENT_ROOT__ACTOR:
				return ACTOR_EDEFAULT == null ? actor != null : !ACTOR_EDEFAULT.equals(actor);
			case EnvelopePackage.DOCUMENT_ROOT__ENCODING_STYLE:
				return ENCODING_STYLE_EDEFAULT == null ? encodingStyle != null : !ENCODING_STYLE_EDEFAULT.equals(encodingStyle);
			case EnvelopePackage.DOCUMENT_ROOT__MUST_UNDERSTAND:
				return isSetMustUnderstand();
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", actor: ");
		result.append(actor);
		result.append(", encodingStyle: ");
		result.append(encodingStyle);
		result.append(", mustUnderstand: ");
		if (mustUnderstandESet) result.append(mustUnderstand); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
