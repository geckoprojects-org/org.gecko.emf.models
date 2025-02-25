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
package org.openmicroscopy.ome.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openmicroscopy.ome.BinDataType;
import org.openmicroscopy.ome.ChannelType;
import org.openmicroscopy.ome.DimensionOrderType;
import org.openmicroscopy.ome.OMEPackage;
import org.openmicroscopy.ome.PixelType;
import org.openmicroscopy.ome.PixelsType;
import org.openmicroscopy.ome.PlaneType;
import org.openmicroscopy.ome.TiffDataType;
import org.openmicroscopy.ome.UnitsLength;
import org.openmicroscopy.ome.UnitsTime;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pixels Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.PixelsTypeImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PixelsTypeImpl#getBinData <em>Bin Data</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PixelsTypeImpl#getTiffData <em>Tiff Data</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PixelsTypeImpl#getMetadataOnly <em>Metadata Only</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PixelsTypeImpl#getPlane <em>Plane</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PixelsTypeImpl#isBigEndian <em>Big Endian</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PixelsTypeImpl#getDimensionOrder <em>Dimension Order</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PixelsTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PixelsTypeImpl#isInterleaved <em>Interleaved</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PixelsTypeImpl#getPhysicalSizeX <em>Physical Size X</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PixelsTypeImpl#getPhysicalSizeXUnit <em>Physical Size XUnit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PixelsTypeImpl#getPhysicalSizeY <em>Physical Size Y</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PixelsTypeImpl#getPhysicalSizeYUnit <em>Physical Size YUnit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PixelsTypeImpl#getPhysicalSizeZ <em>Physical Size Z</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PixelsTypeImpl#getPhysicalSizeZUnit <em>Physical Size ZUnit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PixelsTypeImpl#getSignificantBits <em>Significant Bits</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PixelsTypeImpl#getSizeC <em>Size C</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PixelsTypeImpl#getSizeT <em>Size T</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PixelsTypeImpl#getSizeX <em>Size X</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PixelsTypeImpl#getSizeY <em>Size Y</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PixelsTypeImpl#getSizeZ <em>Size Z</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PixelsTypeImpl#getTimeIncrement <em>Time Increment</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PixelsTypeImpl#getTimeIncrementUnit <em>Time Increment Unit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PixelsTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PixelsTypeImpl extends MinimalEObjectImpl.Container implements PixelsType {
	/**
	 * The cached value of the '{@link #getChannel() <em>Channel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected EList<ChannelType> channel;

	/**
	 * The cached value of the '{@link #getBinData() <em>Bin Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinData()
	 * @generated
	 * @ordered
	 */
	protected EList<BinDataType> binData;

	/**
	 * The cached value of the '{@link #getTiffData() <em>Tiff Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiffData()
	 * @generated
	 * @ordered
	 */
	protected EList<TiffDataType> tiffData;

	/**
	 * The cached value of the '{@link #getMetadataOnly() <em>Metadata Only</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataOnly()
	 * @generated
	 * @ordered
	 */
	protected EObject metadataOnly;

	/**
	 * The cached value of the '{@link #getPlane() <em>Plane</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlane()
	 * @generated
	 * @ordered
	 */
	protected EList<PlaneType> plane;

	/**
	 * The default value of the '{@link #isBigEndian() <em>Big Endian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBigEndian()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIG_ENDIAN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBigEndian() <em>Big Endian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBigEndian()
	 * @generated
	 * @ordered
	 */
	protected boolean bigEndian = BIG_ENDIAN_EDEFAULT;

	/**
	 * This is true if the Big Endian attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bigEndianESet;

	/**
	 * The default value of the '{@link #getDimensionOrder() <em>Dimension Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionOrder()
	 * @generated
	 * @ordered
	 */
	protected static final DimensionOrderType DIMENSION_ORDER_EDEFAULT = DimensionOrderType.XYZCT;

	/**
	 * The cached value of the '{@link #getDimensionOrder() <em>Dimension Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionOrder()
	 * @generated
	 * @ordered
	 */
	protected DimensionOrderType dimensionOrder = DIMENSION_ORDER_EDEFAULT;

	/**
	 * This is true if the Dimension Order attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dimensionOrderESet;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String iD = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isInterleaved() <em>Interleaved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterleaved()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERLEAVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInterleaved() <em>Interleaved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterleaved()
	 * @generated
	 * @ordered
	 */
	protected boolean interleaved = INTERLEAVED_EDEFAULT;

	/**
	 * This is true if the Interleaved attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean interleavedESet;

	/**
	 * The default value of the '{@link #getPhysicalSizeX() <em>Physical Size X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalSizeX()
	 * @generated
	 * @ordered
	 */
	protected static final float PHYSICAL_SIZE_X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPhysicalSizeX() <em>Physical Size X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalSizeX()
	 * @generated
	 * @ordered
	 */
	protected float physicalSizeX = PHYSICAL_SIZE_X_EDEFAULT;

	/**
	 * This is true if the Physical Size X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean physicalSizeXESet;

	/**
	 * The default value of the '{@link #getPhysicalSizeXUnit() <em>Physical Size XUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalSizeXUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsLength PHYSICAL_SIZE_XUNIT_EDEFAULT = UnitsLength.ΜM;

	/**
	 * The cached value of the '{@link #getPhysicalSizeXUnit() <em>Physical Size XUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalSizeXUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsLength physicalSizeXUnit = PHYSICAL_SIZE_XUNIT_EDEFAULT;

	/**
	 * This is true if the Physical Size XUnit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean physicalSizeXUnitESet;

	/**
	 * The default value of the '{@link #getPhysicalSizeY() <em>Physical Size Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalSizeY()
	 * @generated
	 * @ordered
	 */
	protected static final float PHYSICAL_SIZE_Y_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPhysicalSizeY() <em>Physical Size Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalSizeY()
	 * @generated
	 * @ordered
	 */
	protected float physicalSizeY = PHYSICAL_SIZE_Y_EDEFAULT;

	/**
	 * This is true if the Physical Size Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean physicalSizeYESet;

	/**
	 * The default value of the '{@link #getPhysicalSizeYUnit() <em>Physical Size YUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalSizeYUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsLength PHYSICAL_SIZE_YUNIT_EDEFAULT = UnitsLength.ΜM;

	/**
	 * The cached value of the '{@link #getPhysicalSizeYUnit() <em>Physical Size YUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalSizeYUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsLength physicalSizeYUnit = PHYSICAL_SIZE_YUNIT_EDEFAULT;

	/**
	 * This is true if the Physical Size YUnit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean physicalSizeYUnitESet;

	/**
	 * The default value of the '{@link #getPhysicalSizeZ() <em>Physical Size Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalSizeZ()
	 * @generated
	 * @ordered
	 */
	protected static final float PHYSICAL_SIZE_Z_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPhysicalSizeZ() <em>Physical Size Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalSizeZ()
	 * @generated
	 * @ordered
	 */
	protected float physicalSizeZ = PHYSICAL_SIZE_Z_EDEFAULT;

	/**
	 * This is true if the Physical Size Z attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean physicalSizeZESet;

	/**
	 * The default value of the '{@link #getPhysicalSizeZUnit() <em>Physical Size ZUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalSizeZUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsLength PHYSICAL_SIZE_ZUNIT_EDEFAULT = UnitsLength.ΜM;

	/**
	 * The cached value of the '{@link #getPhysicalSizeZUnit() <em>Physical Size ZUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalSizeZUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsLength physicalSizeZUnit = PHYSICAL_SIZE_ZUNIT_EDEFAULT;

	/**
	 * This is true if the Physical Size ZUnit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean physicalSizeZUnitESet;

	/**
	 * The default value of the '{@link #getSignificantBits() <em>Significant Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignificantBits()
	 * @generated
	 * @ordered
	 */
	protected static final int SIGNIFICANT_BITS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSignificantBits() <em>Significant Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignificantBits()
	 * @generated
	 * @ordered
	 */
	protected int significantBits = SIGNIFICANT_BITS_EDEFAULT;

	/**
	 * This is true if the Significant Bits attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean significantBitsESet;

	/**
	 * The default value of the '{@link #getSizeC() <em>Size C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeC()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_C_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSizeC() <em>Size C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeC()
	 * @generated
	 * @ordered
	 */
	protected int sizeC = SIZE_C_EDEFAULT;

	/**
	 * This is true if the Size C attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sizeCESet;

	/**
	 * The default value of the '{@link #getSizeT() <em>Size T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeT()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_T_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSizeT() <em>Size T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeT()
	 * @generated
	 * @ordered
	 */
	protected int sizeT = SIZE_T_EDEFAULT;

	/**
	 * This is true if the Size T attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sizeTESet;

	/**
	 * The default value of the '{@link #getSizeX() <em>Size X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeX()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSizeX() <em>Size X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeX()
	 * @generated
	 * @ordered
	 */
	protected int sizeX = SIZE_X_EDEFAULT;

	/**
	 * This is true if the Size X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sizeXESet;

	/**
	 * The default value of the '{@link #getSizeY() <em>Size Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeY()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSizeY() <em>Size Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeY()
	 * @generated
	 * @ordered
	 */
	protected int sizeY = SIZE_Y_EDEFAULT;

	/**
	 * This is true if the Size Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sizeYESet;

	/**
	 * The default value of the '{@link #getSizeZ() <em>Size Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeZ()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_Z_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSizeZ() <em>Size Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeZ()
	 * @generated
	 * @ordered
	 */
	protected int sizeZ = SIZE_Z_EDEFAULT;

	/**
	 * This is true if the Size Z attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sizeZESet;

	/**
	 * The default value of the '{@link #getTimeIncrement() <em>Time Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeIncrement()
	 * @generated
	 * @ordered
	 */
	protected static final float TIME_INCREMENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTimeIncrement() <em>Time Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeIncrement()
	 * @generated
	 * @ordered
	 */
	protected float timeIncrement = TIME_INCREMENT_EDEFAULT;

	/**
	 * This is true if the Time Increment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timeIncrementESet;

	/**
	 * The default value of the '{@link #getTimeIncrementUnit() <em>Time Increment Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeIncrementUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsTime TIME_INCREMENT_UNIT_EDEFAULT = UnitsTime.S;

	/**
	 * The cached value of the '{@link #getTimeIncrementUnit() <em>Time Increment Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeIncrementUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsTime timeIncrementUnit = TIME_INCREMENT_UNIT_EDEFAULT;

	/**
	 * This is true if the Time Increment Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timeIncrementUnitESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PixelType TYPE_EDEFAULT = PixelType.INT8;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PixelType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PixelsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getPixelsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChannelType> getChannel() {
		if (channel == null) {
			channel = new EObjectContainmentEList<ChannelType>(ChannelType.class, this, OMEPackage.PIXELS_TYPE__CHANNEL);
		}
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BinDataType> getBinData() {
		if (binData == null) {
			binData = new EObjectContainmentEList<BinDataType>(BinDataType.class, this, OMEPackage.PIXELS_TYPE__BIN_DATA);
		}
		return binData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TiffDataType> getTiffData() {
		if (tiffData == null) {
			tiffData = new EObjectContainmentEList<TiffDataType>(TiffDataType.class, this, OMEPackage.PIXELS_TYPE__TIFF_DATA);
		}
		return tiffData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getMetadataOnly() {
		return metadataOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadataOnly(EObject newMetadataOnly, NotificationChain msgs) {
		EObject oldMetadataOnly = metadataOnly;
		metadataOnly = newMetadataOnly;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMEPackage.PIXELS_TYPE__METADATA_ONLY, oldMetadataOnly, newMetadataOnly);
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
	public void setMetadataOnly(EObject newMetadataOnly) {
		if (newMetadataOnly != metadataOnly) {
			NotificationChain msgs = null;
			if (metadataOnly != null)
				msgs = ((InternalEObject)metadataOnly).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMEPackage.PIXELS_TYPE__METADATA_ONLY, null, msgs);
			if (newMetadataOnly != null)
				msgs = ((InternalEObject)newMetadataOnly).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMEPackage.PIXELS_TYPE__METADATA_ONLY, null, msgs);
			msgs = basicSetMetadataOnly(newMetadataOnly, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PIXELS_TYPE__METADATA_ONLY, newMetadataOnly, newMetadataOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlaneType> getPlane() {
		if (plane == null) {
			plane = new EObjectContainmentEList<PlaneType>(PlaneType.class, this, OMEPackage.PIXELS_TYPE__PLANE);
		}
		return plane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBigEndian() {
		return bigEndian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBigEndian(boolean newBigEndian) {
		boolean oldBigEndian = bigEndian;
		bigEndian = newBigEndian;
		boolean oldBigEndianESet = bigEndianESet;
		bigEndianESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PIXELS_TYPE__BIG_ENDIAN, oldBigEndian, bigEndian, !oldBigEndianESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBigEndian() {
		boolean oldBigEndian = bigEndian;
		boolean oldBigEndianESet = bigEndianESet;
		bigEndian = BIG_ENDIAN_EDEFAULT;
		bigEndianESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PIXELS_TYPE__BIG_ENDIAN, oldBigEndian, BIG_ENDIAN_EDEFAULT, oldBigEndianESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBigEndian() {
		return bigEndianESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DimensionOrderType getDimensionOrder() {
		return dimensionOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDimensionOrder(DimensionOrderType newDimensionOrder) {
		DimensionOrderType oldDimensionOrder = dimensionOrder;
		dimensionOrder = newDimensionOrder == null ? DIMENSION_ORDER_EDEFAULT : newDimensionOrder;
		boolean oldDimensionOrderESet = dimensionOrderESet;
		dimensionOrderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PIXELS_TYPE__DIMENSION_ORDER, oldDimensionOrder, dimensionOrder, !oldDimensionOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDimensionOrder() {
		DimensionOrderType oldDimensionOrder = dimensionOrder;
		boolean oldDimensionOrderESet = dimensionOrderESet;
		dimensionOrder = DIMENSION_ORDER_EDEFAULT;
		dimensionOrderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PIXELS_TYPE__DIMENSION_ORDER, oldDimensionOrder, DIMENSION_ORDER_EDEFAULT, oldDimensionOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDimensionOrder() {
		return dimensionOrderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getID() {
		return iD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(String newID) {
		String oldID = iD;
		iD = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PIXELS_TYPE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInterleaved() {
		return interleaved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterleaved(boolean newInterleaved) {
		boolean oldInterleaved = interleaved;
		interleaved = newInterleaved;
		boolean oldInterleavedESet = interleavedESet;
		interleavedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PIXELS_TYPE__INTERLEAVED, oldInterleaved, interleaved, !oldInterleavedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetInterleaved() {
		boolean oldInterleaved = interleaved;
		boolean oldInterleavedESet = interleavedESet;
		interleaved = INTERLEAVED_EDEFAULT;
		interleavedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PIXELS_TYPE__INTERLEAVED, oldInterleaved, INTERLEAVED_EDEFAULT, oldInterleavedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetInterleaved() {
		return interleavedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPhysicalSizeX() {
		return physicalSizeX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysicalSizeX(float newPhysicalSizeX) {
		float oldPhysicalSizeX = physicalSizeX;
		physicalSizeX = newPhysicalSizeX;
		boolean oldPhysicalSizeXESet = physicalSizeXESet;
		physicalSizeXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_X, oldPhysicalSizeX, physicalSizeX, !oldPhysicalSizeXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPhysicalSizeX() {
		float oldPhysicalSizeX = physicalSizeX;
		boolean oldPhysicalSizeXESet = physicalSizeXESet;
		physicalSizeX = PHYSICAL_SIZE_X_EDEFAULT;
		physicalSizeXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_X, oldPhysicalSizeX, PHYSICAL_SIZE_X_EDEFAULT, oldPhysicalSizeXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPhysicalSizeX() {
		return physicalSizeXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsLength getPhysicalSizeXUnit() {
		return physicalSizeXUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysicalSizeXUnit(UnitsLength newPhysicalSizeXUnit) {
		UnitsLength oldPhysicalSizeXUnit = physicalSizeXUnit;
		physicalSizeXUnit = newPhysicalSizeXUnit == null ? PHYSICAL_SIZE_XUNIT_EDEFAULT : newPhysicalSizeXUnit;
		boolean oldPhysicalSizeXUnitESet = physicalSizeXUnitESet;
		physicalSizeXUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_XUNIT, oldPhysicalSizeXUnit, physicalSizeXUnit, !oldPhysicalSizeXUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPhysicalSizeXUnit() {
		UnitsLength oldPhysicalSizeXUnit = physicalSizeXUnit;
		boolean oldPhysicalSizeXUnitESet = physicalSizeXUnitESet;
		physicalSizeXUnit = PHYSICAL_SIZE_XUNIT_EDEFAULT;
		physicalSizeXUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_XUNIT, oldPhysicalSizeXUnit, PHYSICAL_SIZE_XUNIT_EDEFAULT, oldPhysicalSizeXUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPhysicalSizeXUnit() {
		return physicalSizeXUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPhysicalSizeY() {
		return physicalSizeY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysicalSizeY(float newPhysicalSizeY) {
		float oldPhysicalSizeY = physicalSizeY;
		physicalSizeY = newPhysicalSizeY;
		boolean oldPhysicalSizeYESet = physicalSizeYESet;
		physicalSizeYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_Y, oldPhysicalSizeY, physicalSizeY, !oldPhysicalSizeYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPhysicalSizeY() {
		float oldPhysicalSizeY = physicalSizeY;
		boolean oldPhysicalSizeYESet = physicalSizeYESet;
		physicalSizeY = PHYSICAL_SIZE_Y_EDEFAULT;
		physicalSizeYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_Y, oldPhysicalSizeY, PHYSICAL_SIZE_Y_EDEFAULT, oldPhysicalSizeYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPhysicalSizeY() {
		return physicalSizeYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsLength getPhysicalSizeYUnit() {
		return physicalSizeYUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysicalSizeYUnit(UnitsLength newPhysicalSizeYUnit) {
		UnitsLength oldPhysicalSizeYUnit = physicalSizeYUnit;
		physicalSizeYUnit = newPhysicalSizeYUnit == null ? PHYSICAL_SIZE_YUNIT_EDEFAULT : newPhysicalSizeYUnit;
		boolean oldPhysicalSizeYUnitESet = physicalSizeYUnitESet;
		physicalSizeYUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_YUNIT, oldPhysicalSizeYUnit, physicalSizeYUnit, !oldPhysicalSizeYUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPhysicalSizeYUnit() {
		UnitsLength oldPhysicalSizeYUnit = physicalSizeYUnit;
		boolean oldPhysicalSizeYUnitESet = physicalSizeYUnitESet;
		physicalSizeYUnit = PHYSICAL_SIZE_YUNIT_EDEFAULT;
		physicalSizeYUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_YUNIT, oldPhysicalSizeYUnit, PHYSICAL_SIZE_YUNIT_EDEFAULT, oldPhysicalSizeYUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPhysicalSizeYUnit() {
		return physicalSizeYUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPhysicalSizeZ() {
		return physicalSizeZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysicalSizeZ(float newPhysicalSizeZ) {
		float oldPhysicalSizeZ = physicalSizeZ;
		physicalSizeZ = newPhysicalSizeZ;
		boolean oldPhysicalSizeZESet = physicalSizeZESet;
		physicalSizeZESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_Z, oldPhysicalSizeZ, physicalSizeZ, !oldPhysicalSizeZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPhysicalSizeZ() {
		float oldPhysicalSizeZ = physicalSizeZ;
		boolean oldPhysicalSizeZESet = physicalSizeZESet;
		physicalSizeZ = PHYSICAL_SIZE_Z_EDEFAULT;
		physicalSizeZESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_Z, oldPhysicalSizeZ, PHYSICAL_SIZE_Z_EDEFAULT, oldPhysicalSizeZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPhysicalSizeZ() {
		return physicalSizeZESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsLength getPhysicalSizeZUnit() {
		return physicalSizeZUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysicalSizeZUnit(UnitsLength newPhysicalSizeZUnit) {
		UnitsLength oldPhysicalSizeZUnit = physicalSizeZUnit;
		physicalSizeZUnit = newPhysicalSizeZUnit == null ? PHYSICAL_SIZE_ZUNIT_EDEFAULT : newPhysicalSizeZUnit;
		boolean oldPhysicalSizeZUnitESet = physicalSizeZUnitESet;
		physicalSizeZUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_ZUNIT, oldPhysicalSizeZUnit, physicalSizeZUnit, !oldPhysicalSizeZUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPhysicalSizeZUnit() {
		UnitsLength oldPhysicalSizeZUnit = physicalSizeZUnit;
		boolean oldPhysicalSizeZUnitESet = physicalSizeZUnitESet;
		physicalSizeZUnit = PHYSICAL_SIZE_ZUNIT_EDEFAULT;
		physicalSizeZUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_ZUNIT, oldPhysicalSizeZUnit, PHYSICAL_SIZE_ZUNIT_EDEFAULT, oldPhysicalSizeZUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPhysicalSizeZUnit() {
		return physicalSizeZUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSignificantBits() {
		return significantBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignificantBits(int newSignificantBits) {
		int oldSignificantBits = significantBits;
		significantBits = newSignificantBits;
		boolean oldSignificantBitsESet = significantBitsESet;
		significantBitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PIXELS_TYPE__SIGNIFICANT_BITS, oldSignificantBits, significantBits, !oldSignificantBitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSignificantBits() {
		int oldSignificantBits = significantBits;
		boolean oldSignificantBitsESet = significantBitsESet;
		significantBits = SIGNIFICANT_BITS_EDEFAULT;
		significantBitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PIXELS_TYPE__SIGNIFICANT_BITS, oldSignificantBits, SIGNIFICANT_BITS_EDEFAULT, oldSignificantBitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSignificantBits() {
		return significantBitsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSizeC() {
		return sizeC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSizeC(int newSizeC) {
		int oldSizeC = sizeC;
		sizeC = newSizeC;
		boolean oldSizeCESet = sizeCESet;
		sizeCESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PIXELS_TYPE__SIZE_C, oldSizeC, sizeC, !oldSizeCESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSizeC() {
		int oldSizeC = sizeC;
		boolean oldSizeCESet = sizeCESet;
		sizeC = SIZE_C_EDEFAULT;
		sizeCESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PIXELS_TYPE__SIZE_C, oldSizeC, SIZE_C_EDEFAULT, oldSizeCESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSizeC() {
		return sizeCESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSizeT() {
		return sizeT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSizeT(int newSizeT) {
		int oldSizeT = sizeT;
		sizeT = newSizeT;
		boolean oldSizeTESet = sizeTESet;
		sizeTESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PIXELS_TYPE__SIZE_T, oldSizeT, sizeT, !oldSizeTESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSizeT() {
		int oldSizeT = sizeT;
		boolean oldSizeTESet = sizeTESet;
		sizeT = SIZE_T_EDEFAULT;
		sizeTESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PIXELS_TYPE__SIZE_T, oldSizeT, SIZE_T_EDEFAULT, oldSizeTESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSizeT() {
		return sizeTESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSizeX() {
		return sizeX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSizeX(int newSizeX) {
		int oldSizeX = sizeX;
		sizeX = newSizeX;
		boolean oldSizeXESet = sizeXESet;
		sizeXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PIXELS_TYPE__SIZE_X, oldSizeX, sizeX, !oldSizeXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSizeX() {
		int oldSizeX = sizeX;
		boolean oldSizeXESet = sizeXESet;
		sizeX = SIZE_X_EDEFAULT;
		sizeXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PIXELS_TYPE__SIZE_X, oldSizeX, SIZE_X_EDEFAULT, oldSizeXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSizeX() {
		return sizeXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSizeY() {
		return sizeY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSizeY(int newSizeY) {
		int oldSizeY = sizeY;
		sizeY = newSizeY;
		boolean oldSizeYESet = sizeYESet;
		sizeYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PIXELS_TYPE__SIZE_Y, oldSizeY, sizeY, !oldSizeYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSizeY() {
		int oldSizeY = sizeY;
		boolean oldSizeYESet = sizeYESet;
		sizeY = SIZE_Y_EDEFAULT;
		sizeYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PIXELS_TYPE__SIZE_Y, oldSizeY, SIZE_Y_EDEFAULT, oldSizeYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSizeY() {
		return sizeYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSizeZ() {
		return sizeZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSizeZ(int newSizeZ) {
		int oldSizeZ = sizeZ;
		sizeZ = newSizeZ;
		boolean oldSizeZESet = sizeZESet;
		sizeZESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PIXELS_TYPE__SIZE_Z, oldSizeZ, sizeZ, !oldSizeZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSizeZ() {
		int oldSizeZ = sizeZ;
		boolean oldSizeZESet = sizeZESet;
		sizeZ = SIZE_Z_EDEFAULT;
		sizeZESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PIXELS_TYPE__SIZE_Z, oldSizeZ, SIZE_Z_EDEFAULT, oldSizeZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSizeZ() {
		return sizeZESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getTimeIncrement() {
		return timeIncrement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeIncrement(float newTimeIncrement) {
		float oldTimeIncrement = timeIncrement;
		timeIncrement = newTimeIncrement;
		boolean oldTimeIncrementESet = timeIncrementESet;
		timeIncrementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PIXELS_TYPE__TIME_INCREMENT, oldTimeIncrement, timeIncrement, !oldTimeIncrementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTimeIncrement() {
		float oldTimeIncrement = timeIncrement;
		boolean oldTimeIncrementESet = timeIncrementESet;
		timeIncrement = TIME_INCREMENT_EDEFAULT;
		timeIncrementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PIXELS_TYPE__TIME_INCREMENT, oldTimeIncrement, TIME_INCREMENT_EDEFAULT, oldTimeIncrementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTimeIncrement() {
		return timeIncrementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsTime getTimeIncrementUnit() {
		return timeIncrementUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeIncrementUnit(UnitsTime newTimeIncrementUnit) {
		UnitsTime oldTimeIncrementUnit = timeIncrementUnit;
		timeIncrementUnit = newTimeIncrementUnit == null ? TIME_INCREMENT_UNIT_EDEFAULT : newTimeIncrementUnit;
		boolean oldTimeIncrementUnitESet = timeIncrementUnitESet;
		timeIncrementUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PIXELS_TYPE__TIME_INCREMENT_UNIT, oldTimeIncrementUnit, timeIncrementUnit, !oldTimeIncrementUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTimeIncrementUnit() {
		UnitsTime oldTimeIncrementUnit = timeIncrementUnit;
		boolean oldTimeIncrementUnitESet = timeIncrementUnitESet;
		timeIncrementUnit = TIME_INCREMENT_UNIT_EDEFAULT;
		timeIncrementUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PIXELS_TYPE__TIME_INCREMENT_UNIT, oldTimeIncrementUnit, TIME_INCREMENT_UNIT_EDEFAULT, oldTimeIncrementUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTimeIncrementUnit() {
		return timeIncrementUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PixelType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(PixelType newType) {
		PixelType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PIXELS_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetType() {
		PixelType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PIXELS_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMEPackage.PIXELS_TYPE__CHANNEL:
				return ((InternalEList<?>)getChannel()).basicRemove(otherEnd, msgs);
			case OMEPackage.PIXELS_TYPE__BIN_DATA:
				return ((InternalEList<?>)getBinData()).basicRemove(otherEnd, msgs);
			case OMEPackage.PIXELS_TYPE__TIFF_DATA:
				return ((InternalEList<?>)getTiffData()).basicRemove(otherEnd, msgs);
			case OMEPackage.PIXELS_TYPE__METADATA_ONLY:
				return basicSetMetadataOnly(null, msgs);
			case OMEPackage.PIXELS_TYPE__PLANE:
				return ((InternalEList<?>)getPlane()).basicRemove(otherEnd, msgs);
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
			case OMEPackage.PIXELS_TYPE__CHANNEL:
				return getChannel();
			case OMEPackage.PIXELS_TYPE__BIN_DATA:
				return getBinData();
			case OMEPackage.PIXELS_TYPE__TIFF_DATA:
				return getTiffData();
			case OMEPackage.PIXELS_TYPE__METADATA_ONLY:
				return getMetadataOnly();
			case OMEPackage.PIXELS_TYPE__PLANE:
				return getPlane();
			case OMEPackage.PIXELS_TYPE__BIG_ENDIAN:
				return isBigEndian();
			case OMEPackage.PIXELS_TYPE__DIMENSION_ORDER:
				return getDimensionOrder();
			case OMEPackage.PIXELS_TYPE__ID:
				return getID();
			case OMEPackage.PIXELS_TYPE__INTERLEAVED:
				return isInterleaved();
			case OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_X:
				return getPhysicalSizeX();
			case OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_XUNIT:
				return getPhysicalSizeXUnit();
			case OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_Y:
				return getPhysicalSizeY();
			case OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_YUNIT:
				return getPhysicalSizeYUnit();
			case OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_Z:
				return getPhysicalSizeZ();
			case OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_ZUNIT:
				return getPhysicalSizeZUnit();
			case OMEPackage.PIXELS_TYPE__SIGNIFICANT_BITS:
				return getSignificantBits();
			case OMEPackage.PIXELS_TYPE__SIZE_C:
				return getSizeC();
			case OMEPackage.PIXELS_TYPE__SIZE_T:
				return getSizeT();
			case OMEPackage.PIXELS_TYPE__SIZE_X:
				return getSizeX();
			case OMEPackage.PIXELS_TYPE__SIZE_Y:
				return getSizeY();
			case OMEPackage.PIXELS_TYPE__SIZE_Z:
				return getSizeZ();
			case OMEPackage.PIXELS_TYPE__TIME_INCREMENT:
				return getTimeIncrement();
			case OMEPackage.PIXELS_TYPE__TIME_INCREMENT_UNIT:
				return getTimeIncrementUnit();
			case OMEPackage.PIXELS_TYPE__TYPE:
				return getType();
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
			case OMEPackage.PIXELS_TYPE__CHANNEL:
				getChannel().clear();
				getChannel().addAll((Collection<? extends ChannelType>)newValue);
				return;
			case OMEPackage.PIXELS_TYPE__BIN_DATA:
				getBinData().clear();
				getBinData().addAll((Collection<? extends BinDataType>)newValue);
				return;
			case OMEPackage.PIXELS_TYPE__TIFF_DATA:
				getTiffData().clear();
				getTiffData().addAll((Collection<? extends TiffDataType>)newValue);
				return;
			case OMEPackage.PIXELS_TYPE__METADATA_ONLY:
				setMetadataOnly((EObject)newValue);
				return;
			case OMEPackage.PIXELS_TYPE__PLANE:
				getPlane().clear();
				getPlane().addAll((Collection<? extends PlaneType>)newValue);
				return;
			case OMEPackage.PIXELS_TYPE__BIG_ENDIAN:
				setBigEndian((Boolean)newValue);
				return;
			case OMEPackage.PIXELS_TYPE__DIMENSION_ORDER:
				setDimensionOrder((DimensionOrderType)newValue);
				return;
			case OMEPackage.PIXELS_TYPE__ID:
				setID((String)newValue);
				return;
			case OMEPackage.PIXELS_TYPE__INTERLEAVED:
				setInterleaved((Boolean)newValue);
				return;
			case OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_X:
				setPhysicalSizeX((Float)newValue);
				return;
			case OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_XUNIT:
				setPhysicalSizeXUnit((UnitsLength)newValue);
				return;
			case OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_Y:
				setPhysicalSizeY((Float)newValue);
				return;
			case OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_YUNIT:
				setPhysicalSizeYUnit((UnitsLength)newValue);
				return;
			case OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_Z:
				setPhysicalSizeZ((Float)newValue);
				return;
			case OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_ZUNIT:
				setPhysicalSizeZUnit((UnitsLength)newValue);
				return;
			case OMEPackage.PIXELS_TYPE__SIGNIFICANT_BITS:
				setSignificantBits((Integer)newValue);
				return;
			case OMEPackage.PIXELS_TYPE__SIZE_C:
				setSizeC((Integer)newValue);
				return;
			case OMEPackage.PIXELS_TYPE__SIZE_T:
				setSizeT((Integer)newValue);
				return;
			case OMEPackage.PIXELS_TYPE__SIZE_X:
				setSizeX((Integer)newValue);
				return;
			case OMEPackage.PIXELS_TYPE__SIZE_Y:
				setSizeY((Integer)newValue);
				return;
			case OMEPackage.PIXELS_TYPE__SIZE_Z:
				setSizeZ((Integer)newValue);
				return;
			case OMEPackage.PIXELS_TYPE__TIME_INCREMENT:
				setTimeIncrement((Float)newValue);
				return;
			case OMEPackage.PIXELS_TYPE__TIME_INCREMENT_UNIT:
				setTimeIncrementUnit((UnitsTime)newValue);
				return;
			case OMEPackage.PIXELS_TYPE__TYPE:
				setType((PixelType)newValue);
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
			case OMEPackage.PIXELS_TYPE__CHANNEL:
				getChannel().clear();
				return;
			case OMEPackage.PIXELS_TYPE__BIN_DATA:
				getBinData().clear();
				return;
			case OMEPackage.PIXELS_TYPE__TIFF_DATA:
				getTiffData().clear();
				return;
			case OMEPackage.PIXELS_TYPE__METADATA_ONLY:
				setMetadataOnly((EObject)null);
				return;
			case OMEPackage.PIXELS_TYPE__PLANE:
				getPlane().clear();
				return;
			case OMEPackage.PIXELS_TYPE__BIG_ENDIAN:
				unsetBigEndian();
				return;
			case OMEPackage.PIXELS_TYPE__DIMENSION_ORDER:
				unsetDimensionOrder();
				return;
			case OMEPackage.PIXELS_TYPE__ID:
				setID(ID_EDEFAULT);
				return;
			case OMEPackage.PIXELS_TYPE__INTERLEAVED:
				unsetInterleaved();
				return;
			case OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_X:
				unsetPhysicalSizeX();
				return;
			case OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_XUNIT:
				unsetPhysicalSizeXUnit();
				return;
			case OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_Y:
				unsetPhysicalSizeY();
				return;
			case OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_YUNIT:
				unsetPhysicalSizeYUnit();
				return;
			case OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_Z:
				unsetPhysicalSizeZ();
				return;
			case OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_ZUNIT:
				unsetPhysicalSizeZUnit();
				return;
			case OMEPackage.PIXELS_TYPE__SIGNIFICANT_BITS:
				unsetSignificantBits();
				return;
			case OMEPackage.PIXELS_TYPE__SIZE_C:
				unsetSizeC();
				return;
			case OMEPackage.PIXELS_TYPE__SIZE_T:
				unsetSizeT();
				return;
			case OMEPackage.PIXELS_TYPE__SIZE_X:
				unsetSizeX();
				return;
			case OMEPackage.PIXELS_TYPE__SIZE_Y:
				unsetSizeY();
				return;
			case OMEPackage.PIXELS_TYPE__SIZE_Z:
				unsetSizeZ();
				return;
			case OMEPackage.PIXELS_TYPE__TIME_INCREMENT:
				unsetTimeIncrement();
				return;
			case OMEPackage.PIXELS_TYPE__TIME_INCREMENT_UNIT:
				unsetTimeIncrementUnit();
				return;
			case OMEPackage.PIXELS_TYPE__TYPE:
				unsetType();
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
			case OMEPackage.PIXELS_TYPE__CHANNEL:
				return channel != null && !channel.isEmpty();
			case OMEPackage.PIXELS_TYPE__BIN_DATA:
				return binData != null && !binData.isEmpty();
			case OMEPackage.PIXELS_TYPE__TIFF_DATA:
				return tiffData != null && !tiffData.isEmpty();
			case OMEPackage.PIXELS_TYPE__METADATA_ONLY:
				return metadataOnly != null;
			case OMEPackage.PIXELS_TYPE__PLANE:
				return plane != null && !plane.isEmpty();
			case OMEPackage.PIXELS_TYPE__BIG_ENDIAN:
				return isSetBigEndian();
			case OMEPackage.PIXELS_TYPE__DIMENSION_ORDER:
				return isSetDimensionOrder();
			case OMEPackage.PIXELS_TYPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case OMEPackage.PIXELS_TYPE__INTERLEAVED:
				return isSetInterleaved();
			case OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_X:
				return isSetPhysicalSizeX();
			case OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_XUNIT:
				return isSetPhysicalSizeXUnit();
			case OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_Y:
				return isSetPhysicalSizeY();
			case OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_YUNIT:
				return isSetPhysicalSizeYUnit();
			case OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_Z:
				return isSetPhysicalSizeZ();
			case OMEPackage.PIXELS_TYPE__PHYSICAL_SIZE_ZUNIT:
				return isSetPhysicalSizeZUnit();
			case OMEPackage.PIXELS_TYPE__SIGNIFICANT_BITS:
				return isSetSignificantBits();
			case OMEPackage.PIXELS_TYPE__SIZE_C:
				return isSetSizeC();
			case OMEPackage.PIXELS_TYPE__SIZE_T:
				return isSetSizeT();
			case OMEPackage.PIXELS_TYPE__SIZE_X:
				return isSetSizeX();
			case OMEPackage.PIXELS_TYPE__SIZE_Y:
				return isSetSizeY();
			case OMEPackage.PIXELS_TYPE__SIZE_Z:
				return isSetSizeZ();
			case OMEPackage.PIXELS_TYPE__TIME_INCREMENT:
				return isSetTimeIncrement();
			case OMEPackage.PIXELS_TYPE__TIME_INCREMENT_UNIT:
				return isSetTimeIncrementUnit();
			case OMEPackage.PIXELS_TYPE__TYPE:
				return isSetType();
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
		result.append(" (bigEndian: ");
		if (bigEndianESet) result.append(bigEndian); else result.append("<unset>");
		result.append(", dimensionOrder: ");
		if (dimensionOrderESet) result.append(dimensionOrder); else result.append("<unset>");
		result.append(", iD: ");
		result.append(iD);
		result.append(", interleaved: ");
		if (interleavedESet) result.append(interleaved); else result.append("<unset>");
		result.append(", physicalSizeX: ");
		if (physicalSizeXESet) result.append(physicalSizeX); else result.append("<unset>");
		result.append(", physicalSizeXUnit: ");
		if (physicalSizeXUnitESet) result.append(physicalSizeXUnit); else result.append("<unset>");
		result.append(", physicalSizeY: ");
		if (physicalSizeYESet) result.append(physicalSizeY); else result.append("<unset>");
		result.append(", physicalSizeYUnit: ");
		if (physicalSizeYUnitESet) result.append(physicalSizeYUnit); else result.append("<unset>");
		result.append(", physicalSizeZ: ");
		if (physicalSizeZESet) result.append(physicalSizeZ); else result.append("<unset>");
		result.append(", physicalSizeZUnit: ");
		if (physicalSizeZUnitESet) result.append(physicalSizeZUnit); else result.append("<unset>");
		result.append(", significantBits: ");
		if (significantBitsESet) result.append(significantBits); else result.append("<unset>");
		result.append(", sizeC: ");
		if (sizeCESet) result.append(sizeC); else result.append("<unset>");
		result.append(", sizeT: ");
		if (sizeTESet) result.append(sizeT); else result.append("<unset>");
		result.append(", sizeX: ");
		if (sizeXESet) result.append(sizeX); else result.append("<unset>");
		result.append(", sizeY: ");
		if (sizeYESet) result.append(sizeY); else result.append("<unset>");
		result.append(", sizeZ: ");
		if (sizeZESet) result.append(sizeZ); else result.append("<unset>");
		result.append(", timeIncrement: ");
		if (timeIncrementESet) result.append(timeIncrement); else result.append("<unset>");
		result.append(", timeIncrementUnit: ");
		if (timeIncrementUnitESet) result.append(timeIncrementUnit); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PixelsTypeImpl
