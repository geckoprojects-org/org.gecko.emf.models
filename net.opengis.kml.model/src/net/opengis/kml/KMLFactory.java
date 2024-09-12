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
package net.opengis.kml;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.opengis.kml.KMLPackage
 * @generated
 */
@ProviderType
public interface KMLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KMLFactory eINSTANCE = net.opengis.kml.impl.KMLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Alias Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alias Type</em>'.
	 * @generated
	 */
	AliasType createAliasType();

	/**
	 * Returns a new object of class '<em>Balloon Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Balloon Style Type</em>'.
	 * @generated
	 */
	BalloonStyleType createBalloonStyleType();

	/**
	 * Returns a new object of class '<em>Basic Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Link Type</em>'.
	 * @generated
	 */
	BasicLinkType createBasicLinkType();

	/**
	 * Returns a new object of class '<em>Boundary Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boundary Type</em>'.
	 * @generated
	 */
	BoundaryType createBoundaryType();

	/**
	 * Returns a new object of class '<em>Camera Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camera Type</em>'.
	 * @generated
	 */
	CameraType createCameraType();

	/**
	 * Returns a new object of class '<em>Change Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Type</em>'.
	 * @generated
	 */
	ChangeType createChangeType();

	/**
	 * Returns a new object of class '<em>Create Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Type</em>'.
	 * @generated
	 */
	CreateType createCreateType();

	/**
	 * Returns a new object of class '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type</em>'.
	 * @generated
	 */
	DataType createDataType();

	/**
	 * Returns a new object of class '<em>Delete Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Type</em>'.
	 * @generated
	 */
	DeleteType createDeleteType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Document Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Type</em>'.
	 * @generated
	 */
	DocumentType createDocumentType();

	/**
	 * Returns a new object of class '<em>Extended Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extended Data Type</em>'.
	 * @generated
	 */
	ExtendedDataType createExtendedDataType();

	/**
	 * Returns a new object of class '<em>Folder Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Folder Type</em>'.
	 * @generated
	 */
	FolderType createFolderType();

	/**
	 * Returns a new object of class '<em>Ground Overlay Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ground Overlay Type</em>'.
	 * @generated
	 */
	GroundOverlayType createGroundOverlayType();

	/**
	 * Returns a new object of class '<em>Icon Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Icon Style Type</em>'.
	 * @generated
	 */
	IconStyleType createIconStyleType();

	/**
	 * Returns a new object of class '<em>Image Pyramid Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Pyramid Type</em>'.
	 * @generated
	 */
	ImagePyramidType createImagePyramidType();

	/**
	 * Returns a new object of class '<em>Item Icon Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Icon Type</em>'.
	 * @generated
	 */
	ItemIconType createItemIconType();

	/**
	 * Returns a new object of class '<em>Kml Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kml Type</em>'.
	 * @generated
	 */
	KmlType createKmlType();

	/**
	 * Returns a new object of class '<em>Label Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Style Type</em>'.
	 * @generated
	 */
	LabelStyleType createLabelStyleType();

	/**
	 * Returns a new object of class '<em>Lat Lon Alt Box Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lat Lon Alt Box Type</em>'.
	 * @generated
	 */
	LatLonAltBoxType createLatLonAltBoxType();

	/**
	 * Returns a new object of class '<em>Lat Lon Box Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lat Lon Box Type</em>'.
	 * @generated
	 */
	LatLonBoxType createLatLonBoxType();

	/**
	 * Returns a new object of class '<em>Linear Ring Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linear Ring Type</em>'.
	 * @generated
	 */
	LinearRingType createLinearRingType();

	/**
	 * Returns a new object of class '<em>Line String Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line String Type</em>'.
	 * @generated
	 */
	LineStringType createLineStringType();

	/**
	 * Returns a new object of class '<em>Line Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line Style Type</em>'.
	 * @generated
	 */
	LineStyleType createLineStyleType();

	/**
	 * Returns a new object of class '<em>Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Type</em>'.
	 * @generated
	 */
	LinkType createLinkType();

	/**
	 * Returns a new object of class '<em>List Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Style Type</em>'.
	 * @generated
	 */
	ListStyleType createListStyleType();

	/**
	 * Returns a new object of class '<em>Location Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Type</em>'.
	 * @generated
	 */
	LocationType createLocationType();

	/**
	 * Returns a new object of class '<em>Lod Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lod Type</em>'.
	 * @generated
	 */
	LodType createLodType();

	/**
	 * Returns a new object of class '<em>Look At Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Look At Type</em>'.
	 * @generated
	 */
	LookAtType createLookAtType();

	/**
	 * Returns a new object of class '<em>Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metadata Type</em>'.
	 * @generated
	 */
	MetadataType createMetadataType();

	/**
	 * Returns a new object of class '<em>Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Type</em>'.
	 * @generated
	 */
	ModelType createModelType();

	/**
	 * Returns a new object of class '<em>Multi Geometry Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Geometry Type</em>'.
	 * @generated
	 */
	MultiGeometryType createMultiGeometryType();

	/**
	 * Returns a new object of class '<em>Network Link Control Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Link Control Type</em>'.
	 * @generated
	 */
	NetworkLinkControlType createNetworkLinkControlType();

	/**
	 * Returns a new object of class '<em>Network Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Link Type</em>'.
	 * @generated
	 */
	NetworkLinkType createNetworkLinkType();

	/**
	 * Returns a new object of class '<em>Orientation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orientation Type</em>'.
	 * @generated
	 */
	OrientationType createOrientationType();

	/**
	 * Returns a new object of class '<em>Pair Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pair Type</em>'.
	 * @generated
	 */
	PairType createPairType();

	/**
	 * Returns a new object of class '<em>Photo Overlay Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Photo Overlay Type</em>'.
	 * @generated
	 */
	PhotoOverlayType createPhotoOverlayType();

	/**
	 * Returns a new object of class '<em>Placemark Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Placemark Type</em>'.
	 * @generated
	 */
	PlacemarkType createPlacemarkType();

	/**
	 * Returns a new object of class '<em>Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point Type</em>'.
	 * @generated
	 */
	PointType createPointType();

	/**
	 * Returns a new object of class '<em>Polygon Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polygon Type</em>'.
	 * @generated
	 */
	PolygonType createPolygonType();

	/**
	 * Returns a new object of class '<em>Poly Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Poly Style Type</em>'.
	 * @generated
	 */
	PolyStyleType createPolyStyleType();

	/**
	 * Returns a new object of class '<em>Region Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Region Type</em>'.
	 * @generated
	 */
	RegionType createRegionType();

	/**
	 * Returns a new object of class '<em>Resource Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Map Type</em>'.
	 * @generated
	 */
	ResourceMapType createResourceMapType();

	/**
	 * Returns a new object of class '<em>Scale Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scale Type</em>'.
	 * @generated
	 */
	ScaleType createScaleType();

	/**
	 * Returns a new object of class '<em>Schema Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schema Data Type</em>'.
	 * @generated
	 */
	SchemaDataType createSchemaDataType();

	/**
	 * Returns a new object of class '<em>Schema Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schema Type</em>'.
	 * @generated
	 */
	SchemaType createSchemaType();

	/**
	 * Returns a new object of class '<em>Screen Overlay Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Screen Overlay Type</em>'.
	 * @generated
	 */
	ScreenOverlayType createScreenOverlayType();

	/**
	 * Returns a new object of class '<em>Simple Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Data Type</em>'.
	 * @generated
	 */
	SimpleDataType createSimpleDataType();

	/**
	 * Returns a new object of class '<em>Simple Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Field Type</em>'.
	 * @generated
	 */
	SimpleFieldType createSimpleFieldType();

	/**
	 * Returns a new object of class '<em>Snippet Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Snippet Type</em>'.
	 * @generated
	 */
	SnippetType createSnippetType();

	/**
	 * Returns a new object of class '<em>Style Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Style Map Type</em>'.
	 * @generated
	 */
	StyleMapType createStyleMapType();

	/**
	 * Returns a new object of class '<em>Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Style Type</em>'.
	 * @generated
	 */
	StyleType createStyleType();

	/**
	 * Returns a new object of class '<em>Time Span Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Span Type</em>'.
	 * @generated
	 */
	TimeSpanType createTimeSpanType();

	/**
	 * Returns a new object of class '<em>Time Stamp Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Stamp Type</em>'.
	 * @generated
	 */
	TimeStampType createTimeStampType();

	/**
	 * Returns a new object of class '<em>Update Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Type</em>'.
	 * @generated
	 */
	UpdateType createUpdateType();

	/**
	 * Returns a new object of class '<em>Vec2 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vec2 Type</em>'.
	 * @generated
	 */
	Vec2Type createVec2Type();

	/**
	 * Returns a new object of class '<em>View Volume Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Volume Type</em>'.
	 * @generated
	 */
	ViewVolumeType createViewVolumeType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KMLPackage getKMLPackage();

} //KMLFactory
