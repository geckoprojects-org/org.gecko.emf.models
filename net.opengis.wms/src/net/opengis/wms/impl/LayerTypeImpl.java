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
package net.opengis.wms.impl;

import java.math.BigInteger;

import java.util.Collection;

import net.opengis.wms.AttributionType;
import net.opengis.wms.AuthorityURLType;
import net.opengis.wms.BoundingBoxType;
import net.opengis.wms.DataURLType;
import net.opengis.wms.DimensionType;
import net.opengis.wms.EXGeographicBoundingBoxType;
import net.opengis.wms.FeatureListURLType;
import net.opengis.wms.IdentifierType;
import net.opengis.wms.KeywordListType;
import net.opengis.wms.LayerType;
import net.opengis.wms.MetadataURLType;
import net.opengis.wms.StyleType;
import net.opengis.wms.WMSPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wms.impl.LayerTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.opengis.wms.impl.LayerTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link net.opengis.wms.impl.LayerTypeImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link net.opengis.wms.impl.LayerTypeImpl#getKeywordList <em>Keyword List</em>}</li>
 *   <li>{@link net.opengis.wms.impl.LayerTypeImpl#getCRS <em>CRS</em>}</li>
 *   <li>{@link net.opengis.wms.impl.LayerTypeImpl#getEXGeographicBoundingBox <em>EX Geographic Bounding Box</em>}</li>
 *   <li>{@link net.opengis.wms.impl.LayerTypeImpl#getBoundingBox <em>Bounding Box</em>}</li>
 *   <li>{@link net.opengis.wms.impl.LayerTypeImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link net.opengis.wms.impl.LayerTypeImpl#getAttribution <em>Attribution</em>}</li>
 *   <li>{@link net.opengis.wms.impl.LayerTypeImpl#getAuthorityURL <em>Authority URL</em>}</li>
 *   <li>{@link net.opengis.wms.impl.LayerTypeImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link net.opengis.wms.impl.LayerTypeImpl#getMetadataURL <em>Metadata URL</em>}</li>
 *   <li>{@link net.opengis.wms.impl.LayerTypeImpl#getDataURL <em>Data URL</em>}</li>
 *   <li>{@link net.opengis.wms.impl.LayerTypeImpl#getFeatureListURL <em>Feature List URL</em>}</li>
 *   <li>{@link net.opengis.wms.impl.LayerTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link net.opengis.wms.impl.LayerTypeImpl#getMinScaleDenominator <em>Min Scale Denominator</em>}</li>
 *   <li>{@link net.opengis.wms.impl.LayerTypeImpl#getMaxScaleDenominator <em>Max Scale Denominator</em>}</li>
 *   <li>{@link net.opengis.wms.impl.LayerTypeImpl#getLayer <em>Layer</em>}</li>
 *   <li>{@link net.opengis.wms.impl.LayerTypeImpl#getCascaded <em>Cascaded</em>}</li>
 *   <li>{@link net.opengis.wms.impl.LayerTypeImpl#getFixedHeight <em>Fixed Height</em>}</li>
 *   <li>{@link net.opengis.wms.impl.LayerTypeImpl#getFixedWidth <em>Fixed Width</em>}</li>
 *   <li>{@link net.opengis.wms.impl.LayerTypeImpl#isNoSubsets <em>No Subsets</em>}</li>
 *   <li>{@link net.opengis.wms.impl.LayerTypeImpl#isOpaque <em>Opaque</em>}</li>
 *   <li>{@link net.opengis.wms.impl.LayerTypeImpl#isQueryable <em>Queryable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayerTypeImpl extends MinimalEObjectImpl.Container implements LayerType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSTRACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected String abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKeywordList() <em>Keyword List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywordList()
	 * @generated
	 * @ordered
	 */
	protected KeywordListType keywordList;

	/**
	 * The cached value of the '{@link #getCRS() <em>CRS</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCRS()
	 * @generated
	 * @ordered
	 */
	protected EList<String> cRS;

	/**
	 * The cached value of the '{@link #getEXGeographicBoundingBox() <em>EX Geographic Bounding Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEXGeographicBoundingBox()
	 * @generated
	 * @ordered
	 */
	protected EXGeographicBoundingBoxType eXGeographicBoundingBox;

	/**
	 * The cached value of the '{@link #getBoundingBox() <em>Bounding Box</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundingBox()
	 * @generated
	 * @ordered
	 */
	protected EList<BoundingBoxType> boundingBox;

	/**
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected EList<DimensionType> dimension;

	/**
	 * The cached value of the '{@link #getAttribution() <em>Attribution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribution()
	 * @generated
	 * @ordered
	 */
	protected AttributionType attribution;

	/**
	 * The cached value of the '{@link #getAuthorityURL() <em>Authority URL</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorityURL()
	 * @generated
	 * @ordered
	 */
	protected EList<AuthorityURLType> authorityURL;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentifierType> identifier;

	/**
	 * The cached value of the '{@link #getMetadataURL() <em>Metadata URL</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataURL()
	 * @generated
	 * @ordered
	 */
	protected EList<MetadataURLType> metadataURL;

	/**
	 * The cached value of the '{@link #getDataURL() <em>Data URL</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataURL()
	 * @generated
	 * @ordered
	 */
	protected EList<DataURLType> dataURL;

	/**
	 * The cached value of the '{@link #getFeatureListURL() <em>Feature List URL</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureListURL()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureListURLType> featureListURL;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected EList<StyleType> style;

	/**
	 * The default value of the '{@link #getMinScaleDenominator() <em>Min Scale Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinScaleDenominator()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_SCALE_DENOMINATOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinScaleDenominator() <em>Min Scale Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinScaleDenominator()
	 * @generated
	 * @ordered
	 */
	protected double minScaleDenominator = MIN_SCALE_DENOMINATOR_EDEFAULT;

	/**
	 * This is true if the Min Scale Denominator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minScaleDenominatorESet;

	/**
	 * The default value of the '{@link #getMaxScaleDenominator() <em>Max Scale Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxScaleDenominator()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_SCALE_DENOMINATOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxScaleDenominator() <em>Max Scale Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxScaleDenominator()
	 * @generated
	 * @ordered
	 */
	protected double maxScaleDenominator = MAX_SCALE_DENOMINATOR_EDEFAULT;

	/**
	 * This is true if the Max Scale Denominator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxScaleDenominatorESet;

	/**
	 * The cached value of the '{@link #getLayer() <em>Layer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayer()
	 * @generated
	 * @ordered
	 */
	protected EList<LayerType> layer;

	/**
	 * The default value of the '{@link #getCascaded() <em>Cascaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCascaded()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CASCADED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCascaded() <em>Cascaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCascaded()
	 * @generated
	 * @ordered
	 */
	protected BigInteger cascaded = CASCADED_EDEFAULT;

	/**
	 * The default value of the '{@link #getFixedHeight() <em>Fixed Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedHeight()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FIXED_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFixedHeight() <em>Fixed Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedHeight()
	 * @generated
	 * @ordered
	 */
	protected BigInteger fixedHeight = FIXED_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFixedWidth() <em>Fixed Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedWidth()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FIXED_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFixedWidth() <em>Fixed Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedWidth()
	 * @generated
	 * @ordered
	 */
	protected BigInteger fixedWidth = FIXED_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #isNoSubsets() <em>No Subsets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoSubsets()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_SUBSETS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoSubsets() <em>No Subsets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoSubsets()
	 * @generated
	 * @ordered
	 */
	protected boolean noSubsets = NO_SUBSETS_EDEFAULT;

	/**
	 * This is true if the No Subsets attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean noSubsetsESet;

	/**
	 * The default value of the '{@link #isOpaque() <em>Opaque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpaque()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPAQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOpaque() <em>Opaque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpaque()
	 * @generated
	 * @ordered
	 */
	protected boolean opaque = OPAQUE_EDEFAULT;

	/**
	 * This is true if the Opaque attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean opaqueESet;

	/**
	 * The default value of the '{@link #isQueryable() <em>Queryable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isQueryable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean QUERYABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isQueryable() <em>Queryable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isQueryable()
	 * @generated
	 * @ordered
	 */
	protected boolean queryable = QUERYABLE_EDEFAULT;

	/**
	 * This is true if the Queryable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean queryableESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WMSPackage.Literals.LAYER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.LAYER_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.LAYER_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstract(String newAbstract) {
		String oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.LAYER_TYPE__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeywordListType getKeywordList() {
		return keywordList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeywordList(KeywordListType newKeywordList, NotificationChain msgs) {
		KeywordListType oldKeywordList = keywordList;
		keywordList = newKeywordList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WMSPackage.LAYER_TYPE__KEYWORD_LIST, oldKeywordList, newKeywordList);
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
	public void setKeywordList(KeywordListType newKeywordList) {
		if (newKeywordList != keywordList) {
			NotificationChain msgs = null;
			if (keywordList != null)
				msgs = ((InternalEObject)keywordList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WMSPackage.LAYER_TYPE__KEYWORD_LIST, null, msgs);
			if (newKeywordList != null)
				msgs = ((InternalEObject)newKeywordList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WMSPackage.LAYER_TYPE__KEYWORD_LIST, null, msgs);
			msgs = basicSetKeywordList(newKeywordList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.LAYER_TYPE__KEYWORD_LIST, newKeywordList, newKeywordList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCRS() {
		if (cRS == null) {
			cRS = new EDataTypeEList<String>(String.class, this, WMSPackage.LAYER_TYPE__CRS);
		}
		return cRS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EXGeographicBoundingBoxType getEXGeographicBoundingBox() {
		return eXGeographicBoundingBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEXGeographicBoundingBox(EXGeographicBoundingBoxType newEXGeographicBoundingBox, NotificationChain msgs) {
		EXGeographicBoundingBoxType oldEXGeographicBoundingBox = eXGeographicBoundingBox;
		eXGeographicBoundingBox = newEXGeographicBoundingBox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WMSPackage.LAYER_TYPE__EX_GEOGRAPHIC_BOUNDING_BOX, oldEXGeographicBoundingBox, newEXGeographicBoundingBox);
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
	public void setEXGeographicBoundingBox(EXGeographicBoundingBoxType newEXGeographicBoundingBox) {
		if (newEXGeographicBoundingBox != eXGeographicBoundingBox) {
			NotificationChain msgs = null;
			if (eXGeographicBoundingBox != null)
				msgs = ((InternalEObject)eXGeographicBoundingBox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WMSPackage.LAYER_TYPE__EX_GEOGRAPHIC_BOUNDING_BOX, null, msgs);
			if (newEXGeographicBoundingBox != null)
				msgs = ((InternalEObject)newEXGeographicBoundingBox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WMSPackage.LAYER_TYPE__EX_GEOGRAPHIC_BOUNDING_BOX, null, msgs);
			msgs = basicSetEXGeographicBoundingBox(newEXGeographicBoundingBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.LAYER_TYPE__EX_GEOGRAPHIC_BOUNDING_BOX, newEXGeographicBoundingBox, newEXGeographicBoundingBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoundingBoxType> getBoundingBox() {
		if (boundingBox == null) {
			boundingBox = new EObjectContainmentEList<BoundingBoxType>(BoundingBoxType.class, this, WMSPackage.LAYER_TYPE__BOUNDING_BOX);
		}
		return boundingBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DimensionType> getDimension() {
		if (dimension == null) {
			dimension = new EObjectContainmentEList<DimensionType>(DimensionType.class, this, WMSPackage.LAYER_TYPE__DIMENSION);
		}
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributionType getAttribution() {
		return attribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttribution(AttributionType newAttribution, NotificationChain msgs) {
		AttributionType oldAttribution = attribution;
		attribution = newAttribution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WMSPackage.LAYER_TYPE__ATTRIBUTION, oldAttribution, newAttribution);
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
	public void setAttribution(AttributionType newAttribution) {
		if (newAttribution != attribution) {
			NotificationChain msgs = null;
			if (attribution != null)
				msgs = ((InternalEObject)attribution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WMSPackage.LAYER_TYPE__ATTRIBUTION, null, msgs);
			if (newAttribution != null)
				msgs = ((InternalEObject)newAttribution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WMSPackage.LAYER_TYPE__ATTRIBUTION, null, msgs);
			msgs = basicSetAttribution(newAttribution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.LAYER_TYPE__ATTRIBUTION, newAttribution, newAttribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AuthorityURLType> getAuthorityURL() {
		if (authorityURL == null) {
			authorityURL = new EObjectContainmentEList<AuthorityURLType>(AuthorityURLType.class, this, WMSPackage.LAYER_TYPE__AUTHORITY_URL);
		}
		return authorityURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IdentifierType> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<IdentifierType>(IdentifierType.class, this, WMSPackage.LAYER_TYPE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetadataURLType> getMetadataURL() {
		if (metadataURL == null) {
			metadataURL = new EObjectContainmentEList<MetadataURLType>(MetadataURLType.class, this, WMSPackage.LAYER_TYPE__METADATA_URL);
		}
		return metadataURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataURLType> getDataURL() {
		if (dataURL == null) {
			dataURL = new EObjectContainmentEList<DataURLType>(DataURLType.class, this, WMSPackage.LAYER_TYPE__DATA_URL);
		}
		return dataURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeatureListURLType> getFeatureListURL() {
		if (featureListURL == null) {
			featureListURL = new EObjectContainmentEList<FeatureListURLType>(FeatureListURLType.class, this, WMSPackage.LAYER_TYPE__FEATURE_LIST_URL);
		}
		return featureListURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StyleType> getStyle() {
		if (style == null) {
			style = new EObjectContainmentEList<StyleType>(StyleType.class, this, WMSPackage.LAYER_TYPE__STYLE);
		}
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMinScaleDenominator() {
		return minScaleDenominator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinScaleDenominator(double newMinScaleDenominator) {
		double oldMinScaleDenominator = minScaleDenominator;
		minScaleDenominator = newMinScaleDenominator;
		boolean oldMinScaleDenominatorESet = minScaleDenominatorESet;
		minScaleDenominatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.LAYER_TYPE__MIN_SCALE_DENOMINATOR, oldMinScaleDenominator, minScaleDenominator, !oldMinScaleDenominatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMinScaleDenominator() {
		double oldMinScaleDenominator = minScaleDenominator;
		boolean oldMinScaleDenominatorESet = minScaleDenominatorESet;
		minScaleDenominator = MIN_SCALE_DENOMINATOR_EDEFAULT;
		minScaleDenominatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WMSPackage.LAYER_TYPE__MIN_SCALE_DENOMINATOR, oldMinScaleDenominator, MIN_SCALE_DENOMINATOR_EDEFAULT, oldMinScaleDenominatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMinScaleDenominator() {
		return minScaleDenominatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaxScaleDenominator() {
		return maxScaleDenominator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxScaleDenominator(double newMaxScaleDenominator) {
		double oldMaxScaleDenominator = maxScaleDenominator;
		maxScaleDenominator = newMaxScaleDenominator;
		boolean oldMaxScaleDenominatorESet = maxScaleDenominatorESet;
		maxScaleDenominatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.LAYER_TYPE__MAX_SCALE_DENOMINATOR, oldMaxScaleDenominator, maxScaleDenominator, !oldMaxScaleDenominatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaxScaleDenominator() {
		double oldMaxScaleDenominator = maxScaleDenominator;
		boolean oldMaxScaleDenominatorESet = maxScaleDenominatorESet;
		maxScaleDenominator = MAX_SCALE_DENOMINATOR_EDEFAULT;
		maxScaleDenominatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WMSPackage.LAYER_TYPE__MAX_SCALE_DENOMINATOR, oldMaxScaleDenominator, MAX_SCALE_DENOMINATOR_EDEFAULT, oldMaxScaleDenominatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaxScaleDenominator() {
		return maxScaleDenominatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LayerType> getLayer() {
		if (layer == null) {
			layer = new EObjectContainmentEList<LayerType>(LayerType.class, this, WMSPackage.LAYER_TYPE__LAYER);
		}
		return layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getCascaded() {
		return cascaded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCascaded(BigInteger newCascaded) {
		BigInteger oldCascaded = cascaded;
		cascaded = newCascaded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.LAYER_TYPE__CASCADED, oldCascaded, cascaded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getFixedHeight() {
		return fixedHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedHeight(BigInteger newFixedHeight) {
		BigInteger oldFixedHeight = fixedHeight;
		fixedHeight = newFixedHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.LAYER_TYPE__FIXED_HEIGHT, oldFixedHeight, fixedHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getFixedWidth() {
		return fixedWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedWidth(BigInteger newFixedWidth) {
		BigInteger oldFixedWidth = fixedWidth;
		fixedWidth = newFixedWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.LAYER_TYPE__FIXED_WIDTH, oldFixedWidth, fixedWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNoSubsets() {
		return noSubsets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoSubsets(boolean newNoSubsets) {
		boolean oldNoSubsets = noSubsets;
		noSubsets = newNoSubsets;
		boolean oldNoSubsetsESet = noSubsetsESet;
		noSubsetsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.LAYER_TYPE__NO_SUBSETS, oldNoSubsets, noSubsets, !oldNoSubsetsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetNoSubsets() {
		boolean oldNoSubsets = noSubsets;
		boolean oldNoSubsetsESet = noSubsetsESet;
		noSubsets = NO_SUBSETS_EDEFAULT;
		noSubsetsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WMSPackage.LAYER_TYPE__NO_SUBSETS, oldNoSubsets, NO_SUBSETS_EDEFAULT, oldNoSubsetsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNoSubsets() {
		return noSubsetsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOpaque() {
		return opaque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpaque(boolean newOpaque) {
		boolean oldOpaque = opaque;
		opaque = newOpaque;
		boolean oldOpaqueESet = opaqueESet;
		opaqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.LAYER_TYPE__OPAQUE, oldOpaque, opaque, !oldOpaqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOpaque() {
		boolean oldOpaque = opaque;
		boolean oldOpaqueESet = opaqueESet;
		opaque = OPAQUE_EDEFAULT;
		opaqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WMSPackage.LAYER_TYPE__OPAQUE, oldOpaque, OPAQUE_EDEFAULT, oldOpaqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOpaque() {
		return opaqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isQueryable() {
		return queryable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueryable(boolean newQueryable) {
		boolean oldQueryable = queryable;
		queryable = newQueryable;
		boolean oldQueryableESet = queryableESet;
		queryableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.LAYER_TYPE__QUERYABLE, oldQueryable, queryable, !oldQueryableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetQueryable() {
		boolean oldQueryable = queryable;
		boolean oldQueryableESet = queryableESet;
		queryable = QUERYABLE_EDEFAULT;
		queryableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WMSPackage.LAYER_TYPE__QUERYABLE, oldQueryable, QUERYABLE_EDEFAULT, oldQueryableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetQueryable() {
		return queryableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WMSPackage.LAYER_TYPE__KEYWORD_LIST:
				return basicSetKeywordList(null, msgs);
			case WMSPackage.LAYER_TYPE__EX_GEOGRAPHIC_BOUNDING_BOX:
				return basicSetEXGeographicBoundingBox(null, msgs);
			case WMSPackage.LAYER_TYPE__BOUNDING_BOX:
				return ((InternalEList<?>)getBoundingBox()).basicRemove(otherEnd, msgs);
			case WMSPackage.LAYER_TYPE__DIMENSION:
				return ((InternalEList<?>)getDimension()).basicRemove(otherEnd, msgs);
			case WMSPackage.LAYER_TYPE__ATTRIBUTION:
				return basicSetAttribution(null, msgs);
			case WMSPackage.LAYER_TYPE__AUTHORITY_URL:
				return ((InternalEList<?>)getAuthorityURL()).basicRemove(otherEnd, msgs);
			case WMSPackage.LAYER_TYPE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case WMSPackage.LAYER_TYPE__METADATA_URL:
				return ((InternalEList<?>)getMetadataURL()).basicRemove(otherEnd, msgs);
			case WMSPackage.LAYER_TYPE__DATA_URL:
				return ((InternalEList<?>)getDataURL()).basicRemove(otherEnd, msgs);
			case WMSPackage.LAYER_TYPE__FEATURE_LIST_URL:
				return ((InternalEList<?>)getFeatureListURL()).basicRemove(otherEnd, msgs);
			case WMSPackage.LAYER_TYPE__STYLE:
				return ((InternalEList<?>)getStyle()).basicRemove(otherEnd, msgs);
			case WMSPackage.LAYER_TYPE__LAYER:
				return ((InternalEList<?>)getLayer()).basicRemove(otherEnd, msgs);
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
			case WMSPackage.LAYER_TYPE__NAME:
				return getName();
			case WMSPackage.LAYER_TYPE__TITLE:
				return getTitle();
			case WMSPackage.LAYER_TYPE__ABSTRACT:
				return getAbstract();
			case WMSPackage.LAYER_TYPE__KEYWORD_LIST:
				return getKeywordList();
			case WMSPackage.LAYER_TYPE__CRS:
				return getCRS();
			case WMSPackage.LAYER_TYPE__EX_GEOGRAPHIC_BOUNDING_BOX:
				return getEXGeographicBoundingBox();
			case WMSPackage.LAYER_TYPE__BOUNDING_BOX:
				return getBoundingBox();
			case WMSPackage.LAYER_TYPE__DIMENSION:
				return getDimension();
			case WMSPackage.LAYER_TYPE__ATTRIBUTION:
				return getAttribution();
			case WMSPackage.LAYER_TYPE__AUTHORITY_URL:
				return getAuthorityURL();
			case WMSPackage.LAYER_TYPE__IDENTIFIER:
				return getIdentifier();
			case WMSPackage.LAYER_TYPE__METADATA_URL:
				return getMetadataURL();
			case WMSPackage.LAYER_TYPE__DATA_URL:
				return getDataURL();
			case WMSPackage.LAYER_TYPE__FEATURE_LIST_URL:
				return getFeatureListURL();
			case WMSPackage.LAYER_TYPE__STYLE:
				return getStyle();
			case WMSPackage.LAYER_TYPE__MIN_SCALE_DENOMINATOR:
				return getMinScaleDenominator();
			case WMSPackage.LAYER_TYPE__MAX_SCALE_DENOMINATOR:
				return getMaxScaleDenominator();
			case WMSPackage.LAYER_TYPE__LAYER:
				return getLayer();
			case WMSPackage.LAYER_TYPE__CASCADED:
				return getCascaded();
			case WMSPackage.LAYER_TYPE__FIXED_HEIGHT:
				return getFixedHeight();
			case WMSPackage.LAYER_TYPE__FIXED_WIDTH:
				return getFixedWidth();
			case WMSPackage.LAYER_TYPE__NO_SUBSETS:
				return isNoSubsets();
			case WMSPackage.LAYER_TYPE__OPAQUE:
				return isOpaque();
			case WMSPackage.LAYER_TYPE__QUERYABLE:
				return isQueryable();
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
			case WMSPackage.LAYER_TYPE__NAME:
				setName((String)newValue);
				return;
			case WMSPackage.LAYER_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case WMSPackage.LAYER_TYPE__ABSTRACT:
				setAbstract((String)newValue);
				return;
			case WMSPackage.LAYER_TYPE__KEYWORD_LIST:
				setKeywordList((KeywordListType)newValue);
				return;
			case WMSPackage.LAYER_TYPE__CRS:
				getCRS().clear();
				getCRS().addAll((Collection<? extends String>)newValue);
				return;
			case WMSPackage.LAYER_TYPE__EX_GEOGRAPHIC_BOUNDING_BOX:
				setEXGeographicBoundingBox((EXGeographicBoundingBoxType)newValue);
				return;
			case WMSPackage.LAYER_TYPE__BOUNDING_BOX:
				getBoundingBox().clear();
				getBoundingBox().addAll((Collection<? extends BoundingBoxType>)newValue);
				return;
			case WMSPackage.LAYER_TYPE__DIMENSION:
				getDimension().clear();
				getDimension().addAll((Collection<? extends DimensionType>)newValue);
				return;
			case WMSPackage.LAYER_TYPE__ATTRIBUTION:
				setAttribution((AttributionType)newValue);
				return;
			case WMSPackage.LAYER_TYPE__AUTHORITY_URL:
				getAuthorityURL().clear();
				getAuthorityURL().addAll((Collection<? extends AuthorityURLType>)newValue);
				return;
			case WMSPackage.LAYER_TYPE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends IdentifierType>)newValue);
				return;
			case WMSPackage.LAYER_TYPE__METADATA_URL:
				getMetadataURL().clear();
				getMetadataURL().addAll((Collection<? extends MetadataURLType>)newValue);
				return;
			case WMSPackage.LAYER_TYPE__DATA_URL:
				getDataURL().clear();
				getDataURL().addAll((Collection<? extends DataURLType>)newValue);
				return;
			case WMSPackage.LAYER_TYPE__FEATURE_LIST_URL:
				getFeatureListURL().clear();
				getFeatureListURL().addAll((Collection<? extends FeatureListURLType>)newValue);
				return;
			case WMSPackage.LAYER_TYPE__STYLE:
				getStyle().clear();
				getStyle().addAll((Collection<? extends StyleType>)newValue);
				return;
			case WMSPackage.LAYER_TYPE__MIN_SCALE_DENOMINATOR:
				setMinScaleDenominator((Double)newValue);
				return;
			case WMSPackage.LAYER_TYPE__MAX_SCALE_DENOMINATOR:
				setMaxScaleDenominator((Double)newValue);
				return;
			case WMSPackage.LAYER_TYPE__LAYER:
				getLayer().clear();
				getLayer().addAll((Collection<? extends LayerType>)newValue);
				return;
			case WMSPackage.LAYER_TYPE__CASCADED:
				setCascaded((BigInteger)newValue);
				return;
			case WMSPackage.LAYER_TYPE__FIXED_HEIGHT:
				setFixedHeight((BigInteger)newValue);
				return;
			case WMSPackage.LAYER_TYPE__FIXED_WIDTH:
				setFixedWidth((BigInteger)newValue);
				return;
			case WMSPackage.LAYER_TYPE__NO_SUBSETS:
				setNoSubsets((Boolean)newValue);
				return;
			case WMSPackage.LAYER_TYPE__OPAQUE:
				setOpaque((Boolean)newValue);
				return;
			case WMSPackage.LAYER_TYPE__QUERYABLE:
				setQueryable((Boolean)newValue);
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
			case WMSPackage.LAYER_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WMSPackage.LAYER_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case WMSPackage.LAYER_TYPE__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case WMSPackage.LAYER_TYPE__KEYWORD_LIST:
				setKeywordList((KeywordListType)null);
				return;
			case WMSPackage.LAYER_TYPE__CRS:
				getCRS().clear();
				return;
			case WMSPackage.LAYER_TYPE__EX_GEOGRAPHIC_BOUNDING_BOX:
				setEXGeographicBoundingBox((EXGeographicBoundingBoxType)null);
				return;
			case WMSPackage.LAYER_TYPE__BOUNDING_BOX:
				getBoundingBox().clear();
				return;
			case WMSPackage.LAYER_TYPE__DIMENSION:
				getDimension().clear();
				return;
			case WMSPackage.LAYER_TYPE__ATTRIBUTION:
				setAttribution((AttributionType)null);
				return;
			case WMSPackage.LAYER_TYPE__AUTHORITY_URL:
				getAuthorityURL().clear();
				return;
			case WMSPackage.LAYER_TYPE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case WMSPackage.LAYER_TYPE__METADATA_URL:
				getMetadataURL().clear();
				return;
			case WMSPackage.LAYER_TYPE__DATA_URL:
				getDataURL().clear();
				return;
			case WMSPackage.LAYER_TYPE__FEATURE_LIST_URL:
				getFeatureListURL().clear();
				return;
			case WMSPackage.LAYER_TYPE__STYLE:
				getStyle().clear();
				return;
			case WMSPackage.LAYER_TYPE__MIN_SCALE_DENOMINATOR:
				unsetMinScaleDenominator();
				return;
			case WMSPackage.LAYER_TYPE__MAX_SCALE_DENOMINATOR:
				unsetMaxScaleDenominator();
				return;
			case WMSPackage.LAYER_TYPE__LAYER:
				getLayer().clear();
				return;
			case WMSPackage.LAYER_TYPE__CASCADED:
				setCascaded(CASCADED_EDEFAULT);
				return;
			case WMSPackage.LAYER_TYPE__FIXED_HEIGHT:
				setFixedHeight(FIXED_HEIGHT_EDEFAULT);
				return;
			case WMSPackage.LAYER_TYPE__FIXED_WIDTH:
				setFixedWidth(FIXED_WIDTH_EDEFAULT);
				return;
			case WMSPackage.LAYER_TYPE__NO_SUBSETS:
				unsetNoSubsets();
				return;
			case WMSPackage.LAYER_TYPE__OPAQUE:
				unsetOpaque();
				return;
			case WMSPackage.LAYER_TYPE__QUERYABLE:
				unsetQueryable();
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
			case WMSPackage.LAYER_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WMSPackage.LAYER_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case WMSPackage.LAYER_TYPE__ABSTRACT:
				return ABSTRACT_EDEFAULT == null ? abstract_ != null : !ABSTRACT_EDEFAULT.equals(abstract_);
			case WMSPackage.LAYER_TYPE__KEYWORD_LIST:
				return keywordList != null;
			case WMSPackage.LAYER_TYPE__CRS:
				return cRS != null && !cRS.isEmpty();
			case WMSPackage.LAYER_TYPE__EX_GEOGRAPHIC_BOUNDING_BOX:
				return eXGeographicBoundingBox != null;
			case WMSPackage.LAYER_TYPE__BOUNDING_BOX:
				return boundingBox != null && !boundingBox.isEmpty();
			case WMSPackage.LAYER_TYPE__DIMENSION:
				return dimension != null && !dimension.isEmpty();
			case WMSPackage.LAYER_TYPE__ATTRIBUTION:
				return attribution != null;
			case WMSPackage.LAYER_TYPE__AUTHORITY_URL:
				return authorityURL != null && !authorityURL.isEmpty();
			case WMSPackage.LAYER_TYPE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case WMSPackage.LAYER_TYPE__METADATA_URL:
				return metadataURL != null && !metadataURL.isEmpty();
			case WMSPackage.LAYER_TYPE__DATA_URL:
				return dataURL != null && !dataURL.isEmpty();
			case WMSPackage.LAYER_TYPE__FEATURE_LIST_URL:
				return featureListURL != null && !featureListURL.isEmpty();
			case WMSPackage.LAYER_TYPE__STYLE:
				return style != null && !style.isEmpty();
			case WMSPackage.LAYER_TYPE__MIN_SCALE_DENOMINATOR:
				return isSetMinScaleDenominator();
			case WMSPackage.LAYER_TYPE__MAX_SCALE_DENOMINATOR:
				return isSetMaxScaleDenominator();
			case WMSPackage.LAYER_TYPE__LAYER:
				return layer != null && !layer.isEmpty();
			case WMSPackage.LAYER_TYPE__CASCADED:
				return CASCADED_EDEFAULT == null ? cascaded != null : !CASCADED_EDEFAULT.equals(cascaded);
			case WMSPackage.LAYER_TYPE__FIXED_HEIGHT:
				return FIXED_HEIGHT_EDEFAULT == null ? fixedHeight != null : !FIXED_HEIGHT_EDEFAULT.equals(fixedHeight);
			case WMSPackage.LAYER_TYPE__FIXED_WIDTH:
				return FIXED_WIDTH_EDEFAULT == null ? fixedWidth != null : !FIXED_WIDTH_EDEFAULT.equals(fixedWidth);
			case WMSPackage.LAYER_TYPE__NO_SUBSETS:
				return isSetNoSubsets();
			case WMSPackage.LAYER_TYPE__OPAQUE:
				return isSetOpaque();
			case WMSPackage.LAYER_TYPE__QUERYABLE:
				return isSetQueryable();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", title: ");
		result.append(title);
		result.append(", abstract: ");
		result.append(abstract_);
		result.append(", cRS: ");
		result.append(cRS);
		result.append(", minScaleDenominator: ");
		if (minScaleDenominatorESet) result.append(minScaleDenominator); else result.append("<unset>");
		result.append(", maxScaleDenominator: ");
		if (maxScaleDenominatorESet) result.append(maxScaleDenominator); else result.append("<unset>");
		result.append(", cascaded: ");
		result.append(cascaded);
		result.append(", fixedHeight: ");
		result.append(fixedHeight);
		result.append(", fixedWidth: ");
		result.append(fixedWidth);
		result.append(", noSubsets: ");
		if (noSubsetsESet) result.append(noSubsets); else result.append("<unset>");
		result.append(", opaque: ");
		if (opaqueESet) result.append(opaque); else result.append("<unset>");
		result.append(", queryable: ");
		if (queryableESet) result.append(queryable); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LayerTypeImpl
